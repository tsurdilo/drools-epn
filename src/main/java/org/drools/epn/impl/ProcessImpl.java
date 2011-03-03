/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.drools.epn.EPNPackage;
import org.drools.epn.FlowElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.ProcessImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.drools.epn.impl.ProcessImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.ProcessImpl#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.drools.epn.impl.ProcessImpl#isIsExecutable <em>Is Executable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements org.drools.epn.Process {
    /**
     * The cached value of the '{@link #getFlowElementGroup() <em>Flow Element Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap flowElementGroup;

    /**
     * The default value of the '{@link #getDefinitionalCollaborationRef() <em>Definitional Collaboration Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinitionalCollaborationRef()
     * @generated
     * @ordered
     */
    protected static final QName DEFINITIONAL_COLLABORATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefinitionalCollaborationRef() <em>Definitional Collaboration Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinitionalCollaborationRef()
     * @generated
     * @ordered
     */
    protected QName definitionalCollaborationRef = DEFINITIONAL_COLLABORATION_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isIsExecutable() <em>Is Executable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExecutable()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXECUTABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExecutable() <em>Is Executable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExecutable()
     * @generated
     * @ordered
     */
    protected boolean isExecutable = IS_EXECUTABLE_EDEFAULT;

    /**
     * This is true if the Is Executable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExecutableESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.PROCESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this, EPNPackage.PROCESS__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElement() {
        return getFlowElementGroup().list(EPNPackage.Literals.PROCESS__FLOW_ELEMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getDefinitionalCollaborationRef() {
        return definitionalCollaborationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinitionalCollaborationRef(QName newDefinitionalCollaborationRef) {
        QName oldDefinitionalCollaborationRef = definitionalCollaborationRef;
        definitionalCollaborationRef = newDefinitionalCollaborationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF, oldDefinitionalCollaborationRef, definitionalCollaborationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExecutable() {
        return isExecutable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsExecutable(boolean newIsExecutable) {
        boolean oldIsExecutable = isExecutable;
        isExecutable = newIsExecutable;
        boolean oldIsExecutableESet = isExecutableESet;
        isExecutableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EPNPackage.PROCESS__IS_EXECUTABLE, oldIsExecutable, isExecutable, !oldIsExecutableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsExecutable() {
        boolean oldIsExecutable = isExecutable;
        boolean oldIsExecutableESet = isExecutableESet;
        isExecutable = IS_EXECUTABLE_EDEFAULT;
        isExecutableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, EPNPackage.PROCESS__IS_EXECUTABLE, oldIsExecutable, IS_EXECUTABLE_EDEFAULT, oldIsExecutableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsExecutable() {
        return isExecutableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.PROCESS__FLOW_ELEMENT_GROUP:
                return ((InternalEList<?>)getFlowElementGroup()).basicRemove(otherEnd, msgs);
            case EPNPackage.PROCESS__FLOW_ELEMENT:
                return ((InternalEList<?>)getFlowElement()).basicRemove(otherEnd, msgs);
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
            case EPNPackage.PROCESS__FLOW_ELEMENT_GROUP:
                if (coreType) return getFlowElementGroup();
                return ((FeatureMap.Internal)getFlowElementGroup()).getWrapper();
            case EPNPackage.PROCESS__FLOW_ELEMENT:
                return getFlowElement();
            case EPNPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
                return getDefinitionalCollaborationRef();
            case EPNPackage.PROCESS__IS_EXECUTABLE:
                return isIsExecutable();
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
            case EPNPackage.PROCESS__FLOW_ELEMENT_GROUP:
                ((FeatureMap.Internal)getFlowElementGroup()).set(newValue);
                return;
            case EPNPackage.PROCESS__FLOW_ELEMENT:
                getFlowElement().clear();
                getFlowElement().addAll((Collection<? extends FlowElement>)newValue);
                return;
            case EPNPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
                setDefinitionalCollaborationRef((QName)newValue);
                return;
            case EPNPackage.PROCESS__IS_EXECUTABLE:
                setIsExecutable((Boolean)newValue);
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
            case EPNPackage.PROCESS__FLOW_ELEMENT_GROUP:
                getFlowElementGroup().clear();
                return;
            case EPNPackage.PROCESS__FLOW_ELEMENT:
                getFlowElement().clear();
                return;
            case EPNPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
                setDefinitionalCollaborationRef(DEFINITIONAL_COLLABORATION_REF_EDEFAULT);
                return;
            case EPNPackage.PROCESS__IS_EXECUTABLE:
                unsetIsExecutable();
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
            case EPNPackage.PROCESS__FLOW_ELEMENT_GROUP:
                return flowElementGroup != null && !flowElementGroup.isEmpty();
            case EPNPackage.PROCESS__FLOW_ELEMENT:
                return !getFlowElement().isEmpty();
            case EPNPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
                return DEFINITIONAL_COLLABORATION_REF_EDEFAULT == null ? definitionalCollaborationRef != null : !DEFINITIONAL_COLLABORATION_REF_EDEFAULT.equals(definitionalCollaborationRef);
            case EPNPackage.PROCESS__IS_EXECUTABLE:
                return isSetIsExecutable();
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
        result.append(" (flowElementGroup: ");
        result.append(flowElementGroup);
        result.append(", definitionalCollaborationRef: ");
        result.append(definitionalCollaborationRef);
        result.append(", isExecutable: ");
        if (isExecutableESet) result.append(isExecutable); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ProcessImpl
