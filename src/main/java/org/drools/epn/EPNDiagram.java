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
 * A representation of the model object '<em><b>EPN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EPNDiagram#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EpnPackage#getEPNDiagram()
 * @model annotation="ExtendedMetaData name='EPNDiagram' kind='elementOnly'"
 * @generated
 */
public interface EPNDiagram extends Diagram {
    /**
     * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
     * The list contents are of type {@link org.drools.epn.FlowElementsContainer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processes</em>' containment reference list.
     * @see org.drools.epn.EpnPackage#getEPNDiagram_Processes()
     * @model containment="true" required="true"
     *        annotation="ExtendedMetaData name='process' kind='element'"
     * @generated
     */
    EList<FlowElementsContainer> getProcesses();

} // EPNDiagram
