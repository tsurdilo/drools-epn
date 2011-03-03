/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.drools.epn.EPNFactory
 * @model kind="package"
 * @generated
 */
public interface EPNPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "epn";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.jboss.org/drools/epn/MODEL";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "epn";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EPNPackage eINSTANCE = org.drools.epn.impl.EPNPackageImpl.init();

    /**
     * The meta object id for the '{@link org.drools.epn.impl.BaseElementImpl <em>Base Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.BaseElementImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getBaseElement()
     * @generated
     */
    int BASE_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__DOCUMENTATION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ID = 1;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ANY_ATTRIBUTE = 2;

    /**
     * The number of structural features of the '<em>Base Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.FlowElementImpl <em>Flow Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.FlowElementImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getFlowElement()
     * @generated
     */
    int FLOW_ELEMENT = 20;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__CATEGORY_VALUE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Flow Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.FlowNodeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getFlowNode()
     * @generated
     */
    int FLOW_NODE = 21;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Flow Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.ActivityImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getActivity()
     * @generated
     */
    int ACTIVITY = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DEFAULT = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.BoundsImpl <em>Bounds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.BoundsImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getBounds()
     * @generated
     */
    int BOUNDS = 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__HEIGHT = 0;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__WIDTH = 1;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__X = 2;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__Y = 3;

    /**
     * The number of structural features of the '<em>Bounds</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.RootElementImpl <em>Root Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.RootElementImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getRootElement()
     * @generated
     */
    int ROOT_ELEMENT = 29;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Root Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.CallableElementImpl <em>Callable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.CallableElementImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getCallableElement()
     * @generated
     */
    int CALLABLE_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Callable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DefinitionsImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getDefinitions()
     * @generated
     */
    int DEFINITIONS = 4;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ROOT_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>EPN Diagram</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__EPN_DIAGRAM = 1;

    /**
     * The feature id for the '<em><b>Expression Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__EXPRESSION_LANGUAGE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ID = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__NAME = 4;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__TARGET_NAMESPACE = 5;

    /**
     * The feature id for the '<em><b>Type Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__TYPE_LANGUAGE = 6;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ANY_ATTRIBUTE = 7;

    /**
     * The number of structural features of the '<em>Definitions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DiagramImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getDiagram()
     * @generated
     */
    int DIAGRAM = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__DOCUMENTATION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__NAME = 2;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__RESOLUTION = 3;

    /**
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DiagramElementImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getDiagramElement()
     * @generated
     */
    int DIAGRAM_ELEMENT = 6;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__EXTENSION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__ID = 1;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__ANY_ATTRIBUTE = 2;

    /**
     * The number of structural features of the '<em>Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DocumentationImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 7;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__MIXED = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ANY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ID = 2;

    /**
     * The feature id for the '<em><b>Text Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__TEXT_FORMAT = 3;

    /**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.DocumentRootImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 8;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ACTIVITY = 3;

    /**
     * The feature id for the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASE_ELEMENT = 4;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOUNDS = 5;

    /**
     * The feature id for the '<em><b>Callable Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALLABLE_ELEMENT = 6;

    /**
     * The feature id for the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEFINITIONS = 7;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DIAGRAM = 8;

    /**
     * The feature id for the '<em><b>Diagram Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DIAGRAM_ELEMENT = 9;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENTATION = 10;

    /**
     * The feature id for the '<em><b>Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EDGE = 11;

    /**
     * The feature id for the '<em><b>EPN Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EPN_DIAGRAM = 12;

    /**
     * The feature id for the '<em><b>EPN Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EPN_EDGE = 13;

    /**
     * The feature id for the '<em><b>EPN Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EPN_LABEL = 14;

    /**
     * The feature id for the '<em><b>EPN Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EPN_PLANE = 15;

    /**
     * The feature id for the '<em><b>EPN Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EPN_SHAPE = 16;

    /**
     * The feature id for the '<em><b>Event Channel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_CHANNEL = 17;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_ELEMENT = 18;

    /**
     * The feature id for the '<em><b>Event Consumer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_CONSUMER = 19;

    /**
     * The feature id for the '<em><b>Event Processing Agent</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_PROCESSING_AGENT = 20;

    /**
     * The feature id for the '<em><b>Event Producer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_PRODUCER = 21;

    /**
     * The feature id for the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_NODE = 22;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LABEL = 23;

    /**
     * The feature id for the '<em><b>Labeled Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LABELED_EDGE = 24;

    /**
     * The feature id for the '<em><b>Labeled Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LABELED_SHAPE = 25;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NODE = 26;

    /**
     * The feature id for the '<em><b>Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLANE = 27;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__POINT = 28;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS = 29;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ROOT_ELEMENT = 30;

    /**
     * The feature id for the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEQUENCE_FLOW = 31;

    /**
     * The feature id for the '<em><b>Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SHAPE = 32;

    /**
     * The feature id for the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASK = 33;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 34;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EdgeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEdge()
     * @generated
     */
    int EDGE = 9;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__EXTENSION = DIAGRAM_ELEMENT__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__ID = DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__ANY_ATTRIBUTE = DIAGRAM_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__WAYPOINT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EPNDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EPNDiagramImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEPNDiagram()
     * @generated
     */
    int EPN_DIAGRAM = 10;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_DIAGRAM__DOCUMENTATION = DIAGRAM__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_DIAGRAM__ID = DIAGRAM__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_DIAGRAM__NAME = DIAGRAM__NAME;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_DIAGRAM__RESOLUTION = DIAGRAM__RESOLUTION;

    /**
     * The feature id for the '<em><b>EPN Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_DIAGRAM__EPN_PLANE = DIAGRAM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_DIAGRAM_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.LabeledEdgeImpl <em>Labeled Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.LabeledEdgeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getLabeledEdge()
     * @generated
     */
    int LABELED_EDGE = 23;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_EDGE__EXTENSION = EDGE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_EDGE__ID = EDGE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_EDGE__ANY_ATTRIBUTE = EDGE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_EDGE__WAYPOINT = EDGE__WAYPOINT;

    /**
     * The number of structural features of the '<em>Labeled Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EPNEdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EPNEdgeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEPNEdge()
     * @generated
     */
    int EPN_EDGE = 11;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__EXTENSION = LABELED_EDGE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__ID = LABELED_EDGE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__ANY_ATTRIBUTE = LABELED_EDGE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__WAYPOINT = LABELED_EDGE__WAYPOINT;

    /**
     * The feature id for the '<em><b>EPN Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__EPN_LABEL = LABELED_EDGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Epn Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__EPN_ELEMENT = LABELED_EDGE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__SOURCE_ELEMENT = LABELED_EDGE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE__TARGET_ELEMENT = LABELED_EDGE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_EDGE_FEATURE_COUNT = LABELED_EDGE_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.NodeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getNode()
     * @generated
     */
    int NODE = 25;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__EXTENSION = DIAGRAM_ELEMENT__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__ID = DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__ANY_ATTRIBUTE = DIAGRAM_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.LabelImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getLabel()
     * @generated
     */
    int LABEL = 22;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__EXTENSION = NODE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__ID = NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__ANY_ATTRIBUTE = NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__BOUNDS = NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EPNLabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EPNLabelImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEPNLabel()
     * @generated
     */
    int EPN_LABEL = 12;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_LABEL__EXTENSION = LABEL__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_LABEL__ID = LABEL__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_LABEL__ANY_ATTRIBUTE = LABEL__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_LABEL__BOUNDS = LABEL__BOUNDS;

    /**
     * The number of structural features of the '<em>Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.PlaneImpl <em>Plane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.PlaneImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getPlane()
     * @generated
     */
    int PLANE = 26;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__EXTENSION = NODE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__ID = NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__ANY_ATTRIBUTE = NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__DIAGRAM_ELEMENT = NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Plane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EPNPlaneImpl <em>Plane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EPNPlaneImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEPNPlane()
     * @generated
     */
    int EPN_PLANE = 13;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_PLANE__EXTENSION = PLANE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_PLANE__ID = PLANE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_PLANE__ANY_ATTRIBUTE = PLANE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_PLANE__DIAGRAM_ELEMENT = PLANE__DIAGRAM_ELEMENT;

    /**
     * The feature id for the '<em><b>Epn Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_PLANE__EPN_ELEMENT = PLANE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Plane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_PLANE_FEATURE_COUNT = PLANE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.ShapeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getShape()
     * @generated
     */
    int SHAPE = 31;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__EXTENSION = NODE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__ID = NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__ANY_ATTRIBUTE = NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__BOUNDS = NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.LabeledShapeImpl <em>Labeled Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.LabeledShapeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getLabeledShape()
     * @generated
     */
    int LABELED_SHAPE = 24;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_SHAPE__EXTENSION = SHAPE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_SHAPE__ID = SHAPE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_SHAPE__ANY_ATTRIBUTE = SHAPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_SHAPE__BOUNDS = SHAPE__BOUNDS;

    /**
     * The number of structural features of the '<em>Labeled Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EPNShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EPNShapeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEPNShape()
     * @generated
     */
    int EPN_SHAPE = 14;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE__EXTENSION = LABELED_SHAPE__EXTENSION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE__ID = LABELED_SHAPE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE__ANY_ATTRIBUTE = LABELED_SHAPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE__BOUNDS = LABELED_SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>EPN Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE__EPN_LABEL = LABELED_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Epn Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE__EPN_ELEMENT = LABELED_SHAPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPN_SHAPE_FEATURE_COUNT = LABELED_SHAPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.TaskImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getTask()
     * @generated
     */
    int TASK = 33;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__INCOMING = ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__OUTGOING = ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DEFAULT = ACTIVITY__DEFAULT;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventChannelImpl <em>Event Channel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventChannelImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEventChannel()
     * @generated
     */
    int EVENT_CHANNEL = 15;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Channel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CHANNEL_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventConsumerImpl <em>Event Consumer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventConsumerImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEventConsumer()
     * @generated
     */
    int EVENT_CONSUMER = 16;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Consumer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventProcessingAgentImpl <em>Event Processing Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventProcessingAgentImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEventProcessingAgent()
     * @generated
     */
    int EVENT_PROCESSING_AGENT = 17;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Processing Agent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROCESSING_AGENT_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.EventProducerImpl <em>Event Producer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.EventProducerImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getEventProducer()
     * @generated
     */
    int EVENT_PRODUCER = 18;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Producer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRODUCER_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.ExtensionTypeImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getExtensionType()
     * @generated
     */
    int EXTENSION_TYPE = 19;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ANY = 0;

    /**
     * The number of structural features of the '<em>Extension Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.PointImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getPoint()
     * @generated
     */
    int POINT = 27;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__X = 0;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__Y = 1;

    /**
     * The number of structural features of the '<em>Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.ProcessImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 28;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__FLOW_ELEMENT = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definitional Collaboration Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__DEFINITIONAL_COLLABORATION_REF = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Executable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__IS_EXECUTABLE = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.SequenceFlowImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getSequenceFlow()
     * @generated
     */
    int SEQUENCE_FLOW = 30;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Sequence Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.drools.epn.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.impl.StyleImpl
     * @see org.drools.epn.impl.EPNPackageImpl#getStyle()
     * @generated
     */
    int STYLE = 32;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__ID = 0;

    /**
     * The number of structural features of the '<em>Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.drools.epn.ImplementationMember1 <em>Implementation Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.ImplementationMember1
     * @see org.drools.epn.impl.EPNPackageImpl#getImplementationMember1()
     * @generated
     */
    int IMPLEMENTATION_MEMBER1 = 34;

    /**
     * The meta object id for the '{@link org.drools.epn.ProcessType <em>Process Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.ProcessType
     * @see org.drools.epn.impl.EPNPackageImpl#getProcessType()
     * @generated
     */
    int PROCESS_TYPE = 35;

    /**
     * The meta object id for the '<em>Implementation</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.drools.epn.impl.EPNPackageImpl#getImplementation()
     * @generated
     */
    int IMPLEMENTATION = 36;

    /**
     * The meta object id for the '<em>Implementation Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.ImplementationMember1
     * @see org.drools.epn.impl.EPNPackageImpl#getImplementationMember1Object()
     * @generated
     */
    int IMPLEMENTATION_MEMBER1_OBJECT = 37;

    /**
     * The meta object id for the '<em>Process Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.drools.epn.ProcessType
     * @see org.drools.epn.impl.EPNPackageImpl#getProcessTypeObject()
     * @generated
     */
    int PROCESS_TYPE_OBJECT = 38;


    /**
     * Returns the meta object for class '{@link org.drools.epn.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity</em>'.
     * @see org.drools.epn.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Activity#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.drools.epn.Activity#getDefault()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_Default();

    /**
     * Returns the meta object for class '{@link org.drools.epn.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element</em>'.
     * @see org.drools.epn.BaseElement
     * @generated
     */
    EClass getBaseElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.drools.epn.BaseElement#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.drools.epn.BaseElement#getDocumentation()
     * @see #getBaseElement()
     * @generated
     */
    EReference getBaseElement_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.BaseElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.BaseElement#getId()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.BaseElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.drools.epn.BaseElement#getAnyAttribute()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Bounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bounds</em>'.
     * @see org.drools.epn.Bounds
     * @generated
     */
    EClass getBounds();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Bounds#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see org.drools.epn.Bounds#getHeight()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Height();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Bounds#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see org.drools.epn.Bounds#getWidth()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Width();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Bounds#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.drools.epn.Bounds#getX()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_X();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Bounds#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.drools.epn.Bounds#getY()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Y();

    /**
     * Returns the meta object for class '{@link org.drools.epn.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Callable Element</em>'.
     * @see org.drools.epn.CallableElement
     * @generated
     */
    EClass getCallableElement();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.CallableElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.CallableElement#getName()
     * @see #getCallableElement()
     * @generated
     */
    EAttribute getCallableElement_Name();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Definitions</em>'.
     * @see org.drools.epn.Definitions
     * @generated
     */
    EClass getDefinitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.drools.epn.Definitions#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root Element</em>'.
     * @see org.drools.epn.Definitions#getRootElement()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_RootElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.drools.epn.Definitions#getEPNDiagram <em>EPN Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>EPN Diagram</em>'.
     * @see org.drools.epn.Definitions#getEPNDiagram()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_EPNDiagram();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Definitions#getExpressionLanguage <em>Expression Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Language</em>'.
     * @see org.drools.epn.Definitions#getExpressionLanguage()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_ExpressionLanguage();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Definitions#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.Definitions#getId()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_Id();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Definitions#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.Definitions#getName()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_Name();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Definitions#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.drools.epn.Definitions#getTargetNamespace()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_TargetNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Definitions#getTypeLanguage <em>Type Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Language</em>'.
     * @see org.drools.epn.Definitions#getTypeLanguage()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_TypeLanguage();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.Definitions#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.drools.epn.Definitions#getAnyAttribute()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see org.drools.epn.Diagram
     * @generated
     */
    EClass getDiagram();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Diagram#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Documentation</em>'.
     * @see org.drools.epn.Diagram#getDocumentation()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Diagram#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.Diagram#getId()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Id();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Diagram#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.Diagram#getName()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Name();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Diagram#getResolution <em>Resolution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resolution</em>'.
     * @see org.drools.epn.Diagram#getResolution()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Resolution();

    /**
     * Returns the meta object for class '{@link org.drools.epn.DiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Element</em>'.
     * @see org.drools.epn.DiagramElement
     * @generated
     */
    EClass getDiagramElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DiagramElement#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extension</em>'.
     * @see org.drools.epn.DiagramElement#getExtension()
     * @see #getDiagramElement()
     * @generated
     */
    EReference getDiagramElement_Extension();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.DiagramElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.DiagramElement#getId()
     * @see #getDiagramElement()
     * @generated
     */
    EAttribute getDiagramElement_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.DiagramElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.drools.epn.DiagramElement#getAnyAttribute()
     * @see #getDiagramElement()
     * @generated
     */
    EAttribute getDiagramElement_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.drools.epn.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.Documentation#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.drools.epn.Documentation#getMixed()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.Documentation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.drools.epn.Documentation#getAny()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Any();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Documentation#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.Documentation#getId()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Id();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Documentation#getTextFormat <em>Text Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text Format</em>'.
     * @see org.drools.epn.Documentation#getTextFormat()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_TextFormat();

    /**
     * Returns the meta object for class '{@link org.drools.epn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.drools.epn.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.drools.epn.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.drools.epn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.drools.epn.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.drools.epn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.drools.epn.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getActivity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activity</em>'.
     * @see org.drools.epn.DocumentRoot#getActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Activity();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getBaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Base Element</em>'.
     * @see org.drools.epn.DocumentRoot#getBaseElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BaseElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.drools.epn.DocumentRoot#getBounds()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Bounds();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getCallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Callable Element</em>'.
     * @see org.drools.epn.DocumentRoot#getCallableElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallableElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Definitions</em>'.
     * @see org.drools.epn.DocumentRoot#getDefinitions()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Definitions();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Diagram</em>'.
     * @see org.drools.epn.DocumentRoot#getDiagram()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Diagram();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Diagram Element</em>'.
     * @see org.drools.epn.DocumentRoot#getDiagramElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DiagramElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see org.drools.epn.DocumentRoot#getDocumentation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEdge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Edge</em>'.
     * @see org.drools.epn.DocumentRoot#getEdge()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Edge();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEPNDiagram <em>EPN Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Diagram</em>'.
     * @see org.drools.epn.DocumentRoot#getEPNDiagram()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EPNDiagram();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEPNEdge <em>EPN Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Edge</em>'.
     * @see org.drools.epn.DocumentRoot#getEPNEdge()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EPNEdge();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEPNLabel <em>EPN Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Label</em>'.
     * @see org.drools.epn.DocumentRoot#getEPNLabel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EPNLabel();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEPNPlane <em>EPN Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Plane</em>'.
     * @see org.drools.epn.DocumentRoot#getEPNPlane()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EPNPlane();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEPNShape <em>EPN Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Shape</em>'.
     * @see org.drools.epn.DocumentRoot#getEPNShape()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EPNShape();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventChannel <em>Event Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Channel</em>'.
     * @see org.drools.epn.DocumentRoot#getEventChannel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventChannel();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Element</em>'.
     * @see org.drools.epn.DocumentRoot#getFlowElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventConsumer <em>Event Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Consumer</em>'.
     * @see org.drools.epn.DocumentRoot#getEventConsumer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventConsumer();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventProcessingAgent <em>Event Processing Agent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Processing Agent</em>'.
     * @see org.drools.epn.DocumentRoot#getEventProcessingAgent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventProcessingAgent();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getEventProducer <em>Event Producer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Producer</em>'.
     * @see org.drools.epn.DocumentRoot#getEventProducer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventProducer();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getFlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Node</em>'.
     * @see org.drools.epn.DocumentRoot#getFlowNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowNode();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Label</em>'.
     * @see org.drools.epn.DocumentRoot#getLabel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Label();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getLabeledEdge <em>Labeled Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Labeled Edge</em>'.
     * @see org.drools.epn.DocumentRoot#getLabeledEdge()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LabeledEdge();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getLabeledShape <em>Labeled Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Labeled Shape</em>'.
     * @see org.drools.epn.DocumentRoot#getLabeledShape()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LabeledShape();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node</em>'.
     * @see org.drools.epn.DocumentRoot#getNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Node();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plane</em>'.
     * @see org.drools.epn.DocumentRoot#getPlane()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Plane();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.drools.epn.DocumentRoot#getPoint()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Point();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process</em>'.
     * @see org.drools.epn.DocumentRoot#getProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Process();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Element</em>'.
     * @see org.drools.epn.DocumentRoot#getRootElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RootElement();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence Flow</em>'.
     * @see org.drools.epn.DocumentRoot#getSequenceFlow()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SequenceFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getShape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Shape</em>'.
     * @see org.drools.epn.DocumentRoot#getShape()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Shape();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.DocumentRoot#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Task</em>'.
     * @see org.drools.epn.DocumentRoot#getTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Task();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Edge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Edge</em>'.
     * @see org.drools.epn.Edge
     * @generated
     */
    EClass getEdge();

    /**
     * Returns the meta object for the containment reference list '{@link org.drools.epn.Edge#getWaypoint <em>Waypoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Waypoint</em>'.
     * @see org.drools.epn.Edge#getWaypoint()
     * @see #getEdge()
     * @generated
     */
    EReference getEdge_Waypoint();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EPNDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see org.drools.epn.EPNDiagram
     * @generated
     */
    EClass getEPNDiagram();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.EPNDiagram#getEPNPlane <em>EPN Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Plane</em>'.
     * @see org.drools.epn.EPNDiagram#getEPNPlane()
     * @see #getEPNDiagram()
     * @generated
     */
    EReference getEPNDiagram_EPNPlane();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EPNEdge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Edge</em>'.
     * @see org.drools.epn.EPNEdge
     * @generated
     */
    EClass getEPNEdge();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.EPNEdge#getEPNLabel <em>EPN Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Label</em>'.
     * @see org.drools.epn.EPNEdge#getEPNLabel()
     * @see #getEPNEdge()
     * @generated
     */
    EReference getEPNEdge_EPNLabel();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EPNEdge#getEpnElement <em>Epn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Epn Element</em>'.
     * @see org.drools.epn.EPNEdge#getEpnElement()
     * @see #getEPNEdge()
     * @generated
     */
    EAttribute getEPNEdge_EpnElement();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EPNEdge#getSourceElement <em>Source Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Element</em>'.
     * @see org.drools.epn.EPNEdge#getSourceElement()
     * @see #getEPNEdge()
     * @generated
     */
    EAttribute getEPNEdge_SourceElement();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EPNEdge#getTargetElement <em>Target Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Element</em>'.
     * @see org.drools.epn.EPNEdge#getTargetElement()
     * @see #getEPNEdge()
     * @generated
     */
    EAttribute getEPNEdge_TargetElement();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EPNLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Label</em>'.
     * @see org.drools.epn.EPNLabel
     * @generated
     */
    EClass getEPNLabel();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EPNPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Plane</em>'.
     * @see org.drools.epn.EPNPlane
     * @generated
     */
    EClass getEPNPlane();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EPNPlane#getEpnElement <em>Epn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Epn Element</em>'.
     * @see org.drools.epn.EPNPlane#getEpnElement()
     * @see #getEPNPlane()
     * @generated
     */
    EAttribute getEPNPlane_EpnElement();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EPNShape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shape</em>'.
     * @see org.drools.epn.EPNShape
     * @generated
     */
    EClass getEPNShape();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.EPNShape#getEPNLabel <em>EPN Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EPN Label</em>'.
     * @see org.drools.epn.EPNShape#getEPNLabel()
     * @see #getEPNShape()
     * @generated
     */
    EReference getEPNShape_EPNLabel();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EPNShape#getEpnElement <em>Epn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Epn Element</em>'.
     * @see org.drools.epn.EPNShape#getEpnElement()
     * @see #getEPNShape()
     * @generated
     */
    EAttribute getEPNShape_EpnElement();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventChannel <em>Event Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Channel</em>'.
     * @see org.drools.epn.EventChannel
     * @generated
     */
    EClass getEventChannel();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EventChannel#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.drools.epn.EventChannel#getImplementation()
     * @see #getEventChannel()
     * @generated
     */
    EAttribute getEventChannel_Implementation();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventConsumer <em>Event Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Consumer</em>'.
     * @see org.drools.epn.EventConsumer
     * @generated
     */
    EClass getEventConsumer();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EventConsumer#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.drools.epn.EventConsumer#getImplementation()
     * @see #getEventConsumer()
     * @generated
     */
    EAttribute getEventConsumer_Implementation();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventProcessingAgent <em>Event Processing Agent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Processing Agent</em>'.
     * @see org.drools.epn.EventProcessingAgent
     * @generated
     */
    EClass getEventProcessingAgent();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EventProcessingAgent#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.drools.epn.EventProcessingAgent#getImplementation()
     * @see #getEventProcessingAgent()
     * @generated
     */
    EAttribute getEventProcessingAgent_Implementation();

    /**
     * Returns the meta object for class '{@link org.drools.epn.EventProducer <em>Event Producer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Producer</em>'.
     * @see org.drools.epn.EventProducer
     * @generated
     */
    EClass getEventProducer();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.EventProducer#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.drools.epn.EventProducer#getImplementation()
     * @see #getEventProducer()
     * @generated
     */
    EAttribute getEventProducer_Implementation();

    /**
     * Returns the meta object for class '{@link org.drools.epn.ExtensionType <em>Extension Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extension Type</em>'.
     * @see org.drools.epn.ExtensionType
     * @generated
     */
    EClass getExtensionType();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.ExtensionType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.drools.epn.ExtensionType#getAny()
     * @see #getExtensionType()
     * @generated
     */
    EAttribute getExtensionType_Any();

    /**
     * Returns the meta object for class '{@link org.drools.epn.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Element</em>'.
     * @see org.drools.epn.FlowElement
     * @generated
     */
    EClass getFlowElement();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Category Value Ref</em>'.
     * @see org.drools.epn.FlowElement#getCategoryValueRef()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_CategoryValueRef();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.FlowElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.drools.epn.FlowElement#getName()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_Name();

    /**
     * Returns the meta object for class '{@link org.drools.epn.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Node</em>'.
     * @see org.drools.epn.FlowNode
     * @generated
     */
    EClass getFlowNode();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.FlowNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Incoming</em>'.
     * @see org.drools.epn.FlowNode#getIncoming()
     * @see #getFlowNode()
     * @generated
     */
    EAttribute getFlowNode_Incoming();

    /**
     * Returns the meta object for the attribute list '{@link org.drools.epn.FlowNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Outgoing</em>'.
     * @see org.drools.epn.FlowNode#getOutgoing()
     * @see #getFlowNode()
     * @generated
     */
    EAttribute getFlowNode_Outgoing();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Label</em>'.
     * @see org.drools.epn.Label
     * @generated
     */
    EClass getLabel();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.Label#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.drools.epn.Label#getBounds()
     * @see #getLabel()
     * @generated
     */
    EReference getLabel_Bounds();

    /**
     * Returns the meta object for class '{@link org.drools.epn.LabeledEdge <em>Labeled Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Labeled Edge</em>'.
     * @see org.drools.epn.LabeledEdge
     * @generated
     */
    EClass getLabeledEdge();

    /**
     * Returns the meta object for class '{@link org.drools.epn.LabeledShape <em>Labeled Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Labeled Shape</em>'.
     * @see org.drools.epn.LabeledShape
     * @generated
     */
    EClass getLabeledShape();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see org.drools.epn.Node
     * @generated
     */
    EClass getNode();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Plane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Plane</em>'.
     * @see org.drools.epn.Plane
     * @generated
     */
    EClass getPlane();

    /**
     * Returns the meta object for the containment reference list '{@link org.drools.epn.Plane#getDiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Diagram Element</em>'.
     * @see org.drools.epn.Plane#getDiagramElement()
     * @see #getPlane()
     * @generated
     */
    EReference getPlane_DiagramElement();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Point <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point</em>'.
     * @see org.drools.epn.Point
     * @generated
     */
    EClass getPoint();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Point#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.drools.epn.Point#getX()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_X();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Point#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.drools.epn.Point#getY()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_Y();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.drools.epn.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for the containment reference list '{@link org.drools.epn.Process#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.drools.epn.Process#getFlowElement()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_FlowElement();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definitional Collaboration Ref</em>'.
     * @see org.drools.epn.Process#getDefinitionalCollaborationRef()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_DefinitionalCollaborationRef();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Process#isIsExecutable <em>Is Executable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Executable</em>'.
     * @see org.drools.epn.Process#isIsExecutable()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_IsExecutable();

    /**
     * Returns the meta object for class '{@link org.drools.epn.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Element</em>'.
     * @see org.drools.epn.RootElement
     * @generated
     */
    EClass getRootElement();

    /**
     * Returns the meta object for class '{@link org.drools.epn.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Flow</em>'.
     * @see org.drools.epn.SequenceFlow
     * @generated
     */
    EClass getSequenceFlow();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.drools.epn.SequenceFlow#getSourceRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.drools.epn.SequenceFlow#getTargetRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_TargetRef();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shape</em>'.
     * @see org.drools.epn.Shape
     * @generated
     */
    EClass getShape();

    /**
     * Returns the meta object for the containment reference '{@link org.drools.epn.Shape#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.drools.epn.Shape#getBounds()
     * @see #getShape()
     * @generated
     */
    EReference getShape_Bounds();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style</em>'.
     * @see org.drools.epn.Style
     * @generated
     */
    EClass getStyle();

    /**
     * Returns the meta object for the attribute '{@link org.drools.epn.Style#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.drools.epn.Style#getId()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_Id();

    /**
     * Returns the meta object for class '{@link org.drools.epn.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see org.drools.epn.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for enum '{@link org.drools.epn.ImplementationMember1 <em>Implementation Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Implementation Member1</em>'.
     * @see org.drools.epn.ImplementationMember1
     * @generated
     */
    EEnum getImplementationMember1();

    /**
     * Returns the meta object for enum '{@link org.drools.epn.ProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Process Type</em>'.
     * @see org.drools.epn.ProcessType
     * @generated
     */
    EEnum getProcessType();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Implementation</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='Implementation' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI Implementation_._member_._1'"
     * @generated
     */
    EDataType getImplementation();

    /**
     * Returns the meta object for data type '{@link org.drools.epn.ImplementationMember1 <em>Implementation Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Implementation Member1 Object</em>'.
     * @see org.drools.epn.ImplementationMember1
     * @model instanceClass="org.drools.epn.ImplementationMember1"
     *        extendedMetaData="name='Implementation_._member_._1:Object' baseType='Implementation_._member_._1'"
     * @generated
     */
    EDataType getImplementationMember1Object();

    /**
     * Returns the meta object for data type '{@link org.drools.epn.ProcessType <em>Process Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Process Type Object</em>'.
     * @see org.drools.epn.ProcessType
     * @model instanceClass="org.drools.epn.ProcessType"
     *        extendedMetaData="name='ProcessType:Object' baseType='ProcessType'"
     * @generated
     */
    EDataType getProcessTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EPNFactory getEPNFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.drools.epn.impl.ActivityImpl <em>Activity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.ActivityImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getActivity()
         * @generated
         */
        EClass ACTIVITY = eINSTANCE.getActivity();

        /**
         * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY__DEFAULT = eINSTANCE.getActivity_Default();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.BaseElementImpl <em>Base Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.BaseElementImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getBaseElement()
         * @generated
         */
        EClass BASE_ELEMENT = eINSTANCE.getBaseElement();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_ELEMENT__DOCUMENTATION = eINSTANCE.getBaseElement_Documentation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASE_ELEMENT__ID = eINSTANCE.getBaseElement_Id();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASE_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getBaseElement_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.BoundsImpl <em>Bounds</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.BoundsImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getBounds()
         * @generated
         */
        EClass BOUNDS = eINSTANCE.getBounds();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.CallableElementImpl <em>Callable Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.CallableElementImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getCallableElement()
         * @generated
         */
        EClass CALLABLE_ELEMENT = eINSTANCE.getCallableElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CALLABLE_ELEMENT__NAME = eINSTANCE.getCallableElement_Name();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DefinitionsImpl <em>Definitions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DefinitionsImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getDefinitions()
         * @generated
         */
        EClass DEFINITIONS = eINSTANCE.getDefinitions();

        /**
         * The meta object literal for the '<em><b>Root Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEFINITIONS__ROOT_ELEMENT = eINSTANCE.getDefinitions_RootElement();

        /**
         * The meta object literal for the '<em><b>EPN Diagram</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEFINITIONS__EPN_DIAGRAM = eINSTANCE.getDefinitions_EPNDiagram();

        /**
         * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFINITIONS__EXPRESSION_LANGUAGE = eINSTANCE.getDefinitions_ExpressionLanguage();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFINITIONS__ID = eINSTANCE.getDefinitions_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFINITIONS__NAME = eINSTANCE.getDefinitions_Name();

        /**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getDefinitions_TargetNamespace();

        /**
         * The meta object literal for the '<em><b>Type Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFINITIONS__TYPE_LANGUAGE = eINSTANCE.getDefinitions_TypeLanguage();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFINITIONS__ANY_ATTRIBUTE = eINSTANCE.getDefinitions_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DiagramImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getDiagram()
         * @generated
         */
        EClass DIAGRAM = eINSTANCE.getDiagram();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__DOCUMENTATION = eINSTANCE.getDiagram_Documentation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__ID = eINSTANCE.getDiagram_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

        /**
         * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__RESOLUTION = eINSTANCE.getDiagram_Resolution();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DiagramElementImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getDiagramElement()
         * @generated
         */
        EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

        /**
         * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENT__EXTENSION = eINSTANCE.getDiagramElement_Extension();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT__ID = eINSTANCE.getDiagramElement_Id();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getDiagramElement_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DocumentationImpl <em>Documentation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DocumentationImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getDocumentation()
         * @generated
         */
        EClass DOCUMENTATION = eINSTANCE.getDocumentation();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__MIXED = eINSTANCE.getDocumentation_Mixed();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__ANY = eINSTANCE.getDocumentation_Any();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__ID = eINSTANCE.getDocumentation_Id();

        /**
         * The meta object literal for the '<em><b>Text Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__TEXT_FORMAT = eINSTANCE.getDocumentation_TextFormat();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.DocumentRootImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ACTIVITY = eINSTANCE.getDocumentRoot_Activity();

        /**
         * The meta object literal for the '<em><b>Base Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BASE_ELEMENT = eINSTANCE.getDocumentRoot_BaseElement();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BOUNDS = eINSTANCE.getDocumentRoot_Bounds();

        /**
         * The meta object literal for the '<em><b>Callable Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CALLABLE_ELEMENT = eINSTANCE.getDocumentRoot_CallableElement();

        /**
         * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DEFINITIONS = eINSTANCE.getDocumentRoot_Definitions();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DIAGRAM = eINSTANCE.getDocumentRoot_Diagram();

        /**
         * The meta object literal for the '<em><b>Diagram Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DIAGRAM_ELEMENT = eINSTANCE.getDocumentRoot_DiagramElement();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

        /**
         * The meta object literal for the '<em><b>Edge</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EDGE = eINSTANCE.getDocumentRoot_Edge();

        /**
         * The meta object literal for the '<em><b>EPN Diagram</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EPN_DIAGRAM = eINSTANCE.getDocumentRoot_EPNDiagram();

        /**
         * The meta object literal for the '<em><b>EPN Edge</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EPN_EDGE = eINSTANCE.getDocumentRoot_EPNEdge();

        /**
         * The meta object literal for the '<em><b>EPN Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EPN_LABEL = eINSTANCE.getDocumentRoot_EPNLabel();

        /**
         * The meta object literal for the '<em><b>EPN Plane</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EPN_PLANE = eINSTANCE.getDocumentRoot_EPNPlane();

        /**
         * The meta object literal for the '<em><b>EPN Shape</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EPN_SHAPE = eINSTANCE.getDocumentRoot_EPNShape();

        /**
         * The meta object literal for the '<em><b>Event Channel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_CHANNEL = eINSTANCE.getDocumentRoot_EventChannel();

        /**
         * The meta object literal for the '<em><b>Flow Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FLOW_ELEMENT = eINSTANCE.getDocumentRoot_FlowElement();

        /**
         * The meta object literal for the '<em><b>Event Consumer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_CONSUMER = eINSTANCE.getDocumentRoot_EventConsumer();

        /**
         * The meta object literal for the '<em><b>Event Processing Agent</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_PROCESSING_AGENT = eINSTANCE.getDocumentRoot_EventProcessingAgent();

        /**
         * The meta object literal for the '<em><b>Event Producer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_PRODUCER = eINSTANCE.getDocumentRoot_EventProducer();

        /**
         * The meta object literal for the '<em><b>Flow Node</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FLOW_NODE = eINSTANCE.getDocumentRoot_FlowNode();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LABEL = eINSTANCE.getDocumentRoot_Label();

        /**
         * The meta object literal for the '<em><b>Labeled Edge</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LABELED_EDGE = eINSTANCE.getDocumentRoot_LabeledEdge();

        /**
         * The meta object literal for the '<em><b>Labeled Shape</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LABELED_SHAPE = eINSTANCE.getDocumentRoot_LabeledShape();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

        /**
         * The meta object literal for the '<em><b>Plane</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLANE = eINSTANCE.getDocumentRoot_Plane();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__POINT = eINSTANCE.getDocumentRoot_Point();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESS = eINSTANCE.getDocumentRoot_Process();

        /**
         * The meta object literal for the '<em><b>Root Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ROOT_ELEMENT = eINSTANCE.getDocumentRoot_RootElement();

        /**
         * The meta object literal for the '<em><b>Sequence Flow</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SEQUENCE_FLOW = eINSTANCE.getDocumentRoot_SequenceFlow();

        /**
         * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SHAPE = eINSTANCE.getDocumentRoot_Shape();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TASK = eINSTANCE.getDocumentRoot_Task();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EdgeImpl <em>Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EdgeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEdge()
         * @generated
         */
        EClass EDGE = eINSTANCE.getEdge();

        /**
         * The meta object literal for the '<em><b>Waypoint</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EDGE__WAYPOINT = eINSTANCE.getEdge_Waypoint();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EPNDiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EPNDiagramImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEPNDiagram()
         * @generated
         */
        EClass EPN_DIAGRAM = eINSTANCE.getEPNDiagram();

        /**
         * The meta object literal for the '<em><b>EPN Plane</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPN_DIAGRAM__EPN_PLANE = eINSTANCE.getEPNDiagram_EPNPlane();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EPNEdgeImpl <em>Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EPNEdgeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEPNEdge()
         * @generated
         */
        EClass EPN_EDGE = eINSTANCE.getEPNEdge();

        /**
         * The meta object literal for the '<em><b>EPN Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPN_EDGE__EPN_LABEL = eINSTANCE.getEPNEdge_EPNLabel();

        /**
         * The meta object literal for the '<em><b>Epn Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EPN_EDGE__EPN_ELEMENT = eINSTANCE.getEPNEdge_EpnElement();

        /**
         * The meta object literal for the '<em><b>Source Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EPN_EDGE__SOURCE_ELEMENT = eINSTANCE.getEPNEdge_SourceElement();

        /**
         * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EPN_EDGE__TARGET_ELEMENT = eINSTANCE.getEPNEdge_TargetElement();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EPNLabelImpl <em>Label</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EPNLabelImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEPNLabel()
         * @generated
         */
        EClass EPN_LABEL = eINSTANCE.getEPNLabel();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EPNPlaneImpl <em>Plane</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EPNPlaneImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEPNPlane()
         * @generated
         */
        EClass EPN_PLANE = eINSTANCE.getEPNPlane();

        /**
         * The meta object literal for the '<em><b>Epn Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EPN_PLANE__EPN_ELEMENT = eINSTANCE.getEPNPlane_EpnElement();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EPNShapeImpl <em>Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EPNShapeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEPNShape()
         * @generated
         */
        EClass EPN_SHAPE = eINSTANCE.getEPNShape();

        /**
         * The meta object literal for the '<em><b>EPN Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPN_SHAPE__EPN_LABEL = eINSTANCE.getEPNShape_EPNLabel();

        /**
         * The meta object literal for the '<em><b>Epn Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EPN_SHAPE__EPN_ELEMENT = eINSTANCE.getEPNShape_EpnElement();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventChannelImpl <em>Event Channel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventChannelImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEventChannel()
         * @generated
         */
        EClass EVENT_CHANNEL = eINSTANCE.getEventChannel();

        /**
         * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_CHANNEL__IMPLEMENTATION = eINSTANCE.getEventChannel_Implementation();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventConsumerImpl <em>Event Consumer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventConsumerImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEventConsumer()
         * @generated
         */
        EClass EVENT_CONSUMER = eINSTANCE.getEventConsumer();

        /**
         * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_CONSUMER__IMPLEMENTATION = eINSTANCE.getEventConsumer_Implementation();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventProcessingAgentImpl <em>Event Processing Agent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventProcessingAgentImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEventProcessingAgent()
         * @generated
         */
        EClass EVENT_PROCESSING_AGENT = eINSTANCE.getEventProcessingAgent();

        /**
         * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_PROCESSING_AGENT__IMPLEMENTATION = eINSTANCE.getEventProcessingAgent_Implementation();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.EventProducerImpl <em>Event Producer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.EventProducerImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getEventProducer()
         * @generated
         */
        EClass EVENT_PRODUCER = eINSTANCE.getEventProducer();

        /**
         * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_PRODUCER__IMPLEMENTATION = eINSTANCE.getEventProducer_Implementation();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.ExtensionTypeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getExtensionType()
         * @generated
         */
        EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENSION_TYPE__ANY = eINSTANCE.getExtensionType_Any();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.FlowElementImpl <em>Flow Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.FlowElementImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getFlowElement()
         * @generated
         */
        EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

        /**
         * The meta object literal for the '<em><b>Category Value Ref</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOW_ELEMENT__CATEGORY_VALUE_REF = eINSTANCE.getFlowElement_CategoryValueRef();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOW_ELEMENT__NAME = eINSTANCE.getFlowElement_Name();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.FlowNodeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getFlowNode()
         * @generated
         */
        EClass FLOW_NODE = eINSTANCE.getFlowNode();

        /**
         * The meta object literal for the '<em><b>Incoming</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOW_NODE__INCOMING = eINSTANCE.getFlowNode_Incoming();

        /**
         * The meta object literal for the '<em><b>Outgoing</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOW_NODE__OUTGOING = eINSTANCE.getFlowNode_Outgoing();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.LabelImpl <em>Label</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.LabelImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getLabel()
         * @generated
         */
        EClass LABEL = eINSTANCE.getLabel();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LABEL__BOUNDS = eINSTANCE.getLabel_Bounds();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.LabeledEdgeImpl <em>Labeled Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.LabeledEdgeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getLabeledEdge()
         * @generated
         */
        EClass LABELED_EDGE = eINSTANCE.getLabeledEdge();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.LabeledShapeImpl <em>Labeled Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.LabeledShapeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getLabeledShape()
         * @generated
         */
        EClass LABELED_SHAPE = eINSTANCE.getLabeledShape();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.NodeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getNode()
         * @generated
         */
        EClass NODE = eINSTANCE.getNode();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.PlaneImpl <em>Plane</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.PlaneImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getPlane()
         * @generated
         */
        EClass PLANE = eINSTANCE.getPlane();

        /**
         * The meta object literal for the '<em><b>Diagram Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLANE__DIAGRAM_ELEMENT = eINSTANCE.getPlane_DiagramElement();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.PointImpl <em>Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.PointImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getPoint()
         * @generated
         */
        EClass POINT = eINSTANCE.getPoint();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__X = eINSTANCE.getPoint_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__Y = eINSTANCE.getPoint_Y();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.ProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.ProcessImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getProcess()
         * @generated
         */
        EClass PROCESS = eINSTANCE.getProcess();

        /**
         * The meta object literal for the '<em><b>Flow Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS__FLOW_ELEMENT = eINSTANCE.getProcess_FlowElement();

        /**
         * The meta object literal for the '<em><b>Definitional Collaboration Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS__DEFINITIONAL_COLLABORATION_REF = eINSTANCE.getProcess_DefinitionalCollaborationRef();

        /**
         * The meta object literal for the '<em><b>Is Executable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS__IS_EXECUTABLE = eINSTANCE.getProcess_IsExecutable();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.RootElementImpl <em>Root Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.RootElementImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getRootElement()
         * @generated
         */
        EClass ROOT_ELEMENT = eINSTANCE.getRootElement();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.SequenceFlowImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getSequenceFlow()
         * @generated
         */
        EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_FLOW__SOURCE_REF = eINSTANCE.getSequenceFlow_SourceRef();

        /**
         * The meta object literal for the '<em><b>Target Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_FLOW__TARGET_REF = eINSTANCE.getSequenceFlow_TargetRef();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.ShapeImpl <em>Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.ShapeImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getShape()
         * @generated
         */
        EClass SHAPE = eINSTANCE.getShape();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHAPE__BOUNDS = eINSTANCE.getShape_Bounds();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.StyleImpl <em>Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.StyleImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getStyle()
         * @generated
         */
        EClass STYLE = eINSTANCE.getStyle();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__ID = eINSTANCE.getStyle_Id();

        /**
         * The meta object literal for the '{@link org.drools.epn.impl.TaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.impl.TaskImpl
         * @see org.drools.epn.impl.EPNPackageImpl#getTask()
         * @generated
         */
        EClass TASK = eINSTANCE.getTask();

        /**
         * The meta object literal for the '{@link org.drools.epn.ImplementationMember1 <em>Implementation Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.ImplementationMember1
         * @see org.drools.epn.impl.EPNPackageImpl#getImplementationMember1()
         * @generated
         */
        EEnum IMPLEMENTATION_MEMBER1 = eINSTANCE.getImplementationMember1();

        /**
         * The meta object literal for the '{@link org.drools.epn.ProcessType <em>Process Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.ProcessType
         * @see org.drools.epn.impl.EPNPackageImpl#getProcessType()
         * @generated
         */
        EEnum PROCESS_TYPE = eINSTANCE.getProcessType();

        /**
         * The meta object literal for the '<em>Implementation</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.drools.epn.impl.EPNPackageImpl#getImplementation()
         * @generated
         */
        EDataType IMPLEMENTATION = eINSTANCE.getImplementation();

        /**
         * The meta object literal for the '<em>Implementation Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.ImplementationMember1
         * @see org.drools.epn.impl.EPNPackageImpl#getImplementationMember1Object()
         * @generated
         */
        EDataType IMPLEMENTATION_MEMBER1_OBJECT = eINSTANCE.getImplementationMember1Object();

        /**
         * The meta object literal for the '<em>Process Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.drools.epn.ProcessType
         * @see org.drools.epn.impl.EPNPackageImpl#getProcessTypeObject()
         * @generated
         */
        EDataType PROCESS_TYPE_OBJECT = eINSTANCE.getProcessTypeObject();

    }

} //EPNPackage
