/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.drools.epn.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEPNDiagram <em>EPN Diagram</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEPNEdge <em>EPN Edge</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEPNLabel <em>EPN Label</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEPNPlane <em>EPN Plane</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEPNShape <em>EPN Shape</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventChannel <em>Event Channel</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventConsumer <em>Event Consumer</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventProcessingAgent <em>Event Processing Agent</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getEventProducer <em>Event Producer</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getLabeledEdge <em>Labeled Edge</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getLabeledShape <em>Labeled Shape</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getNode <em>Node</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getPoint <em>Point</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getShape <em>Shape</em>}</li>
 *   <li>{@link org.drools.epn.DocumentRoot#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.drools.epn.EPNPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.drools.epn.EPNPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.drools.epn.EPNPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity</em>' containment reference.
     * @see #setActivity(Activity)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Activity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
     * @generated
     */
    Activity getActivity();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getActivity <em>Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity</em>' containment reference.
     * @see #getActivity()
     * @generated
     */
    void setActivity(Activity value);

    /**
     * Returns the value of the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Element</em>' containment reference.
     * @see #setBaseElement(BaseElement)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_BaseElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='baseElement' namespace='##targetNamespace'"
     * @generated
     */
    BaseElement getBaseElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getBaseElement <em>Base Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Element</em>' containment reference.
     * @see #getBaseElement()
     * @generated
     */
    void setBaseElement(BaseElement value);

    /**
     * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bounds</em>' containment reference.
     * @see #setBounds(Bounds)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Bounds()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Bounds' namespace='##targetNamespace'"
     * @generated
     */
    Bounds getBounds();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getBounds <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bounds</em>' containment reference.
     * @see #getBounds()
     * @generated
     */
    void setBounds(Bounds value);

    /**
     * Returns the value of the '<em><b>Callable Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Callable Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Callable Element</em>' containment reference.
     * @see #setCallableElement(CallableElement)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_CallableElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='callableElement' namespace='##targetNamespace'"
     * @generated
     */
    CallableElement getCallableElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getCallableElement <em>Callable Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callable Element</em>' containment reference.
     * @see #getCallableElement()
     * @generated
     */
    void setCallableElement(CallableElement value);

    /**
     * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definitions</em>' containment reference.
     * @see #setDefinitions(Definitions)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Definitions()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='definitions' namespace='##targetNamespace'"
     * @generated
     */
    Definitions getDefinitions();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDefinitions <em>Definitions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definitions</em>' containment reference.
     * @see #getDefinitions()
     * @generated
     */
    void setDefinitions(Definitions value);

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' containment reference.
     * @see #setDiagram(Diagram)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Diagram()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Diagram' namespace='##targetNamespace'"
     * @generated
     */
    Diagram getDiagram();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDiagram <em>Diagram</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' containment reference.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(Diagram value);

    /**
     * Returns the value of the '<em><b>Diagram Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Element</em>' containment reference.
     * @see #setDiagramElement(DiagramElement)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_DiagramElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DiagramElement' namespace='##targetNamespace'"
     * @generated
     */
    DiagramElement getDiagramElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDiagramElement <em>Diagram Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Element</em>' containment reference.
     * @see #getDiagramElement()
     * @generated
     */
    void setDiagramElement(DiagramElement value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(Documentation)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Documentation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
     * @generated
     */
    Documentation getDocumentation();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(Documentation value);

    /**
     * Returns the value of the '<em><b>Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Edge</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Edge</em>' containment reference.
     * @see #setEdge(Edge)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Edge()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Edge' namespace='##targetNamespace'"
     * @generated
     */
    Edge getEdge();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEdge <em>Edge</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edge</em>' containment reference.
     * @see #getEdge()
     * @generated
     */
    void setEdge(Edge value);

    /**
     * Returns the value of the '<em><b>EPN Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Diagram</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Diagram</em>' containment reference.
     * @see #setEPNDiagram(EPNDiagram)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EPNDiagram()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EPNDiagram' namespace='##targetNamespace'"
     * @generated
     */
    EPNDiagram getEPNDiagram();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEPNDiagram <em>EPN Diagram</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Diagram</em>' containment reference.
     * @see #getEPNDiagram()
     * @generated
     */
    void setEPNDiagram(EPNDiagram value);

    /**
     * Returns the value of the '<em><b>EPN Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Edge</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Edge</em>' containment reference.
     * @see #setEPNEdge(EPNEdge)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EPNEdge()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EPNEdge' namespace='##targetNamespace' affiliation='DiagramElement'"
     * @generated
     */
    EPNEdge getEPNEdge();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEPNEdge <em>EPN Edge</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Edge</em>' containment reference.
     * @see #getEPNEdge()
     * @generated
     */
    void setEPNEdge(EPNEdge value);

    /**
     * Returns the value of the '<em><b>EPN Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Label</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Label</em>' containment reference.
     * @see #setEPNLabel(EPNLabel)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EPNLabel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EPNLabel' namespace='##targetNamespace'"
     * @generated
     */
    EPNLabel getEPNLabel();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEPNLabel <em>EPN Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Label</em>' containment reference.
     * @see #getEPNLabel()
     * @generated
     */
    void setEPNLabel(EPNLabel value);

    /**
     * Returns the value of the '<em><b>EPN Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Plane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Plane</em>' containment reference.
     * @see #setEPNPlane(EPNPlane)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EPNPlane()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EPNPlane' namespace='##targetNamespace'"
     * @generated
     */
    EPNPlane getEPNPlane();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEPNPlane <em>EPN Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Plane</em>' containment reference.
     * @see #getEPNPlane()
     * @generated
     */
    void setEPNPlane(EPNPlane value);

    /**
     * Returns the value of the '<em><b>EPN Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPN Shape</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPN Shape</em>' containment reference.
     * @see #setEPNShape(EPNShape)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EPNShape()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EPNShape' namespace='##targetNamespace' affiliation='DiagramElement'"
     * @generated
     */
    EPNShape getEPNShape();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEPNShape <em>EPN Shape</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPN Shape</em>' containment reference.
     * @see #getEPNShape()
     * @generated
     */
    void setEPNShape(EPNShape value);

    /**
     * Returns the value of the '<em><b>Event Channel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Channel</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Channel</em>' containment reference.
     * @see #setEventChannel(EventChannel)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EventChannel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventChannel' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    EventChannel getEventChannel();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventChannel <em>Event Channel</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Channel</em>' containment reference.
     * @see #getEventChannel()
     * @generated
     */
    void setEventChannel(EventChannel value);

    /**
     * Returns the value of the '<em><b>Flow Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element</em>' containment reference.
     * @see #setFlowElement(FlowElement)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_FlowElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace'"
     * @generated
     */
    FlowElement getFlowElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getFlowElement <em>Flow Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Element</em>' containment reference.
     * @see #getFlowElement()
     * @generated
     */
    void setFlowElement(FlowElement value);

    /**
     * Returns the value of the '<em><b>Event Consumer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Consumer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Consumer</em>' containment reference.
     * @see #setEventConsumer(EventConsumer)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EventConsumer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventConsumer' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    EventConsumer getEventConsumer();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventConsumer <em>Event Consumer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Consumer</em>' containment reference.
     * @see #getEventConsumer()
     * @generated
     */
    void setEventConsumer(EventConsumer value);

    /**
     * Returns the value of the '<em><b>Event Processing Agent</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Processing Agent</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Processing Agent</em>' containment reference.
     * @see #setEventProcessingAgent(EventProcessingAgent)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EventProcessingAgent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventProcessingAgent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    EventProcessingAgent getEventProcessingAgent();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventProcessingAgent <em>Event Processing Agent</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Processing Agent</em>' containment reference.
     * @see #getEventProcessingAgent()
     * @generated
     */
    void setEventProcessingAgent(EventProcessingAgent value);

    /**
     * Returns the value of the '<em><b>Event Producer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Producer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Producer</em>' containment reference.
     * @see #setEventProducer(EventProducer)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_EventProducer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventProducer' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    EventProducer getEventProducer();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getEventProducer <em>Event Producer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Producer</em>' containment reference.
     * @see #getEventProducer()
     * @generated
     */
    void setEventProducer(EventProducer value);

    /**
     * Returns the value of the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Node</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Node</em>' containment reference.
     * @see #setFlowNode(FlowNode)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_FlowNode()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowNode' namespace='##targetNamespace'"
     * @generated
     */
    FlowNode getFlowNode();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getFlowNode <em>Flow Node</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Node</em>' containment reference.
     * @see #getFlowNode()
     * @generated
     */
    void setFlowNode(FlowNode value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference.
     * @see #setLabel(Label)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Label()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Label' namespace='##targetNamespace'"
     * @generated
     */
    Label getLabel();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getLabel <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' containment reference.
     * @see #getLabel()
     * @generated
     */
    void setLabel(Label value);

    /**
     * Returns the value of the '<em><b>Labeled Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Labeled Edge</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labeled Edge</em>' containment reference.
     * @see #setLabeledEdge(LabeledEdge)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_LabeledEdge()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='LabeledEdge' namespace='##targetNamespace'"
     * @generated
     */
    LabeledEdge getLabeledEdge();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getLabeledEdge <em>Labeled Edge</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labeled Edge</em>' containment reference.
     * @see #getLabeledEdge()
     * @generated
     */
    void setLabeledEdge(LabeledEdge value);

    /**
     * Returns the value of the '<em><b>Labeled Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Labeled Shape</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labeled Shape</em>' containment reference.
     * @see #setLabeledShape(LabeledShape)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_LabeledShape()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='LabeledShape' namespace='##targetNamespace'"
     * @generated
     */
    LabeledShape getLabeledShape();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getLabeledShape <em>Labeled Shape</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labeled Shape</em>' containment reference.
     * @see #getLabeledShape()
     * @generated
     */
    void setLabeledShape(LabeledShape value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' containment reference.
     * @see #setNode(Node)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Node()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
     * @generated
     */
    Node getNode();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getNode <em>Node</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node</em>' containment reference.
     * @see #getNode()
     * @generated
     */
    void setNode(Node value);

    /**
     * Returns the value of the '<em><b>Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plane</em>' containment reference.
     * @see #setPlane(Plane)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Plane()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Plane' namespace='##targetNamespace'"
     * @generated
     */
    Plane getPlane();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getPlane <em>Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plane</em>' containment reference.
     * @see #getPlane()
     * @generated
     */
    void setPlane(Plane value);

    /**
     * Returns the value of the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point</em>' containment reference.
     * @see #setPoint(Point)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Point()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
     * @generated
     */
    Point getPoint();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getPoint <em>Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point</em>' containment reference.
     * @see #getPoint()
     * @generated
     */
    void setPoint(Point value);

    /**
     * Returns the value of the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference.
     * @see #setProcess(org.drools.epn.Process)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Process()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    org.drools.epn.Process getProcess();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getProcess <em>Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' containment reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(org.drools.epn.Process value);

    /**
     * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Element</em>' containment reference.
     * @see #setRootElement(RootElement)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_RootElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rootElement' namespace='##targetNamespace'"
     * @generated
     */
    RootElement getRootElement();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getRootElement <em>Root Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Element</em>' containment reference.
     * @see #getRootElement()
     * @generated
     */
    void setRootElement(RootElement value);

    /**
     * Returns the value of the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence Flow</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence Flow</em>' containment reference.
     * @see #setSequenceFlow(SequenceFlow)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_SequenceFlow()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sequenceFlow' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    SequenceFlow getSequenceFlow();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Flow</em>' containment reference.
     * @see #getSequenceFlow()
     * @generated
     */
    void setSequenceFlow(SequenceFlow value);

    /**
     * Returns the value of the '<em><b>Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shape</em>' containment reference.
     * @see #setShape(Shape)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Shape()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Shape' namespace='##targetNamespace'"
     * @generated
     */
    Shape getShape();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getShape <em>Shape</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shape</em>' containment reference.
     * @see #getShape()
     * @generated
     */
    void setShape(Shape value);

    /**
     * Returns the value of the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task</em>' containment reference.
     * @see #setTask(Task)
     * @see org.drools.epn.EPNPackage#getDocumentRoot_Task()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    Task getTask();

    /**
     * Sets the value of the '{@link org.drools.epn.DocumentRoot#getTask <em>Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task</em>' containment reference.
     * @see #getTask()
     * @generated
     */
    void setTask(Task value);

} // DocumentRoot
