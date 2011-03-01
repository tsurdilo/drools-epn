/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.util;

import java.util.List;

import org.drools.epn.*;

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
 * @see org.drools.epn.EpnPackage
 * @generated
 */
public class EpnSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EpnPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EpnSwitch() {
        if (modelPackage == null) {
            modelPackage = EpnPackage.eINSTANCE;
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
            case EpnPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.ACTIVITY: {
                Activity activity = (Activity)theEObject;
                T result = caseActivity(activity);
                if (result == null) result = caseFlowNode(activity);
                if (result == null) result = caseFlowElement(activity);
                if (result == null) result = caseBaseElement(activity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.FLOW_NODE: {
                FlowNode flowNode = (FlowNode)theEObject;
                T result = caseFlowNode(flowNode);
                if (result == null) result = caseFlowElement(flowNode);
                if (result == null) result = caseBaseElement(flowNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.FLOW_ELEMENT: {
                FlowElement flowElement = (FlowElement)theEObject;
                T result = caseFlowElement(flowElement);
                if (result == null) result = caseBaseElement(flowElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.BASE_ELEMENT: {
                BaseElement baseElement = (BaseElement)theEObject;
                T result = caseBaseElement(baseElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.DOCUMENTATION: {
                Documentation documentation = (Documentation)theEObject;
                T result = caseDocumentation(documentation);
                if (result == null) result = caseBaseElement(documentation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.SEQUENCE_FLOW: {
                SequenceFlow sequenceFlow = (SequenceFlow)theEObject;
                T result = caseSequenceFlow(sequenceFlow);
                if (result == null) result = caseFlowElement(sequenceFlow);
                if (result == null) result = caseBaseElement(sequenceFlow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.TASK: {
                Task task = (Task)theEObject;
                T result = caseTask(task);
                if (result == null) result = caseActivity(task);
                if (result == null) result = caseInteractionNode(task);
                if (result == null) result = caseFlowNode(task);
                if (result == null) result = caseFlowElement(task);
                if (result == null) result = caseBaseElement(task);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.INTERACTION_NODE: {
                InteractionNode interactionNode = (InteractionNode)theEObject;
                T result = caseInteractionNode(interactionNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.CONVERSATION_LINK: {
                ConversationLink conversationLink = (ConversationLink)theEObject;
                T result = caseConversationLink(conversationLink);
                if (result == null) result = caseBaseElement(conversationLink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.EVENT_PRODUCER: {
                EventProducer eventProducer = (EventProducer)theEObject;
                T result = caseEventProducer(eventProducer);
                if (result == null) result = caseTask(eventProducer);
                if (result == null) result = caseActivity(eventProducer);
                if (result == null) result = caseInteractionNode(eventProducer);
                if (result == null) result = caseFlowNode(eventProducer);
                if (result == null) result = caseFlowElement(eventProducer);
                if (result == null) result = caseBaseElement(eventProducer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.EVENT_CONSUMER: {
                EventConsumer eventConsumer = (EventConsumer)theEObject;
                T result = caseEventConsumer(eventConsumer);
                if (result == null) result = caseTask(eventConsumer);
                if (result == null) result = caseActivity(eventConsumer);
                if (result == null) result = caseInteractionNode(eventConsumer);
                if (result == null) result = caseFlowNode(eventConsumer);
                if (result == null) result = caseFlowElement(eventConsumer);
                if (result == null) result = caseBaseElement(eventConsumer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.EVENT_AGENT: {
                EventAgent eventAgent = (EventAgent)theEObject;
                T result = caseEventAgent(eventAgent);
                if (result == null) result = caseTask(eventAgent);
                if (result == null) result = caseActivity(eventAgent);
                if (result == null) result = caseInteractionNode(eventAgent);
                if (result == null) result = caseFlowNode(eventAgent);
                if (result == null) result = caseFlowElement(eventAgent);
                if (result == null) result = caseBaseElement(eventAgent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.DATA_INPUT: {
                DataInput dataInput = (DataInput)theEObject;
                T result = caseDataInput(dataInput);
                if (result == null) result = caseBaseElement(dataInput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.DATA_OUTPUT: {
                DataOutput dataOutput = (DataOutput)theEObject;
                T result = caseDataOutput(dataOutput);
                if (result == null) result = caseBaseElement(dataOutput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.INPUT_SET: {
                InputSet inputSet = (InputSet)theEObject;
                T result = caseInputSet(inputSet);
                if (result == null) result = caseBaseElement(inputSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EpnPackage.OUTPUT_SET: {
                OutputSet outputSet = (OutputSet)theEObject;
                T result = caseOutputSet(outputSet);
                if (result == null) result = caseBaseElement(outputSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Interaction Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionNode(InteractionNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conversation Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conversation Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConversationLink(ConversationLink object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Event Agent</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Agent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventAgent(EventAgent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInput(DataInput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataOutput(DataOutput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputSet(InputSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputSet(OutputSet object) {
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

} //EpnSwitch
