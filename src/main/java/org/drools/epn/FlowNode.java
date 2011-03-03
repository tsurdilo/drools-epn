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
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.drools.epn.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getFlowNode()
 * @model abstract="true"
 *        extendedMetaData="name='FlowNode' kind='elementOnly'"
 * @generated
 */
public interface FlowNode extends FlowElement {
    /**
     * Returns the value of the '<em><b>Incoming</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getFlowNode_Incoming()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='incoming' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getIncoming();

    /**
     * Returns the value of the '<em><b>Outgoing</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getFlowNode_Outgoing()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='outgoing' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getOutgoing();

} // FlowNode
