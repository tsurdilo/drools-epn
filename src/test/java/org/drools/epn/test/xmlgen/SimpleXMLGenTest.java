package org.drools.epn.test.xmlgen;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.drools.epn.Definitions;
import org.drools.epn.DocumentRoot;
import org.drools.epn.EPNFactory;
import org.drools.epn.EventConsumer;
import org.drools.epn.EventProcessingAgent;
import org.drools.epn.EventProducer;
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
        producer.setId("producer1");
        process.getFlowElement().add(producer);

        EventProcessingAgent agent = factory.createEventProcessingAgent();
        agent.setName("agent1");
        agent.setId("agent1");
        process.getFlowElement().add(agent);
        
        EventConsumer consumer = factory.createEventConsumer();
        consumer.setName("consumer1");
        consumer.setId("consumer1");
        process.getFlowElement().add(consumer);
        
        definitions.getRootElement().add(process);
        definitions.setTargetNamespace("http://www.example.org/SimpleExample");

        DocumentRoot documentRoot = factory.createDocumentRoot();
        documentRoot.setDefinitions(definitions);
        
        Resource epn2 = new EPNResourceFactoryImpl().createResource(URI.createURI("src/test/resources/org/drools/epn/simple/basic.epn"));
        epn2.getContents().add(documentRoot);
        epn2.save(null);
          
    }
    
    private Resource loadSimpleModel() throws Exception {
        Resource epn2 = new EPNResourceImpl(URI.createURI("src/test/resources/org/drools/epn/simple/basic.epn"));
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        epn2.load(options);
        return epn2;
    }
}
