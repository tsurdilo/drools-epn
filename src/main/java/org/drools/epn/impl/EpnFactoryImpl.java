/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpnFactoryImpl extends EFactoryImpl implements EpnFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EpnFactory init() {
        try {
            EpnFactory theEpnFactory = (EpnFactory)EPackage.Registry.INSTANCE.getEFactory("http://epn/1.0"); 
            if (theEpnFactory != null) {
                return theEpnFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EpnFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EpnFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EpnPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case EpnPackage.ACTIVITY: return createActivity();
            case EpnPackage.FLOW_NODE: return createFlowNode();
            case EpnPackage.FLOW_ELEMENT: return createFlowElement();
            case EpnPackage.BASE_ELEMENT: return createBaseElement();
            case EpnPackage.DOCUMENTATION: return createDocumentation();
            case EpnPackage.SEQUENCE_FLOW: return createSequenceFlow();
            case EpnPackage.TASK: return createTask();
            case EpnPackage.INTERACTION_NODE: return createInteractionNode();
            case EpnPackage.CONVERSATION_LINK: return createConversationLink();
            case EpnPackage.EVENT_PRODUCER: return createEventProducer();
            case EpnPackage.EVENT_CONSUMER: return createEventConsumer();
            case EpnPackage.EVENT_AGENT: return createEventAgent();
            case EpnPackage.DATA_INPUT: return createDataInput();
            case EpnPackage.DATA_OUTPUT: return createDataOutput();
            case EpnPackage.INPUT_SET: return createInputSet();
            case EpnPackage.OUTPUT_SET: return createOutputSet();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity createActivity() {
        ActivityImpl activity = new ActivityImpl();
        return activity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowNode createFlowNode() {
        FlowNodeImpl flowNode = new FlowNodeImpl();
        return flowNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowElement createFlowElement() {
        FlowElementImpl flowElement = new FlowElementImpl();
        return flowElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElement createBaseElement() {
        BaseElementImpl baseElement = new BaseElementImpl();
        return baseElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation createDocumentation() {
        DocumentationImpl documentation = new DocumentationImpl();
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow createSequenceFlow() {
        SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
        return sequenceFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionNode createInteractionNode() {
        InteractionNodeImpl interactionNode = new InteractionNodeImpl();
        return interactionNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationLink createConversationLink() {
        ConversationLinkImpl conversationLink = new ConversationLinkImpl();
        return conversationLink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProducer createEventProducer() {
        EventProducerImpl eventProducer = new EventProducerImpl();
        return eventProducer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventConsumer createEventConsumer() {
        EventConsumerImpl eventConsumer = new EventConsumerImpl();
        return eventConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventAgent createEventAgent() {
        EventAgentImpl eventAgent = new EventAgentImpl();
        return eventAgent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput createDataInput() {
        DataInputImpl dataInput = new DataInputImpl();
        return dataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput createDataOutput() {
        DataOutputImpl dataOutput = new DataOutputImpl();
        return dataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSet createInputSet() {
        InputSetImpl inputSet = new InputSetImpl();
        return inputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet createOutputSet() {
        OutputSetImpl outputSet = new OutputSetImpl();
        return outputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EpnPackage getEpnPackage() {
        return (EpnPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EpnPackage getPackage() {
        return EpnPackage.eINSTANCE;
    }

} //EpnFactoryImpl
