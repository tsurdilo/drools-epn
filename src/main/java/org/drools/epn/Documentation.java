/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Documentation#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.drools.epn.Documentation#getAny <em>Any</em>}</li>
 *   <li>{@link org.drools.epn.Documentation#getId <em>Id</em>}</li>
 *   <li>{@link org.drools.epn.Documentation#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getDocumentation()
 * @model extendedMetaData="name='Documentation' kind='mixed'"
 * @generated
 */
public interface Documentation extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getDocumentation_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getDocumentation_Any()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

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
     * @see org.drools.epn.EPNPackage#getDocumentation_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.drools.epn.Documentation#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Text Format</b></em>' attribute.
     * The default value is <code>"text/plain"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Format</em>' attribute.
     * @see #isSetTextFormat()
     * @see #unsetTextFormat()
     * @see #setTextFormat(String)
     * @see org.drools.epn.EPNPackage#getDocumentation_TextFormat()
     * @model default="text/plain" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='textFormat'"
     * @generated
     */
    String getTextFormat();

    /**
     * Sets the value of the '{@link org.drools.epn.Documentation#getTextFormat <em>Text Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Format</em>' attribute.
     * @see #isSetTextFormat()
     * @see #unsetTextFormat()
     * @see #getTextFormat()
     * @generated
     */
    void setTextFormat(String value);

    /**
     * Unsets the value of the '{@link org.drools.epn.Documentation#getTextFormat <em>Text Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTextFormat()
     * @see #getTextFormat()
     * @see #setTextFormat(String)
     * @generated
     */
    void unsetTextFormat();

    /**
     * Returns whether the value of the '{@link org.drools.epn.Documentation#getTextFormat <em>Text Format</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Text Format</em>' attribute is set.
     * @see #unsetTextFormat()
     * @see #getTextFormat()
     * @see #setTextFormat(String)
     * @generated
     */
    boolean isSetTextFormat();

} // Documentation
