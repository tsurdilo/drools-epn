/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.EventProducer#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getEventProducer()
 * @model extendedMetaData="name='EventProducer' kind='elementOnly'"
 * @generated
 */
public interface EventProducer extends Task {
    /**
     * Returns the value of the '<em><b>Implementation</b></em>' attribute.
     * The default value is <code>"##unspecified"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation</em>' attribute.
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #setImplementation(Object)
     * @see org.drools.epn.EPNPackage#getEventProducer_Implementation()
     * @model default="##unspecified" unsettable="true" dataType="org.drools.epn.Implementation"
     *        extendedMetaData="kind='attribute' name='implementation'"
     * @generated
     */
    Object getImplementation();

    /**
     * Sets the value of the '{@link org.drools.epn.EventProducer#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation</em>' attribute.
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @generated
     */
    void setImplementation(Object value);

    /**
     * Unsets the value of the '{@link org.drools.epn.EventProducer#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(Object)
     * @generated
     */
    void unsetImplementation();

    /**
     * Returns whether the value of the '{@link org.drools.epn.EventProducer#getImplementation <em>Implementation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Implementation</em>' attribute is set.
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(Object)
     * @generated
     */
    boolean isSetImplementation();

} // EventProducer
