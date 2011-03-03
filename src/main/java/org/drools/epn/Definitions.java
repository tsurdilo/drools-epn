/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.Definitions#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getEPNDiagram <em>EPN Diagram</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getId <em>Id</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link org.drools.epn.Definitions#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getDefinitions()
 * @model extendedMetaData="name='Definitions' kind='elementOnly'"
 * @generated
 */
public interface Definitions extends EObject {
    /**
     * Returns the value of the '<em><b>Root Element</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.RootElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Element</em>' containment reference list.
     * @see org.drools.epn.EPNPackage#getDefinitions_RootElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='rootElement' namespace='##targetNamespace'"
     * @generated
     */
    EList<RootElement> getRootElement();

    /**
     * Returns the value of the '<em><b>EPN Diagram</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.EPNDiagram}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Diagram</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Diagram</em>' containment reference list.
     * @see org.drools.epn.EPNPackage#getDefinitions_EPNDiagram()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EPNDiagram' namespace='##targetNamespace'"
     * @generated
     */
    EList<EPNDiagram> getEPNDiagram();

    /**
     * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
     * The default value is <code>"http://www.w3.org/1999/XPath"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Language</em>' attribute.
     * @see #isSetExpressionLanguage()
     * @see #unsetExpressionLanguage()
     * @see #setExpressionLanguage(String)
     * @see org.drools.epn.EPNPackage#getDefinitions_ExpressionLanguage()
     * @model default="http://www.w3.org/1999/XPath" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='expressionLanguage'"
     * @generated
     */
    String getExpressionLanguage();

    /**
     * Sets the value of the '{@link org.drools.epn.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Language</em>' attribute.
     * @see #isSetExpressionLanguage()
     * @see #unsetExpressionLanguage()
     * @see #getExpressionLanguage()
     * @generated
     */
    void setExpressionLanguage(String value);

    /**
     * Unsets the value of the '{@link org.drools.epn.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExpressionLanguage()
     * @see #getExpressionLanguage()
     * @see #setExpressionLanguage(String)
     * @generated
     */
    void unsetExpressionLanguage();

    /**
     * Returns whether the value of the '{@link org.drools.epn.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Expression Language</em>' attribute is set.
     * @see #unsetExpressionLanguage()
     * @see #getExpressionLanguage()
     * @see #setExpressionLanguage(String)
     * @generated
     */
    boolean isSetExpressionLanguage();

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
     * @see org.drools.epn.EPNPackage#getDefinitions_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.drools.epn.Definitions#getId <em>Id</em>}' attribute.
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
     * @see org.drools.epn.EPNPackage#getDefinitions_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.Definitions#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Namespace</em>' attribute.
     * @see #setTargetNamespace(String)
     * @see org.drools.epn.EPNPackage#getDefinitions_TargetNamespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='targetNamespace'"
     * @generated
     */
    String getTargetNamespace();

    /**
     * Sets the value of the '{@link org.drools.epn.Definitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Namespace</em>' attribute.
     * @see #getTargetNamespace()
     * @generated
     */
    void setTargetNamespace(String value);

    /**
     * Returns the value of the '<em><b>Type Language</b></em>' attribute.
     * The default value is <code>"http://www.w3.org/2001/XMLSchema"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Language</em>' attribute.
     * @see #isSetTypeLanguage()
     * @see #unsetTypeLanguage()
     * @see #setTypeLanguage(String)
     * @see org.drools.epn.EPNPackage#getDefinitions_TypeLanguage()
     * @model default="http://www.w3.org/2001/XMLSchema" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='typeLanguage'"
     * @generated
     */
    String getTypeLanguage();

    /**
     * Sets the value of the '{@link org.drools.epn.Definitions#getTypeLanguage <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Language</em>' attribute.
     * @see #isSetTypeLanguage()
     * @see #unsetTypeLanguage()
     * @see #getTypeLanguage()
     * @generated
     */
    void setTypeLanguage(String value);

    /**
     * Unsets the value of the '{@link org.drools.epn.Definitions#getTypeLanguage <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeLanguage()
     * @see #getTypeLanguage()
     * @see #setTypeLanguage(String)
     * @generated
     */
    void unsetTypeLanguage();

    /**
     * Returns whether the value of the '{@link org.drools.epn.Definitions#getTypeLanguage <em>Type Language</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type Language</em>' attribute is set.
     * @see #unsetTypeLanguage()
     * @see #getTypeLanguage()
     * @see #setTypeLanguage(String)
     * @generated
     */
    boolean isSetTypeLanguage();

    /**
     * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getDefinitions_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute();

} // Definitions
