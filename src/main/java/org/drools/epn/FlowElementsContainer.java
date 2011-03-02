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
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement {
    /**
     * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Elements</em>' containment reference list.
     * @see org.drools.epn.EpnPackage#getFlowElementsContainer_FlowElements()
     * @model containment="true"
     *        annotation="ExtendedMetaData name='flowElement' kind='element'"
     * @generated
     */
    EList<FlowElement> getFlowElements();

} // FlowElementsContainer
