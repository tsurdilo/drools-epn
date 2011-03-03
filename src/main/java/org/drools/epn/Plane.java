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
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Plane#getDiagramElement <em>Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getPlane()
 * @model abstract="true"
 *        extendedMetaData="name='Plane' kind='elementOnly'"
 * @generated
 */
public interface Plane extends Node {
    /**
     * Returns the value of the '<em><b>Diagram Element</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.DiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Element</em>' containment reference list.
     * @see org.drools.epn.EPNPackage#getPlane_DiagramElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DiagramElement' namespace='##targetNamespace'"
     * @generated
     */
    EList<DiagramElement> getDiagramElement();

} // Plane
