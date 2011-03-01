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
 * @see org.drools.epn.EpnPackage
 * @generated
 */
public class EpnAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EpnPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EpnAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EpnPackage.eINSTANCE;
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
    protected EpnSwitch<Adapter> modelSwitch =
        new EpnSwitch<Adapter>() {
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseActivity(Activity object) {
                return createActivityAdapter();
            }
            @Override
            public Adapter caseFlowNode(FlowNode object) {
                return createFlowNodeAdapter();
            }
            @Override
            public Adapter caseFlowElement(FlowElement object) {
                return createFlowElementAdapter();
            }
            @Override
            public Adapter caseBaseElement(BaseElement object) {
                return createBaseElementAdapter();
            }
            @Override
            public Adapter caseDocumentation(Documentation object) {
                return createDocumentationAdapter();
            }
            @Override
            public Adapter caseSequenceFlow(SequenceFlow object) {
                return createSequenceFlowAdapter();
            }
            @Override
            public Adapter caseTask(Task object) {
                return createTaskAdapter();
            }
            @Override
            public Adapter caseInteractionNode(InteractionNode object) {
                return createInteractionNodeAdapter();
            }
            @Override
            public Adapter caseConversationLink(ConversationLink object) {
                return createConversationLinkAdapter();
            }
            @Override
            public Adapter caseEventProducer(EventProducer object) {
                return createEventProducerAdapter();
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
            public Adapter caseDataInput(DataInput object) {
                return createDataInputAdapter();
            }
            @Override
            public Adapter caseDataOutput(DataOutput object) {
                return createDataOutputAdapter();
            }
            @Override
            public Adapter caseInputSet(InputSet object) {
                return createInputSetAdapter();
            }
            @Override
            public Adapter caseOutputSet(OutputSet object) {
                return createOutputSetAdapter();
            }
            @Override
            public Adapter caseEventChannel(EventChannel object) {
                return createEventChannelAdapter();
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
     * Creates a new adapter for an object of class '{@link org.drools.epn.InteractionNode <em>Interaction Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.InteractionNode
     * @generated
     */
    public Adapter createInteractionNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.ConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.ConversationLink
     * @generated
     */
    public Adapter createConversationLinkAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.drools.epn.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.DataInput
     * @generated
     */
    public Adapter createDataInputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.DataOutput
     * @generated
     */
    public Adapter createDataOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.InputSet
     * @generated
     */
    public Adapter createInputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.drools.epn.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.drools.epn.OutputSet
     * @generated
     */
    public Adapter createOutputSetAdapter() {
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

} //EpnAdapterFactory
