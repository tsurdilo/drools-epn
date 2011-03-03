/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import javax.xml.namespace.QName;

import org.drools.epn.EPNLabel;
import org.drools.epn.EPNPackage;
import org.drools.epn.EPNShape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.EPNShapeImpl#getEPNLabel <em>EPN Label</em>}</li>
 *   <li>{@link org.drools.epn.impl.EPNShapeImpl#getEpnElement <em>Epn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPNShapeImpl extends LabeledShapeImpl implements EPNShape {
    /**
     * The cached value of the '{@link #getEPNLabel() <em>EPN Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEPNLabel()
     * @generated
     * @ordered
     */
    protected EPNLabel ePNLabel;

    /**
     * The default value of the '{@link #getEpnElement() <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpnElement()
     * @generated
     * @ordered
     */
    protected static final String EPN_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEpnElement() <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpnElement()
     * @generated
     * @ordered
     */
    protected String epnElement = EPN_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EPNShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.EPN_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNLabel getEPNLabel() {
        return ePNLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNLabel(EPNLabel newEPNLabel, NotificationChain msgs) {
        EPNLabel oldEPNLabel = ePNLabel;
        ePNLabel = newEPNLabel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_SHAPE__EPN_LABEL, oldEPNLabel, newEPNLabel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNLabel(EPNLabel newEPNLabel) {
        if (newEPNLabel != ePNLabel) {
            NotificationChain msgs = null;
            if (ePNLabel != null)
                msgs = ((InternalEObject)ePNLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EPNPackage.EPN_SHAPE__EPN_LABEL, null, msgs);
            if (newEPNLabel != null)
                msgs = ((InternalEObject)newEPNLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EPNPackage.EPN_SHAPE__EPN_LABEL, null, msgs);
            msgs = basicSetEPNLabel(newEPNLabel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_SHAPE__EPN_LABEL, newEPNLabel, newEPNLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEpnElement() {
        return epnElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEpnElement(String newEpnElement) {
        String oldEpnElement = epnElement;
        epnElement = newEpnElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_SHAPE__EPN_ELEMENT, oldEpnElement, epnElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.EPN_SHAPE__EPN_LABEL:
                return basicSetEPNLabel(null, msgs);
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
            case EPNPackage.EPN_SHAPE__EPN_LABEL:
                return getEPNLabel();
            case EPNPackage.EPN_SHAPE__EPN_ELEMENT:
                return getEpnElement();
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
            case EPNPackage.EPN_SHAPE__EPN_LABEL:
                setEPNLabel((EPNLabel)newValue);
                return;
            case EPNPackage.EPN_SHAPE__EPN_ELEMENT:
                setEpnElement((String)newValue);
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
            case EPNPackage.EPN_SHAPE__EPN_LABEL:
                setEPNLabel((EPNLabel)null);
                return;
            case EPNPackage.EPN_SHAPE__EPN_ELEMENT:
                setEpnElement(EPN_ELEMENT_EDEFAULT);
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
            case EPNPackage.EPN_SHAPE__EPN_LABEL:
                return ePNLabel != null;
            case EPNPackage.EPN_SHAPE__EPN_ELEMENT:
                return EPN_ELEMENT_EDEFAULT == null ? epnElement != null : !EPN_ELEMENT_EDEFAULT.equals(epnElement);
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
        result.append(" (epnElement: ");
        result.append(epnElement);
        result.append(')');
        return result.toString();
    }

} //EPNShapeImpl
