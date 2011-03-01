/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import java.util.Collection;

import org.drools.epn.DataOutput;
import org.drools.epn.EpnPackage;
import org.drools.epn.InputSet;
import org.drools.epn.OutputSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.OutputSetImpl#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.drools.epn.impl.OutputSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.impl.OutputSetImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSetImpl extends BaseElementImpl implements OutputSet {
    /**
     * The cached value of the '{@link #getDataOutputRefs() <em>Data Output Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputRefs()
     * @generated
     * @ordered
     */
    protected EList<DataOutput> dataOutputRefs;

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
     * The cached value of the '{@link #getInputSetRefs() <em>Input Set Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSetRefs()
     * @generated
     * @ordered
     */
    protected EList<InputSet> inputSetRefs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.OUTPUT_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutput> getDataOutputRefs() {
        if (dataOutputRefs == null) {
            dataOutputRefs = new EObjectWithInverseResolvingEList.ManyInverse<DataOutput>(DataOutput.class, this, EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS, EpnPackage.DATA_OUTPUT__OUTPUT_SET_REFS);
        }
        return dataOutputRefs;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.OUTPUT_SET__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputSet> getInputSetRefs() {
        if (inputSetRefs == null) {
            inputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>(InputSet.class, this, EpnPackage.OUTPUT_SET__INPUT_SET_REFS, EpnPackage.INPUT_SET__OUTPUT_SET_REFS);
        }
        return inputSetRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataOutputRefs()).basicAdd(otherEnd, msgs);
            case EpnPackage.OUTPUT_SET__INPUT_SET_REFS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSetRefs()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
                return ((InternalEList<?>)getDataOutputRefs()).basicRemove(otherEnd, msgs);
            case EpnPackage.OUTPUT_SET__INPUT_SET_REFS:
                return ((InternalEList<?>)getInputSetRefs()).basicRemove(otherEnd, msgs);
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
            case EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
                return getDataOutputRefs();
            case EpnPackage.OUTPUT_SET__NAME:
                return getName();
            case EpnPackage.OUTPUT_SET__INPUT_SET_REFS:
                return getInputSetRefs();
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
            case EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
                getDataOutputRefs().clear();
                getDataOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
                return;
            case EpnPackage.OUTPUT_SET__NAME:
                setName((String)newValue);
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
            case EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
                getDataOutputRefs().clear();
                return;
            case EpnPackage.OUTPUT_SET__NAME:
                setName(NAME_EDEFAULT);
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
            case EpnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
                return dataOutputRefs != null && !dataOutputRefs.isEmpty();
            case EpnPackage.OUTPUT_SET__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EpnPackage.OUTPUT_SET__INPUT_SET_REFS:
                return inputSetRefs != null && !inputSetRefs.isEmpty();
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //OutputSetImpl
