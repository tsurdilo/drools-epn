/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import javax.xml.namespace.QName;

import org.drools.epn.EPNPackage;
import org.drools.epn.EPNPlane;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.EPNPlaneImpl#getEpnElement <em>Epn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPNPlaneImpl extends PlaneImpl implements EPNPlane {
    /**
     * The default value of the '{@link #getEpnElement() <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpnElement()
     * @generated
     * @ordered
     */
    protected static final QName EPN_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEpnElement() <em>Epn Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpnElement()
     * @generated
     * @ordered
     */
    protected QName epnElement = EPN_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EPNPlaneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.EPN_PLANE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getEpnElement() {
        return epnElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEpnElement(QName newEpnElement) {
        QName oldEpnElement = epnElement;
        epnElement = newEpnElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_PLANE__EPN_ELEMENT, oldEpnElement, epnElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EPNPackage.EPN_PLANE__EPN_ELEMENT:
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
            case EPNPackage.EPN_PLANE__EPN_ELEMENT:
                setEpnElement((QName)newValue);
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
            case EPNPackage.EPN_PLANE__EPN_ELEMENT:
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
            case EPNPackage.EPN_PLANE__EPN_ELEMENT:
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

} //EPNPlaneImpl
