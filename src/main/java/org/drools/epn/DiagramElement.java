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
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.drools.epn.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.drools.epn.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.drools.epn.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.drools.epn.DiagramElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getDiagramElement()
 * @model annotation="ExtendedMetaData name='DiagramElement' kind='elementOnly'"
 * @generated
 */
public interface DiagramElement extends EObject {
    /**
     * Returns the value of the '<em><b>Owning Diagram</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Diagram</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Diagram</em>' reference.
     * @see org.drools.epn.EpnPackage#getDiagramElement_OwningDiagram()
     * @model changeable="false"
     * @generated
     */
    Diagram getOwningDiagram();

    /**
     * Returns the value of the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Element</em>' reference.
     * @see org.drools.epn.EpnPackage#getDiagramElement_OwningElement()
     * @model changeable="false"
     * @generated
     */
    DiagramElement getOwningElement();

    /**
     * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.DiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Element</em>' reference list.
     * @see org.drools.epn.EpnPackage#getDiagramElement_OwnedElement()
     * @model changeable="false"
     * @generated
     */
    EList<DiagramElement> getOwnedElement();

    /**
     * Returns the value of the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Element</em>' reference.
     * @see #setModelElement(EObject)
     * @see org.drools.epn.EpnPackage#getDiagramElement_ModelElement()
     * @model
     * @generated
     */
    EObject getModelElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DiagramElement#getModelElement <em>Model Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Element</em>' reference.
     * @see #getModelElement()
     * @generated
     */
    void setModelElement(EObject value);

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
     * @see org.drools.epn.EpnPackage#getDiagramElement_Id()
     * @model annotation="ExtendedMetaData name='id' kind='attribute'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.drools.epn.DiagramElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // DiagramElement
