/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import java.util.Collection;

import org.drools.epn.DataInput;
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
 * An implementation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.InputSetImpl#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link org.drools.epn.impl.InputSetImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 *   <li>{@link org.drools.epn.impl.InputSetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputSetImpl extends BaseElementImpl implements InputSet {
    /**
     * The cached value of the '{@link #getDataInputRefs() <em>Data Input Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputRefs()
     * @generated
     * @ordered
     */
    protected EList<DataInput> dataInputRefs;

    /**
     * The cached value of the '{@link #getOutputSetRefs() <em>Output Set Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputSetRefs()
     * @generated
     * @ordered
     */
    protected EList<OutputSet> outputSetRefs;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.INPUT_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataInput> getDataInputRefs() {
        if (dataInputRefs == null) {
            dataInputRefs = new EObjectWithInverseResolvingEList.ManyInverse<DataInput>(DataInput.class, this, EpnPackage.INPUT_SET__DATA_INPUT_REFS, EpnPackage.DATA_INPUT__INPUT_SET_REFS);
        }
        return dataInputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputSet> getOutputSetRefs() {
        if (outputSetRefs == null) {
            outputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<OutputSet>(OutputSet.class, this, EpnPackage.INPUT_SET__OUTPUT_SET_REFS, EpnPackage.OUTPUT_SET__INPUT_SET_REFS);
        }
        return outputSetRefs;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.INPUT_SET__NAME, oldName, name));
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
            case EpnPackage.INPUT_SET__DATA_INPUT_REFS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataInputRefs()).basicAdd(otherEnd, msgs);
            case EpnPackage.INPUT_SET__OUTPUT_SET_REFS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputSetRefs()).basicAdd(otherEnd, msgs);
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
            case EpnPackage.INPUT_SET__DATA_INPUT_REFS:
                return ((InternalEList<?>)getDataInputRefs()).basicRemove(otherEnd, msgs);
            case EpnPackage.INPUT_SET__OUTPUT_SET_REFS:
                return ((InternalEList<?>)getOutputSetRefs()).basicRemove(otherEnd, msgs);
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
            case EpnPackage.INPUT_SET__DATA_INPUT_REFS:
                return getDataInputRefs();
            case EpnPackage.INPUT_SET__OUTPUT_SET_REFS:
                return getOutputSetRefs();
            case EpnPackage.INPUT_SET__NAME:
                return getName();
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
            case EpnPackage.INPUT_SET__DATA_INPUT_REFS:
                getDataInputRefs().clear();
                getDataInputRefs().addAll((Collection<? extends DataInput>)newValue);
                return;
            case EpnPackage.INPUT_SET__NAME:
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
            case EpnPackage.INPUT_SET__DATA_INPUT_REFS:
                getDataInputRefs().clear();
                return;
            case EpnPackage.INPUT_SET__NAME:
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
            case EpnPackage.INPUT_SET__DATA_INPUT_REFS:
                return dataInputRefs != null && !dataInputRefs.isEmpty();
            case EpnPackage.INPUT_SET__OUTPUT_SET_REFS:
                return outputSetRefs != null && !outputSetRefs.isEmpty();
            case EpnPackage.INPUT_SET__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //InputSetImpl
