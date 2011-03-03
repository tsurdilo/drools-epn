/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EPNPlane#getEpnElement <em>Epn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getEPNPlane()
 * @model extendedMetaData="name='EPNPlane' kind='elementOnly'"
 * @generated
 */
public interface EPNPlane extends Plane {
    /**
     * Returns the value of the '<em><b>Epn Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Epn Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Epn Element</em>' attribute.
     * @see #setEpnElement(QName)
     * @see org.drools.epn.EPNPackage#getEPNPlane_EpnElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='epnElement'"
     * @generated
     */
    QName getEpnElement();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNPlane#getEpnElement <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epn Element</em>' attribute.
     * @see #getEpnElement()
     * @generated
     */
    void setEpnElement(QName value);

} // EPNPlane
