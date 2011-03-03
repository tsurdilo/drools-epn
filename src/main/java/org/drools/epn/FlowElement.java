/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}</li>
 *   <li>{@link org.drools.epn.FlowElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getFlowElement()
 * @model abstract="true"
 *        extendedMetaData="name='FlowElement' kind='elementOnly'"
 * @generated
 */
public interface FlowElement extends BaseElement {
    /**
     * Returns the value of the '<em><b>Category Value Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Value Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Value Ref</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getFlowElement_CategoryValueRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='categoryValueRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getCategoryValueRef();

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
     * @see org.drools.epn.EPNPackage#getFlowElement_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
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
