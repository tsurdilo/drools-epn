/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import java.util.Collection;

import org.drools.epn.EpnPackage;
import org.drools.epn.FlowElement;
import org.drools.epn.FlowElementsContainer;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.FlowElementsContainerImpl#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowElementsContainerImpl extends BaseElementImpl implements FlowElementsContainer {
    /**
     * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElements()
     * @generated
     * @ordered
     */
    protected EList<FlowElement> flowElements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowElementsContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.FLOW_ELEMENTS_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElements() {
        if (flowElements == null) {
            flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, EpnPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS);
        }
        return flowElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EpnPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
                return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
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
            case EpnPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
                return getFlowElements();
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
            case EpnPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
                getFlowElements().clear();
                getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
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
            case EpnPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
                getFlowElements().clear();
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
            case EpnPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
                return flowElements != null && !flowElements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FlowElementsContainerImpl
