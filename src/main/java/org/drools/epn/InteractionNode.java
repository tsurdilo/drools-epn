/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.drools.epn.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getInteractionNode()
 * @model annotation="ExtendedMetaData abstract='true'"
 * @generated
 */
public interface InteractionNode extends EObject {
    /**
     * Returns the value of the '<em><b>Incoming Conversation Links</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.ConversationLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Conversation Links</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Conversation Links</em>' reference list.
     * @see org.drools.epn.EpnPackage#getInteractionNode_IncomingConversationLinks()
     * @model changeable="false"
     * @generated
     */
    EList<ConversationLink> getIncomingConversationLinks();

    /**
     * Returns the value of the '<em><b>Outgoing Conversation Links</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.ConversationLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Conversation Links</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Conversation Links</em>' reference list.
     * @see org.drools.epn.EpnPackage#getInteractionNode_OutgoingConversationLinks()
     * @model changeable="false"
     * @generated
     */
    EList<ConversationLink> getOutgoingConversationLinks();

} // InteractionNode
