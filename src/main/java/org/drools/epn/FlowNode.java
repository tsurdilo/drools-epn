/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.drools.epn.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getFlowNode()
 * @model annotation="ExtendedMetaData name='tFlowNode' kind='elementOnly'"
 * @generated
 */
public interface FlowNode extends FlowElement {
    /**
     * Returns the value of the '<em><b>Incoming</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.SequenceFlow}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming</em>' reference list.
     * @see org.drools.epn.EpnPackage#getFlowNode_Incoming()
     * @see org.drools.epn.SequenceFlow#getTargetRef
     * @model opposite="targetRef" resolveProxies="false" ordered="false"
     *        annotation="ExtendedMetaData name='incoming' kind='attribute'"
     * @generated
     */
    EList<SequenceFlow> getIncoming();

    /**
     * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
     * The list contents are of type {@link org.drools.epn.SequenceFlow}.
     * It is bidirectional and its opposite is '{@link org.drools.epn.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing</em>' reference list.
     * @see org.drools.epn.EpnPackage#getFlowNode_Outgoing()
     * @see org.drools.epn.SequenceFlow#getSourceRef
     * @model opposite="sourceRef" resolveProxies="false" ordered="false"
     *        annotation="ExtendedMetaData name='outgoing' kind='element'"
     * @generated
     */
    EList<SequenceFlow> getOutgoing();

} // FlowNode
