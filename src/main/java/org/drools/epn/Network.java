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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Network#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.drools.epn.Network#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.drools.epn.Network#isIsExecutable <em>Is Executable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getNetwork()
 * @model extendedMetaData="name='Network' kind='elementOnly'"
 * @generated
 */
public interface Network extends CallableElement {
    /**
     * Returns the value of the '<em><b>Flow Element</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element</em>' containment reference list.
     * @see org.drools.epn.EPNPackage#getNetwork_FlowElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace'"
     * @generated
     */
    EList<FlowElement> getFlowElement();

    /**
     * Returns the value of the '<em><b>Definitional Collaboration Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definitional Collaboration Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definitional Collaboration Ref</em>' attribute.
     * @see #setDefinitionalCollaborationRef(QName)
     * @see org.drools.epn.EPNPackage#getNetwork_DefinitionalCollaborationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='definitionalCollaborationRef'"
     * @generated
     */
    QName getDefinitionalCollaborationRef();

    /**
     * Sets the value of the '{@link org.drools.epn.Network#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definitional Collaboration Ref</em>' attribute.
     * @see #getDefinitionalCollaborationRef()
     * @generated
     */
    void setDefinitionalCollaborationRef(QName value);

    /**
     * Returns the value of the '<em><b>Is Executable</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Executable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Executable</em>' attribute.
     * @see #isSetIsExecutable()
     * @see #unsetIsExecutable()
     * @see #setIsExecutable(boolean)
     * @see org.drools.epn.EPNPackage#getNetwork_IsExecutable()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isExecutable'"
     * @generated
     */
    boolean isIsExecutable();

    /**
     * Sets the value of the '{@link org.drools.epn.Network#isIsExecutable <em>Is Executable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Executable</em>' attribute.
     * @see #isSetIsExecutable()
     * @see #unsetIsExecutable()
     * @see #isIsExecutable()
     * @generated
     */
    void setIsExecutable(boolean value);

    /**
     * Unsets the value of the '{@link org.drools.epn.Network#isIsExecutable <em>Is Executable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExecutable()
     * @see #isIsExecutable()
     * @see #setIsExecutable(boolean)
     * @generated
     */
    void unsetIsExecutable();

    /**
     * Returns whether the value of the '{@link org.drools.epn.Network#isIsExecutable <em>Is Executable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Executable</em>' attribute is set.
     * @see #unsetIsExecutable()
     * @see #isIsExecutable()
     * @see #setIsExecutable(boolean)
     * @generated
     */
    boolean isSetIsExecutable();

} // Network
