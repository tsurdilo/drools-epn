/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Diagram#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.drools.epn.Diagram#getId <em>Id</em>}</li>
 *   <li>{@link org.drools.epn.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.Diagram#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getDiagram()
 * @model abstract="true"
 *        annotation="ExtendedMetaData name='diagram' kind='empty'"
 * @generated
 */
public interface Diagram extends EObject {
    /**
     * Returns the value of the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' attribute.
     * @see #setDocumentation(String)
     * @see org.drools.epn.EpnPackage#getDiagram_Documentation()
     * @model annotation="ExtendedMetaData name='documentation' kind='attribute'"
     * @generated
     */
    String getDocumentation();

    /**
     * Sets the value of the '{@link org.drools.epn.Diagram#getDocumentation <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' attribute.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(String value);

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
     * @see org.drools.epn.EpnPackage#getDiagram_Id()
     * @model annotation="ExtendedMetaData name='id' kind='attribute'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.drools.epn.Diagram#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.drools.epn.EpnPackage#getDiagram_Name()
     * @model annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.Diagram#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Root Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Element</em>' reference.
     * @see org.drools.epn.EpnPackage#getDiagram_RootElement()
     * @model required="true" changeable="false"
     * @generated
     */
    DiagramElement getRootElement();

} // Diagram
