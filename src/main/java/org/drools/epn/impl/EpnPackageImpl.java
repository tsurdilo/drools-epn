/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.Activity;
import org.drools.epn.BaseElement;
import org.drools.epn.ConversationLink;
import org.drools.epn.DataInput;
import org.drools.epn.DataOutput;
import org.drools.epn.Diagram;
import org.drools.epn.DiagramElement;
import org.drools.epn.DocumentRoot;
import org.drools.epn.Documentation;
import org.drools.epn.EPNDiagram;
import org.drools.epn.EpnFactory;
import org.drools.epn.EpnPackage;
import org.drools.epn.EventChannel;
import org.drools.epn.EventConsumer;
import org.drools.epn.EventProcessingAgent;
import org.drools.epn.EventProducer;
import org.drools.epn.FlowElement;
import org.drools.epn.FlowElementsContainer;
import org.drools.epn.FlowNode;
import org.drools.epn.InputSet;
import org.drools.epn.InteractionNode;
import org.drools.epn.OutputSet;
import org.drools.epn.ProcessType;
import org.drools.epn.SequenceFlow;
import org.drools.epn.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpnPackageImpl extends EPackageImpl implements EpnPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sequenceFlowEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conversationLinkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventProducerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventConsumerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventProcessingAgentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataOutputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventChannelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass epnDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowElementsContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.drools.epn.EpnPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EpnPackageImpl() {
        super(eNS_URI, EpnFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link EpnPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EpnPackage init() {
        if (isInited) return (EpnPackage)EPackage.Registry.INSTANCE.getEPackage(EpnPackage.eNS_URI);

        // Obtain or create and register package
        EpnPackageImpl theEpnPackage = (EpnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EpnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EpnPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theEpnPackage.createPackageContents();

        // Initialize created meta-data
        theEpnPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theEpnPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(EpnPackage.eNS_URI, theEpnPackage);
        return theEpnPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Activity() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FlowNode() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BaseElement() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Documentation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SequenceFlow() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Task() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ConversationLink() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataInput() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataOutput() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_InputSet() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OutputSet() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventProducer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventConsumer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventProcessingAgent() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventChannel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivity() {
        return activityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowNode() {
        return flowNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowNode_Incoming() {
        return (EReference)flowNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowNode_Outgoing() {
        return (EReference)flowNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowElement() {
        return flowElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowElement_Name() {
        return (EAttribute)flowElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseElement() {
        return baseElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseElement_Documentation() {
        return (EReference)baseElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElement_Id() {
        return (EAttribute)baseElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentation() {
        return documentationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Mixed() {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Text() {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSequenceFlow() {
        return sequenceFlowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSequenceFlow_SourceRef() {
        return (EReference)sequenceFlowEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSequenceFlow_TargetRef() {
        return (EReference)sequenceFlowEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTask() {
        return taskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionNode() {
        return interactionNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionNode_IncomingConversationLinks() {
        return (EReference)interactionNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionNode_OutgoingConversationLinks() {
        return (EReference)interactionNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConversationLink() {
        return conversationLinkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversationLink_Name() {
        return (EAttribute)conversationLinkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversationLink_SourceRef() {
        return (EReference)conversationLinkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversationLink_TargetRef() {
        return (EReference)conversationLinkEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventProducer() {
        return eventProducerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventProducer_DataOutputs() {
        return (EReference)eventProducerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventProducer_DataInputs() {
        return (EReference)eventProducerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventConsumer() {
        return eventConsumerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventConsumer_DataOutputs() {
        return (EReference)eventConsumerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventConsumer_DataInputs() {
        return (EReference)eventConsumerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventProcessingAgent() {
        return eventProcessingAgentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventProcessingAgent_DataOutputs() {
        return (EReference)eventProcessingAgentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventProcessingAgent_DataInputs() {
        return (EReference)eventProcessingAgentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInput() {
        return dataInputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInput_Name() {
        return (EAttribute)dataInputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInput_InputSetRefs() {
        return (EReference)dataInputEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataOutput() {
        return dataOutputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataOutput_Name() {
        return (EAttribute)dataOutputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataOutput_OutputSetRefs() {
        return (EReference)dataOutputEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputSet() {
        return inputSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputSet_DataInputRefs() {
        return (EReference)inputSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputSet_OutputSetRefs() {
        return (EReference)inputSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputSet_Name() {
        return (EAttribute)inputSetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputSet() {
        return outputSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputSet_DataOutputRefs() {
        return (EReference)outputSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputSet_Name() {
        return (EAttribute)outputSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputSet_InputSetRefs() {
        return (EReference)outputSetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventChannel() {
        return eventChannelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventChannel_DataOutputs() {
        return (EReference)eventChannelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventChannel_DataInputs() {
        return (EReference)eventChannelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEPNDiagram() {
        return epnDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEPNDiagram_Processes() {
        return (EReference)epnDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagram() {
        return diagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Documentation() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Id() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Name() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagram_RootElement() {
        return (EReference)diagramEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowElementsContainer() {
        return flowElementsContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowElementsContainer_FlowElements() {
        return (EReference)flowElementsContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramElement() {
        return diagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_OwningDiagram() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_OwningElement() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_OwnedElement() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_ModelElement() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElement_Id() {
        return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_IsExecutable() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_ProcessType() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessType() {
        return processTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EpnFactory getEpnFactory() {
        return (EpnFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVITY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FLOW_NODE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BASE_ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SEQUENCE_FLOW);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TASK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CONVERSATION_LINK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_INPUT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_OUTPUT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INPUT_SET);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUT_SET);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_PRODUCER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_CONSUMER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_PROCESSING_AGENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_CHANNEL);

        activityEClass = createEClass(ACTIVITY);

        flowNodeEClass = createEClass(FLOW_NODE);
        createEReference(flowNodeEClass, FLOW_NODE__INCOMING);
        createEReference(flowNodeEClass, FLOW_NODE__OUTGOING);

        flowElementEClass = createEClass(FLOW_ELEMENT);
        createEAttribute(flowElementEClass, FLOW_ELEMENT__NAME);

        baseElementEClass = createEClass(BASE_ELEMENT);
        createEReference(baseElementEClass, BASE_ELEMENT__DOCUMENTATION);
        createEAttribute(baseElementEClass, BASE_ELEMENT__ID);

        documentationEClass = createEClass(DOCUMENTATION);
        createEAttribute(documentationEClass, DOCUMENTATION__MIXED);
        createEAttribute(documentationEClass, DOCUMENTATION__TEXT);

        sequenceFlowEClass = createEClass(SEQUENCE_FLOW);
        createEReference(sequenceFlowEClass, SEQUENCE_FLOW__SOURCE_REF);
        createEReference(sequenceFlowEClass, SEQUENCE_FLOW__TARGET_REF);

        taskEClass = createEClass(TASK);

        interactionNodeEClass = createEClass(INTERACTION_NODE);
        createEReference(interactionNodeEClass, INTERACTION_NODE__INCOMING_CONVERSATION_LINKS);
        createEReference(interactionNodeEClass, INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS);

        conversationLinkEClass = createEClass(CONVERSATION_LINK);
        createEAttribute(conversationLinkEClass, CONVERSATION_LINK__NAME);
        createEReference(conversationLinkEClass, CONVERSATION_LINK__SOURCE_REF);
        createEReference(conversationLinkEClass, CONVERSATION_LINK__TARGET_REF);

        eventProducerEClass = createEClass(EVENT_PRODUCER);
        createEReference(eventProducerEClass, EVENT_PRODUCER__DATA_OUTPUTS);
        createEReference(eventProducerEClass, EVENT_PRODUCER__DATA_INPUTS);

        eventConsumerEClass = createEClass(EVENT_CONSUMER);
        createEReference(eventConsumerEClass, EVENT_CONSUMER__DATA_OUTPUTS);
        createEReference(eventConsumerEClass, EVENT_CONSUMER__DATA_INPUTS);

        eventProcessingAgentEClass = createEClass(EVENT_PROCESSING_AGENT);
        createEReference(eventProcessingAgentEClass, EVENT_PROCESSING_AGENT__DATA_OUTPUTS);
        createEReference(eventProcessingAgentEClass, EVENT_PROCESSING_AGENT__DATA_INPUTS);

        dataInputEClass = createEClass(DATA_INPUT);
        createEAttribute(dataInputEClass, DATA_INPUT__NAME);
        createEReference(dataInputEClass, DATA_INPUT__INPUT_SET_REFS);

        dataOutputEClass = createEClass(DATA_OUTPUT);
        createEAttribute(dataOutputEClass, DATA_OUTPUT__NAME);
        createEReference(dataOutputEClass, DATA_OUTPUT__OUTPUT_SET_REFS);

        inputSetEClass = createEClass(INPUT_SET);
        createEReference(inputSetEClass, INPUT_SET__DATA_INPUT_REFS);
        createEReference(inputSetEClass, INPUT_SET__OUTPUT_SET_REFS);
        createEAttribute(inputSetEClass, INPUT_SET__NAME);

        outputSetEClass = createEClass(OUTPUT_SET);
        createEReference(outputSetEClass, OUTPUT_SET__DATA_OUTPUT_REFS);
        createEAttribute(outputSetEClass, OUTPUT_SET__NAME);
        createEReference(outputSetEClass, OUTPUT_SET__INPUT_SET_REFS);

        eventChannelEClass = createEClass(EVENT_CHANNEL);
        createEReference(eventChannelEClass, EVENT_CHANNEL__DATA_OUTPUTS);
        createEReference(eventChannelEClass, EVENT_CHANNEL__DATA_INPUTS);

        epnDiagramEClass = createEClass(EPN_DIAGRAM);
        createEReference(epnDiagramEClass, EPN_DIAGRAM__PROCESSES);

        diagramEClass = createEClass(DIAGRAM);
        createEAttribute(diagramEClass, DIAGRAM__DOCUMENTATION);
        createEAttribute(diagramEClass, DIAGRAM__ID);
        createEAttribute(diagramEClass, DIAGRAM__NAME);
        createEReference(diagramEClass, DIAGRAM__ROOT_ELEMENT);

        flowElementsContainerEClass = createEClass(FLOW_ELEMENTS_CONTAINER);
        createEReference(flowElementsContainerEClass, FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS);

        diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__OWNING_DIAGRAM);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__OWNING_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__OWNED_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__MODEL_ELEMENT);
        createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ID);

        processEClass = createEClass(PROCESS);
        createEAttribute(processEClass, PROCESS__IS_EXECUTABLE);
        createEAttribute(processEClass, PROCESS__PROCESS_TYPE);

        // Create enums
        processTypeEEnum = createEEnum(PROCESS_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        activityEClass.getESuperTypes().add(this.getFlowNode());
        flowNodeEClass.getESuperTypes().add(this.getFlowElement());
        flowElementEClass.getESuperTypes().add(this.getBaseElement());
        documentationEClass.getESuperTypes().add(this.getBaseElement());
        sequenceFlowEClass.getESuperTypes().add(this.getFlowElement());
        taskEClass.getESuperTypes().add(this.getActivity());
        taskEClass.getESuperTypes().add(this.getInteractionNode());
        conversationLinkEClass.getESuperTypes().add(this.getBaseElement());
        eventProducerEClass.getESuperTypes().add(this.getTask());
        eventConsumerEClass.getESuperTypes().add(this.getTask());
        eventProcessingAgentEClass.getESuperTypes().add(this.getTask());
        dataInputEClass.getESuperTypes().add(this.getBaseElement());
        dataOutputEClass.getESuperTypes().add(this.getBaseElement());
        inputSetEClass.getESuperTypes().add(this.getBaseElement());
        outputSetEClass.getESuperTypes().add(this.getBaseElement());
        eventChannelEClass.getESuperTypes().add(this.getTask());
        epnDiagramEClass.getESuperTypes().add(this.getDiagram());
        flowElementsContainerEClass.getESuperTypes().add(this.getBaseElement());
        processEClass.getESuperTypes().add(this.getFlowElementsContainer());

        // Initialize classes and features; add operations and parameters
        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Activity(), this.getActivity(), null, "activity", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_FlowNode(), this.getFlowNode(), null, "flowNode", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BaseElement(), this.getBaseElement(), null, "baseElement", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_SequenceFlow(), this.getSequenceFlow(), null, "sequenceFlow", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Task(), this.getTask(), null, "task", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ConversationLink(), this.getConversationLink(), null, "conversationLink", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_DataInput(), this.getDataInput(), null, "dataInput", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_DataOutput(), this.getDataOutput(), null, "dataOutput", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_InputSet(), this.getInputSet(), null, "inputSet", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OutputSet(), this.getOutputSet(), null, "outputSet", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventProducer(), this.getEventProducer(), null, "eventProducer", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventConsumer(), this.getEventConsumer(), null, "eventConsumer", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventProcessingAgent(), this.getEventProcessingAgent(), null, "eventProcessingAgent", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventChannel(), this.getEventChannel(), null, "eventChannel", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(flowNodeEClass, FlowNode.class, "FlowNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowNode_Incoming(), this.getSequenceFlow(), this.getSequenceFlow_TargetRef(), "incoming", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFlowNode_Outgoing(), this.getSequenceFlow(), this.getSequenceFlow_SourceRef(), "outgoing", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(flowElementEClass, FlowElement.class, "FlowElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFlowElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(baseElementEClass, BaseElement.class, "BaseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseElement_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBaseElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentation_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentation_Text(), ecorePackage.getEString(), "text", null, 1, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSequenceFlow_SourceRef(), this.getFlowNode(), this.getFlowNode_Outgoing(), "sourceRef", null, 1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getSequenceFlow_TargetRef(), this.getFlowNode(), this.getFlowNode_Incoming(), "targetRef", null, 1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionNodeEClass, InteractionNode.class, "InteractionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionNode_IncomingConversationLinks(), this.getConversationLink(), null, "incomingConversationLinks", null, 0, -1, InteractionNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionNode_OutgoingConversationLinks(), this.getConversationLink(), null, "outgoingConversationLinks", null, 0, -1, InteractionNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conversationLinkEClass, ConversationLink.class, "ConversationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConversationLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConversationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConversationLink_SourceRef(), this.getInteractionNode(), null, "sourceRef", null, 1, 1, ConversationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConversationLink_TargetRef(), this.getInteractionNode(), null, "targetRef", null, 1, 1, ConversationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventProducerEClass, EventProducer.class, "EventProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEventProducer_DataOutputs(), this.getDataOutput(), null, "dataOutputs", null, 0, -2, EventProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEventProducer_DataInputs(), this.getDataInput(), null, "dataInputs", null, 0, -2, EventProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventConsumerEClass, EventConsumer.class, "EventConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEventConsumer_DataOutputs(), this.getDataOutput(), null, "dataOutputs", null, 0, -2, EventConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEventConsumer_DataInputs(), this.getDataInput(), null, "dataInputs", null, 0, -2, EventConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventProcessingAgentEClass, EventProcessingAgent.class, "EventProcessingAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEventProcessingAgent_DataOutputs(), this.getDataOutput(), null, "dataOutputs", null, 0, -2, EventProcessingAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEventProcessingAgent_DataInputs(), this.getDataInput(), null, "dataInputs", null, 0, -2, EventProcessingAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataInputEClass, DataInput.class, "DataInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataInput_InputSetRefs(), this.getInputSet(), this.getInputSet_DataInputRefs(), "inputSetRefs", null, 0, -1, DataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataOutputEClass, DataOutput.class, "DataOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataOutput_OutputSetRefs(), this.getOutputSet(), this.getOutputSet_DataOutputRefs(), "outputSetRefs", null, 0, -1, DataOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputSetEClass, InputSet.class, "InputSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInputSet_DataInputRefs(), this.getDataInput(), this.getDataInput_InputSetRefs(), "dataInputRefs", null, 0, -1, InputSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInputSet_OutputSetRefs(), this.getOutputSet(), this.getOutputSet_InputSetRefs(), "outputSetRefs", null, 0, -1, InputSet.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(outputSetEClass, OutputSet.class, "OutputSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOutputSet_DataOutputRefs(), this.getDataOutput(), this.getDataOutput_OutputSetRefs(), "dataOutputRefs", null, 0, -1, OutputSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOutputSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOutputSet_InputSetRefs(), this.getInputSet(), this.getInputSet_OutputSetRefs(), "inputSetRefs", null, 0, -1, OutputSet.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventChannelEClass, EventChannel.class, "EventChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEventChannel_DataOutputs(), this.getDataOutput(), null, "dataOutputs", null, 0, -2, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEventChannel_DataInputs(), this.getDataInput(), null, "dataInputs", null, 0, -2, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(epnDiagramEClass, EPNDiagram.class, "EPNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEPNDiagram_Processes(), this.getFlowElementsContainer(), null, "processes", null, 1, -1, EPNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagram_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagram_Id(), ecorePackage.getEString(), "id", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagram_RootElement(), this.getDiagramElement(), null, "rootElement", null, 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowElementsContainerEClass, FlowElementsContainer.class, "FlowElementsContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowElementsContainer_FlowElements(), this.getFlowElement(), null, "flowElements", null, 0, -1, FlowElementsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagramElement_OwningDiagram(), this.getDiagram(), null, "owningDiagram", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramElement_OwningElement(), this.getDiagramElement(), null, "owningElement", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramElement_OwnedElement(), this.getDiagramElement(), null, "ownedElement", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramElement_ModelElement(), ecorePackage.getEObject(), null, "modelElement", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processEClass, org.drools.epn.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcess_IsExecutable(), ecorePackage.getEBoolean(), "isExecutable", null, 1, 1, org.drools.epn.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_ProcessType(), this.getProcessType(), "processType", null, 1, 1, org.drools.epn.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(processTypeEEnum, ProcessType.class, "ProcessType");
        addEEnumLiteral(processTypeEEnum, ProcessType.NONE);
        addEEnumLiteral(processTypeEEnum, ProcessType.PUBLIC);
        addEEnumLiteral(processTypeEEnum, ProcessType.PRIVATE);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // ExtendedMetaAttributes
        createExtendedMetaAttributesAnnotations();
        // ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>ExtendedMetaAttributes</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaAttributesAnnotations() {
        String source = "ExtendedMetaAttributes";		
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] {
             "name", null,
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] {
             "name", ":mixed",
             "kind", "elementWildcard"
           });																																																															
    }

    /**
     * Initializes the annotations for <b>ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "ExtendedMetaData";				
        addAnnotation
          (getDocumentRoot_Activity(), 
           source, 
           new String[] {
             "name", "activity",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_FlowNode(), 
           source, 
           new String[] {
             "name", "flowNode",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_BaseElement(), 
           source, 
           new String[] {
             "name", "baseElement",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_Documentation(), 
           source, 
           new String[] {
             "name", "documentation",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_SequenceFlow(), 
           source, 
           new String[] {
             "name", "sequenceFlow",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_Task(), 
           source, 
           new String[] {
             "name", "task",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_ConversationLink(), 
           source, 
           new String[] {
             "name", "conversationLink",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_DataInput(), 
           source, 
           new String[] {
             "name", "dataInput",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_DataOutput(), 
           source, 
           new String[] {
             "name", "dataOutput",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_InputSet(), 
           source, 
           new String[] {
             "name", "inputSet",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_OutputSet(), 
           source, 
           new String[] {
             "name", "outputSet",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_EventProducer(), 
           source, 
           new String[] {
             "name", "eventProducer",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_EventConsumer(), 
           source, 
           new String[] {
             "name", "eventConsumer",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_EventProcessingAgent(), 
           source, 
           new String[] {
             "name", "eventProcessingAgent",
             "kind", "element"
           });		
        addAnnotation
          (getDocumentRoot_EventChannel(), 
           source, 
           new String[] {
             "name", "eventChannel",
             "kind", "element"
           });		
        addAnnotation
          (activityEClass, 
           source, 
           new String[] {
             "name", "tActivity",
             "kind", "elementOnly",
             "abstract", "true"
           });		
        addAnnotation
          (flowNodeEClass, 
           source, 
           new String[] {
             "name", "tFlowNode",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFlowNode_Incoming(), 
           source, 
           new String[] {
             "name", "incoming",
             "kind", "attribute"
           });		
        addAnnotation
          (getFlowNode_Outgoing(), 
           source, 
           new String[] {
             "name", "outgoing",
             "kind", "element"
           });		
        addAnnotation
          (flowElementEClass, 
           source, 
           new String[] {
             "name", "tFlowElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFlowElement_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (baseElementEClass, 
           source, 
           new String[] {
             "name", "tBaseElement",
             "kind", "elementOnly",
             "abstract", "true"
           });		
        addAnnotation
          (getBaseElement_Documentation(), 
           source, 
           new String[] {
             "name", "documentation",
             "kind", "element"
           });		
        addAnnotation
          (getBaseElement_Id(), 
           source, 
           new String[] {
             "name", "id",
             "kind", "attribute"
           });		
        addAnnotation
          (documentationEClass, 
           source, 
           new String[] {
             "name", "tDocumentation",
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentation_Mixed(), 
           source, 
           new String[] {
             "name", ":mixed",
             "kind", "elementWildcard"
           });		
        addAnnotation
          (sequenceFlowEClass, 
           source, 
           new String[] {
             "name", "tSequenceFlow",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSequenceFlow_SourceRef(), 
           source, 
           new String[] {
             "name", "sourceRef",
             "kind", "attribute"
           });		
        addAnnotation
          (taskEClass, 
           source, 
           new String[] {
             "name", "tTask",
             "kind", "elementOnly"
           });		
        addAnnotation
          (interactionNodeEClass, 
           source, 
           new String[] {
             "abstract", "true"
           });		
        addAnnotation
          (conversationLinkEClass, 
           source, 
           new String[] {
             "name", "tConversationLink",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConversationLink_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (getConversationLink_SourceRef(), 
           source, 
           new String[] {
             "name", "sourceRef",
             "kind", "attribute"
           });		
        addAnnotation
          (getConversationLink_TargetRef(), 
           source, 
           new String[] {
             "name", "targetRef",
             "kind", "attribute"
           });		
        addAnnotation
          (eventProducerEClass, 
           source, 
           new String[] {
             "name", "tEventProducer",
             "kind", "elementOnly"
           });		
        addAnnotation
          (eventConsumerEClass, 
           source, 
           new String[] {
             "name", "tEventConsumer",
             "kind", "elementOnly"
           });		
        addAnnotation
          (eventProcessingAgentEClass, 
           source, 
           new String[] {
             "name", "tEventAgent",
             "kind", "elementOnly"
           });		
        addAnnotation
          (dataInputEClass, 
           source, 
           new String[] {
             "name", "tDataInput",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDataInput_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (dataOutputEClass, 
           source, 
           new String[] {
             "name", "tDataOutput",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDataOutput_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (inputSetEClass, 
           source, 
           new String[] {
             "name", "tInputSet",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInputSet_DataInputRefs(), 
           source, 
           new String[] {
             "name", "dataInputRefs",
             "kind", "element"
           });		
        addAnnotation
          (getInputSet_OutputSetRefs(), 
           source, 
           new String[] {
             "name", "outputSetRefs",
             "kind", "element"
           });		
        addAnnotation
          (getInputSet_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (outputSetEClass, 
           source, 
           new String[] {
             "name", "tOutputSet",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOutputSet_DataOutputRefs(), 
           source, 
           new String[] {
             "name", "dataOutputRefs",
             "kind", "element"
           });		
        addAnnotation
          (getOutputSet_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (getOutputSet_InputSetRefs(), 
           source, 
           new String[] {
             "name", "outputSetRefs",
             "kind", "element"
           });		
        addAnnotation
          (eventChannelEClass, 
           source, 
           new String[] {
             "name", "tEventChannel",
             "kind", "elementOnly"
           });		
        addAnnotation
          (epnDiagramEClass, 
           source, 
           new String[] {
             "name", "EPNDiagram",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEPNDiagram_Processes(), 
           source, 
           new String[] {
             "name", "process",
             "kind", "element"
           });		
        addAnnotation
          (diagramEClass, 
           source, 
           new String[] {
             "name", "diagram",
             "kind", "empty"
           });		
        addAnnotation
          (getDiagram_Documentation(), 
           source, 
           new String[] {
             "name", "documentation",
             "kind", "attribute"
           });		
        addAnnotation
          (getDiagram_Id(), 
           source, 
           new String[] {
             "name", "id",
             "kind", "attribute"
           });		
        addAnnotation
          (getDiagram_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (getFlowElementsContainer_FlowElements(), 
           source, 
           new String[] {
             "name", "flowElement",
             "kind", "element"
           });		
        addAnnotation
          (diagramElementEClass, 
           source, 
           new String[] {
             "name", "DiagramElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDiagramElement_Id(), 
           source, 
           new String[] {
             "name", "id",
             "kind", "attribute"
           });		
        addAnnotation
          (processEClass, 
           source, 
           new String[] {
             "name", "tProcess",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getProcess_IsExecutable(), 
           source, 
           new String[] {
             "name", "isExecutable",
             "kind", "attribute"
           });		
        addAnnotation
          (getProcess_ProcessType(), 
           source, 
           new String[] {
             "name", "processType",
             "kind", "attribute"
           });		
        addAnnotation
          (processTypeEEnum, 
           source, 
           new String[] {
             "name", "tProcessType"
           });
    }

} //EpnPackageImpl
