/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.EpnPackage;
import org.drools.epn.ProcessType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.ProcessImpl#isIsExecutable <em>Is Executable</em>}</li>
 *   <li>{@link org.drools.epn.impl.ProcessImpl#getProcessType <em>Process Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends FlowElementsContainerImpl implements org.drools.epn.Process {
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
     * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessType()
     * @generated
     * @ordered
     */
    protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.NONE;

    /**
     * The cached value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessType()
     * @generated
     * @ordered
     */
    protected ProcessType processType = PROCESS_TYPE_EDEFAULT;

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
        return EpnPackage.Literals.PROCESS;
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.PROCESS__IS_EXECUTABLE, oldIsExecutable, isExecutable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessType(ProcessType newProcessType) {
        ProcessType oldProcessType = processType;
        processType = newProcessType == null ? PROCESS_TYPE_EDEFAULT : newProcessType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.PROCESS__PROCESS_TYPE, oldProcessType, processType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EpnPackage.PROCESS__IS_EXECUTABLE:
                return isIsExecutable();
            case EpnPackage.PROCESS__PROCESS_TYPE:
                return getProcessType();
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
            case EpnPackage.PROCESS__IS_EXECUTABLE:
                setIsExecutable((Boolean)newValue);
                return;
            case EpnPackage.PROCESS__PROCESS_TYPE:
                setProcessType((ProcessType)newValue);
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
            case EpnPackage.PROCESS__IS_EXECUTABLE:
                setIsExecutable(IS_EXECUTABLE_EDEFAULT);
                return;
            case EpnPackage.PROCESS__PROCESS_TYPE:
                setProcessType(PROCESS_TYPE_EDEFAULT);
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
            case EpnPackage.PROCESS__IS_EXECUTABLE:
                return isExecutable != IS_EXECUTABLE_EDEFAULT;
            case EpnPackage.PROCESS__PROCESS_TYPE:
                return processType != PROCESS_TYPE_EDEFAULT;
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
        result.append(" (isExecutable: ");
        result.append(isExecutable);
        result.append(", processType: ");
        result.append(processType);
        result.append(')');
        return result.toString();
    }

} //ProcessImpl
