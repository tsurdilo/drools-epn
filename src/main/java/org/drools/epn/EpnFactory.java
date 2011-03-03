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
 * @see org.drools.epn.EPNPackage
 * @generated
 */
public interface EPNFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EPNFactory eINSTANCE = org.drools.epn.impl.EPNFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Bounds</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bounds</em>'.
     * @generated
     */
    Bounds createBounds();

    /**
     * Returns a new object of class '<em>Callable Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Callable Element</em>'.
     * @generated
     */
    CallableElement createCallableElement();

    /**
     * Returns a new object of class '<em>Definitions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Definitions</em>'.
     * @generated
     */
    Definitions createDefinitions();

    /**
     * Returns a new object of class '<em>Documentation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Documentation</em>'.
     * @generated
     */
    Documentation createDocumentation();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    EPNDiagram createEPNDiagram();

    /**
     * Returns a new object of class '<em>Edge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Edge</em>'.
     * @generated
     */
    EPNEdge createEPNEdge();

    /**
     * Returns a new object of class '<em>Label</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Label</em>'.
     * @generated
     */
    EPNLabel createEPNLabel();

    /**
     * Returns a new object of class '<em>Plane</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Plane</em>'.
     * @generated
     */
    EPNPlane createEPNPlane();

    /**
     * Returns a new object of class '<em>Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape</em>'.
     * @generated
     */
    EPNShape createEPNShape();

    /**
     * Returns a new object of class '<em>Event Channel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Channel</em>'.
     * @generated
     */
    EventChannel createEventChannel();

    /**
     * Returns a new object of class '<em>Event Consumer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Consumer</em>'.
     * @generated
     */
    EventConsumer createEventConsumer();

    /**
     * Returns a new object of class '<em>Event Processing Agent</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Processing Agent</em>'.
     * @generated
     */
    EventProcessingAgent createEventProcessingAgent();

    /**
     * Returns a new object of class '<em>Event Producer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Producer</em>'.
     * @generated
     */
    EventProducer createEventProducer();

    /**
     * Returns a new object of class '<em>Extension Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension Type</em>'.
     * @generated
     */
    ExtensionType createExtensionType();

    /**
     * Returns a new object of class '<em>Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Point</em>'.
     * @generated
     */
    Point createPoint();

    /**
     * Returns a new object of class '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process</em>'.
     * @generated
     */
    Process createProcess();

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
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EPNPackage getEPNPackage();

} //EPNFactory
