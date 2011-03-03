/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.util;

import java.util.List;

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
import org.drools.epn.ExtensionType;
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
import org.drools.epn.Style;
import org.drools.epn.Task;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.drools.epn.EPNPackage
 * @generated
 */
public class EPNSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EPNPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNSwitch() {
        if (modelPackage == null) {
            modelPackage = EPNPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case EPNPackage.ACTIVITY: {
                Activity activity = (Activity)theEObject;
                T result = caseActivity(activity);
                if (result == null) result = caseFlowNode(activity);
                if (result == null) result = caseFlowElement(activity);
                if (result == null) result = caseBaseElement(activity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.BASE_ELEMENT: {
                BaseElement baseElement = (BaseElement)theEObject;
                T result = caseBaseElement(baseElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.BOUNDS: {
                Bounds bounds = (Bounds)theEObject;
                T result = caseBounds(bounds);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.CALLABLE_ELEMENT: {
                CallableElement callableElement = (CallableElement)theEObject;
                T result = caseCallableElement(callableElement);
                if (result == null) result = caseRootElement(callableElement);
                if (result == null) result = caseBaseElement(callableElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.DEFINITIONS: {
                Definitions definitions = (Definitions)theEObject;
                T result = caseDefinitions(definitions);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.DIAGRAM: {
                Diagram diagram = (Diagram)theEObject;
                T result = caseDiagram(diagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.DIAGRAM_ELEMENT: {
                DiagramElement diagramElement = (DiagramElement)theEObject;
                T result = caseDiagramElement(diagramElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.DOCUMENTATION: {
                Documentation documentation = (Documentation)theEObject;
                T result = caseDocumentation(documentation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EDGE: {
                Edge edge = (Edge)theEObject;
                T result = caseEdge(edge);
                if (result == null) result = caseDiagramElement(edge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EPN_DIAGRAM: {
                EPNDiagram epnDiagram = (EPNDiagram)theEObject;
                T result = caseEPNDiagram(epnDiagram);
                if (result == null) result = caseDiagram(epnDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EPN_EDGE: {
                EPNEdge epnEdge = (EPNEdge)theEObject;
                T result = caseEPNEdge(epnEdge);
                if (result == null) result = caseLabeledEdge(epnEdge);
                if (result == null) result = caseEdge(epnEdge);
                if (result == null) result = caseDiagramElement(epnEdge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EPN_LABEL: {
                EPNLabel epnLabel = (EPNLabel)theEObject;
                T result = caseEPNLabel(epnLabel);
                if (result == null) result = caseLabel(epnLabel);
                if (result == null) result = caseNode(epnLabel);
                if (result == null) result = caseDiagramElement(epnLabel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EPN_PLANE: {
                EPNPlane epnPlane = (EPNPlane)theEObject;
                T result = caseEPNPlane(epnPlane);
                if (result == null) result = casePlane(epnPlane);
                if (result == null) result = caseNode(epnPlane);
                if (result == null) result = caseDiagramElement(epnPlane);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EPN_SHAPE: {
                EPNShape epnShape = (EPNShape)theEObject;
                T result = caseEPNShape(epnShape);
                if (result == null) result = caseLabeledShape(epnShape);
                if (result == null) result = caseShape(epnShape);
                if (result == null) result = caseNode(epnShape);
                if (result == null) result = caseDiagramElement(epnShape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EVENT_CHANNEL: {
                EventChannel eventChannel = (EventChannel)theEObject;
                T result = caseEventChannel(eventChannel);
                if (result == null) result = caseTask(eventChannel);
                if (result == null) result = caseActivity(eventChannel);
                if (result == null) result = caseFlowNode(eventChannel);
                if (result == null) result = caseFlowElement(eventChannel);
                if (result == null) result = caseBaseElement(eventChannel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EVENT_CONSUMER: {
                EventConsumer eventConsumer = (EventConsumer)theEObject;
                T result = caseEventConsumer(eventConsumer);
                if (result == null) result = caseTask(eventConsumer);
                if (result == null) result = caseActivity(eventConsumer);
                if (result == null) result = caseFlowNode(eventConsumer);
                if (result == null) result = caseFlowElement(eventConsumer);
                if (result == null) result = caseBaseElement(eventConsumer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EVENT_PROCESSING_AGENT: {
                EventProcessingAgent eventProcessingAgent = (EventProcessingAgent)theEObject;
                T result = caseEventProcessingAgent(eventProcessingAgent);
                if (result == null) result = caseTask(eventProcessingAgent);
                if (result == null) result = caseActivity(eventProcessingAgent);
                if (result == null) result = caseFlowNode(eventProcessingAgent);
                if (result == null) result = caseFlowElement(eventProcessingAgent);
                if (result == null) result = caseBaseElement(eventProcessingAgent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EVENT_PRODUCER: {
                EventProducer eventProducer = (EventProducer)theEObject;
                T result = caseEventProducer(eventProducer);
                if (result == null) result = caseTask(eventProducer);
                if (result == null) result = caseActivity(eventProducer);
                if (result == null) result = caseFlowNode(eventProducer);
                if (result == null) result = caseFlowElement(eventProducer);
                if (result == null) result = caseBaseElement(eventProducer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.EXTENSION_TYPE: {
                ExtensionType extensionType = (ExtensionType)theEObject;
                T result = caseExtensionType(extensionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.FLOW_ELEMENT: {
                FlowElement flowElement = (FlowElement)theEObject;
                T result = caseFlowElement(flowElement);
                if (result == null) result = caseBaseElement(flowElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.FLOW_NODE: {
                FlowNode flowNode = (FlowNode)theEObject;
                T result = caseFlowNode(flowNode);
                if (result == null) result = caseFlowElement(flowNode);
                if (result == null) result = caseBaseElement(flowNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.LABEL: {
                Label label = (Label)theEObject;
                T result = caseLabel(label);
                if (result == null) result = caseNode(label);
                if (result == null) result = caseDiagramElement(label);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.LABELED_EDGE: {
                LabeledEdge labeledEdge = (LabeledEdge)theEObject;
                T result = caseLabeledEdge(labeledEdge);
                if (result == null) result = caseEdge(labeledEdge);
                if (result == null) result = caseDiagramElement(labeledEdge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.LABELED_SHAPE: {
                LabeledShape labeledShape = (LabeledShape)theEObject;
                T result = caseLabeledShape(labeledShape);
                if (result == null) result = caseShape(labeledShape);
                if (result == null) result = caseNode(labeledShape);
                if (result == null) result = caseDiagramElement(labeledShape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.NODE: {
                Node node = (Node)theEObject;
                T result = caseNode(node);
                if (result == null) result = caseDiagramElement(node);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.PLANE: {
                Plane plane = (Plane)theEObject;
                T result = casePlane(plane);
                if (result == null) result = caseNode(plane);
                if (result == null) result = caseDiagramElement(plane);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.POINT: {
                Point point = (Point)theEObject;
                T result = casePoint(point);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.PROCESS: {
                org.drools.epn.Process process = (org.drools.epn.Process)theEObject;
                T result = caseProcess(process);
                if (result == null) result = caseCallableElement(process);
                if (result == null) result = caseRootElement(process);
                if (result == null) result = caseBaseElement(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.ROOT_ELEMENT: {
                RootElement rootElement = (RootElement)theEObject;
                T result = caseRootElement(rootElement);
                if (result == null) result = caseBaseElement(rootElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.SEQUENCE_FLOW: {
                SequenceFlow sequenceFlow = (SequenceFlow)theEObject;
                T result = caseSequenceFlow(sequenceFlow);
                if (result == null) result = caseFlowElement(sequenceFlow);
                if (result == null) result = caseBaseElement(sequenceFlow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.SHAPE: {
                Shape shape = (Shape)theEObject;
                T result = caseShape(shape);
                if (result == null) result = caseNode(shape);
                if (result == null) result = caseDiagramElement(shape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.STYLE: {
                Style style = (Style)theEObject;
                T result = caseStyle(style);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EPNPackage.TASK: {
                Task task = (Task)theEObject;
                T result = caseTask(task);
                if (result == null) result = caseActivity(task);
                if (result == null) result = caseFlowNode(task);
                if (result == null) result = caseFlowElement(task);
                if (result == null) result = caseBaseElement(task);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivity(Activity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseElement(BaseElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bounds</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bounds</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBounds(Bounds object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Callable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Callable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallableElement(CallableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefinitions(Definitions object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagram(Diagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramElement(DiagramElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentation(Documentation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEdge(Edge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPNDiagram(EPNDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPNEdge(EPNEdge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Label</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPNLabel(EPNLabel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plane</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPNPlane(EPNPlane object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPNShape(EPNShape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Channel</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Channel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventChannel(EventChannel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Consumer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Consumer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventConsumer(EventConsumer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Processing Agent</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Processing Agent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventProcessingAgent(EventProcessingAgent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Producer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Producer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventProducer(EventProducer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extension Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extension Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtensionType(ExtensionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowElement(FlowElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowNode(FlowNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Label</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabel(Label object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabeledEdge(LabeledEdge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Labeled Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Labeled Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabeledShape(LabeledShape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNode(Node object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plane</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlane(Plane object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePoint(Point object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcess(org.drools.epn.Process object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRootElement(RootElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSequenceFlow(SequenceFlow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShape(Shape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyle(Style object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTask(Task object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //EPNSwitch
