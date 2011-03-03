/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.Activity;
import org.drools.epn.BaseElement;
import org.drools.epn.Bounds;
import org.drools.epn.CallableElement;
import org.drools.epn.Definitions;
import org.drools.epn.Diagram;
import org.drools.epn.DiagramElement;
import org.drools.epn.DocumentRoot;
import org.drools.epn.Documentation;
import org.drools.epn.EPNDiagram;
import org.drools.epn.EPNEdge;
import org.drools.epn.EPNLabel;
import org.drools.epn.EPNPackage;
import org.drools.epn.EPNPlane;
import org.drools.epn.EPNShape;
import org.drools.epn.Edge;
import org.drools.epn.EventChannel;
import org.drools.epn.EventConsumer;
import org.drools.epn.EventProcessingAgent;
import org.drools.epn.EventProducer;
import org.drools.epn.FlowElement;
import org.drools.epn.FlowNode;
import org.drools.epn.Label;
import org.drools.epn.LabeledEdge;
import org.drools.epn.LabeledShape;
import org.drools.epn.Node;
import org.drools.epn.Plane;
import org.drools.epn.Point;
import org.drools.epn.RootElement;
import org.drools.epn.SequenceFlow;
import org.drools.epn.Shape;
import org.drools.epn.Task;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEPNDiagram <em>EPN Diagram</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEPNEdge <em>EPN Edge</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEPNLabel <em>EPN Label</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEPNPlane <em>EPN Plane</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEPNShape <em>EPN Shape</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventChannel <em>Event Channel</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventConsumer <em>Event Consumer</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventProcessingAgent <em>Event Processing Agent</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getEventProducer <em>Event Producer</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getLabeledEdge <em>Labeled Edge</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getLabeledShape <em>Labeled Shape</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.drools.epn.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EPNPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, EPNPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EPNPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EPNPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity getActivity() {
        return (Activity)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__ACTIVITY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__ACTIVITY, newActivity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivity(Activity newActivity) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__ACTIVITY, newActivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElement getBaseElement() {
        return (BaseElement)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__BASE_ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseElement(BaseElement newBaseElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__BASE_ELEMENT, newBaseElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseElement(BaseElement newBaseElement) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__BASE_ELEMENT, newBaseElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bounds getBounds() {
        return (Bounds)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__BOUNDS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__BOUNDS, newBounds, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBounds(Bounds newBounds) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__BOUNDS, newBounds);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement getCallableElement() {
        return (CallableElement)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallableElement(CallableElement newCallableElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT, newCallableElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallableElement(CallableElement newCallableElement) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT, newCallableElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Definitions getDefinitions() {
        return (Definitions)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__DEFINITIONS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefinitions(Definitions newDefinitions, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__DEFINITIONS, newDefinitions, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinitions(Definitions newDefinitions) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__DEFINITIONS, newDefinitions);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram getDiagram() {
        return (Diagram)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__DIAGRAM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(Diagram newDiagram) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getDiagramElement() {
        return (DiagramElement)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagramElement(DiagramElement newDiagramElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT, newDiagramElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagramElement(DiagramElement newDiagramElement) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT, newDiagramElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation getDocumentation() {
        return (Documentation)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(Documentation newDocumentation) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Edge getEdge() {
        return (Edge)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EDGE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEdge(Edge newEdge, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EDGE, newEdge, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEdge(Edge newEdge) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EDGE, newEdge);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNDiagram getEPNDiagram() {
        return (EPNDiagram)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EPN_DIAGRAM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNDiagram(EPNDiagram newEPNDiagram, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EPN_DIAGRAM, newEPNDiagram, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNDiagram(EPNDiagram newEPNDiagram) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EPN_DIAGRAM, newEPNDiagram);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNEdge getEPNEdge() {
        return (EPNEdge)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EPN_EDGE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNEdge(EPNEdge newEPNEdge, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EPN_EDGE, newEPNEdge, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNEdge(EPNEdge newEPNEdge) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EPN_EDGE, newEPNEdge);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNLabel getEPNLabel() {
        return (EPNLabel)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EPN_LABEL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNLabel(EPNLabel newEPNLabel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EPN_LABEL, newEPNLabel, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNLabel(EPNLabel newEPNLabel) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EPN_LABEL, newEPNLabel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNPlane getEPNPlane() {
        return (EPNPlane)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EPN_PLANE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNPlane(EPNPlane newEPNPlane, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EPN_PLANE, newEPNPlane, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNPlane(EPNPlane newEPNPlane) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EPN_PLANE, newEPNPlane);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNShape getEPNShape() {
        return (EPNShape)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EPN_SHAPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEPNShape(EPNShape newEPNShape, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EPN_SHAPE, newEPNShape, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPNShape(EPNShape newEPNShape) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EPN_SHAPE, newEPNShape);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventChannel getEventChannel() {
        return (EventChannel)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_CHANNEL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventChannel(EventChannel newEventChannel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_CHANNEL, newEventChannel, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventChannel(EventChannel newEventChannel) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_CHANNEL, newEventChannel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowElement getFlowElement() {
        return (FlowElement)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__FLOW_ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFlowElement(FlowElement newFlowElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__FLOW_ELEMENT, newFlowElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowElement(FlowElement newFlowElement) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__FLOW_ELEMENT, newFlowElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventConsumer getEventConsumer() {
        return (EventConsumer)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_CONSUMER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventConsumer(EventConsumer newEventConsumer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_CONSUMER, newEventConsumer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventConsumer(EventConsumer newEventConsumer) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_CONSUMER, newEventConsumer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProcessingAgent getEventProcessingAgent() {
        return (EventProcessingAgent)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventProcessingAgent(EventProcessingAgent newEventProcessingAgent, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT, newEventProcessingAgent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventProcessingAgent(EventProcessingAgent newEventProcessingAgent) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT, newEventProcessingAgent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProducer getEventProducer() {
        return (EventProducer)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_PRODUCER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventProducer(EventProducer newEventProducer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_PRODUCER, newEventProducer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventProducer(EventProducer newEventProducer) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__EVENT_PRODUCER, newEventProducer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowNode getFlowNode() {
        return (FlowNode)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__FLOW_NODE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFlowNode(FlowNode newFlowNode, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__FLOW_NODE, newFlowNode, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowNode(FlowNode newFlowNode) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__FLOW_NODE, newFlowNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Label getLabel() {
        return (Label)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__LABEL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(Label newLabel) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LabeledEdge getLabeledEdge() {
        return (LabeledEdge)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabeledEdge(LabeledEdge newLabeledEdge, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE, newLabeledEdge, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabeledEdge(LabeledEdge newLabeledEdge) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE, newLabeledEdge);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LabeledShape getLabeledShape() {
        return (LabeledShape)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabeledShape(LabeledShape newLabeledShape, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE, newLabeledShape, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabeledShape(LabeledShape newLabeledShape) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE, newLabeledShape);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getNode() {
        return (Node)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__NODE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__NODE, newNode, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode(Node newNode) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__NODE, newNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Plane getPlane() {
        return (Plane)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__PLANE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlane(Plane newPlane, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__PLANE, newPlane, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlane(Plane newPlane) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__PLANE, newPlane);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point getPoint() {
        return (Point)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__POINT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPoint(Point newPoint, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__POINT, newPoint, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPoint(Point newPoint) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__POINT, newPoint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.drools.epn.Process getProcess() {
        return (org.drools.epn.Process)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__PROCESS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcess(org.drools.epn.Process newProcess, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__PROCESS, newProcess, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcess(org.drools.epn.Process newProcess) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__PROCESS, newProcess);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootElement getRootElement() {
        return (RootElement)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__ROOT_ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootElement(RootElement newRootElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__ROOT_ELEMENT, newRootElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootElement(RootElement newRootElement) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__ROOT_ELEMENT, newRootElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow getSequenceFlow() {
        return (SequenceFlow)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__SEQUENCE_FLOW, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSequenceFlow(SequenceFlow newSequenceFlow, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__SEQUENCE_FLOW, newSequenceFlow, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequenceFlow(SequenceFlow newSequenceFlow) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__SEQUENCE_FLOW, newSequenceFlow);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shape getShape() {
        return (Shape)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__SHAPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetShape(Shape newShape, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__SHAPE, newShape, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShape(Shape newShape) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__SHAPE, newShape);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task getTask() {
        return (Task)getMixed().get(EPNPackage.Literals.DOCUMENT_ROOT__TASK, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EPNPackage.Literals.DOCUMENT_ROOT__TASK, newTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTask(Task newTask) {
        ((FeatureMap.Internal)getMixed()).set(EPNPackage.Literals.DOCUMENT_ROOT__TASK, newTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EPNPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case EPNPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case EPNPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case EPNPackage.DOCUMENT_ROOT__ACTIVITY:
                return basicSetActivity(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                return basicSetBaseElement(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__BOUNDS:
                return basicSetBounds(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
                return basicSetCallableElement(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__DEFINITIONS:
                return basicSetDefinitions(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM:
                return basicSetDiagram(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
                return basicSetDiagramElement(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EDGE:
                return basicSetEdge(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EPN_DIAGRAM:
                return basicSetEPNDiagram(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EPN_EDGE:
                return basicSetEPNEdge(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EPN_LABEL:
                return basicSetEPNLabel(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EPN_PLANE:
                return basicSetEPNPlane(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EPN_SHAPE:
                return basicSetEPNShape(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                return basicSetEventChannel(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
                return basicSetFlowElement(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                return basicSetEventConsumer(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                return basicSetEventProcessingAgent(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                return basicSetEventProducer(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__FLOW_NODE:
                return basicSetFlowNode(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__LABEL:
                return basicSetLabel(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__LABELED_EDGE:
                return basicSetLabeledEdge(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__LABELED_SHAPE:
                return basicSetLabeledShape(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__NODE:
                return basicSetNode(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__PLANE:
                return basicSetPlane(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__POINT:
                return basicSetPoint(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__PROCESS:
                return basicSetProcess(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
                return basicSetRootElement(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                return basicSetSequenceFlow(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__SHAPE:
                return basicSetShape(null, msgs);
            case EPNPackage.DOCUMENT_ROOT__TASK:
                return basicSetTask(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EPNPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case EPNPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case EPNPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case EPNPackage.DOCUMENT_ROOT__ACTIVITY:
                return getActivity();
            case EPNPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                return getBaseElement();
            case EPNPackage.DOCUMENT_ROOT__BOUNDS:
                return getBounds();
            case EPNPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
                return getCallableElement();
            case EPNPackage.DOCUMENT_ROOT__DEFINITIONS:
                return getDefinitions();
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM:
                return getDiagram();
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
                return getDiagramElement();
            case EPNPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation();
            case EPNPackage.DOCUMENT_ROOT__EDGE:
                return getEdge();
            case EPNPackage.DOCUMENT_ROOT__EPN_DIAGRAM:
                return getEPNDiagram();
            case EPNPackage.DOCUMENT_ROOT__EPN_EDGE:
                return getEPNEdge();
            case EPNPackage.DOCUMENT_ROOT__EPN_LABEL:
                return getEPNLabel();
            case EPNPackage.DOCUMENT_ROOT__EPN_PLANE:
                return getEPNPlane();
            case EPNPackage.DOCUMENT_ROOT__EPN_SHAPE:
                return getEPNShape();
            case EPNPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                return getEventChannel();
            case EPNPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
                return getFlowElement();
            case EPNPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                return getEventConsumer();
            case EPNPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                return getEventProcessingAgent();
            case EPNPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                return getEventProducer();
            case EPNPackage.DOCUMENT_ROOT__FLOW_NODE:
                return getFlowNode();
            case EPNPackage.DOCUMENT_ROOT__LABEL:
                return getLabel();
            case EPNPackage.DOCUMENT_ROOT__LABELED_EDGE:
                return getLabeledEdge();
            case EPNPackage.DOCUMENT_ROOT__LABELED_SHAPE:
                return getLabeledShape();
            case EPNPackage.DOCUMENT_ROOT__NODE:
                return getNode();
            case EPNPackage.DOCUMENT_ROOT__PLANE:
                return getPlane();
            case EPNPackage.DOCUMENT_ROOT__POINT:
                return getPoint();
            case EPNPackage.DOCUMENT_ROOT__PROCESS:
                return getProcess();
            case EPNPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
                return getRootElement();
            case EPNPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                return getSequenceFlow();
            case EPNPackage.DOCUMENT_ROOT__SHAPE:
                return getShape();
            case EPNPackage.DOCUMENT_ROOT__TASK:
                return getTask();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EPNPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__ACTIVITY:
                setActivity((Activity)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                setBaseElement((BaseElement)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__BOUNDS:
                setBounds((Bounds)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
                setCallableElement((CallableElement)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__DEFINITIONS:
                setDefinitions((Definitions)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM:
                setDiagram((Diagram)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
                setDiagramElement((DiagramElement)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((Documentation)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EDGE:
                setEdge((Edge)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_DIAGRAM:
                setEPNDiagram((EPNDiagram)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_EDGE:
                setEPNEdge((EPNEdge)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_LABEL:
                setEPNLabel((EPNLabel)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_PLANE:
                setEPNPlane((EPNPlane)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_SHAPE:
                setEPNShape((EPNShape)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                setEventChannel((EventChannel)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
                setFlowElement((FlowElement)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                setEventConsumer((EventConsumer)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                setEventProcessingAgent((EventProcessingAgent)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                setEventProducer((EventProducer)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__FLOW_NODE:
                setFlowNode((FlowNode)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__LABEL:
                setLabel((Label)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__LABELED_EDGE:
                setLabeledEdge((LabeledEdge)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__LABELED_SHAPE:
                setLabeledShape((LabeledShape)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__NODE:
                setNode((Node)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__PLANE:
                setPlane((Plane)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__POINT:
                setPoint((Point)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__PROCESS:
                setProcess((org.drools.epn.Process)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
                setRootElement((RootElement)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                setSequenceFlow((SequenceFlow)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__SHAPE:
                setShape((Shape)newValue);
                return;
            case EPNPackage.DOCUMENT_ROOT__TASK:
                setTask((Task)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EPNPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case EPNPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case EPNPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case EPNPackage.DOCUMENT_ROOT__ACTIVITY:
                setActivity((Activity)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                setBaseElement((BaseElement)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__BOUNDS:
                setBounds((Bounds)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
                setCallableElement((CallableElement)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__DEFINITIONS:
                setDefinitions((Definitions)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM:
                setDiagram((Diagram)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
                setDiagramElement((DiagramElement)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((Documentation)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EDGE:
                setEdge((Edge)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_DIAGRAM:
                setEPNDiagram((EPNDiagram)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_EDGE:
                setEPNEdge((EPNEdge)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_LABEL:
                setEPNLabel((EPNLabel)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_PLANE:
                setEPNPlane((EPNPlane)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EPN_SHAPE:
                setEPNShape((EPNShape)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                setEventChannel((EventChannel)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
                setFlowElement((FlowElement)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                setEventConsumer((EventConsumer)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                setEventProcessingAgent((EventProcessingAgent)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                setEventProducer((EventProducer)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__FLOW_NODE:
                setFlowNode((FlowNode)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__LABEL:
                setLabel((Label)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__LABELED_EDGE:
                setLabeledEdge((LabeledEdge)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__LABELED_SHAPE:
                setLabeledShape((LabeledShape)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__NODE:
                setNode((Node)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__PLANE:
                setPlane((Plane)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__POINT:
                setPoint((Point)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__PROCESS:
                setProcess((org.drools.epn.Process)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
                setRootElement((RootElement)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                setSequenceFlow((SequenceFlow)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__SHAPE:
                setShape((Shape)null);
                return;
            case EPNPackage.DOCUMENT_ROOT__TASK:
                setTask((Task)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EPNPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case EPNPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case EPNPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case EPNPackage.DOCUMENT_ROOT__ACTIVITY:
                return getActivity() != null;
            case EPNPackage.DOCUMENT_ROOT__BASE_ELEMENT:
                return getBaseElement() != null;
            case EPNPackage.DOCUMENT_ROOT__BOUNDS:
                return getBounds() != null;
            case EPNPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
                return getCallableElement() != null;
            case EPNPackage.DOCUMENT_ROOT__DEFINITIONS:
                return getDefinitions() != null;
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM:
                return getDiagram() != null;
            case EPNPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
                return getDiagramElement() != null;
            case EPNPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation() != null;
            case EPNPackage.DOCUMENT_ROOT__EDGE:
                return getEdge() != null;
            case EPNPackage.DOCUMENT_ROOT__EPN_DIAGRAM:
                return getEPNDiagram() != null;
            case EPNPackage.DOCUMENT_ROOT__EPN_EDGE:
                return getEPNEdge() != null;
            case EPNPackage.DOCUMENT_ROOT__EPN_LABEL:
                return getEPNLabel() != null;
            case EPNPackage.DOCUMENT_ROOT__EPN_PLANE:
                return getEPNPlane() != null;
            case EPNPackage.DOCUMENT_ROOT__EPN_SHAPE:
                return getEPNShape() != null;
            case EPNPackage.DOCUMENT_ROOT__EVENT_CHANNEL:
                return getEventChannel() != null;
            case EPNPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
                return getFlowElement() != null;
            case EPNPackage.DOCUMENT_ROOT__EVENT_CONSUMER:
                return getEventConsumer() != null;
            case EPNPackage.DOCUMENT_ROOT__EVENT_PROCESSING_AGENT:
                return getEventProcessingAgent() != null;
            case EPNPackage.DOCUMENT_ROOT__EVENT_PRODUCER:
                return getEventProducer() != null;
            case EPNPackage.DOCUMENT_ROOT__FLOW_NODE:
                return getFlowNode() != null;
            case EPNPackage.DOCUMENT_ROOT__LABEL:
                return getLabel() != null;
            case EPNPackage.DOCUMENT_ROOT__LABELED_EDGE:
                return getLabeledEdge() != null;
            case EPNPackage.DOCUMENT_ROOT__LABELED_SHAPE:
                return getLabeledShape() != null;
            case EPNPackage.DOCUMENT_ROOT__NODE:
                return getNode() != null;
            case EPNPackage.DOCUMENT_ROOT__PLANE:
                return getPlane() != null;
            case EPNPackage.DOCUMENT_ROOT__POINT:
                return getPoint() != null;
            case EPNPackage.DOCUMENT_ROOT__PROCESS:
                return getProcess() != null;
            case EPNPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
                return getRootElement() != null;
            case EPNPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
                return getSequenceFlow() != null;
            case EPNPackage.DOCUMENT_ROOT__SHAPE:
                return getShape() != null;
            case EPNPackage.DOCUMENT_ROOT__TASK:
                return getTask() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
