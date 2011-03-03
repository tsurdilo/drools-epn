/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.EPNDiagram;
import org.drools.epn.EPNPackage;
import org.drools.epn.EPNPlane;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.EPNDiagramImpl#getEPNPlane <em>EPN Plane</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPNDiagramImpl extends DiagramImpl implements EPNDiagram {
    /**
     * The cached value of the '{@link #getEPNPlane() <em>EPN Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEPNPlane()
     * @generated
     * @ordered
     */
    protected EPNPlane ePNPlane;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EPNDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.EPN_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNPlane getEPNPlane() {
        return ePNPlane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNPlane(EPNPlane newEPNPlane, NotificationChain msgs) {
        EPNPlane oldEPNPlane = ePNPlane;
        ePNPlane = newEPNPlane;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_DIAGRAM__EPN_PLANE, oldEPNPlane, newEPNPlane);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNPlane(EPNPlane newEPNPlane) {
        if (newEPNPlane != ePNPlane) {
            NotificationChain msgs = null;
            if (ePNPlane != null)
                msgs = ((InternalEObject)ePNPlane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EPNPackage.EPN_DIAGRAM__EPN_PLANE, null, msgs);
            if (newEPNPlane != null)
                msgs = ((InternalEObject)newEPNPlane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EPNPackage.EPN_DIAGRAM__EPN_PLANE, null, msgs);
            msgs = basicSetEPNPlane(newEPNPlane, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_DIAGRAM__EPN_PLANE, newEPNPlane, newEPNPlane));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.EPN_DIAGRAM__EPN_PLANE:
                return basicSetEPNPlane(null, msgs);
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
            case EPNPackage.EPN_DIAGRAM__EPN_PLANE:
                return getEPNPlane();
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
            case EPNPackage.EPN_DIAGRAM__EPN_PLANE:
                setEPNPlane((EPNPlane)newValue);
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
            case EPNPackage.EPN_DIAGRAM__EPN_PLANE:
                setEPNPlane((EPNPlane)null);
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
            case EPNPackage.EPN_DIAGRAM__EPN_PLANE:
                return ePNPlane != null;
        }
        return super.eIsSet(featureID);
    }

} //EPNDiagramImpl
