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
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EPNShape#getEPNLabel <em>EPN Label</em>}</li>
 *   <li>{@link org.drools.epn.EPNShape#getEpnElement <em>Epn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getEPNShape()
 * @model extendedMetaData="name='EPNShape' kind='elementOnly'"
 * @generated
 */
public interface EPNShape extends LabeledShape {
    /**
     * Returns the value of the '<em><b>EPN Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Label</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Label</em>' containment reference.
     * @see #setEPNLabel(EPNLabel)
     * @see org.drools.epn.EPNPackage#getEPNShape_EPNLabel()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EPNLabel' namespace='##targetNamespace'"
     * @generated
     */
    EPNLabel getEPNLabel();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNShape#getEPNLabel <em>EPN Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Label</em>' containment reference.
     * @see #getEPNLabel()
     * @generated
     */
    void setEPNLabel(EPNLabel value);

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
     * @see org.drools.epn.EPNPackage#getEPNShape_EpnElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='epnElement'"
     * @generated
     */
    QName getEpnElement();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNShape#getEpnElement <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epn Element</em>' attribute.
     * @see #getEpnElement()
     * @generated
     */
    void setEpnElement(QName value);

} // EPNShape
