/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.util;

import org.drools.epn.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.drools.epn.EPNPackage
 * @generated
 */
public class EPNAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EPNPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EPNPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EPNSwitch<Adapter> modelSwitch =
        new EPNSwitch<Adapter>() {
            @Override
            public Adapter caseActivity(Activity object) {
                return createActivityAdapter();
            }
            @Override
            public Adapter caseBaseElement(BaseElement object) {
                return createBaseElementAdapter();
            }
            @Override
            public Adapter caseBounds(Bounds object) {
                return createBoundsAdapter();
            }
            @Override
            public Adapter caseCallableElement(CallableElement object) {
                return createCallableElementAdapter();
            }
            @Override
            public Adapter caseDefinitions(Definitions object) {
                return createDefinitionsAdapter();
            }
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseDiagramElement(DiagramElement object) {
                return createDiagramElementAdapter();
            }
            @Override
            public Adapter caseDocumentation(Documentation object) {
                return createDocumentationAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseEdge(Edge object) {
                return createEdgeAdapter();
            }
            @Override
            public Adapter caseEPNDiagram(EPNDiagram object) {
                return createEPNDiagramAdapter();
            }
            @Override
            public Adapter caseEPNEdge(EPNEdge object) {
                return createEPNEdgeAdapter();
            }
            @Override
            public Adapter caseEPNLabel(EPNLabel object) {
                return createEPNLabelAdapter();
            }
            @Override
            public Adapter caseEPNPlane(EPNPlane object) {
                return createEPNPlaneAdapter();
            }
            @Override
            public Adapter caseEPNShape(EPNShape object) {
                return createEPNShapeAdapter();
            }
            @Override
            public Adapter caseEventChannel(EventChannel object) {
                return createEventChannelAdapter();
            }
            @Override
            public Adapter caseEventConsumer(EventConsumer object) {
                return createEventConsumerAdapter();
            }
            @Override
            public Adapter caseEventProcessingAgent(EventProcessingAgent object) {
                return createEventProcessingAgentAdapter();
            }
            @Override
            public Adapter caseEventProducer(EventProducer object) {
                return createEventProducerAdapter();
            }
            @Override
            public Adapter caseExtensionType(ExtensionType object) {
                return createExtensionTypeAdapter();
            }
            @Override
            public Adapter caseFlowElement(FlowElement object) {
                return createFlowElementAdapter();
            }
            @Override
            public Adapter caseFlowNode(FlowNode object) {
                return createFlowNodeAdapter();
            }
            @Override
            public Adapter caseLabel(Label object) {
                return createLabelAdapter();
            }
            @Override
            public Adapter caseLabeledEdge(LabeledEdge object) {
                return createLabeledEdgeAdapter();
            }
            @Override
            public Adapter caseLabeledShape(LabeledShape object) {
                return createLabeledShapeAdapter();
            }
            @Override
            public Adapter caseNetwork(Network object) {
                return createNetworkAdapter();
            }
            @Override
            public Adapter caseNode(Node object) {
                return createNodeAdapter();
            }
            @Override
            public Adapter casePlane(Plane object) {
                return createPlaneAdapter();
            }
            @Override
            public Adapter casePoint(Point object) {
                return createPointAdapter();
            }
            @Override
            public Adapter caseRootElement(RootElement object) {
                return createRootElementAdapter();
            }
            @Override
            public Adapter caseSequenceFlow(SequenceFlow object) {
                return createSequenceFlowAdapter();
            }
            @Override
            public Adapter caseShape(Shape object) {
                return createShapeAdapter();
            }
            @Override
            public Adapter caseStyle(Style object) {
                return createStyleAdapter();
            }
            @Override
            public Adapter caseTask(Task object) {
                return createTaskAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.BaseElement
     * @generated
     */
    public Adapter createBaseElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Bounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Bounds
     * @generated
     */
    public Adapter createBoundsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.CallableElement
     * @generated
     */
    public Adapter createCallableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Definitions
     * @generated
     */
    public Adapter createDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.DiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.DiagramElement
     * @generated
     */
    public Adapter createDiagramElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Documentation
     * @generated
     */
    public Adapter createDocumentationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Edge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Edge
     * @generated
     */
    public Adapter createEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EPNDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EPNDiagram
     * @generated
     */
    public Adapter createEPNDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EPNEdge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EPNEdge
     * @generated
     */
    public Adapter createEPNEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EPNLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EPNLabel
     * @generated
     */
    public Adapter createEPNLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EPNPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EPNPlane
     * @generated
     */
    public Adapter createEPNPlaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EPNShape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EPNShape
     * @generated
     */
    public Adapter createEPNShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EventChannel <em>Event Channel</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EventChannel
     * @generated
     */
    public Adapter createEventChannelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EventConsumer <em>Event Consumer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EventConsumer
     * @generated
     */
    public Adapter createEventConsumerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EventProcessingAgent <em>Event Processing Agent</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EventProcessingAgent
     * @generated
     */
    public Adapter createEventProcessingAgentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.EventProducer <em>Event Producer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.EventProducer
     * @generated
     */
    public Adapter createEventProducerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.ExtensionType <em>Extension Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.ExtensionType
     * @generated
     */
    public Adapter createExtensionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.FlowElement
     * @generated
     */
    public Adapter createFlowElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.FlowNode
     * @generated
     */
    public Adapter createFlowNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Label
     * @generated
     */
    public Adapter createLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.LabeledEdge <em>Labeled Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.LabeledEdge
     * @generated
     */
    public Adapter createLabeledEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.LabeledShape <em>Labeled Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.LabeledShape
     * @generated
     */
    public Adapter createLabeledShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Network
     * @generated
     */
    public Adapter createNetworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Node
     * @generated
     */
    public Adapter createNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Plane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Plane
     * @generated
     */
    public Adapter createPlaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Point <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Point
     * @generated
     */
    public Adapter createPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.RootElement
     * @generated
     */
    public Adapter createRootElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.SequenceFlow
     * @generated
     */
    public Adapter createSequenceFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Shape
     * @generated
     */
    public Adapter createShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Style
     * @generated
     */
    public Adapter createStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.Task
     * @generated
     */
    public Adapter createTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //EPNAdapterFactory
