/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.ConversationLink#getName <em>Name</em>}</li>
 *   <li>{@link org.drools.epn.ConversationLink#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.drools.epn.ConversationLink#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getConversationLink()
 * @model annotation="ExtendedMetaData name='tConversationLink' kind='elementOnly'"
 * @generated
 */
public interface ConversationLink extends BaseElement {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.drools.epn.EpnPackage#getConversationLink_Name()
     * @model annotation="ExtendedMetaData name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.drools.epn.ConversationLink#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' reference.
     * @see #setSourceRef(InteractionNode)
     * @see org.drools.epn.EpnPackage#getConversationLink_SourceRef()
     * @model required="true"
     *        annotation="ExtendedMetaData name='sourceRef' kind='attribute'"
     * @generated
     */
    InteractionNode getSourceRef();

    /**
     * Sets the value of the '{@link org.drools.epn.ConversationLink#getSourceRef <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' reference.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef(InteractionNode value);

    /**
     * Returns the value of the '<em><b>Target Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Ref</em>' reference.
     * @see #setTargetRef(InteractionNode)
     * @see org.drools.epn.EpnPackage#getConversationLink_TargetRef()
     * @model required="true"
     *        annotation="ExtendedMetaData name='targetRef' kind='attribute'"
     * @generated
     */
    InteractionNode getTargetRef();

    /**
     * Sets the value of the '{@link org.drools.epn.ConversationLink#getTargetRef <em>Target Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' reference.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(InteractionNode value);

} // ConversationLink
