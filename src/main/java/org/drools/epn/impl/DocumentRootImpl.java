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
import org.drools.epn.DocumentRoot;
import org.drools.epn.Documentation;
import org.drools.epn.EpnPackage;
import org.drools.epn.EventChannel;
import org.drools.epn.EventConsumer;
import org.drools.epn.EventProcessingAgent;
import org.drools.epn.EventProducer;
import org.drools.epn.FlowNode;
import org.drools.epn.InputSet;
import org.drools.epn.OutputSet;
import org.drools.epn.SequenceFlow;
import org.drools.epn.Task;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getConversationLink <em>Conversation Link</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventProducer <em>Event Producer</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventConsumer <em>Event Consumer</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventProcessingAgent <em>Event Processing Agent</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventChannel <em>Event Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, EpnPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity getActivity() {
        // TODO: implement this method to return the 'Activity' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Activity' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivity(Activity newActivity) {
        // TODO: implement this method to set the 'Activity' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowNode getFlowNode() {
        // TODO: implement this method to return the 'Flow Node' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFlowNode(FlowNode newFlowNode, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Flow Node' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowNode(FlowNode newFlowNode) {
        // TODO: implement this method to set the 'Flow Node' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElement getBaseElement() {
        // TODO: implement this method to return the 'Base Element' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseElement(BaseElement newBaseElement, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Base Element' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseElement(BaseElement newBaseElement) {
        // TODO: implement this method to set the 'Base Element' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation getDocumentation() {
        // TODO: implement this method to return the 'Documentation' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Documentation' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(Documentation newDocumentation) {
        // TODO: implement this method to set the 'Documentation' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow getSequenceFlow() {
        // TODO: implement this method to return the 'Sequence Flow' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSequenceFlow(SequenceFlow newSequenceFlow, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Sequence Flow' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequenceFlow(SequenceFlow newSequenceFlow) {
        // TODO: implement this method to set the 'Sequence Flow' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task getTask() {
        // TODO: implement this method to return the 'Task' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Task' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTask(Task newTask) {
        // TODO: implement this method to set the 'Task' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationLink getConversationLink() {
        // TODO: implement this method to return the 'Conversation Link' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConversationLink(ConversationLink newConversationLink, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Conversation Link' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConversationLink(ConversationLink newConversationLink) {
        // TODO: implement this method to set the 'Conversation Link' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput getDataInput() {
        // TODO: implement this method to return the 'Data Input' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataInput(DataInput newDataInput, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Data Input' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInput(DataInput newDataInput) {
        // TODO: implement this method to set the 'Data Input' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput getDataOutput() {
        // TODO: implement this method to return the 'Data Output' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataOutput(DataOutput newDataOutput, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Data Output' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataOutput(DataOutput newDataOutput) {
        // TODO: implement this method to set the 'Data Output' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSet getInputSet() {
        // TODO: implement this method to return the 'Input Set' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputSet(InputSet newInputSet, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Input Set' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputSet(InputSet newInputSet) {
        // TODO: implement this method to set the 'Input Set' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet getOutputSet() {
        // TODO: implement this method to return the 'Output Set' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputSet(OutputSet newOutputSet, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Output Set' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputSet(OutputSet newOutputSet) {
        // TODO: implement this method to set the 'Output Set' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProducer getEventProducer() {
        // TODO: implement this method to return the 'Event Producer' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventProducer(EventProducer newEventProducer, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Event Producer' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventProducer(EventProducer newEventProducer) {
        // TODO: implement this method to set the 'Event Producer' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventConsumer getEventConsumer() {
        // TODO: implement this method to return the 'Event Consumer' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventConsumer(EventConsumer newEventConsumer, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Event Consumer' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventConsumer(EventConsumer newEventConsumer) {
        // TODO: implement this method to set the 'Event Consumer' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProcessingAgent getEventProcessingAgent() {
        // TODO: implement this method to return the 'Event Processing Agent' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventProcessingAgent(EventProcessingAgent newEventProcessingAgent, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Event Processing Agent' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventProcessingAgent(EventProcessingAgent newEventProcessingAgent) {
        // TODO: implement this method to set the 'Event Processing Agent' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventChannel getEventChannel() {
        // TODO: implement this method to return the 'Event Channel' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventChannel(EventChannel newEventChannel, NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Event Channel' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventChannel(EventChannel newEventChannel) {
        // TODO: implement this method to set the 'Event Channel' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EpnPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case EpnPackage.DOCUMENT_ROOT__ACTIVITY:
                return basicSetActivity(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__FLOW_NODE:
                return basicSetFlowNode(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                return basicSetBaseElement(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                return basicSetSequenceFlow(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__TASK:
                return basicSetTask(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
                return basicSetConversationLink(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__DATA_INPUT:
                return basicSetDataInput(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
                return basicSetDataOutput(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__INPUT_SET:
                return basicSetInputSet(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__OUTPUT_SET:
                return basicSetOutputSet(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                return basicSetEventProducer(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                return basicSetEventConsumer(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                return basicSetEventProcessingAgent(null, msgs);
            case EpnPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                return basicSetEventChannel(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EpnPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case EpnPackage.DOCUMENT_ROOT__ACTIVITY:
                return getActivity();
            case EpnPackage.DOCUMENT_ROOT__FLOW_NODE:
                return getFlowNode();
            case EpnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                return getBaseElement();
            case EpnPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation();
            case EpnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                return getSequenceFlow();
            case EpnPackage.DOCUMENT_ROOT__TASK:
                return getTask();
            case EpnPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
                return getConversationLink();
            case EpnPackage.DOCUMENT_ROOT__DATA_INPUT:
                return getDataInput();
            case EpnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
                return getDataOutput();
            case EpnPackage.DOCUMENT_ROOT__INPUT_SET:
                return getInputSet();
            case EpnPackage.DOCUMENT_ROOT__OUTPUT_SET:
                return getOutputSet();
            case EpnPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                return getEventProducer();
            case EpnPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                return getEventConsumer();
            case EpnPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                return getEventProcessingAgent();
            case EpnPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                return getEventChannel();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EpnPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__ACTIVITY:
                setActivity((Activity)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__FLOW_NODE:
                setFlowNode((FlowNode)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                setBaseElement((BaseElement)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((Documentation)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                setSequenceFlow((SequenceFlow)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__TASK:
                setTask((Task)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
                setConversationLink((ConversationLink)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__DATA_INPUT:
                setDataInput((DataInput)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
                setDataOutput((DataOutput)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__INPUT_SET:
                setInputSet((InputSet)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__OUTPUT_SET:
                setOutputSet((OutputSet)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                setEventProducer((EventProducer)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                setEventConsumer((EventConsumer)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                setEventProcessingAgent((EventProcessingAgent)newValue);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                setEventChannel((EventChannel)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EpnPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case EpnPackage.DOCUMENT_ROOT__ACTIVITY:
                setActivity((Activity)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__FLOW_NODE:
                setFlowNode((FlowNode)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                setBaseElement((BaseElement)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((Documentation)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                setSequenceFlow((SequenceFlow)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__TASK:
                setTask((Task)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
                setConversationLink((ConversationLink)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__DATA_INPUT:
                setDataInput((DataInput)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
                setDataOutput((DataOutput)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__INPUT_SET:
                setInputSet((InputSet)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__OUTPUT_SET:
                setOutputSet((OutputSet)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                setEventProducer((EventProducer)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                setEventConsumer((EventConsumer)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                setEventProcessingAgent((EventProcessingAgent)null);
                return;
            case EpnPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                setEventChannel((EventChannel)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EpnPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case EpnPackage.DOCUMENT_ROOT__ACTIVITY:
                return getActivity() != null;
            case EpnPackage.DOCUMENT_ROOT__FLOW_NODE:
                return getFlowNode() != null;
            case EpnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                return getBaseElement() != null;
            case EpnPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation() != null;
            case EpnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                return getSequenceFlow() != null;
            case EpnPackage.DOCUMENT_ROOT__TASK:
                return getTask() != null;
            case EpnPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
                return getConversationLink() != null;
            case EpnPackage.DOCUMENT_ROOT__DATA_INPUT:
                return getDataInput() != null;
            case EpnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
                return getDataOutput() != null;
            case EpnPackage.DOCUMENT_ROOT__INPUT_SET:
                return getInputSet() != null;
            case EpnPackage.DOCUMENT_ROOT__OUTPUT_SET:
                return getOutputSet() != null;
            case EpnPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                return getEventProducer() != null;
            case EpnPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                return getEventConsumer() != null;
            case EpnPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                return getEventProcessingAgent() != null;
            case EpnPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                return getEventChannel() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
