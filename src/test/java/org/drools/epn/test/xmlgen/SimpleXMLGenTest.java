package org.drools.epn.test.xmlgen;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;
import org.drools.epn.Definitions;
import org.drools.epn.DocumentRoot;
import org.drools.epn.EPNFactory;
import org.drools.epn.EventConsumer;
import org.drools.epn.EventProcessingAgent;
import org.drools.epn.EventProducer;
import org.drools.epn.SequenceFlow;
import org.drools.epn.impl.EPNPackageImpl;
import org.drools.epn.util.EPNResourceFactoryImpl;
import org.drools.epn.util.EPNResourceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleXMLGenTest {
    
    @Test
    public void testSimpleEpnNode() throws Exception {
        saveSimpleModel();
        Resource loaded = loadSimpleModel();

        assertTrue(loaded.getContents().get(0) instanceof DocumentRoot);
        DocumentRoot droot = (DocumentRoot) loaded.getContents().get(0);
        assertTrue(droot.getDefinitions().getRootElement().get(0) instanceof org.drools.epn.Process);

        
    }
    
    private void saveSimpleModel() throws Exception {
        // simple model has one producer connected to an agent 
        // and the agent is connected to a consumer
        EPNPackageImpl.init();
        EPNFactory factory = EPNFactory.eINSTANCE;
        Definitions definitions = factory.createDefinitions();
        definitions.setId("Definition");

        org.drools.epn.Process process = factory.createProcess();
        process.setId("p1");
        process.setName("simpleProcess");
        process.setIsExecutable(true);
        
        
        EventProducer producer = factory.createEventProducer();
        producer.setName("producer1");
        producer.setId("_p1");
        process.getFlowElement().add(producer);

        EventProcessingAgent agent = factory.createEventProcessingAgent();
        agent.setName("agent1");
        agent.setId("_a1");
        process.getFlowElement().add(agent);
        
        EventConsumer consumer = factory.createEventConsumer();
        consumer.setName("consumer1");
        consumer.setId("_c1");
        process.getFlowElement().add(consumer);
        
        // now do the sequenceFlow connections
        SequenceFlow p1toa1 =  factory.createSequenceFlow();
        p1toa1.setSourceRef(producer.getId());
        p1toa1.setTargetRef(agent.getId());
        p1toa1.setId(producer.getId() + "-" + agent.getId());
        process.getFlowElement().add(p1toa1);
        
        SequenceFlow a1toc1 =  factory.createSequenceFlow();
        a1toc1.setSourceRef(agent.getId());
        a1toc1.setTargetRef(consumer.getId());
        a1toc1.setId(agent.getId() + "-" + consumer.getId());
        process.getFlowElement().add(a1toc1);
        
        
        definitions.getRootElement().add(process);
        definitions.setTargetNamespace("http://www.example.org/SimpleExample");

        DocumentRoot documentRoot = factory.createDocumentRoot();
        documentRoot.setDefinitions(definitions);
        
        Resource epn = new EPNResourceFactoryImpl().createResource(URI.createURI("src/test/resources/org/drools/epn/simple/basic.epn"));
        // this is needed so that substitution groups are honored which == pretty xml ;)
        ((XMLResource) epn).getDefaultSaveOptions().put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(false));
        epn.getContents().add(documentRoot);
        epn.save(null);
          
    }
    
    private Resource loadSimpleModel() throws Exception {
        Resource epn = new EPNResourceImpl(URI.createURI("src/test/resources/org/drools/epn/simple/basic.epn"));
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        epn.load(options);
        return epn;
    }
}
