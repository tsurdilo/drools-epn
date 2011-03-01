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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.InteractionNodeImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.drools.epn.impl.InteractionNodeImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionNodeImpl extends EObjectImpl implements InteractionNode {
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
    protected InteractionNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EpnPackage.Literals.INTERACTION_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationLink> getIncomingConversationLinks() {
        if (incomingConversationLinks == null) {
            incomingConversationLinks = new EObjectResolvingEList<ConversationLink>(ConversationLink.class, this, EpnPackage.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS);
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
            outgoingConversationLinks = new EObjectResolvingEList<ConversationLink>(ConversationLink.class, this, EpnPackage.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS);
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
            case EpnPackage.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
                return getIncomingConversationLinks();
            case EpnPackage.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
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
            case EpnPackage.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
                return incomingConversationLinks != null && !incomingConversationLinks.isEmpty();
            case EpnPackage.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
                return outgoingConversationLinks != null && !outgoingConversationLinks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InteractionNodeImpl
