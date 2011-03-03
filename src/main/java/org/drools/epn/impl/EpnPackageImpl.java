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
import org.drools.epn.EPNFactory;
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
import org.drools.epn.ImplementationMember1;
import org.drools.epn.Label;
import org.drools.epn.LabeledEdge;
import org.drools.epn.LabeledShape;
import org.drools.epn.Node;
import org.drools.epn.Plane;
import org.drools.epn.Point;
import org.drools.epn.ProcessType;
import org.drools.epn.RootElement;
import org.drools.epn.SequenceFlow;
import org.drools.epn.Shape;
import org.drools.epn.Style;
import org.drools.epn.Task;

import org.drools.epn.util.EPNValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EPNPackageImpl extends EPackageImpl implements EPNPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boundsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callableElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass definitionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass edgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass epnDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass epnEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass epnLabelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass epnPlaneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass epnShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventChannelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventConsumerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventProcessingAgentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventProducerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extensionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass labelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass labeledEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass labeledShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass planeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rootElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sequenceFlowEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass styleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum implementationMember1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType implementationEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType implementationMember1ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType processTypeObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.drools.epn.EPNPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EPNPackageImpl() {
        super(eNS_URI, EPNFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link EPNPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EPNPackage init() {
        if (isInited) return (EPNPackage)EPackage.Registry.INSTANCE.getEPackage(EPNPackage.eNS_URI);

        // Obtain or create and register package
        EPNPackageImpl theEPNPackage = (EPNPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EPNPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EPNPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theEPNPackage.createPackageContents();

        // Initialize created meta-data
        theEPNPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theEPNPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return EPNValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theEPNPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(EPNPackage.eNS_URI, theEPNPackage);
        return theEPNPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivity() {
        return activityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_Default() {
        return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseElement() {
        return baseElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseElement_Documentation() {
        return (EReference)baseElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElement_Id() {
        return (EAttribute)baseElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElement_AnyAttribute() {
        return (EAttribute)baseElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBounds() {
        return boundsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_Height() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_Width() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_X() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_Y() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallableElement() {
        return callableElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallableElement_Name() {
        return (EAttribute)callableElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefinitions() {
        return definitionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_RootElementGroup() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_RootElement() {
        return (EReference)definitionsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_EPNDiagram() {
        return (EReference)definitionsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_ExpressionLanguage() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_Id() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_Name() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_TargetNamespace() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_TypeLanguage() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_AnyAttribute() {
        return (EAttribute)definitionsEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagram() {
        return diagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Documentation() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Id() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Name() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Resolution() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramElement() {
        return diagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_Extension() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElement_Id() {
        return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElement_AnyAttribute() {
        return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentation() {
        return documentationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Mixed() {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Any() {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Id() {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_TextFormat() {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Activity() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BaseElement() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Bounds() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CallableElement() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Definitions() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Diagram() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DiagramElement() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Documentation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Edge() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EPNDiagram() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EPNEdge() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EPNLabel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EPNPlane() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EPNShape() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventChannel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FlowElement() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventConsumer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventProcessingAgent() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventProducer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FlowNode() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Label() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LabeledEdge() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LabeledShape() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Node() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Plane() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Point() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Process() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RootElement() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SequenceFlow() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Shape() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Task() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEdge() {
        return edgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEdge_Waypoint() {
        return (EReference)edgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEPNDiagram() {
        return epnDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEPNDiagram_EPNPlane() {
        return (EReference)epnDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEPNEdge() {
        return epnEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEPNEdge_EPNLabel() {
        return (EReference)epnEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEPNEdge_EpnElement() {
        return (EAttribute)epnEdgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEPNEdge_SourceElement() {
        return (EAttribute)epnEdgeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEPNEdge_TargetElement() {
        return (EAttribute)epnEdgeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEPNLabel() {
        return epnLabelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEPNPlane() {
        return epnPlaneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEPNPlane_EpnElement() {
        return (EAttribute)epnPlaneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEPNShape() {
        return epnShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEPNShape_EPNLabel() {
        return (EReference)epnShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEPNShape_EpnElement() {
        return (EAttribute)epnShapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventChannel() {
        return eventChannelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventChannel_Implementation() {
        return (EAttribute)eventChannelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventConsumer() {
        return eventConsumerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventConsumer_Implementation() {
        return (EAttribute)eventConsumerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventProcessingAgent() {
        return eventProcessingAgentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventProcessingAgent_Implementation() {
        return (EAttribute)eventProcessingAgentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventProducer() {
        return eventProducerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventProducer_Implementation() {
        return (EAttribute)eventProducerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtensionType() {
        return extensionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtensionType_Any() {
        return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowElement() {
        return flowElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowElement_CategoryValueRef() {
        return (EAttribute)flowElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowElement_Name() {
        return (EAttribute)flowElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowNode() {
        return flowNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowNode_Incoming() {
        return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowNode_Outgoing() {
        return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLabel() {
        return labelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLabel_Bounds() {
        return (EReference)labelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLabeledEdge() {
        return labeledEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLabeledShape() {
        return labeledShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNode() {
        return nodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPlane() {
        return planeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlane_DiagramElementGroup() {
        return (EAttribute)planeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPlane_DiagramElement() {
        return (EReference)planeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPoint() {
        return pointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPoint_X() {
        return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPoint_Y() {
        return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_FlowElementGroup() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_FlowElement() {
        return (EReference)processEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_DefinitionalCollaborationRef() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_IsExecutable() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRootElement() {
        return rootElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSequenceFlow() {
        return sequenceFlowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSequenceFlow_SourceRef() {
        return (EAttribute)sequenceFlowEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSequenceFlow_TargetRef() {
        return (EAttribute)sequenceFlowEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getShape() {
        return shapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getShape_Bounds() {
        return (EReference)shapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStyle() {
        return styleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_Id() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTask() {
        return taskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getImplementationMember1() {
        return implementationMember1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessType() {
        return processTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getImplementation() {
        return implementationEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getImplementationMember1Object() {
        return implementationMember1ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getProcessTypeObject() {
        return processTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNFactory getEPNFactory() {
        return (EPNFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        activityEClass = createEClass(ACTIVITY);
        createEAttribute(activityEClass, ACTIVITY__DEFAULT);

        baseElementEClass = createEClass(BASE_ELEMENT);
        createEReference(baseElementEClass, BASE_ELEMENT__DOCUMENTATION);
        createEAttribute(baseElementEClass, BASE_ELEMENT__ID);
        createEAttribute(baseElementEClass, BASE_ELEMENT__ANY_ATTRIBUTE);

        boundsEClass = createEClass(BOUNDS);
        createEAttribute(boundsEClass, BOUNDS__HEIGHT);
        createEAttribute(boundsEClass, BOUNDS__WIDTH);
        createEAttribute(boundsEClass, BOUNDS__X);
        createEAttribute(boundsEClass, BOUNDS__Y);

        callableElementEClass = createEClass(CALLABLE_ELEMENT);
        createEAttribute(callableElementEClass, CALLABLE_ELEMENT__NAME);

        definitionsEClass = createEClass(DEFINITIONS);
        createEAttribute(definitionsEClass, DEFINITIONS__ROOT_ELEMENT_GROUP);
        createEReference(definitionsEClass, DEFINITIONS__ROOT_ELEMENT);
        createEReference(definitionsEClass, DEFINITIONS__EPN_DIAGRAM);
        createEAttribute(definitionsEClass, DEFINITIONS__EXPRESSION_LANGUAGE);
        createEAttribute(definitionsEClass, DEFINITIONS__ID);
        createEAttribute(definitionsEClass, DEFINITIONS__NAME);
        createEAttribute(definitionsEClass, DEFINITIONS__TARGET_NAMESPACE);
        createEAttribute(definitionsEClass, DEFINITIONS__TYPE_LANGUAGE);
        createEAttribute(definitionsEClass, DEFINITIONS__ANY_ATTRIBUTE);

        diagramEClass = createEClass(DIAGRAM);
        createEAttribute(diagramEClass, DIAGRAM__DOCUMENTATION);
        createEAttribute(diagramEClass, DIAGRAM__ID);
        createEAttribute(diagramEClass, DIAGRAM__NAME);
        createEAttribute(diagramEClass, DIAGRAM__RESOLUTION);

        diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__EXTENSION);
        createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ID);
        createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ANY_ATTRIBUTE);

        documentationEClass = createEClass(DOCUMENTATION);
        createEAttribute(documentationEClass, DOCUMENTATION__MIXED);
        createEAttribute(documentationEClass, DOCUMENTATION__ANY);
        createEAttribute(documentationEClass, DOCUMENTATION__ID);
        createEAttribute(documentationEClass, DOCUMENTATION__TEXT_FORMAT);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVITY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BASE_ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BOUNDS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CALLABLE_ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DEFINITIONS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGRAM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGRAM_ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EDGE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EPN_DIAGRAM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EPN_EDGE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EPN_LABEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EPN_PLANE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EPN_SHAPE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_CHANNEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FLOW_ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_CONSUMER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_PROCESSING_AGENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_PRODUCER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FLOW_NODE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LABEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LABELED_EDGE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LABELED_SHAPE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__NODE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PLANE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__POINT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROCESS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT_ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SEQUENCE_FLOW);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SHAPE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TASK);

        edgeEClass = createEClass(EDGE);
        createEReference(edgeEClass, EDGE__WAYPOINT);

        epnDiagramEClass = createEClass(EPN_DIAGRAM);
        createEReference(epnDiagramEClass, EPN_DIAGRAM__EPN_PLANE);

        epnEdgeEClass = createEClass(EPN_EDGE);
        createEReference(epnEdgeEClass, EPN_EDGE__EPN_LABEL);
        createEAttribute(epnEdgeEClass, EPN_EDGE__EPN_ELEMENT);
        createEAttribute(epnEdgeEClass, EPN_EDGE__SOURCE_ELEMENT);
        createEAttribute(epnEdgeEClass, EPN_EDGE__TARGET_ELEMENT);

        epnLabelEClass = createEClass(EPN_LABEL);

        epnPlaneEClass = createEClass(EPN_PLANE);
        createEAttribute(epnPlaneEClass, EPN_PLANE__EPN_ELEMENT);

        epnShapeEClass = createEClass(EPN_SHAPE);
        createEReference(epnShapeEClass, EPN_SHAPE__EPN_LABEL);
        createEAttribute(epnShapeEClass, EPN_SHAPE__EPN_ELEMENT);

        eventChannelEClass = createEClass(EVENT_CHANNEL);
        createEAttribute(eventChannelEClass, EVENT_CHANNEL__IMPLEMENTATION);

        eventConsumerEClass = createEClass(EVENT_CONSUMER);
        createEAttribute(eventConsumerEClass, EVENT_CONSUMER__IMPLEMENTATION);

        eventProcessingAgentEClass = createEClass(EVENT_PROCESSING_AGENT);
        createEAttribute(eventProcessingAgentEClass, EVENT_PROCESSING_AGENT__IMPLEMENTATION);

        eventProducerEClass = createEClass(EVENT_PRODUCER);
        createEAttribute(eventProducerEClass, EVENT_PRODUCER__IMPLEMENTATION);

        extensionTypeEClass = createEClass(EXTENSION_TYPE);
        createEAttribute(extensionTypeEClass, EXTENSION_TYPE__ANY);

        flowElementEClass = createEClass(FLOW_ELEMENT);
        createEAttribute(flowElementEClass, FLOW_ELEMENT__CATEGORY_VALUE_REF);
        createEAttribute(flowElementEClass, FLOW_ELEMENT__NAME);

        flowNodeEClass = createEClass(FLOW_NODE);
        createEAttribute(flowNodeEClass, FLOW_NODE__INCOMING);
        createEAttribute(flowNodeEClass, FLOW_NODE__OUTGOING);

        labelEClass = createEClass(LABEL);
        createEReference(labelEClass, LABEL__BOUNDS);

        labeledEdgeEClass = createEClass(LABELED_EDGE);

        labeledShapeEClass = createEClass(LABELED_SHAPE);

        nodeEClass = createEClass(NODE);

        planeEClass = createEClass(PLANE);
        createEAttribute(planeEClass, PLANE__DIAGRAM_ELEMENT_GROUP);
        createEReference(planeEClass, PLANE__DIAGRAM_ELEMENT);

        pointEClass = createEClass(POINT);
        createEAttribute(pointEClass, POINT__X);
        createEAttribute(pointEClass, POINT__Y);

        processEClass = createEClass(PROCESS);
        createEAttribute(processEClass, PROCESS__FLOW_ELEMENT_GROUP);
        createEReference(processEClass, PROCESS__FLOW_ELEMENT);
        createEAttribute(processEClass, PROCESS__DEFINITIONAL_COLLABORATION_REF);
        createEAttribute(processEClass, PROCESS__IS_EXECUTABLE);

        rootElementEClass = createEClass(ROOT_ELEMENT);

        sequenceFlowEClass = createEClass(SEQUENCE_FLOW);
        createEAttribute(sequenceFlowEClass, SEQUENCE_FLOW__SOURCE_REF);
        createEAttribute(sequenceFlowEClass, SEQUENCE_FLOW__TARGET_REF);

        shapeEClass = createEClass(SHAPE);
        createEReference(shapeEClass, SHAPE__BOUNDS);

        styleEClass = createEClass(STYLE);
        createEAttribute(styleEClass, STYLE__ID);

        taskEClass = createEClass(TASK);

        // Create enums
        implementationMember1EEnum = createEEnum(IMPLEMENTATION_MEMBER1);
        processTypeEEnum = createEEnum(PROCESS_TYPE);

        // Create data types
        implementationEDataType = createEDataType(IMPLEMENTATION);
        implementationMember1ObjectEDataType = createEDataType(IMPLEMENTATION_MEMBER1_OBJECT);
        processTypeObjectEDataType = createEDataType(PROCESS_TYPE_OBJECT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        activityEClass.getESuperTypes().add(this.getFlowNode());
        callableElementEClass.getESuperTypes().add(this.getRootElement());
        edgeEClass.getESuperTypes().add(this.getDiagramElement());
        epnDiagramEClass.getESuperTypes().add(this.getDiagram());
        epnEdgeEClass.getESuperTypes().add(this.getLabeledEdge());
        epnLabelEClass.getESuperTypes().add(this.getLabel());
        epnPlaneEClass.getESuperTypes().add(this.getPlane());
        epnShapeEClass.getESuperTypes().add(this.getLabeledShape());
        eventChannelEClass.getESuperTypes().add(this.getTask());
        eventConsumerEClass.getESuperTypes().add(this.getTask());
        eventProcessingAgentEClass.getESuperTypes().add(this.getTask());
        eventProducerEClass.getESuperTypes().add(this.getTask());
        flowElementEClass.getESuperTypes().add(this.getBaseElement());
        flowNodeEClass.getESuperTypes().add(this.getFlowElement());
        labelEClass.getESuperTypes().add(this.getNode());
        labeledEdgeEClass.getESuperTypes().add(this.getEdge());
        labeledShapeEClass.getESuperTypes().add(this.getShape());
        nodeEClass.getESuperTypes().add(this.getDiagramElement());
        planeEClass.getESuperTypes().add(this.getNode());
        processEClass.getESuperTypes().add(this.getCallableElement());
        rootElementEClass.getESuperTypes().add(this.getBaseElement());
        sequenceFlowEClass.getESuperTypes().add(this.getFlowElement());
        shapeEClass.getESuperTypes().add(this.getNode());
        taskEClass.getESuperTypes().add(this.getActivity());

        // Initialize classes and features; add operations and parameters
        initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActivity_Default(), theXMLTypePackage.getIDREF(), "default", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseElementEClass, BaseElement.class, "BaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseElement_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBaseElement_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBaseElement_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBounds_Height(), theXMLTypePackage.getDouble(), "height", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBounds_Width(), theXMLTypePackage.getDouble(), "width", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBounds_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBounds_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(callableElementEClass, CallableElement.class, "CallableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCallableElement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CallableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDefinitions_RootElementGroup(), ecorePackage.getEFeatureMapEntry(), "rootElementGroup", null, 0, -1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDefinitions_RootElement(), this.getRootElement(), null, "rootElement", null, 0, -1, Definitions.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDefinitions_EPNDiagram(), this.getEPNDiagram(), null, "ePNDiagram", null, 0, -1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefinitions_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", "http://www.w3.org/1999/XPath", 0, 1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefinitions_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefinitions_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefinitions_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 1, 1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefinitions_TypeLanguage(), theXMLTypePackage.getAnyURI(), "typeLanguage", "http://www.w3.org/2001/XMLSchema", 0, 1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefinitions_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagram_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagram_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagram_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagram_Resolution(), theXMLTypePackage.getDouble(), "resolution", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagramElement_Extension(), this.getExtensionType(), null, "extension", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElement_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElement_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentation_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentation_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentation_TextFormat(), theXMLTypePackage.getString(), "textFormat", "text/plain", 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Activity(), this.getActivity(), null, "activity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BaseElement(), this.getBaseElement(), null, "baseElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Bounds(), this.getBounds(), null, "bounds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_CallableElement(), this.getCallableElement(), null, "callableElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Definitions(), this.getDefinitions(), null, "definitions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Diagram(), this.getDiagram(), null, "diagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_DiagramElement(), this.getDiagramElement(), null, "diagramElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Edge(), this.getEdge(), null, "edge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EPNDiagram(), this.getEPNDiagram(), null, "ePNDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EPNEdge(), this.getEPNEdge(), null, "ePNEdge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EPNLabel(), this.getEPNLabel(), null, "ePNLabel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EPNPlane(), this.getEPNPlane(), null, "ePNPlane", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EPNShape(), this.getEPNShape(), null, "ePNShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventChannel(), this.getEventChannel(), null, "eventChannel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_FlowElement(), this.getFlowElement(), null, "flowElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventConsumer(), this.getEventConsumer(), null, "eventConsumer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventProcessingAgent(), this.getEventProcessingAgent(), null, "eventProcessingAgent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventProducer(), this.getEventProducer(), null, "eventProducer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_FlowNode(), this.getFlowNode(), null, "flowNode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Label(), this.getLabel(), null, "label", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_LabeledEdge(), this.getLabeledEdge(), null, "labeledEdge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_LabeledShape(), this.getLabeledShape(), null, "labeledShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Node(), this.getNode(), null, "node", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Plane(), this.getPlane(), null, "plane", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Point(), this.getPoint(), null, "point", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Process(), this.getProcess(), null, "process", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_RootElement(), this.getRootElement(), null, "rootElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_SequenceFlow(), this.getSequenceFlow(), null, "sequenceFlow", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Shape(), this.getShape(), null, "shape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Task(), this.getTask(), null, "task", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEdge_Waypoint(), this.getPoint(), null, "waypoint", null, 2, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(epnDiagramEClass, EPNDiagram.class, "EPNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEPNDiagram_EPNPlane(), this.getEPNPlane(), null, "ePNPlane", null, 1, 1, EPNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(epnEdgeEClass, EPNEdge.class, "EPNEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEPNEdge_EPNLabel(), this.getEPNLabel(), null, "ePNLabel", null, 0, 1, EPNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEPNEdge_EpnElement(), theXMLTypePackage.getQName(), "epnElement", null, 0, 1, EPNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEPNEdge_SourceElement(), theXMLTypePackage.getQName(), "sourceElement", null, 0, 1, EPNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEPNEdge_TargetElement(), theXMLTypePackage.getQName(), "targetElement", null, 0, 1, EPNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(epnLabelEClass, EPNLabel.class, "EPNLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(epnPlaneEClass, EPNPlane.class, "EPNPlane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEPNPlane_EpnElement(), theXMLTypePackage.getQName(), "epnElement", null, 0, 1, EPNPlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(epnShapeEClass, EPNShape.class, "EPNShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEPNShape_EPNLabel(), this.getEPNLabel(), null, "ePNLabel", null, 0, 1, EPNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEPNShape_EpnElement(), theXMLTypePackage.getQName(), "epnElement", null, 0, 1, EPNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventChannelEClass, EventChannel.class, "EventChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventChannel_Implementation(), this.getImplementation(), "implementation", "##unspecified", 0, 1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventConsumerEClass, EventConsumer.class, "EventConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventConsumer_Implementation(), this.getImplementation(), "implementation", "##unspecified", 0, 1, EventConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventProcessingAgentEClass, EventProcessingAgent.class, "EventProcessingAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventProcessingAgent_Implementation(), this.getImplementation(), "implementation", "##unspecified", 0, 1, EventProcessingAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventProducerEClass, EventProducer.class, "EventProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventProducer_Implementation(), this.getImplementation(), "implementation", "##unspecified", 0, 1, EventProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extensionTypeEClass, ExtensionType.class, "ExtensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExtensionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFlowElement_CategoryValueRef(), theXMLTypePackage.getQName(), "categoryValueRef", null, 0, -1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFlowElement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFlowNode_Incoming(), theXMLTypePackage.getQName(), "incoming", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFlowNode_Outgoing(), theXMLTypePackage.getQName(), "outgoing", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLabel_Bounds(), this.getBounds(), null, "bounds", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(labeledEdgeEClass, LabeledEdge.class, "LabeledEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(labeledShapeEClass, LabeledShape.class, "LabeledShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(planeEClass, Plane.class, "Plane", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPlane_DiagramElementGroup(), ecorePackage.getEFeatureMapEntry(), "diagramElementGroup", null, 0, -1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlane_DiagramElement(), this.getDiagramElement(), null, "diagramElement", null, 0, -1, Plane.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPoint_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPoint_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processEClass, org.drools.epn.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcess_FlowElementGroup(), ecorePackage.getEFeatureMapEntry(), "flowElementGroup", null, 0, -1, org.drools.epn.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_FlowElement(), this.getFlowElement(), null, "flowElement", null, 0, -1, org.drools.epn.Process.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_DefinitionalCollaborationRef(), theXMLTypePackage.getQName(), "definitionalCollaborationRef", null, 0, 1, org.drools.epn.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_IsExecutable(), theXMLTypePackage.getBoolean(), "isExecutable", "false", 0, 1, org.drools.epn.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rootElementEClass, RootElement.class, "RootElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSequenceFlow_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSequenceFlow_TargetRef(), theXMLTypePackage.getIDREF(), "targetRef", null, 1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShape_Bounds(), this.getBounds(), null, "bounds", null, 1, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(styleEClass, Style.class, "Style", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStyle_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(implementationMember1EEnum, ImplementationMember1.class, "ImplementationMember1");
        addEEnumLiteral(implementationMember1EEnum, ImplementationMember1.UNSPECIFIED);
        addEEnumLiteral(implementationMember1EEnum, ImplementationMember1.WEB_SERVICE);

        initEEnum(processTypeEEnum, ProcessType.class, "ProcessType");
        addEEnumLiteral(processTypeEEnum, ProcessType.NONE);
        addEEnumLiteral(processTypeEEnum, ProcessType.PUBLIC);
        addEEnumLiteral(processTypeEEnum, ProcessType.PRIVATE);

        // Initialize data types
        initEDataType(implementationEDataType, Object.class, "Implementation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(implementationMember1ObjectEDataType, ImplementationMember1.class, "ImplementationMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(processTypeObjectEDataType, ProcessType.class, "ProcessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
        addAnnotation
          (activityEClass, 
           source, 
           new String[] {
             "name", "Activity",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getActivity_Default(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "default"
           });		
        addAnnotation
          (baseElementEClass, 
           source, 
           new String[] {
             "name", "BaseElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBaseElement_Documentation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "documentation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBaseElement_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (getBaseElement_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":2",
             "processing", "lax"
           });		
        addAnnotation
          (boundsEClass, 
           source, 
           new String[] {
             "name", "Bounds",
             "kind", "empty"
           });		
        addAnnotation
          (getBounds_Height(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "height"
           });		
        addAnnotation
          (getBounds_Width(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "width"
           });		
        addAnnotation
          (getBounds_X(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "x"
           });		
        addAnnotation
          (getBounds_Y(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "y"
           });		
        addAnnotation
          (callableElementEClass, 
           source, 
           new String[] {
             "name", "CallableElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCallableElement_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (definitionsEClass, 
           source, 
           new String[] {
             "name", "Definitions",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDefinitions_RootElementGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "rootElement:group",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDefinitions_RootElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rootElement",
             "namespace", "##targetNamespace",
             "group", "rootElement:group"
           });		
        addAnnotation
          (getDefinitions_EPNDiagram(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNDiagram",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDefinitions_ExpressionLanguage(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "expressionLanguage"
           });		
        addAnnotation
          (getDefinitions_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (getDefinitions_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getDefinitions_TargetNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetNamespace"
           });		
        addAnnotation
          (getDefinitions_TypeLanguage(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "typeLanguage"
           });		
        addAnnotation
          (getDefinitions_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":8",
             "processing", "lax"
           });		
        addAnnotation
          (diagramEClass, 
           source, 
           new String[] {
             "name", "Diagram",
             "kind", "empty"
           });		
        addAnnotation
          (getDiagram_Documentation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "documentation"
           });		
        addAnnotation
          (getDiagram_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (getDiagram_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getDiagram_Resolution(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "resolution"
           });		
        addAnnotation
          (diagramElementEClass, 
           source, 
           new String[] {
             "name", "DiagramElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDiagramElement_Extension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extension",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDiagramElement_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (getDiagramElement_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":2",
             "processing", "lax"
           });		
        addAnnotation
          (documentationEClass, 
           source, 
           new String[] {
             "name", "Documentation",
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentation_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });		
        addAnnotation
          (getDocumentation_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##any",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getDocumentation_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (getDocumentation_TextFormat(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "textFormat"
           });		
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] {
             "name", "",
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });		
        addAnnotation
          (getDocumentRoot_XMLNSPrefixMap(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xmlns:prefix"
           });		
        addAnnotation
          (getDocumentRoot_XSISchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xsi:schemaLocation"
           });		
        addAnnotation
          (getDocumentRoot_Activity(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "activity",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_BaseElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "baseElement",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Bounds(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Bounds",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_CallableElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "callableElement",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Definitions(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "definitions",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Diagram(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Diagram",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_DiagramElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DiagramElement",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Documentation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "documentation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Edge(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Edge",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_EPNDiagram(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNDiagram",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_EPNEdge(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNEdge",
             "namespace", "##targetNamespace",
             "affiliation", "DiagramElement"
           });		
        addAnnotation
          (getDocumentRoot_EPNLabel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNLabel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_EPNPlane(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNPlane",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_EPNShape(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNShape",
             "namespace", "##targetNamespace",
             "affiliation", "DiagramElement"
           });		
        addAnnotation
          (getDocumentRoot_EventChannel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eventChannel",
             "namespace", "##targetNamespace",
             "affiliation", "flowElement"
           });		
        addAnnotation
          (getDocumentRoot_FlowElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flowElement",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_EventConsumer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eventConsumer",
             "namespace", "##targetNamespace",
             "affiliation", "flowElement"
           });		
        addAnnotation
          (getDocumentRoot_EventProcessingAgent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eventProcessingAgent",
             "namespace", "##targetNamespace",
             "affiliation", "flowElement"
           });		
        addAnnotation
          (getDocumentRoot_EventProducer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eventProducer",
             "namespace", "##targetNamespace",
             "affiliation", "flowElement"
           });		
        addAnnotation
          (getDocumentRoot_FlowNode(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flowNode",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Label",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_LabeledEdge(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LabeledEdge",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_LabeledShape(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "LabeledShape",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Node(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Node",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Plane(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Plane",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Point(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Point",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Process(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "process",
             "namespace", "##targetNamespace",
             "affiliation", "rootElement"
           });		
        addAnnotation
          (getDocumentRoot_RootElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rootElement",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_SequenceFlow(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequenceFlow",
             "namespace", "##targetNamespace",
             "affiliation", "flowElement"
           });		
        addAnnotation
          (getDocumentRoot_Shape(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Shape",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Task(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "task",
             "namespace", "##targetNamespace",
             "affiliation", "flowElement"
           });		
        addAnnotation
          (edgeEClass, 
           source, 
           new String[] {
             "name", "Edge",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEdge_Waypoint(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "waypoint",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (epnDiagramEClass, 
           source, 
           new String[] {
             "name", "EPNDiagram",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEPNDiagram_EPNPlane(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNPlane",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (epnEdgeEClass, 
           source, 
           new String[] {
             "name", "EPNEdge",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEPNEdge_EPNLabel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNLabel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEPNEdge_EpnElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "epnElement"
           });		
        addAnnotation
          (getEPNEdge_SourceElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "sourceElement"
           });		
        addAnnotation
          (getEPNEdge_TargetElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetElement"
           });		
        addAnnotation
          (epnLabelEClass, 
           source, 
           new String[] {
             "name", "EPNLabel",
             "kind", "elementOnly"
           });		
        addAnnotation
          (epnPlaneEClass, 
           source, 
           new String[] {
             "name", "EPNPlane",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEPNPlane_EpnElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "epnElement"
           });		
        addAnnotation
          (epnShapeEClass, 
           source, 
           new String[] {
             "name", "EPNShape",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEPNShape_EPNLabel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "EPNLabel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEPNShape_EpnElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "epnElement"
           });		
        addAnnotation
          (eventChannelEClass, 
           source, 
           new String[] {
             "name", "EventChannel",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEventChannel_Implementation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "implementation"
           });		
        addAnnotation
          (eventConsumerEClass, 
           source, 
           new String[] {
             "name", "EventConsumer",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEventConsumer_Implementation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "implementation"
           });		
        addAnnotation
          (eventProcessingAgentEClass, 
           source, 
           new String[] {
             "name", "EventProcessingAgent",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEventProcessingAgent_Implementation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "implementation"
           });		
        addAnnotation
          (eventProducerEClass, 
           source, 
           new String[] {
             "name", "EventProducer",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEventProducer_Implementation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "implementation"
           });		
        addAnnotation
          (extensionTypeEClass, 
           source, 
           new String[] {
             "name", "extension_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getExtensionType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":0",
             "processing", "strict"
           });		
        addAnnotation
          (flowElementEClass, 
           source, 
           new String[] {
             "name", "FlowElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFlowElement_CategoryValueRef(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "categoryValueRef",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFlowElement_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (flowNodeEClass, 
           source, 
           new String[] {
             "name", "FlowNode",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFlowNode_Incoming(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "incoming",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFlowNode_Outgoing(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outgoing",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (implementationEDataType, 
           source, 
           new String[] {
             "name", "Implementation",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI Implementation_._member_._1"
           });		
        addAnnotation
          (implementationMember1EEnum, 
           source, 
           new String[] {
             "name", "Implementation_._member_._1"
           });		
        addAnnotation
          (implementationMember1ObjectEDataType, 
           source, 
           new String[] {
             "name", "Implementation_._member_._1:Object",
             "baseType", "Implementation_._member_._1"
           });		
        addAnnotation
          (labelEClass, 
           source, 
           new String[] {
             "name", "Label",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getLabel_Bounds(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Bounds",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (labeledEdgeEClass, 
           source, 
           new String[] {
             "name", "LabeledEdge",
             "kind", "elementOnly"
           });		
        addAnnotation
          (labeledShapeEClass, 
           source, 
           new String[] {
             "name", "LabeledShape",
             "kind", "elementOnly"
           });		
        addAnnotation
          (nodeEClass, 
           source, 
           new String[] {
             "name", "Node",
             "kind", "elementOnly"
           });		
        addAnnotation
          (planeEClass, 
           source, 
           new String[] {
             "name", "Plane",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPlane_DiagramElementGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "DiagramElement:group",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getPlane_DiagramElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "DiagramElement",
             "namespace", "##targetNamespace",
             "group", "DiagramElement:group"
           });		
        addAnnotation
          (pointEClass, 
           source, 
           new String[] {
             "name", "Point",
             "kind", "empty"
           });		
        addAnnotation
          (getPoint_X(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "x"
           });		
        addAnnotation
          (getPoint_Y(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "y"
           });		
        addAnnotation
          (processEClass, 
           source, 
           new String[] {
             "name", "Process",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getProcess_FlowElementGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "flowElement:group",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProcess_FlowElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flowElement",
             "namespace", "##targetNamespace",
             "group", "flowElement:group"
           });		
        addAnnotation
          (getProcess_DefinitionalCollaborationRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "definitionalCollaborationRef"
           });		
        addAnnotation
          (getProcess_IsExecutable(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "isExecutable"
           });		
        addAnnotation
          (processTypeEEnum, 
           source, 
           new String[] {
             "name", "ProcessType"
           });		
        addAnnotation
          (processTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "ProcessType:Object",
             "baseType", "ProcessType"
           });		
        addAnnotation
          (rootElementEClass, 
           source, 
           new String[] {
             "name", "RootElement",
             "kind", "elementOnly"
           });		
        addAnnotation
          (sequenceFlowEClass, 
           source, 
           new String[] {
             "name", "SequenceFlow",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSequenceFlow_SourceRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "sourceRef"
           });		
        addAnnotation
          (getSequenceFlow_TargetRef(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetRef"
           });		
        addAnnotation
          (shapeEClass, 
           source, 
           new String[] {
             "name", "Shape",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getShape_Bounds(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Bounds",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (styleEClass, 
           source, 
           new String[] {
             "name", "Style",
             "kind", "empty"
           });		
        addAnnotation
          (getStyle_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (taskEClass, 
           source, 
           new String[] {
             "name", "Task",
             "kind", "elementOnly"
           });
    }

} //EPNPackageImpl
