package org.drools.epn.test.xmlgen;

import java.util.HashMap;
import java.util.Map;

import org.drools.epn.DocumentRoot;
import org.drools.epn.EPNDiagram;
import org.drools.epn.EpnFactory;
import org.drools.epn.EventChannel;
import org.drools.epn.EventProducer;
import org.drools.epn.Process;
import org.drools.epn.ProcessType;
import org.drools.epn.impl.EpnPackageImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleXMLGenTest {
    
    @Test
    public void testSimpleEpnNode() throws Exception {
        saveSimpleModel();
        Resource loaded = loadSimpleModel();
        
        assertTrue(loaded.getContents().get(0) instanceof EPNDiagram);
        
        EPNDiagram diagram = (EPNDiagram) loaded.getContents().get(0);
        
        assertTrue(diagram.getProcesses().size() == 1);
        Process p1 = (Process)diagram.getProcesses().get(0);
        assertTrue(p1.getId().equals("p1"));
        assertTrue(p1.getFlowElements().size() == 2);
        
    }
    
    private void saveSimpleModel() throws Exception {
        EpnPackageImpl.init();
        EpnFactory factory = EpnFactory.eINSTANCE;
        EPNDiagram diagram = factory.createEPNDiagram();
        
        Process process = factory.createProcess();
        process.setId("p1");
        process.setIsExecutable(true);
        process.setProcessType(ProcessType.PUBLIC);
        
        EventProducer producer = factory.createEventProducer();
        producer.setName("producer1");
        producer.setId("prod1");
        process.getFlowElements().add(producer);
        
        EventChannel channel = factory.createEventChannel();
        channel.setName("channel1");
        channel.setId("chanel1");
        process.getFlowElements().add(channel);
        
        diagram.setName("testDiagram");
        diagram.getProcesses().add(process);
        
        Resource resource =
            new XMLResourceImpl(URI.createURI("src/test/resources/org/drools/epn/simple/basic.xml"));
          resource.getContents().add(diagram);
          resource.save(null);
    }
    
    private Resource loadSimpleModel() throws Exception {
        Resource resource =
            new XMLResourceImpl(URI.createURI("src/test/resources/org/drools/epn/simple/basic.xml"));
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        resource.load(options);
        return resource;
    }
}
