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
 * A representation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.InputSet#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link org.drools.epn.InputSet#getOutputSetRefs <em>Output Set Refs</em>}</li>
 *   <li>{@link org.drools.epn.InputSet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getInputSet()
 * @model annotation="ExtendedMetaData name='tInputSet' kind='elementOnly'"
 * @generated
 */
public interface InputSet extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data Input Refs</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.DataInput}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.DataInput#getInputSetRefs <em>Input Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input Refs</em>' reference list.
     * @see org.drools.epn.EpnPackage#getInputSet_DataInputRefs()
     * @see org.drools.epn.DataInput#getInputSetRefs
     * @model opposite="inputSetRefs"
     *        annotation="ExtendedMetaData name='dataInputRefs' kind='element'"
     * @generated
     */
    EList<DataInput> getDataInputRefs();

    /**
     * Returns the value of the '<em><b>Output Set Refs</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.OutputSet}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set Refs</em>' reference list.
     * @see org.drools.epn.EpnPackage#getInputSet_OutputSetRefs()
     * @see org.drools.epn.OutputSet#getInputSetRefs
     * @model opposite="inputSetRefs" changeable="false"
     *        annotation="ExtendedMetaData name='outputSetRefs' kind='element'"
     * @generated
     */
    EList<OutputSet> getOutputSetRefs();

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
     * @see org.drools.epn.EpnPackage#getInputSet_Name()
     * @model annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.InputSet#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // InputSet
