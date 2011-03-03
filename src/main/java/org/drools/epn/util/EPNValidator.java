/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.util;

import java.util.Map;

import org.drools.epn.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.drools.epn.EPNPackage
 * @generated
 */
public class EPNValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EPNValidator INSTANCE = new EPNValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.drools.epn";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTypeValidator xmlTypeValidator;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNValidator() {
        super();
        xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return EPNPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case EPNPackage.ACTIVITY:
                return validateActivity((Activity)value, diagnostics, context);
            case EPNPackage.BASE_ELEMENT:
                return validateBaseElement((BaseElement)value, diagnostics, context);
            case EPNPackage.BOUNDS:
                return validateBounds((Bounds)value, diagnostics, context);
            case EPNPackage.CALLABLE_ELEMENT:
                return validateCallableElement((CallableElement)value, diagnostics, context);
            case EPNPackage.DEFINITIONS:
                return validateDefinitions((Definitions)value, diagnostics, context);
            case EPNPackage.DIAGRAM:
                return validateDiagram((Diagram)value, diagnostics, context);
            case EPNPackage.DIAGRAM_ELEMENT:
                return validateDiagramElement((DiagramElement)value, diagnostics, context);
            case EPNPackage.DOCUMENTATION:
                return validateDocumentation((Documentation)value, diagnostics, context);
            case EPNPackage.DOCUMENT_ROOT:
                return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
            case EPNPackage.EDGE:
                return validateEdge((Edge)value, diagnostics, context);
            case EPNPackage.EPN_DIAGRAM:
                return validateEPNDiagram((EPNDiagram)value, diagnostics, context);
            case EPNPackage.EPN_EDGE:
                return validateEPNEdge((EPNEdge)value, diagnostics, context);
            case EPNPackage.EPN_LABEL:
                return validateEPNLabel((EPNLabel)value, diagnostics, context);
            case EPNPackage.EPN_PLANE:
                return validateEPNPlane((EPNPlane)value, diagnostics, context);
            case EPNPackage.EPN_SHAPE:
                return validateEPNShape((EPNShape)value, diagnostics, context);
            case EPNPackage.EVENT_CHANNEL:
                return validateEventChannel((EventChannel)value, diagnostics, context);
            case EPNPackage.EVENT_CONSUMER:
                return validateEventConsumer((EventConsumer)value, diagnostics, context);
            case EPNPackage.EVENT_PROCESSING_AGENT:
                return validateEventProcessingAgent((EventProcessingAgent)value, diagnostics, context);
            case EPNPackage.EVENT_PRODUCER:
                return validateEventProducer((EventProducer)value, diagnostics, context);
            case EPNPackage.EXTENSION_TYPE:
                return validateExtensionType((ExtensionType)value, diagnostics, context);
            case EPNPackage.FLOW_ELEMENT:
                return validateFlowElement((FlowElement)value, diagnostics, context);
            case EPNPackage.FLOW_NODE:
                return validateFlowNode((FlowNode)value, diagnostics, context);
            case EPNPackage.LABEL:
                return validateLabel((Label)value, diagnostics, context);
            case EPNPackage.LABELED_EDGE:
                return validateLabeledEdge((LabeledEdge)value, diagnostics, context);
            case EPNPackage.LABELED_SHAPE:
                return validateLabeledShape((LabeledShape)value, diagnostics, context);
            case EPNPackage.NETWORK:
                return validateNetwork((Network)value, diagnostics, context);
            case EPNPackage.NODE:
                return validateNode((Node)value, diagnostics, context);
            case EPNPackage.PLANE:
                return validatePlane((Plane)value, diagnostics, context);
            case EPNPackage.POINT:
                return validatePoint((Point)value, diagnostics, context);
            case EPNPackage.ROOT_ELEMENT:
                return validateRootElement((RootElement)value, diagnostics, context);
            case EPNPackage.SEQUENCE_FLOW:
                return validateSequenceFlow((SequenceFlow)value, diagnostics, context);
            case EPNPackage.SHAPE:
                return validateShape((Shape)value, diagnostics, context);
            case EPNPackage.STYLE:
                return validateStyle((Style)value, diagnostics, context);
            case EPNPackage.TASK:
                return validateTask((Task)value, diagnostics, context);
            case EPNPackage.IMPLEMENTATION_MEMBER1:
                return validateImplementationMember1((ImplementationMember1)value, diagnostics, context);
            case EPNPackage.PROCESS_TYPE:
                return validateProcessType((ProcessType)value, diagnostics, context);
            case EPNPackage.IMPLEMENTATION:
                return validateImplementation(value, diagnostics, context);
            case EPNPackage.IMPLEMENTATION_MEMBER1_OBJECT:
                return validateImplementationMember1Object((ImplementationMember1)value, diagnostics, context);
            case EPNPackage.PROCESS_TYPE_OBJECT:
                return validateProcessTypeObject((ProcessType)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(activity, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBaseElement(BaseElement baseElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(baseElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBounds(Bounds bounds, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bounds, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCallableElement(CallableElement callableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(callableElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDefinitions(Definitions definitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(definitions, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(diagram, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDiagramElement(DiagramElement diagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(diagramElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(documentation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(edge, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEPNDiagram(EPNDiagram epnDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(epnDiagram, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEPNEdge(EPNEdge epnEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(epnEdge, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEPNLabel(EPNLabel epnLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(epnLabel, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEPNPlane(EPNPlane epnPlane, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(epnPlane, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEPNShape(EPNShape epnShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(epnShape, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEventChannel(EventChannel eventChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(eventChannel, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEventConsumer(EventConsumer eventConsumer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(eventConsumer, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEventProcessingAgent(EventProcessingAgent eventProcessingAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(eventProcessingAgent, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEventProducer(EventProducer eventProducer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(eventProducer, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExtensionType(ExtensionType extensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(extensionType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFlowElement(FlowElement flowElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(flowElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFlowNode(FlowNode flowNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(flowNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(label, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLabeledEdge(LabeledEdge labeledEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(labeledEdge, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLabeledShape(LabeledShape labeledShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(labeledShape, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(network, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(node, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePlane(Plane plane, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(plane, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePoint(Point point, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(point, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRootElement(RootElement rootElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rootElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSequenceFlow(SequenceFlow sequenceFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sequenceFlow, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(shape, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(style, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(task, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateImplementationMember1(ImplementationMember1 implementationMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProcessType(ProcessType processType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateImplementation(Object implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateImplementation_MemberTypes(implementation, diagnostics, context);
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Implementation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateImplementation_MemberTypes(Object implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (diagnostics != null) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if (XMLTypePackage.Literals.ANY_URI.isInstance(implementation)) {
                if (xmlTypeValidator.validateAnyURI((String)implementation, tempDiagnostics, context)) return true;
            }
            if (EPNPackage.Literals.IMPLEMENTATION_MEMBER1.isInstance(implementation)) {
                if (validateImplementationMember1((ImplementationMember1)implementation, tempDiagnostics, context)) return true;
            }
            for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
                diagnostics.add(diagnostic);
            }
        }
        else {
            if (XMLTypePackage.Literals.ANY_URI.isInstance(implementation)) {
                if (xmlTypeValidator.validateAnyURI((String)implementation, null, context)) return true;
            }
            if (EPNPackage.Literals.IMPLEMENTATION_MEMBER1.isInstance(implementation)) {
                if (validateImplementationMember1((ImplementationMember1)implementation, null, context)) return true;
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateImplementationMember1Object(ImplementationMember1 implementationMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProcessTypeObject(ProcessType processTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //EPNValidator
