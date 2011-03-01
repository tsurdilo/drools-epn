/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.ConversationLink;
import org.drools.epn.EpnPackage;
import org.drools.epn.InteractionNode;
import org.drools.epn.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.TaskImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.drools.epn.impl.TaskImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends ActivityImpl implements Task {
    /**
     * The cached value of the '{@link #getIncomingConversationLinks() <em>Incoming Conversation Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingConversationLinks()
     * @generated
     * @ordered
     */
    protected EList<ConversationLink> incomingConversationLinks;

    /**
     * The cached value of the '{@link #getOutgoingConversationLinks() <em>Outgoing Conversation Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingConversationLinks()
     * @generated
     * @ordered
     */
    protected EList<ConversationLink> outgoingConversationLinks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationLink> getIncomingConversationLinks() {
        if (incomingConversationLinks == null) {
            incomingConversationLinks = new EObjectResolvingEList<ConversationLink>(ConversationLink.class, this, EpnPackage.TASK__INCOMING_CONVERSATION_LINKS);
        }
        return incomingConversationLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationLink> getOutgoingConversationLinks() {
        if (outgoingConversationLinks == null) {
            outgoingConversationLinks = new EObjectResolvingEList<ConversationLink>(ConversationLink.class, this, EpnPackage.TASK__OUTGOING_CONVERSATION_LINKS);
        }
        return outgoingConversationLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EpnPackage.TASK__INCOMING_CONVERSATION_LINKS:
                return getIncomingConversationLinks();
            case EpnPackage.TASK__OUTGOING_CONVERSATION_LINKS:
                return getOutgoingConversationLinks();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EpnPackage.TASK__INCOMING_CONVERSATION_LINKS:
                return incomingConversationLinks != null && !incomingConversationLinks.isEmpty();
            case EpnPackage.TASK__OUTGOING_CONVERSATION_LINKS:
                return outgoingConversationLinks != null && !outgoingConversationLinks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == InteractionNode.class) {
            switch (derivedFeatureID) {
                case EpnPackage.TASK__INCOMING_CONVERSATION_LINKS: return EpnPackage.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
                case EpnPackage.TASK__OUTGOING_CONVERSATION_LINKS: return EpnPackage.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == InteractionNode.class) {
            switch (baseFeatureID) {
                case EpnPackage.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS: return EpnPackage.TASK__INCOMING_CONVERSATION_LINKS;
                case EpnPackage.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS: return EpnPackage.TASK__OUTGOING_CONVERSATION_LINKS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //TaskImpl
