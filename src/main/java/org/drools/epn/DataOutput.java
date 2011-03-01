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
 * A representation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.DataOutput#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getDataOutput()
 * @model annotation="ExtendedMetaData name='tDataOutput' kind='elementOnly'"
 * @generated
 */
public interface DataOutput extends BaseElement {
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
     * @see org.drools.epn.EpnPackage#getDataOutput_Name()
     * @model annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.DataOutput#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Output Set Refs</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.OutputSet}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set Refs</em>' reference list.
     * @see org.drools.epn.EpnPackage#getDataOutput_OutputSetRefs()
     * @see org.drools.epn.OutputSet#getDataOutputRefs
     * @model opposite="dataOutputRefs"
     * @generated
     */
    EList<OutputSet> getOutputSetRefs();

} // DataOutput
