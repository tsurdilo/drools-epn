/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.DataInput;
import org.drools.epn.DataOutput;
import org.drools.epn.EpnPackage;
import org.drools.epn.EventProducer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.EventProducerImpl#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.drools.epn.impl.EventProducerImpl#getDataInputs <em>Data Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventProducerImpl extends TaskImpl implements EventProducer {
    /**
     * The cached value of the '{@link #getDataOutputs() <em>Data Outputs</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputs()
     * @generated
     * @ordered
     */
    protected DataOutput dataOutputs;

    /**
     * The cached value of the '{@link #getDataInputs() <em>Data Inputs</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputs()
     * @generated
     * @ordered
     */
    protected DataInput dataInputs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventProducerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.EVENT_PRODUCER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput getDataOutputs() {
        if (dataOutputs != null && dataOutputs.eIsProxy()) {
            InternalEObject oldDataOutputs = (InternalEObject)dataOutputs;
            dataOutputs = (DataOutput)eResolveProxy(oldDataOutputs);
            if (dataOutputs != oldDataOutputs) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpnPackage.EVENT_PRODUCER__DATA_OUTPUTS, oldDataOutputs, dataOutputs));
            }
        }
        return dataOutputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput basicGetDataOutputs() {
        return dataOutputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataOutputs(DataOutput newDataOutputs) {
        DataOutput oldDataOutputs = dataOutputs;
        dataOutputs = newDataOutputs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.EVENT_PRODUCER__DATA_OUTPUTS, oldDataOutputs, dataOutputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput getDataInputs() {
        if (dataInputs != null && dataInputs.eIsProxy()) {
            InternalEObject oldDataInputs = (InternalEObject)dataInputs;
            dataInputs = (DataInput)eResolveProxy(oldDataInputs);
            if (dataInputs != oldDataInputs) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpnPackage.EVENT_PRODUCER__DATA_INPUTS, oldDataInputs, dataInputs));
            }
        }
        return dataInputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput basicGetDataInputs() {
        return dataInputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInputs(DataInput newDataInputs) {
        DataInput oldDataInputs = dataInputs;
        dataInputs = newDataInputs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.EVENT_PRODUCER__DATA_INPUTS, oldDataInputs, dataInputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EpnPackage.EVENT_PRODUCER__DATA_OUTPUTS:
                if (resolve) return getDataOutputs();
                return basicGetDataOutputs();
            case EpnPackage.EVENT_PRODUCER__DATA_INPUTS:
                if (resolve) return getDataInputs();
                return basicGetDataInputs();
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
            case EpnPackage.EVENT_PRODUCER__DATA_OUTPUTS:
                setDataOutputs((DataOutput)newValue);
                return;
            case EpnPackage.EVENT_PRODUCER__DATA_INPUTS:
                setDataInputs((DataInput)newValue);
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
            case EpnPackage.EVENT_PRODUCER__DATA_OUTPUTS:
                setDataOutputs((DataOutput)null);
                return;
            case EpnPackage.EVENT_PRODUCER__DATA_INPUTS:
                setDataInputs((DataInput)null);
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
            case EpnPackage.EVENT_PRODUCER__DATA_OUTPUTS:
                return dataOutputs != null;
            case EpnPackage.EVENT_PRODUCER__DATA_INPUTS:
                return dataInputs != null;
        }
        return super.eIsSet(featureID);
    }

} //EventProducerImpl
