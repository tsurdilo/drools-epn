/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

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
 *   <li>{@link org.drools.epn.Documentation#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getDocumentation()
 * @model annotation="ExtendedMetaData name='tDocumentation' kind='mixed'"
 * @generated
 */
public interface Documentation extends BaseElement {
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
     * @see org.drools.epn.EpnPackage#getDocumentation_Mixed()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        annotation="ExtendedMetaData name=':mixed' kind='elementWildcard'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see org.drools.epn.EpnPackage#getDocumentation_Text()
     * @model required="true"
     * @generated
     */
    String getText();

    /**
     * Sets the value of the '{@link org.drools.epn.Documentation#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
    void setText(String value);

} // Documentation
