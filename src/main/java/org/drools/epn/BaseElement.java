/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.BaseElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.drools.epn.BaseElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getBaseElement()
 * @model annotation="ExtendedMetaData name='tBaseElement' kind='elementOnly' abstract='true'"
 * @generated
 */
public interface BaseElement extends EObject {
    /**
     * Returns the value of the '<em><b>Documentation</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.Documentation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' reference list.
     * @see org.drools.epn.EpnPackage#getBaseElement_Documentation()
     * @model ordered="false"
     *        annotation="ExtendedMetaData name='documentation' kind='element'"
     * @generated
     */
    EList<Documentation> getDocumentation();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.drools.epn.EpnPackage#getBaseElement_Id()
     * @model id="true" required="true" ordered="false"
     *        annotation="ExtendedMetaData name='id' kind='attribute'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.drools.epn.BaseElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // BaseElement
