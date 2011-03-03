/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import javax.xml.namespace.QName;

import org.drools.epn.EPNEdge;
import org.drools.epn.EPNLabel;
import org.drools.epn.EPNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.EPNEdgeImpl#getEPNLabel <em>EPN Label</em>}</li>
 *   <li>{@link org.drools.epn.impl.EPNEdgeImpl#getEpnElement <em>Epn Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.EPNEdgeImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.EPNEdgeImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPNEdgeImpl extends LabeledEdgeImpl implements EPNEdge {
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
     * The default value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceElement()
     * @generated
     * @ordered
     */
    protected static final QName SOURCE_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceElement()
     * @generated
     * @ordered
     */
    protected QName sourceElement = SOURCE_ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetElement()
     * @generated
     * @ordered
     */
    protected static final QName TARGET_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetElement()
     * @generated
     * @ordered
     */
    protected QName targetElement = TARGET_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EPNEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.EPN_EDGE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_EDGE__EPN_LABEL, oldEPNLabel, newEPNLabel);
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
                msgs = ((InternalEObject)ePNLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EPNPackage.EPN_EDGE__EPN_LABEL, null, msgs);
            if (newEPNLabel != null)
                msgs = ((InternalEObject)newEPNLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EPNPackage.EPN_EDGE__EPN_LABEL, null, msgs);
            msgs = basicSetEPNLabel(newEPNLabel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_EDGE__EPN_LABEL, newEPNLabel, newEPNLabel));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_EDGE__EPN_ELEMENT, oldEpnElement, epnElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getSourceElement() {
        return sourceElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceElement(QName newSourceElement) {
        QName oldSourceElement = sourceElement;
        sourceElement = newSourceElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_EDGE__SOURCE_ELEMENT, oldSourceElement, sourceElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getTargetElement() {
        return targetElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetElement(QName newTargetElement) {
        QName oldTargetElement = targetElement;
        targetElement = newTargetElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.EPN_EDGE__TARGET_ELEMENT, oldTargetElement, targetElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.EPN_EDGE__EPN_LABEL:
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
            case EPNPackage.EPN_EDGE__EPN_LABEL:
                return getEPNLabel();
            case EPNPackage.EPN_EDGE__EPN_ELEMENT:
                return getEpnElement();
            case EPNPackage.EPN_EDGE__SOURCE_ELEMENT:
                return getSourceElement();
            case EPNPackage.EPN_EDGE__TARGET_ELEMENT:
                return getTargetElement();
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
            case EPNPackage.EPN_EDGE__EPN_LABEL:
                setEPNLabel((EPNLabel)newValue);
                return;
            case EPNPackage.EPN_EDGE__EPN_ELEMENT:
                setEpnElement((String)newValue);
                return;
            case EPNPackage.EPN_EDGE__SOURCE_ELEMENT:
                setSourceElement((QName)newValue);
                return;
            case EPNPackage.EPN_EDGE__TARGET_ELEMENT:
                setTargetElement((QName)newValue);
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
            case EPNPackage.EPN_EDGE__EPN_LABEL:
                setEPNLabel((EPNLabel)null);
                return;
            case EPNPackage.EPN_EDGE__EPN_ELEMENT:
                setEpnElement(EPN_ELEMENT_EDEFAULT);
                return;
            case EPNPackage.EPN_EDGE__SOURCE_ELEMENT:
                setSourceElement(SOURCE_ELEMENT_EDEFAULT);
                return;
            case EPNPackage.EPN_EDGE__TARGET_ELEMENT:
                setTargetElement(TARGET_ELEMENT_EDEFAULT);
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
            case EPNPackage.EPN_EDGE__EPN_LABEL:
                return ePNLabel != null;
            case EPNPackage.EPN_EDGE__EPN_ELEMENT:
                return EPN_ELEMENT_EDEFAULT == null ? epnElement != null : !EPN_ELEMENT_EDEFAULT.equals(epnElement);
            case EPNPackage.EPN_EDGE__SOURCE_ELEMENT:
                return SOURCE_ELEMENT_EDEFAULT == null ? sourceElement != null : !SOURCE_ELEMENT_EDEFAULT.equals(sourceElement);
            case EPNPackage.EPN_EDGE__TARGET_ELEMENT:
                return TARGET_ELEMENT_EDEFAULT == null ? targetElement != null : !TARGET_ELEMENT_EDEFAULT.equals(targetElement);
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
        result.append(", sourceElement: ");
        result.append(sourceElement);
        result.append(", targetElement: ");
        result.append(targetElement);
        result.append(')');
        return result.toString();
    }

} //EPNEdgeImpl
