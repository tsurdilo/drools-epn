/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EPNDiagram#getEPNPlane <em>EPN Plane</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getEPNDiagram()
 * @model extendedMetaData="name='EPNDiagram' kind='elementOnly'"
 * @generated
 */
public interface EPNDiagram extends Diagram {
    /**
     * Returns the value of the '<em><b>EPN Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Plane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Plane</em>' containment reference.
     * @see #setEPNPlane(EPNPlane)
     * @see org.drools.epn.EPNPackage#getEPNDiagram_EPNPlane()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='EPNPlane' namespace='##targetNamespace'"
     * @generated
     */
    EPNPlane getEPNPlane();

    /**
     * Sets the value of the '{@link org.drools.epn.EPNDiagram#getEPNPlane <em>EPN Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Plane</em>' containment reference.
     * @see #getEPNPlane()
     * @generated
     */
    void setEPNPlane(EPNPlane value);

} // EPNDiagram
