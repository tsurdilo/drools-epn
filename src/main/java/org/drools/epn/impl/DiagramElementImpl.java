/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.Diagram;
import org.drools.epn.DiagramElement;
import org.drools.epn.EpnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.DiagramElementImpl#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.drools.epn.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DiagramElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramElementImpl extends EObjectImpl implements DiagramElement {
    /**
     * The cached value of the '{@link #getOwningDiagram() <em>Owning Diagram</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwningDiagram()
     * @generated
     * @ordered
     */
    protected Diagram owningDiagram;

    /**
     * The cached value of the '{@link #getOwningElement() <em>Owning Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwningElement()
     * @generated
     * @ordered
     */
    protected DiagramElement owningElement;

    /**
     * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedElement()
     * @generated
     * @ordered
     */
    protected EList<DiagramElement> ownedElement;

    /**
     * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelElement()
     * @generated
     * @ordered
     */
    protected EObject modelElement;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.DIAGRAM_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram getOwningDiagram() {
        if (owningDiagram != null && owningDiagram.eIsProxy()) {
            InternalEObject oldOwningDiagram = (InternalEObject)owningDiagram;
            owningDiagram = (Diagram)eResolveProxy(oldOwningDiagram);
            if (owningDiagram != oldOwningDiagram) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpnPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM, oldOwningDiagram, owningDiagram));
            }
        }
        return owningDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram basicGetOwningDiagram() {
        return owningDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getOwningElement() {
        if (owningElement != null && owningElement.eIsProxy()) {
            InternalEObject oldOwningElement = (InternalEObject)owningElement;
            owningElement = (DiagramElement)eResolveProxy(oldOwningElement);
            if (owningElement != oldOwningElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpnPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT, oldOwningElement, owningElement));
            }
        }
        return owningElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetOwningElement() {
        return owningElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiagramElement> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new EObjectResolvingEList<DiagramElement>(DiagramElement.class, this, EpnPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT);
        }
        return ownedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getModelElement() {
        if (modelElement != null && modelElement.eIsProxy()) {
            InternalEObject oldModelElement = (InternalEObject)modelElement;
            modelElement = eResolveProxy(oldModelElement);
            if (modelElement != oldModelElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpnPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT, oldModelElement, modelElement));
            }
        }
        return modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetModelElement() {
        return modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelElement(EObject newModelElement) {
        EObject oldModelElement = modelElement;
        modelElement = newModelElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT, oldModelElement, modelElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EpnPackage.DIAGRAM_ELEMENT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EpnPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
                if (resolve) return getOwningDiagram();
                return basicGetOwningDiagram();
            case EpnPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
                if (resolve) return getOwningElement();
                return basicGetOwningElement();
            case EpnPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
                return getOwnedElement();
            case EpnPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                if (resolve) return getModelElement();
                return basicGetModelElement();
            case EpnPackage.DIAGRAM_ELEMENT__ID:
                return getId();
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
            case EpnPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                setModelElement((EObject)newValue);
                return;
            case EpnPackage.DIAGRAM_ELEMENT__ID:
                setId((String)newValue);
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
            case EpnPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                setModelElement((EObject)null);
                return;
            case EpnPackage.DIAGRAM_ELEMENT__ID:
                setId(ID_EDEFAULT);
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
            case EpnPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
                return owningDiagram != null;
            case EpnPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
                return owningElement != null;
            case EpnPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
                return ownedElement != null && !ownedElement.isEmpty();
            case EpnPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                return modelElement != null;
            case EpnPackage.DIAGRAM_ELEMENT__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //DiagramElementImpl
