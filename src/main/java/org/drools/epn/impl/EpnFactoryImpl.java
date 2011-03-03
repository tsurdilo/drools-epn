/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.impl;

import org.drools.epn.Bounds;
import org.drools.epn.CallableElement;
import org.drools.epn.Definitions;
import org.drools.epn.DocumentRoot;
import org.drools.epn.Documentation;
import org.drools.epn.EPNDiagram;
import org.drools.epn.EPNEdge;
import org.drools.epn.EPNFactory;
import org.drools.epn.EPNLabel;
import org.drools.epn.EPNPackage;
import org.drools.epn.EPNPlane;
import org.drools.epn.EPNShape;
import org.drools.epn.EventChannel;
import org.drools.epn.EventConsumer;
import org.drools.epn.EventProcessingAgent;
import org.drools.epn.EventProducer;
import org.drools.epn.ExtensionType;
import org.drools.epn.ImplementationMember1;
import org.drools.epn.Point;
import org.drools.epn.ProcessType;
import org.drools.epn.SequenceFlow;
import org.drools.epn.Task;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EPNFactoryImpl extends EFactoryImpl implements EPNFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EPNFactory init() {
        try {
            EPNFactory theEPNFactory = (EPNFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.jboss.org/drools/epn/MODEL"); 
            if (theEPNFactory != null) {
                return theEPNFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EPNFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EPNPackage.BOUNDS: return createBounds();
            case EPNPackage.CALLABLE_ELEMENT: return createCallableElement();
            case EPNPackage.DEFINITIONS: return createDefinitions();
            case EPNPackage.DOCUMENTATION: return createDocumentation();
            case EPNPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case EPNPackage.EPN_DIAGRAM: return createEPNDiagram();
            case EPNPackage.EPN_EDGE: return createEPNEdge();
            case EPNPackage.EPN_LABEL: return createEPNLabel();
            case EPNPackage.EPN_PLANE: return createEPNPlane();
            case EPNPackage.EPN_SHAPE: return createEPNShape();
            case EPNPackage.EVENT_CHANNEL: return createEventChannel();
            case EPNPackage.EVENT_CONSUMER: return createEventConsumer();
            case EPNPackage.EVENT_PROCESSING_AGENT: return createEventProcessingAgent();
            case EPNPackage.EVENT_PRODUCER: return createEventProducer();
            case EPNPackage.EXTENSION_TYPE: return createExtensionType();
            case EPNPackage.POINT: return createPoint();
            case EPNPackage.PROCESS: return createProcess();
            case EPNPackage.SEQUENCE_FLOW: return createSequenceFlow();
            case EPNPackage.TASK: return createTask();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case EPNPackage.IMPLEMENTATION_MEMBER1:
                return createImplementationMember1FromString(eDataType, initialValue);
            case EPNPackage.PROCESS_TYPE:
                return createProcessTypeFromString(eDataType, initialValue);
            case EPNPackage.IMPLEMENTATION:
                return createImplementationFromString(eDataType, initialValue);
            case EPNPackage.IMPLEMENTATION_MEMBER1_OBJECT:
                return createImplementationMember1ObjectFromString(eDataType, initialValue);
            case EPNPackage.PROCESS_TYPE_OBJECT:
                return createProcessTypeObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case EPNPackage.IMPLEMENTATION_MEMBER1:
                return convertImplementationMember1ToString(eDataType, instanceValue);
            case EPNPackage.PROCESS_TYPE:
                return convertProcessTypeToString(eDataType, instanceValue);
            case EPNPackage.IMPLEMENTATION:
                return convertImplementationToString(eDataType, instanceValue);
            case EPNPackage.IMPLEMENTATION_MEMBER1_OBJECT:
                return convertImplementationMember1ObjectToString(eDataType, instanceValue);
            case EPNPackage.PROCESS_TYPE_OBJECT:
                return convertProcessTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bounds createBounds() {
        BoundsImpl bounds = new BoundsImpl();
        return bounds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement createCallableElement() {
        CallableElementImpl callableElement = new CallableElementImpl();
        return callableElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Definitions createDefinitions() {
        DefinitionsImpl definitions = new DefinitionsImpl();
        return definitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation createDocumentation() {
        DocumentationImpl documentation = new DocumentationImpl();
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNDiagram createEPNDiagram() {
        EPNDiagramImpl epnDiagram = new EPNDiagramImpl();
        return epnDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNEdge createEPNEdge() {
        EPNEdgeImpl epnEdge = new EPNEdgeImpl();
        return epnEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNLabel createEPNLabel() {
        EPNLabelImpl epnLabel = new EPNLabelImpl();
        return epnLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNPlane createEPNPlane() {
        EPNPlaneImpl epnPlane = new EPNPlaneImpl();
        return epnPlane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNShape createEPNShape() {
        EPNShapeImpl epnShape = new EPNShapeImpl();
        return epnShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventChannel createEventChannel() {
        EventChannelImpl eventChannel = new EventChannelImpl();
        return eventChannel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventConsumer createEventConsumer() {
        EventConsumerImpl eventConsumer = new EventConsumerImpl();
        return eventConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProcessingAgent createEventProcessingAgent() {
        EventProcessingAgentImpl eventProcessingAgent = new EventProcessingAgentImpl();
        return eventProcessingAgent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProducer createEventProducer() {
        EventProducerImpl eventProducer = new EventProducerImpl();
        return eventProducer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionType createExtensionType() {
        ExtensionTypeImpl extensionType = new ExtensionTypeImpl();
        return extensionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point createPoint() {
        PointImpl point = new PointImpl();
        return point;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.drools.epn.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow createSequenceFlow() {
        SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
        return sequenceFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationMember1 createImplementationMember1FromString(EDataType eDataType, String initialValue) {
        ImplementationMember1 result = ImplementationMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertImplementationMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
        ProcessType result = ProcessType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createImplementationFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createImplementationMember1FromString(EPNPackage.Literals.IMPLEMENTATION_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertImplementationToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (EPNPackage.Literals.IMPLEMENTATION_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertImplementationMember1ToString(EPNPackage.Literals.IMPLEMENTATION_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationMember1 createImplementationMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createImplementationMember1FromString(EPNPackage.Literals.IMPLEMENTATION_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertImplementationMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertImplementationMember1ToString(EPNPackage.Literals.IMPLEMENTATION_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createProcessTypeFromString(EPNPackage.Literals.PROCESS_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertProcessTypeToString(EPNPackage.Literals.PROCESS_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNPackage getEPNPackage() {
        return (EPNPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EPNPackage getPackage() {
        return EPNPackage.eINSTANCE;
    }

} //EPNFactoryImpl
