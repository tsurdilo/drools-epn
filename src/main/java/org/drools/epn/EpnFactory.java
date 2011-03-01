/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.drools.epn.EpnPackage
 * @generated
 */
public interface EpnFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EpnFactory eINSTANCE = org.drools.epn.impl.EpnFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Activity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity</em>'.
     * @generated
     */
    Activity createActivity();

    /**
     * Returns a new object of class '<em>Flow Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Node</em>'.
     * @generated
     */
    FlowNode createFlowNode();

    /**
     * Returns a new object of class '<em>Flow Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Element</em>'.
     * @generated
     */
    FlowElement createFlowElement();

    /**
     * Returns a new object of class '<em>Base Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Element</em>'.
     * @generated
     */
    BaseElement createBaseElement();

    /**
     * Returns a new object of class '<em>Documentation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Documentation</em>'.
     * @generated
     */
    Documentation createDocumentation();

    /**
     * Returns a new object of class '<em>Sequence Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sequence Flow</em>'.
     * @generated
     */
    SequenceFlow createSequenceFlow();

    /**
     * Returns a new object of class '<em>Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Task</em>'.
     * @generated
     */
    Task createTask();

    /**
     * Returns a new object of class '<em>Interaction Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Node</em>'.
     * @generated
     */
    InteractionNode createInteractionNode();

    /**
     * Returns a new object of class '<em>Conversation Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conversation Link</em>'.
     * @generated
     */
    ConversationLink createConversationLink();

    /**
     * Returns a new object of class '<em>Event Producer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Producer</em>'.
     * @generated
     */
    EventProducer createEventProducer();

    /**
     * Returns a new object of class '<em>Event Consumer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Consumer</em>'.
     * @generated
     */
    EventConsumer createEventConsumer();

    /**
     * Returns a new object of class '<em>Event Agent</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Agent</em>'.
     * @generated
     */
    EventAgent createEventAgent();

    /**
     * Returns a new object of class '<em>Data Input</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Input</em>'.
     * @generated
     */
    DataInput createDataInput();

    /**
     * Returns a new object of class '<em>Data Output</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Output</em>'.
     * @generated
     */
    DataOutput createDataOutput();

    /**
     * Returns a new object of class '<em>Input Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Set</em>'.
     * @generated
     */
    InputSet createInputSet();

    /**
     * Returns a new object of class '<em>Output Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Set</em>'.
     * @generated
     */
    OutputSet createOutputSet();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EpnPackage getEpnPackage();

} //EpnFactory
