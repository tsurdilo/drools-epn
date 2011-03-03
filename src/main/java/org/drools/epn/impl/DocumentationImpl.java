/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.Documentation;
import org.drools.epn.EPNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.DocumentationImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationImpl extends EObjectImpl implements Documentation {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

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
     * The default value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextFormat()
     * @generated
     * @ordered
     */
    protected static final String TEXT_FORMAT_EDEFAULT = "text/plain";

    /**
     * The cached value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextFormat()
     * @generated
     * @ordered
     */
    protected String textFormat = TEXT_FORMAT_EDEFAULT;

    /**
     * This is true if the Text Format attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean textFormatESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.DOCUMENTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, EPNPackage.DOCUMENTATION__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(EPNPackage.Literals.DOCUMENTATION__ANY);
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
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DOCUMENTATION__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTextFormat() {
        return textFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextFormat(String newTextFormat) {
        String oldTextFormat = textFormat;
        textFormat = newTextFormat;
        boolean oldTextFormatESet = textFormatESet;
        textFormatESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.DOCUMENTATION__TEXT_FORMAT, oldTextFormat, textFormat, !oldTextFormatESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTextFormat() {
        String oldTextFormat = textFormat;
        boolean oldTextFormatESet = textFormatESet;
        textFormat = TEXT_FORMAT_EDEFAULT;
        textFormatESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, EPNPackage.DOCUMENTATION__TEXT_FORMAT, oldTextFormat, TEXT_FORMAT_EDEFAULT, oldTextFormatESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTextFormat() {
        return textFormatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.DOCUMENTATION__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case EPNPackage.DOCUMENTATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
            case EPNPackage.DOCUMENTATION__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case EPNPackage.DOCUMENTATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case EPNPackage.DOCUMENTATION__ID:
                return getId();
            case EPNPackage.DOCUMENTATION__TEXT_FORMAT:
                return getTextFormat();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EPNPackage.DOCUMENTATION__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case EPNPackage.DOCUMENTATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case EPNPackage.DOCUMENTATION__ID:
                setId((String)newValue);
                return;
            case EPNPackage.DOCUMENTATION__TEXT_FORMAT:
                setTextFormat((String)newValue);
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
            case EPNPackage.DOCUMENTATION__MIXED:
                getMixed().clear();
                return;
            case EPNPackage.DOCUMENTATION__ANY:
                getAny().clear();
                return;
            case EPNPackage.DOCUMENTATION__ID:
                setId(ID_EDEFAULT);
                return;
            case EPNPackage.DOCUMENTATION__TEXT_FORMAT:
                unsetTextFormat();
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
            case EPNPackage.DOCUMENTATION__MIXED:
                return mixed != null && !mixed.isEmpty();
            case EPNPackage.DOCUMENTATION__ANY:
                return !getAny().isEmpty();
            case EPNPackage.DOCUMENTATION__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case EPNPackage.DOCUMENTATION__TEXT_FORMAT:
                return isSetTextFormat();
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(", id: ");
        result.append(id);
        result.append(", textFormat: ");
        if (textFormatESet) result.append(textFormat); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DocumentationImpl
