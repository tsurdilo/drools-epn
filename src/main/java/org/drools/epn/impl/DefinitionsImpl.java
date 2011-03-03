/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import java.util.Collection;

import org.drools.epn.Definitions;
import org.drools.epn.EPNDiagram;
import org.drools.epn.EPNPackage;
import org.drools.epn.RootElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getEPNDiagram <em>EPN Diagram</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link org.drools.epn.impl.DefinitionsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends EObjectImpl implements Definitions {
    /**
     * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootElement()
     * @generated
     * @ordered
     */
    protected EList<RootElement> rootElement;

    /**
     * The cached value of the '{@link #getEPNDiagram() <em>EPN Diagram</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEPNDiagram()
     * @generated
     * @ordered
     */
    protected EList<EPNDiagram> ePNDiagram;

    /**
     * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionLanguage()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";

    /**
     * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionLanguage()
     * @generated
     * @ordered
     */
    protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

    /**
     * This is true if the Expression Language attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean expressionLanguageESet;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected static final String TARGET_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeLanguage()
     * @generated
     * @ordered
     */
    protected static final String TYPE_LANGUAGE_EDEFAULT = "http://www.w3.org/2001/XMLSchema";

    /**
     * The cached value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeLanguage()
     * @generated
     * @ordered
     */
    protected String typeLanguage = TYPE_LANGUAGE_EDEFAULT;

    /**
     * This is true if the Type Language attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeLanguageESet;

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefinitionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.DEFINITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RootElement> getRootElement() {
        if (rootElement == null) {
            rootElement = new EObjectContainmentEList<RootElement>(RootElement.class, this, EPNPackage.DEFINITIONS__ROOT_ELEMENT);
        }
        return rootElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EPNDiagram> getEPNDiagram() {
        if (ePNDiagram == null) {
            ePNDiagram = new EObjectContainmentEList<EPNDiagram>(EPNDiagram.class, this, EPNPackage.DEFINITIONS__EPN_DIAGRAM);
        }
        return ePNDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpressionLanguage(String newExpressionLanguage) {
        String oldExpressionLanguage = expressionLanguage;
        expressionLanguage = newExpressionLanguage;
        boolean oldExpressionLanguageESet = expressionLanguageESet;
        expressionLanguageESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage, !oldExpressionLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExpressionLanguage() {
        String oldExpressionLanguage = expressionLanguage;
        boolean oldExpressionLanguageESet = expressionLanguageESet;
        expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;
        expressionLanguageESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, EPNPackage.DEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT, oldExpressionLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExpressionLanguage() {
        return expressionLanguageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DEFINITIONS__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DEFINITIONS__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypeLanguage(String newTypeLanguage) {
        String oldTypeLanguage = typeLanguage;
        typeLanguage = newTypeLanguage;
        boolean oldTypeLanguageESet = typeLanguageESet;
        typeLanguageESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, typeLanguage, !oldTypeLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTypeLanguage() {
        String oldTypeLanguage = typeLanguage;
        boolean oldTypeLanguageESet = typeLanguageESet;
        typeLanguage = TYPE_LANGUAGE_EDEFAULT;
        typeLanguageESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, EPNPackage.DEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, TYPE_LANGUAGE_EDEFAULT, oldTypeLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTypeLanguage() {
        return typeLanguageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, EPNPackage.DEFINITIONS__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.DEFINITIONS__ROOT_ELEMENT:
                return ((InternalEList<?>)getRootElement()).basicRemove(otherEnd, msgs);
            case EPNPackage.DEFINITIONS__EPN_DIAGRAM:
                return ((InternalEList<?>)getEPNDiagram()).basicRemove(otherEnd, msgs);
            case EPNPackage.DEFINITIONS__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EPNPackage.DEFINITIONS__ROOT_ELEMENT:
                return getRootElement();
            case EPNPackage.DEFINITIONS__EPN_DIAGRAM:
                return getEPNDiagram();
            case EPNPackage.DEFINITIONS__EXPRESSION_LANGUAGE:
                return getExpressionLanguage();
            case EPNPackage.DEFINITIONS__ID:
                return getId();
            case EPNPackage.DEFINITIONS__NAME:
                return getName();
            case EPNPackage.DEFINITIONS__TARGET_NAMESPACE:
                return getTargetNamespace();
            case EPNPackage.DEFINITIONS__TYPE_LANGUAGE:
                return getTypeLanguage();
            case EPNPackage.DEFINITIONS__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EPNPackage.DEFINITIONS__ROOT_ELEMENT:
                getRootElement().clear();
                getRootElement().addAll((Collection<? extends RootElement>)newValue);
                return;
            case EPNPackage.DEFINITIONS__EPN_DIAGRAM:
                getEPNDiagram().clear();
                getEPNDiagram().addAll((Collection<? extends EPNDiagram>)newValue);
                return;
            case EPNPackage.DEFINITIONS__EXPRESSION_LANGUAGE:
                setExpressionLanguage((String)newValue);
                return;
            case EPNPackage.DEFINITIONS__ID:
                setId((String)newValue);
                return;
            case EPNPackage.DEFINITIONS__NAME:
                setName((String)newValue);
                return;
            case EPNPackage.DEFINITIONS__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
                return;
            case EPNPackage.DEFINITIONS__TYPE_LANGUAGE:
                setTypeLanguage((String)newValue);
                return;
            case EPNPackage.DEFINITIONS__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EPNPackage.DEFINITIONS__ROOT_ELEMENT:
                getRootElement().clear();
                return;
            case EPNPackage.DEFINITIONS__EPN_DIAGRAM:
                getEPNDiagram().clear();
                return;
            case EPNPackage.DEFINITIONS__EXPRESSION_LANGUAGE:
                unsetExpressionLanguage();
                return;
            case EPNPackage.DEFINITIONS__ID:
                setId(ID_EDEFAULT);
                return;
            case EPNPackage.DEFINITIONS__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EPNPackage.DEFINITIONS__TARGET_NAMESPACE:
                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
                return;
            case EPNPackage.DEFINITIONS__TYPE_LANGUAGE:
                unsetTypeLanguage();
                return;
            case EPNPackage.DEFINITIONS__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EPNPackage.DEFINITIONS__ROOT_ELEMENT:
                return rootElement != null && !rootElement.isEmpty();
            case EPNPackage.DEFINITIONS__EPN_DIAGRAM:
                return ePNDiagram != null && !ePNDiagram.isEmpty();
            case EPNPackage.DEFINITIONS__EXPRESSION_LANGUAGE:
                return isSetExpressionLanguage();
            case EPNPackage.DEFINITIONS__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case EPNPackage.DEFINITIONS__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EPNPackage.DEFINITIONS__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
            case EPNPackage.DEFINITIONS__TYPE_LANGUAGE:
                return isSetTypeLanguage();
            case EPNPackage.DEFINITIONS__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (expressionLanguage: ");
        if (expressionLanguageESet) result.append(expressionLanguage); else result.append("<unset>");
        result.append(", id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(", typeLanguage: ");
        if (typeLanguageESet) result.append(typeLanguage); else result.append("<unset>");
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //DefinitionsImpl
