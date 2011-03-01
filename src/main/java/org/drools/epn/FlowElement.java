/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.FlowElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getFlowElement()
 * @model annotation="ExtendedMetaData name='tFlowElement' kind='elementOnly'"
 * @generated
 */
public interface FlowElement extends BaseElement {
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
     * @see org.drools.epn.EpnPackage#getFlowElement_Name()
     * @model ordered="false"
     *        annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.FlowElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // FlowElement
