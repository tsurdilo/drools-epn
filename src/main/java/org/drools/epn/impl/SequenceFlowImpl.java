/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.EpnPackage;
import org.drools.epn.FlowNode;
import org.drools.epn.SequenceFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.drools.epn.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected FlowNode sourceRef;

    /**
     * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected FlowNode targetRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SequenceFlowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.SEQUENCE_FLOW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowNode getSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceRef(FlowNode newSourceRef, NotificationChain msgs) {
        FlowNode oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpnPackage.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef, newSourceRef);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRef(FlowNode newSourceRef) {
        if (newSourceRef != sourceRef) {
            NotificationChain msgs = null;
            if (sourceRef != null)
                msgs = ((InternalEObject)sourceRef).eInverseRemove(this, EpnPackage.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
            if (newSourceRef != null)
                msgs = ((InternalEObject)newSourceRef).eInverseAdd(this, EpnPackage.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
            msgs = basicSetSourceRef(newSourceRef, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.SEQUENCE_FLOW__SOURCE_REF, newSourceRef, newSourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowNode getTargetRef() {
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTargetRef(FlowNode newTargetRef, NotificationChain msgs) {
        FlowNode oldTargetRef = targetRef;
        targetRef = newTargetRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpnPackage.SEQUENCE_FLOW__TARGET_REF, oldTargetRef, newTargetRef);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetRef(FlowNode newTargetRef) {
        if (newTargetRef != targetRef) {
            NotificationChain msgs = null;
            if (targetRef != null)
                msgs = ((InternalEObject)targetRef).eInverseRemove(this, EpnPackage.FLOW_NODE__INCOMING, FlowNode.class, msgs);
            if (newTargetRef != null)
                msgs = ((InternalEObject)newTargetRef).eInverseAdd(this, EpnPackage.FLOW_NODE__INCOMING, FlowNode.class, msgs);
            msgs = basicSetTargetRef(newTargetRef, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.SEQUENCE_FLOW__TARGET_REF, newTargetRef, newTargetRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EpnPackage.SEQUENCE_FLOW__SOURCE_REF:
                if (sourceRef != null)
                    msgs = ((InternalEObject)sourceRef).eInverseRemove(this, EpnPackage.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
                return basicSetSourceRef((FlowNode)otherEnd, msgs);
            case EpnPackage.SEQUENCE_FLOW__TARGET_REF:
                if (targetRef != null)
                    msgs = ((InternalEObject)targetRef).eInverseRemove(this, EpnPackage.FLOW_NODE__INCOMING, FlowNode.class, msgs);
                return basicSetTargetRef((FlowNode)otherEnd, msgs);
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
            case EpnPackage.SEQUENCE_FLOW__SOURCE_REF:
                return basicSetSourceRef(null, msgs);
            case EpnPackage.SEQUENCE_FLOW__TARGET_REF:
                return basicSetTargetRef(null, msgs);
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
            case EpnPackage.SEQUENCE_FLOW__SOURCE_REF:
                return getSourceRef();
            case EpnPackage.SEQUENCE_FLOW__TARGET_REF:
                return getTargetRef();
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
            case EpnPackage.SEQUENCE_FLOW__SOURCE_REF:
                setSourceRef((FlowNode)newValue);
                return;
            case EpnPackage.SEQUENCE_FLOW__TARGET_REF:
                setTargetRef((FlowNode)newValue);
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
            case EpnPackage.SEQUENCE_FLOW__SOURCE_REF:
                setSourceRef((FlowNode)null);
                return;
            case EpnPackage.SEQUENCE_FLOW__TARGET_REF:
                setTargetRef((FlowNode)null);
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
            case EpnPackage.SEQUENCE_FLOW__SOURCE_REF:
                return sourceRef != null;
            case EpnPackage.SEQUENCE_FLOW__TARGET_REF:
                return targetRef != null;
        }
        return super.eIsSet(featureID);
    }

} //SequenceFlowImpl
