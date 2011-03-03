/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Plane#getDiagramElementGroup <em>Diagram Element Group</em>}</li>
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
     * Returns the value of the '<em><b>Diagram Element Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Element Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Element Group</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getPlane_DiagramElementGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='DiagramElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getDiagramElementGroup();

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
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DiagramElement' namespace='##targetNamespace' group='DiagramElement:group'"
     * @generated
     */
    EList<DiagramElement> getDiagramElement();

} // Plane
