/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Edge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getEdge()
 * @model abstract="true"
 *        extendedMetaData="name='Edge' kind='elementOnly'"
 * @generated
 */
public interface Edge extends DiagramElement {
    /**
     * Returns the value of the '<em><b>Waypoint</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.Point}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Waypoint</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Waypoint</em>' containment reference list.
     * @see org.drools.epn.EPNPackage#getEdge_Waypoint()
     * @model containment="true" lower="2"
     *        extendedMetaData="kind='element' name='waypoint' namespace='##targetNamespace'"
     * @generated
     */
    EList<Point> getWaypoint();

} // Edge
