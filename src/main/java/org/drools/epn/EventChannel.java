/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EventChannel#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.drools.epn.EventChannel#getDataInputs <em>Data Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getEventChannel()
 * @model annotation="ExtendedMetaData name='tEventChannel' kind='elementOnly'"
 * @generated
 */
public interface EventChannel extends Task {
    /**
     * Returns the value of the '<em><b>Data Outputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Outputs</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Outputs</em>' reference.
     * @see #setDataOutputs(DataOutput)
     * @see org.drools.epn.EpnPackage#getEventChannel_DataOutputs()
     * @model upper="-2"
     * @generated
     */
    DataOutput getDataOutputs();

    /**
     * Sets the value of the '{@link org.drools.epn.EventChannel#getDataOutputs <em>Data Outputs</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Outputs</em>' reference.
     * @see #getDataOutputs()
     * @generated
     */
    void setDataOutputs(DataOutput value);

    /**
     * Returns the value of the '<em><b>Data Inputs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Inputs</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Inputs</em>' reference.
     * @see #setDataInputs(DataInput)
     * @see org.drools.epn.EpnPackage#getEventChannel_DataInputs()
     * @model upper="-2"
     * @generated
     */
    DataInput getDataInputs();

    /**
     * Sets the value of the '{@link org.drools.epn.EventChannel#getDataInputs <em>Data Inputs</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Inputs</em>' reference.
     * @see #getDataInputs()
     * @generated
     */
    void setDataInputs(DataInput value);

} // EventChannel
