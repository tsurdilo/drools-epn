/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.drools.epn.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getSequenceFlow()
 * @model annotation="ExtendedMetaData name='tSequenceFlow' kind='elementOnly'"
 * @generated
 */
public interface SequenceFlow extends FlowElement {
    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.drools.epn.FlowNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' reference.
     * @see #setSourceRef(FlowNode)
     * @see org.drools.epn.EpnPackage#getSequenceFlow_SourceRef()
     * @see org.drools.epn.FlowNode#getOutgoing
     * @model opposite="outgoing" resolveProxies="false" required="true" ordered="false"
     *        annotation="ExtendedMetaData name='sourceRef' kind='attribute'"
     * @generated
     */
    FlowNode getSourceRef();

    /**
     * Sets the value of the '{@link org.drools.epn.SequenceFlow#getSourceRef <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' reference.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef(FlowNode value);

    /**
     * Returns the value of the '<em><b>Target Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.drools.epn.FlowNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Ref</em>' reference.
     * @see #setTargetRef(FlowNode)
     * @see org.drools.epn.EpnPackage#getSequenceFlow_TargetRef()
     * @see org.drools.epn.FlowNode#getIncoming
     * @model opposite="incoming" resolveProxies="false" required="true" ordered="false"
     * @generated
     */
    FlowNode getTargetRef();

    /**
     * Sets the value of the '{@link org.drools.epn.SequenceFlow#getTargetRef <em>Target Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' reference.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(FlowNode value);

} // SequenceFlow
