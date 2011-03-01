/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.drools.epn.EpnFactory
 * @model kind="package"
 * @generated
 */
public interface EpnPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "epn";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://epn/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "epn";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EpnPackage eINSTANCE = org.drools.epn.impl.EpnPackageImpl.init();

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DocumentRootImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ACTIVITY = 1;

    /**
     * The feature id for the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_NODE = 2;

    /**
     * The feature id for the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASE_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENTATION = 4;

    /**
     * The feature id for the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEQUENCE_FLOW = 5;

    /**
     * The feature id for the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASK = 6;

    /**
     * The feature id for the '<em><b>Conversation Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION_LINK = 7;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_INPUT = 8;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OUTPUT = 9;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPUT_SET = 10;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUT_SET = 11;

    /**
     * The feature id for the '<em><b>Event Producer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_PRODUCER = 12;

    /**
     * The feature id for the '<em><b>Event Consumer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_CONSUMER = 13;

    /**
     * The feature id for the '<em><b>Event Processing Agent</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_PROCESSING_AGENT = 14;

    /**
     * The feature id for the '<em><b>Event Channel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_CHANNEL = 15;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 16;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.BaseElementImpl <em>Base Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.BaseElementImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getBaseElement()
     * @generated
     */
    int BASE_ELEMENT = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__DOCUMENTATION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ID = 1;

    /**
     * The number of structural features of the '<em>Base Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.FlowElementImpl <em>Flow Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.FlowElementImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getFlowElement()
     * @generated
     */
    int FLOW_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Flow Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.FlowNodeImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getFlowNode()
     * @generated
     */
    int FLOW_NODE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Flow Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.ActivityImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getActivity()
     * @generated
     */
    int ACTIVITY = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The number of structural features of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DocumentationImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__MIXED = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__TEXT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.SequenceFlowImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getSequenceFlow()
     * @generated
     */
    int SEQUENCE_FLOW = 6;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Sequence Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.TaskImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getTask()
     * @generated
     */
    int TASK = 7;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__INCOMING = ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__OUTGOING = ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__INCOMING_CONVERSATION_LINKS = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__OUTGOING_CONVERSATION_LINKS = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.InteractionNodeImpl <em>Interaction Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.InteractionNodeImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getInteractionNode()
     * @generated
     */
    int INTERACTION_NODE = 8;

    /**
     * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_NODE__INCOMING_CONVERSATION_LINKS = 0;

    /**
     * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS = 1;

    /**
     * The number of structural features of the '<em>Interaction Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_NODE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.ConversationLinkImpl <em>Conversation Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.ConversationLinkImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getConversationLink()
     * @generated
     */
    int CONVERSATION_LINK = 9;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conversation Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventProducerImpl <em>Event Producer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventProducerImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getEventProducer()
     * @generated
     */
    int EVENT_PRODUCER = 10;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Data Outputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__DATA_OUTPUTS = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Inputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__DATA_INPUTS = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Producer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventConsumerImpl <em>Event Consumer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventConsumerImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getEventConsumer()
     * @generated
     */
    int EVENT_CONSUMER = 11;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Data Outputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__DATA_OUTPUTS = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Inputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__DATA_INPUTS = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Consumer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventProcessingAgentImpl <em>Event Processing Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventProcessingAgentImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getEventProcessingAgent()
     * @generated
     */
    int EVENT_PROCESSING_AGENT = 12;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Data Outputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__DATA_OUTPUTS = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Inputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__DATA_INPUTS = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Processing Agent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DataInputImpl <em>Data Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DataInputImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getDataInput()
     * @generated
     */
    int DATA_INPUT = 13;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input Set Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__INPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DataOutputImpl <em>Data Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DataOutputImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getDataOutput()
     * @generated
     */
    int DATA_OUTPUT = 14;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Set Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__OUTPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.InputSetImpl <em>Input Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.InputSetImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getInputSet()
     * @generated
     */
    int INPUT_SET = 15;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Data Input Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__DATA_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Set Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__OUTPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Input Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.OutputSetImpl <em>Output Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.OutputSetImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getOutputSet()
     * @generated
     */
    int OUTPUT_SET = 16;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Data Output Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__DATA_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Input Set Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__INPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Output Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventChannelImpl <em>Event Channel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventChannelImpl
     * @see org.drools.epn.impl.EpnPackageImpl#getEventChannel()
     * @generated
     */
    int EVENT_CHANNEL = 17;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

    /**
     * The feature id for the '<em><b>Data Outputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__DATA_OUTPUTS = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Inputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__DATA_INPUTS = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Channel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;


    /**
     * Returns the meta object for class '{@link org.drools.epn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.drools.epn.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.drools.epn.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getActivity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activity</em>'.
     * @see org.drools.epn.DocumentRoot#getActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Activity();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getFlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Node</em>'.
     * @see org.drools.epn.DocumentRoot#getFlowNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowNode();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getBaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Base Element</em>'.
     * @see org.drools.epn.DocumentRoot#getBaseElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BaseElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see org.drools.epn.DocumentRoot#getDocumentation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence Flow</em>'.
     * @see org.drools.epn.DocumentRoot#getSequenceFlow()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SequenceFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Task</em>'.
     * @see org.drools.epn.DocumentRoot#getTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Task();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation Link</em>'.
     * @see org.drools.epn.DocumentRoot#getConversationLink()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConversationLink();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input</em>'.
     * @see org.drools.epn.DocumentRoot#getDataInput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output</em>'.
     * @see org.drools.epn.DocumentRoot#getDataOutput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Set</em>'.
     * @see org.drools.epn.DocumentRoot#getInputSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_InputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Set</em>'.
     * @see org.drools.epn.DocumentRoot#getOutputSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OutputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventProducer <em>Event Producer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Producer</em>'.
     * @see org.drools.epn.DocumentRoot#getEventProducer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventProducer();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventConsumer <em>Event Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Consumer</em>'.
     * @see org.drools.epn.DocumentRoot#getEventConsumer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventConsumer();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventProcessingAgent <em>Event Processing Agent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Processing Agent</em>'.
     * @see org.drools.epn.DocumentRoot#getEventProcessingAgent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventProcessingAgent();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventChannel <em>Event Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Channel</em>'.
     * @see org.drools.epn.DocumentRoot#getEventChannel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventChannel();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity</em>'.
     * @see org.drools.epn.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for class '{@link org.drools.epn.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Node</em>'.
     * @see org.drools.epn.FlowNode
     * @generated
     */
    EClass getFlowNode();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.FlowNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming</em>'.
     * @see org.drools.epn.FlowNode#getIncoming()
     * @see #getFlowNode()
     * @generated
     */
    EReference getFlowNode_Incoming();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.FlowNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing</em>'.
     * @see org.drools.epn.FlowNode#getOutgoing()
     * @see #getFlowNode()
     * @generated
     */
    EReference getFlowNode_Outgoing();

    /**
     * Returns the meta object for class '{@link org.drools.epn.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Element</em>'.
     * @see org.drools.epn.FlowElement
     * @generated
     */
    EClass getFlowElement();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.FlowElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.FlowElement#getName()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_Name();

    /**
     * Returns the meta object for class '{@link org.drools.epn.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element</em>'.
     * @see org.drools.epn.BaseElement
     * @generated
     */
    EClass getBaseElement();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.BaseElement#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Documentation</em>'.
     * @see org.drools.epn.BaseElement#getDocumentation()
     * @see #getBaseElement()
     * @generated
     */
    EReference getBaseElement_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.BaseElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.BaseElement#getId()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Id();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.drools.epn.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.Documentation#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.drools.epn.Documentation#getMixed()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Mixed();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Documentation#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see org.drools.epn.Documentation#getText()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Text();

    /**
     * Returns the meta object for class '{@link org.drools.epn.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Flow</em>'.
     * @see org.drools.epn.SequenceFlow
     * @generated
     */
    EClass getSequenceFlow();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.drools.epn.SequenceFlow#getSourceRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EReference getSequenceFlow_SourceRef();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Ref</em>'.
     * @see org.drools.epn.SequenceFlow#getTargetRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EReference getSequenceFlow_TargetRef();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see org.drools.epn.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for class '{@link org.drools.epn.InteractionNode <em>Interaction Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Node</em>'.
     * @see org.drools.epn.InteractionNode
     * @generated
     */
    EClass getInteractionNode();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Conversation Links</em>'.
     * @see org.drools.epn.InteractionNode#getIncomingConversationLinks()
     * @see #getInteractionNode()
     * @generated
     */
    EReference getInteractionNode_IncomingConversationLinks();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Conversation Links</em>'.
     * @see org.drools.epn.InteractionNode#getOutgoingConversationLinks()
     * @see #getInteractionNode()
     * @generated
     */
    EReference getInteractionNode_OutgoingConversationLinks();

    /**
     * Returns the meta object for class '{@link org.drools.epn.ConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation Link</em>'.
     * @see org.drools.epn.ConversationLink
     * @generated
     */
    EClass getConversationLink();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.ConversationLink#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.ConversationLink#getName()
     * @see #getConversationLink()
     * @generated
     */
    EAttribute getConversationLink_Name();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.ConversationLink#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.drools.epn.ConversationLink#getSourceRef()
     * @see #getConversationLink()
     * @generated
     */
    EReference getConversationLink_SourceRef();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.ConversationLink#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Ref</em>'.
     * @see org.drools.epn.ConversationLink#getTargetRef()
     * @see #getConversationLink()
     * @generated
     */
    EReference getConversationLink_TargetRef();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventProducer <em>Event Producer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Producer</em>'.
     * @see org.drools.epn.EventProducer
     * @generated
     */
    EClass getEventProducer();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventProducer#getDataOutputs <em>Data Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Outputs</em>'.
     * @see org.drools.epn.EventProducer#getDataOutputs()
     * @see #getEventProducer()
     * @generated
     */
    EReference getEventProducer_DataOutputs();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventProducer#getDataInputs <em>Data Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Inputs</em>'.
     * @see org.drools.epn.EventProducer#getDataInputs()
     * @see #getEventProducer()
     * @generated
     */
    EReference getEventProducer_DataInputs();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventConsumer <em>Event Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Consumer</em>'.
     * @see org.drools.epn.EventConsumer
     * @generated
     */
    EClass getEventConsumer();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventConsumer#getDataOutputs <em>Data Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Outputs</em>'.
     * @see org.drools.epn.EventConsumer#getDataOutputs()
     * @see #getEventConsumer()
     * @generated
     */
    EReference getEventConsumer_DataOutputs();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventConsumer#getDataInputs <em>Data Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Inputs</em>'.
     * @see org.drools.epn.EventConsumer#getDataInputs()
     * @see #getEventConsumer()
     * @generated
     */
    EReference getEventConsumer_DataInputs();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventProcessingAgent <em>Event Processing Agent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Processing Agent</em>'.
     * @see org.drools.epn.EventProcessingAgent
     * @generated
     */
    EClass getEventProcessingAgent();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventProcessingAgent#getDataOutputs <em>Data Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Outputs</em>'.
     * @see org.drools.epn.EventProcessingAgent#getDataOutputs()
     * @see #getEventProcessingAgent()
     * @generated
     */
    EReference getEventProcessingAgent_DataOutputs();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventProcessingAgent#getDataInputs <em>Data Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Inputs</em>'.
     * @see org.drools.epn.EventProcessingAgent#getDataInputs()
     * @see #getEventProcessingAgent()
     * @generated
     */
    EReference getEventProcessingAgent_DataInputs();

    /**
     * Returns the meta object for class '{@link org.drools.epn.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Input</em>'.
     * @see org.drools.epn.DataInput
     * @generated
     */
    EClass getDataInput();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.DataInput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.DataInput#getName()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_Name();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.DataInput#getInputSetRefs <em>Input Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Input Set Refs</em>'.
     * @see org.drools.epn.DataInput#getInputSetRefs()
     * @see #getDataInput()
     * @generated
     */
    EReference getDataInput_InputSetRefs();

    /**
     * Returns the meta object for class '{@link org.drools.epn.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Output</em>'.
     * @see org.drools.epn.DataOutput
     * @generated
     */
    EClass getDataOutput();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.DataOutput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.DataOutput#getName()
     * @see #getDataOutput()
     * @generated
     */
    EAttribute getDataOutput_Name();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Output Set Refs</em>'.
     * @see org.drools.epn.DataOutput#getOutputSetRefs()
     * @see #getDataOutput()
     * @generated
     */
    EReference getDataOutput_OutputSetRefs();

    /**
     * Returns the meta object for class '{@link org.drools.epn.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Set</em>'.
     * @see org.drools.epn.InputSet
     * @generated
     */
    EClass getInputSet();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Data Input Refs</em>'.
     * @see org.drools.epn.InputSet#getDataInputRefs()
     * @see #getInputSet()
     * @generated
     */
    EReference getInputSet_DataInputRefs();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Output Set Refs</em>'.
     * @see org.drools.epn.InputSet#getOutputSetRefs()
     * @see #getInputSet()
     * @generated
     */
    EReference getInputSet_OutputSetRefs();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.InputSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.InputSet#getName()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_Name();

    /**
     * Returns the meta object for class '{@link org.drools.epn.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Set</em>'.
     * @see org.drools.epn.OutputSet
     * @generated
     */
    EClass getOutputSet();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Data Output Refs</em>'.
     * @see org.drools.epn.OutputSet#getDataOutputRefs()
     * @see #getOutputSet()
     * @generated
     */
    EReference getOutputSet_DataOutputRefs();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.OutputSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.OutputSet#getName()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_Name();

    /**
     * Returns the meta object for the reference list '{@link org.drools.epn.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Input Set Refs</em>'.
     * @see org.drools.epn.OutputSet#getInputSetRefs()
     * @see #getOutputSet()
     * @generated
     */
    EReference getOutputSet_InputSetRefs();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventChannel <em>Event Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Channel</em>'.
     * @see org.drools.epn.EventChannel
     * @generated
     */
    EClass getEventChannel();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventChannel#getDataOutputs <em>Data Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Outputs</em>'.
     * @see org.drools.epn.EventChannel#getDataOutputs()
     * @see #getEventChannel()
     * @generated
     */
    EReference getEventChannel_DataOutputs();

    /**
     * Returns the meta object for the reference '{@link org.drools.epn.EventChannel#getDataInputs <em>Data Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Inputs</em>'.
     * @see org.drools.epn.EventChannel#getDataInputs()
     * @see #getEventChannel()
     * @generated
     */
    EReference getEventChannel_DataInputs();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EpnFactory getEpnFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DocumentRootImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ACTIVITY = eINSTANCE.getDocumentRoot_Activity();

        /**
         * The meta object literal for the '<em><b>Flow Node</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FLOW_NODE = eINSTANCE.getDocumentRoot_FlowNode();

        /**
         * The meta object literal for the '<em><b>Base Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BASE_ELEMENT = eINSTANCE.getDocumentRoot_BaseElement();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

        /**
         * The meta object literal for the '<em><b>Sequence Flow</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SEQUENCE_FLOW = eINSTANCE.getDocumentRoot_SequenceFlow();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TASK = eINSTANCE.getDocumentRoot_Task();

        /**
         * The meta object literal for the '<em><b>Conversation Link</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONVERSATION_LINK = eINSTANCE.getDocumentRoot_ConversationLink();

        /**
         * The meta object literal for the '<em><b>Data Input</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DATA_INPUT = eINSTANCE.getDocumentRoot_DataInput();

        /**
         * The meta object literal for the '<em><b>Data Output</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DATA_OUTPUT = eINSTANCE.getDocumentRoot_DataOutput();

        /**
         * The meta object literal for the '<em><b>Input Set</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INPUT_SET = eINSTANCE.getDocumentRoot_InputSet();

        /**
         * The meta object literal for the '<em><b>Output Set</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OUTPUT_SET = eINSTANCE.getDocumentRoot_OutputSet();

        /**
         * The meta object literal for the '<em><b>Event Producer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_PRODUCER = eINSTANCE.getDocumentRoot_EventProducer();

        /**
         * The meta object literal for the '<em><b>Event Consumer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_CONSUMER = eINSTANCE.getDocumentRoot_EventConsumer();

        /**
         * The meta object literal for the '<em><b>Event Processing Agent</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_PROCESSING_AGENT = eINSTANCE.getDocumentRoot_EventProcessingAgent();

        /**
         * The meta object literal for the '<em><b>Event Channel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_CHANNEL = eINSTANCE.getDocumentRoot_EventChannel();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.ActivityImpl <em>Activity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.ActivityImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getActivity()
         * @generated
         */
        EClass ACTIVITY = eINSTANCE.getActivity();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.FlowNodeImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getFlowNode()
         * @generated
         */
        EClass FLOW_NODE = eINSTANCE.getFlowNode();

        /**
         * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_NODE__INCOMING = eINSTANCE.getFlowNode_Incoming();

        /**
         * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_NODE__OUTGOING = eINSTANCE.getFlowNode_Outgoing();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.FlowElementImpl <em>Flow Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.FlowElementImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getFlowElement()
         * @generated
         */
        EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOW_ELEMENT__NAME = eINSTANCE.getFlowElement_Name();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.BaseElementImpl <em>Base Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.BaseElementImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getBaseElement()
         * @generated
         */
        EClass BASE_ELEMENT = eINSTANCE.getBaseElement();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_ELEMENT__DOCUMENTATION = eINSTANCE.getBaseElement_Documentation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASE_ELEMENT__ID = eINSTANCE.getBaseElement_Id();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DocumentationImpl <em>Documentation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DocumentationImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getDocumentation()
         * @generated
         */
        EClass DOCUMENTATION = eINSTANCE.getDocumentation();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__MIXED = eINSTANCE.getDocumentation_Mixed();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__TEXT = eINSTANCE.getDocumentation_Text();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.SequenceFlowImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getSequenceFlow()
         * @generated
         */
        EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEQUENCE_FLOW__SOURCE_REF = eINSTANCE.getSequenceFlow_SourceRef();

        /**
         * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEQUENCE_FLOW__TARGET_REF = eINSTANCE.getSequenceFlow_TargetRef();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.TaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.TaskImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getTask()
         * @generated
         */
        EClass TASK = eINSTANCE.getTask();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.InteractionNodeImpl <em>Interaction Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.InteractionNodeImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getInteractionNode()
         * @generated
         */
        EClass INTERACTION_NODE = eINSTANCE.getInteractionNode();

        /**
         * The meta object literal for the '<em><b>Incoming Conversation Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_NODE__INCOMING_CONVERSATION_LINKS = eINSTANCE.getInteractionNode_IncomingConversationLinks();

        /**
         * The meta object literal for the '<em><b>Outgoing Conversation Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS = eINSTANCE.getInteractionNode_OutgoingConversationLinks();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.ConversationLinkImpl <em>Conversation Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.ConversationLinkImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getConversationLink()
         * @generated
         */
        EClass CONVERSATION_LINK = eINSTANCE.getConversationLink();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONVERSATION_LINK__NAME = eINSTANCE.getConversationLink_Name();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONVERSATION_LINK__SOURCE_REF = eINSTANCE.getConversationLink_SourceRef();

        /**
         * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONVERSATION_LINK__TARGET_REF = eINSTANCE.getConversationLink_TargetRef();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventProducerImpl <em>Event Producer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventProducerImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getEventProducer()
         * @generated
         */
        EClass EVENT_PRODUCER = eINSTANCE.getEventProducer();

        /**
         * The meta object literal for the '<em><b>Data Outputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_PRODUCER__DATA_OUTPUTS = eINSTANCE.getEventProducer_DataOutputs();

        /**
         * The meta object literal for the '<em><b>Data Inputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_PRODUCER__DATA_INPUTS = eINSTANCE.getEventProducer_DataInputs();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventConsumerImpl <em>Event Consumer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventConsumerImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getEventConsumer()
         * @generated
         */
        EClass EVENT_CONSUMER = eINSTANCE.getEventConsumer();

        /**
         * The meta object literal for the '<em><b>Data Outputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_CONSUMER__DATA_OUTPUTS = eINSTANCE.getEventConsumer_DataOutputs();

        /**
         * The meta object literal for the '<em><b>Data Inputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_CONSUMER__DATA_INPUTS = eINSTANCE.getEventConsumer_DataInputs();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventProcessingAgentImpl <em>Event Processing Agent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventProcessingAgentImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getEventProcessingAgent()
         * @generated
         */
        EClass EVENT_PROCESSING_AGENT = eINSTANCE.getEventProcessingAgent();

        /**
         * The meta object literal for the '<em><b>Data Outputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_PROCESSING_AGENT__DATA_OUTPUTS = eINSTANCE.getEventProcessingAgent_DataOutputs();

        /**
         * The meta object literal for the '<em><b>Data Inputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_PROCESSING_AGENT__DATA_INPUTS = eINSTANCE.getEventProcessingAgent_DataInputs();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DataInputImpl <em>Data Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DataInputImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getDataInput()
         * @generated
         */
        EClass DATA_INPUT = eINSTANCE.getDataInput();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_INPUT__NAME = eINSTANCE.getDataInput_Name();

        /**
         * The meta object literal for the '<em><b>Input Set Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INPUT__INPUT_SET_REFS = eINSTANCE.getDataInput_InputSetRefs();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DataOutputImpl <em>Data Output</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DataOutputImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getDataOutput()
         * @generated
         */
        EClass DATA_OUTPUT = eINSTANCE.getDataOutput();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OUTPUT__NAME = eINSTANCE.getDataOutput_Name();

        /**
         * The meta object literal for the '<em><b>Output Set Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_OUTPUT__OUTPUT_SET_REFS = eINSTANCE.getDataOutput_OutputSetRefs();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.InputSetImpl <em>Input Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.InputSetImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getInputSet()
         * @generated
         */
        EClass INPUT_SET = eINSTANCE.getInputSet();

        /**
         * The meta object literal for the '<em><b>Data Input Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_SET__DATA_INPUT_REFS = eINSTANCE.getInputSet_DataInputRefs();

        /**
         * The meta object literal for the '<em><b>Output Set Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_SET__OUTPUT_SET_REFS = eINSTANCE.getInputSet_OutputSetRefs();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_SET__NAME = eINSTANCE.getInputSet_Name();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.OutputSetImpl <em>Output Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.OutputSetImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getOutputSet()
         * @generated
         */
        EClass OUTPUT_SET = eINSTANCE.getOutputSet();

        /**
         * The meta object literal for the '<em><b>Data Output Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_SET__DATA_OUTPUT_REFS = eINSTANCE.getOutputSet_DataOutputRefs();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_SET__NAME = eINSTANCE.getOutputSet_Name();

        /**
         * The meta object literal for the '<em><b>Input Set Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_SET__INPUT_SET_REFS = eINSTANCE.getOutputSet_InputSetRefs();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventChannelImpl <em>Event Channel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventChannelImpl
         * @see org.drools.epn.impl.EpnPackageImpl#getEventChannel()
         * @generated
         */
        EClass EVENT_CHANNEL = eINSTANCE.getEventChannel();

        /**
         * The meta object literal for the '<em><b>Data Outputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_CHANNEL__DATA_OUTPUTS = eINSTANCE.getEventChannel_DataOutputs();

        /**
         * The meta object literal for the '<em><b>Data Inputs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_CHANNEL__DATA_INPUTS = eINSTANCE.getEventChannel_DataInputs();

    }

} //EpnPackage
