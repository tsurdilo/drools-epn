/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}</li>
 *   <li>{@link org.drools.epn.Process#getProcessType <em>Process Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getProcess()
 * @model annotation="ExtendedMetaData name='tProcess' kind='elementOnly'"
 * @generated
 */
public interface Process extends FlowElementsContainer {
    /**
     * Returns the value of the '<em><b>Is Executable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Executable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Executable</em>' attribute.
     * @see #setIsExecutable(boolean)
     * @see org.drools.epn.EpnPackage#getProcess_IsExecutable()
     * @model required="true"
     *        annotation="ExtendedMetaData name='isExecutable' kind='attribute'"
     * @generated
     */
    boolean isIsExecutable();

    /**
     * Sets the value of the '{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Executable</em>' attribute.
     * @see #isIsExecutable()
     * @generated
     */
    void setIsExecutable(boolean value);

    /**
     * Returns the value of the '<em><b>Process Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.drools.epn.ProcessType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Type</em>' attribute.
     * @see org.drools.epn.ProcessType
     * @see #setProcessType(ProcessType)
     * @see org.drools.epn.EpnPackage#getProcess_ProcessType()
     * @model required="true"
     *        annotation="ExtendedMetaData name='processType' kind='attribute'"
     * @generated
     */
    ProcessType getProcessType();

    /**
     * Sets the value of the '{@link org.drools.epn.Process#getProcessType <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Type</em>' attribute.
     * @see org.drools.epn.ProcessType
     * @see #getProcessType()
     * @generated
     */
    void setProcessType(ProcessType value);

} // Process
