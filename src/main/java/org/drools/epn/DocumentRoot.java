/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getConversationLink <em>Conversation Link</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventProducer <em>Event Producer</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventConsumer <em>Event Consumer</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventAgent <em>Event Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getDocumentRoot()
 * @model annotation="ExtendedMetaAttributes name='null' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.drools.epn.EpnPackage#getDocumentRoot_Mixed()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        annotation="ExtendedMetaAttributes name=':mixed' kind='elementWildcard'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity</em>' containment reference.
     * @see #setActivity(Activity)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_Activity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='activity' kind='element'"
     * @generated
     */
    Activity getActivity();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getActivity <em>Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity</em>' containment reference.
     * @see #getActivity()
     * @generated
     */
    void setActivity(Activity value);

    /**
     * Returns the value of the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Node</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Node</em>' containment reference.
     * @see #setFlowNode(FlowNode)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_FlowNode()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='flowNode' kind='element'"
     * @generated
     */
    FlowNode getFlowNode();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getFlowNode <em>Flow Node</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Node</em>' containment reference.
     * @see #getFlowNode()
     * @generated
     */
    void setFlowNode(FlowNode value);

    /**
     * Returns the value of the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Element</em>' containment reference.
     * @see #setBaseElement(BaseElement)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_BaseElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='baseElement' kind='element'"
     * @generated
     */
    BaseElement getBaseElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getBaseElement <em>Base Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Element</em>' containment reference.
     * @see #getBaseElement()
     * @generated
     */
    void setBaseElement(BaseElement value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(Documentation)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_Documentation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='documentation' kind='element'"
     * @generated
     */
    Documentation getDocumentation();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(Documentation value);

    /**
     * Returns the value of the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence Flow</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence Flow</em>' containment reference.
     * @see #setSequenceFlow(SequenceFlow)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_SequenceFlow()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='sequenceFlow' kind='element'"
     * @generated
     */
    SequenceFlow getSequenceFlow();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Flow</em>' containment reference.
     * @see #getSequenceFlow()
     * @generated
     */
    void setSequenceFlow(SequenceFlow value);

    /**
     * Returns the value of the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task</em>' containment reference.
     * @see #setTask(Task)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_Task()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='task' kind='element'"
     * @generated
     */
    Task getTask();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getTask <em>Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task</em>' containment reference.
     * @see #getTask()
     * @generated
     */
    void setTask(Task value);

    /**
     * Returns the value of the '<em><b>Conversation Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Link</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Link</em>' containment reference.
     * @see #setConversationLink(ConversationLink)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_ConversationLink()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='conversationLink' kind='element'"
     * @generated
     */
    ConversationLink getConversationLink();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getConversationLink <em>Conversation Link</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conversation Link</em>' containment reference.
     * @see #getConversationLink()
     * @generated
     */
    void setConversationLink(ConversationLink value);

    /**
     * Returns the value of the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input</em>' containment reference.
     * @see #setDataInput(DataInput)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_DataInput()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='dataInput' kind='element'"
     * @generated
     */
    DataInput getDataInput();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDataInput <em>Data Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Input</em>' containment reference.
     * @see #getDataInput()
     * @generated
     */
    void setDataInput(DataInput value);

    /**
     * Returns the value of the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output</em>' containment reference.
     * @see #setDataOutput(DataOutput)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_DataOutput()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='dataOutput' kind='element'"
     * @generated
     */
    DataOutput getDataOutput();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDataOutput <em>Data Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Output</em>' containment reference.
     * @see #getDataOutput()
     * @generated
     */
    void setDataOutput(DataOutput value);

    /**
     * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set</em>' containment reference.
     * @see #setInputSet(InputSet)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_InputSet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='inputSet' kind='element'"
     * @generated
     */
    InputSet getInputSet();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getInputSet <em>Input Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Set</em>' containment reference.
     * @see #getInputSet()
     * @generated
     */
    void setInputSet(InputSet value);

    /**
     * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set</em>' containment reference.
     * @see #setOutputSet(OutputSet)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_OutputSet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='outputSet' kind='element'"
     * @generated
     */
    OutputSet getOutputSet();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getOutputSet <em>Output Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Set</em>' containment reference.
     * @see #getOutputSet()
     * @generated
     */
    void setOutputSet(OutputSet value);

    /**
     * Returns the value of the '<em><b>Event Producer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Producer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Producer</em>' containment reference.
     * @see #setEventProducer(EventProducer)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_EventProducer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='eventProducer' kind='element'"
     * @generated
     */
    EventProducer getEventProducer();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventProducer <em>Event Producer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Producer</em>' containment reference.
     * @see #getEventProducer()
     * @generated
     */
    void setEventProducer(EventProducer value);

    /**
     * Returns the value of the '<em><b>Event Consumer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Consumer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Consumer</em>' containment reference.
     * @see #setEventConsumer(EventConsumer)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_EventConsumer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='eventConsumer' kind='element'"
     * @generated
     */
    EventConsumer getEventConsumer();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventConsumer <em>Event Consumer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Consumer</em>' containment reference.
     * @see #getEventConsumer()
     * @generated
     */
    void setEventConsumer(EventConsumer value);

    /**
     * Returns the value of the '<em><b>Event Agent</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Agent</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Agent</em>' containment reference.
     * @see #setEventAgent(EventAgent)
     * @see org.drools.epn.EpnPackage#getDocumentRoot_EventAgent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        annotation="ExtendedMetaData name='eventAgent' kind='element'"
     * @generated
     */
    EventAgent getEventAgent();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventAgent <em>Event Agent</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Agent</em>' containment reference.
     * @see #getEventAgent()
     * @generated
     */
    void setEventAgent(EventAgent value);

} // DocumentRoot
