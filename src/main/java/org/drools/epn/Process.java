/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Process#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.drools.epn.Process#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.drools.epn.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getProcess()
 * @model extendedMetaData="name='Process' kind='elementOnly'"
 * @generated
 */
public interface Process extends CallableElement {
    /**
     * Returns the value of the '<em><b>Flow Element Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element Group</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getProcess_FlowElementGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='flowElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getFlowElementGroup();

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
     * @see org.drools.epn.EPNPackage#getProcess_FlowElement()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace' group='flowElement:group'"
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
     * @see org.drools.epn.EPNPackage#getProcess_DefinitionalCollaborationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='definitionalCollaborationRef'"
     * @generated
     */
    QName getDefinitionalCollaborationRef();

    /**
     * Sets the value of the '{@link org.drools.epn.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}' attribute.
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
     * @see org.drools.epn.EPNPackage#getProcess_IsExecutable()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isExecutable'"
     * @generated
     */
    boolean isIsExecutable();

    /**
     * Sets the value of the '{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}' attribute.
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
     * Unsets the value of the '{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExecutable()
     * @see #isIsExecutable()
     * @see #setIsExecutable(boolean)
     * @generated
     */
    void unsetIsExecutable();

    /**
     * Returns whether the value of the '{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Executable</em>' attribute is set.
     * @see #unsetIsExecutable()
     * @see #isIsExecutable()
     * @see #setIsExecutable(boolean)
     * @generated
     */
    boolean isSetIsExecutable();

} // Process
