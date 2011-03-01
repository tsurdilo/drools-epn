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
 * A representation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.drools.epn.OutputSet#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.OutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getOutputSet()
 * @model annotation="ExtendedMetaData name='tOutputSet' kind='elementOnly'"
 * @generated
 */
public interface OutputSet extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data Output Refs</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.DataOutput}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Refs</em>' reference list.
     * @see org.drools.epn.EpnPackage#getOutputSet_DataOutputRefs()
     * @see org.drools.epn.DataOutput#getOutputSetRefs
     * @model opposite="outputSetRefs"
     *        annotation="ExtendedMetaData name='dataOutputRefs' kind='element'"
     * @generated
     */
    EList<DataOutput> getDataOutputRefs();

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
     * @see org.drools.epn.EpnPackage#getOutputSet_Name()
     * @model annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.OutputSet#getName <em>Name</em>}' attribute.
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
     * It is bidirectional and its opposite is '{@link org.drools.epn.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set Refs</em>' reference list.
     * @see org.drools.epn.EpnPackage#getOutputSet_InputSetRefs()
     * @see org.drools.epn.InputSet#getOutputSetRefs
     * @model opposite="outputSetRefs" changeable="false"
     *        annotation="ExtendedMetaData name='outputSetRefs' kind='element'"
     * @generated
     */
    EList<InputSet> getInputSetRefs();

} // OutputSet
