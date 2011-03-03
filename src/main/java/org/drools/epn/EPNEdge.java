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
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EPNEdge#getEPNLabel <em>EPN Label</em>}</li>
 *   <li>{@link org.drools.epn.EPNEdge#getEpnElement <em>Epn Element</em>}</li>
 *   <li>{@link org.drools.epn.EPNEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.drools.epn.EPNEdge#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getEPNEdge()
 * @model extendedMetaData="name='EPNEdge' kind='elementOnly'"
 * @generated
 */
public interface EPNEdge extends LabeledEdge {
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
     * @see org.drools.epn.EPNPackage#getEPNEdge_EPNLabel()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EPNLabel' namespace='##targetNamespace'"
     * @generated
     */
    EPNLabel getEPNLabel();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNEdge#getEPNLabel <em>EPN Label</em>}' containment reference.
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
     * @see #setEpnElement(String)
     * @see org.drools.epn.EPNPackage#getEPNEdge_EpnElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='epnElement'"
     * @generated
     */
    String getEpnElement();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNEdge#getEpnElement <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epn Element</em>' attribute.
     * @see #getEpnElement()
     * @generated
     */
    void setEpnElement(String value);

    /**
     * Returns the value of the '<em><b>Source Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Element</em>' attribute.
     * @see #setSourceElement(QName)
     * @see org.drools.epn.EPNPackage#getEPNEdge_SourceElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='sourceElement'"
     * @generated
     */
    QName getSourceElement();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNEdge#getSourceElement <em>Source Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Element</em>' attribute.
     * @see #getSourceElement()
     * @generated
     */
    void setSourceElement(QName value);

    /**
     * Returns the value of the '<em><b>Target Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Element</em>' attribute.
     * @see #setTargetElement(QName)
     * @see org.drools.epn.EPNPackage#getEPNEdge_TargetElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='targetElement'"
     * @generated
     */
    QName getTargetElement();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNEdge#getTargetElement <em>Target Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Element</em>' attribute.
     * @see #getTargetElement()
     * @generated
     */
    void setTargetElement(QName value);

} // EPNEdge
