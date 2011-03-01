/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.DataInput#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.DataInput#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getDataInput()
 * @model annotation="ExtendedMetaData name='tDataInput' kind='elementOnly'"
 * @generated
 */
public interface DataInput extends BaseElement {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.drools.epn.EpnPackage#getDataInput_Name()
     * @model annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.DataInput#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.InputSet}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set Refs</em>' reference list.
     * @see org.drools.epn.EpnPackage#getDataInput_InputSetRefs()
     * @see org.drools.epn.InputSet#getDataInputRefs
     * @model opposite="dataInputRefs"
     * @generated
     */
    EList<InputSet> getInputSetRefs();

} // DataInput
