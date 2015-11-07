/**
 */
package views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see views.ViewsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link views.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewImpl
	 * @see views.impl.ViewsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HEADER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__START_VIEW = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewGroupImpl <em>View Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewGroupImpl
	 * @see views.impl.ViewsPackageImpl#getViewGroup()
	 * @generated
	 */
	int VIEW_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__VIEWS = 1;

	/**
	 * The feature id for the '<em><b>Welcome View Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__WELCOME_VIEW_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__LAYOUT = 3;

	/**
	 * The number of structural features of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ClassIndexViewImpl <em>Class Index View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ClassIndexViewImpl
	 * @see views.impl.ViewsPackageImpl#getClassIndexView()
	 * @generated
	 */
	int CLASS_INDEX_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__HEADER = VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__START_VIEW = VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__LINK = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Index View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Index View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ClassOperationViewImpl <em>Class Operation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ClassOperationViewImpl
	 * @see views.impl.ViewsPackageImpl#getClassOperationView()
	 * @generated
	 */
	int CLASS_OPERATION_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__HEADER = VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__START_VIEW = VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Viewelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__VIEWELEMENTS = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elementgroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__ELEMENTGROUPS = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__LINK = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__CREATE = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Read</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__READ = VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Update</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__UPDATE = VIEW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__DELETE = VIEW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Class Operation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Class Operation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewElementsImpl <em>View Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewElementsImpl
	 * @see views.impl.ViewsPackageImpl#getViewElements()
	 * @generated
	 */
	int VIEW_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENTS__ELEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENTS__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENTS__VISIBILITYCONDITION = 2;

	/**
	 * The number of structural features of the '<em>View Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.PropertyElementsImpl <em>Property Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.PropertyElementsImpl
	 * @see views.impl.ViewsPackageImpl#getPropertyElements()
	 * @generated
	 */
	int PROPERTY_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENTS__ELEMENT_ID = VIEW_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENTS__LABEL = VIEW_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENTS__VISIBILITYCONDITION = VIEW_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The number of structural features of the '<em>Property Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENTS_FEATURE_COUNT = VIEW_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENTS_OPERATION_COUNT = VIEW_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.AssociationElementsImpl <em>Association Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.AssociationElementsImpl
	 * @see views.impl.ViewsPackageImpl#getAssociationElements()
	 * @generated
	 */
	int ASSOCIATION_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENTS__ELEMENT_ID = VIEW_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENTS__LABEL = VIEW_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENTS__VISIBILITYCONDITION = VIEW_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENTS__LINK = VIEW_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENTS_FEATURE_COUNT = VIEW_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENTS_OPERATION_COUNT = VIEW_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.TextImpl
	 * @see views.impl.ViewsPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 7;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ELEMENT_ID = PROPERTY_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LABEL = PROPERTY_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VISIBILITYCONDITION = PROPERTY_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Text Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_TYPE = PROPERTY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = PROPERTY_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = PROPERTY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.DateTimePickerImpl <em>Date Time Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DateTimePickerImpl
	 * @see views.impl.ViewsPackageImpl#getDateTimePicker()
	 * @generated
	 */
	int DATE_TIME_PICKER = 8;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__ELEMENT_ID = PROPERTY_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__LABEL = PROPERTY_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__VISIBILITYCONDITION = PROPERTY_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Date Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__DATE_TYPE = PROPERTY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_FEATURE_COUNT = PROPERTY_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_OPERATION_COUNT = PROPERTY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.SelectionImpl
	 * @see views.impl.ViewsPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 9;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ELEMENT_ID = PROPERTY_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__LABEL = PROPERTY_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__VISIBILITYCONDITION = PROPERTY_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Selectionitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTIONITEMS = PROPERTY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__TYPE = PROPERTY_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = PROPERTY_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = PROPERTY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.VisibilityConditionImpl <em>Visibility Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.VisibilityConditionImpl
	 * @see views.impl.ViewsPackageImpl#getVisibilityCondition()
	 * @generated
	 */
	int VISIBILITY_CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION__CONDITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION__CONDITION_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Visibility Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visibility Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ComparisonConditionsImpl <em>Comparison Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ComparisonConditionsImpl
	 * @see views.impl.ViewsPackageImpl#getComparisonConditions()
	 * @generated
	 */
	int COMPARISON_CONDITIONS = 10;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITIONS__CONDITION_ID = VISIBILITY_CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITIONS__CONDITION_TYPE = VISIBILITY_CONDITION__CONDITION_TYPE;

	/**
	 * The number of structural features of the '<em>Comparison Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITIONS_FEATURE_COUNT = VISIBILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparison Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITIONS_OPERATION_COUNT = VISIBILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.CompositeConditionsImpl <em>Composite Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.CompositeConditionsImpl
	 * @see views.impl.ViewsPackageImpl#getCompositeConditions()
	 * @generated
	 */
	int COMPOSITE_CONDITIONS = 11;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITIONS__CONDITION_ID = VISIBILITY_CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITIONS__CONDITION_TYPE = VISIBILITY_CONDITION__CONDITION_TYPE;

	/**
	 * The feature id for the '<em><b>Composite Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITIONS__COMPOSITE_TYPE = VISIBILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITIONS_FEATURE_COUNT = VISIBILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITIONS_OPERATION_COUNT = VISIBILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ListImpl
	 * @see views.impl.ViewsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_ID = ASSOCIATION_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LABEL = ASSOCIATION_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VISIBILITYCONDITION = ASSOCIATION_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LINK = ASSOCIATION_ELEMENTS__LINK;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = ASSOCIATION_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = ASSOCIATION_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.CreateImpl
	 * @see views.impl.ViewsPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 13;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ReadImpl
	 * @see views.impl.ViewsPackageImpl#getRead()
	 * @generated
	 */
	int READ = 14;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DeleteImpl
	 * @see views.impl.ViewsPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 15;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.UpdateImpl
	 * @see views.impl.ViewsPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 16;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ElementGroupsImpl <em>Element Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ElementGroupsImpl
	 * @see views.impl.ViewsPackageImpl#getElementGroups()
	 * @generated
	 */
	int ELEMENT_GROUPS = 17;

	/**
	 * The feature id for the '<em><b>Viewelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUPS__VIEWELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUPS__VISIBILITYCONDITION = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUPS__LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUPS__HEADER = 3;

	/**
	 * The number of structural features of the '<em>Element Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUPS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.SelectionItemsImpl <em>Selection Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.SelectionItemsImpl
	 * @see views.impl.ViewsPackageImpl#getSelectionItems()
	 * @generated
	 */
	int SELECTION_ITEMS = 19;

	/**
	 * The number of structural features of the '<em>Selection Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEMS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Selection Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.LayoutImpl
	 * @see views.impl.ViewsPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 20;

	/**
	 * The feature id for the '<em><b>Layout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYOUT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.LinkImpl
	 * @see views.impl.ViewsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Classoperationview</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CLASSOPERATIONVIEW = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.TableImpl
	 * @see views.impl.ViewsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 22;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ELEMENT_ID = ASSOCIATION_ELEMENTS__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL = ASSOCIATION_ELEMENTS__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VISIBILITYCONDITION = ASSOCIATION_ELEMENTS__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LINK = ASSOCIATION_ELEMENTS__LINK;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = ASSOCIATION_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ASSOCIATION_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ASSOCIATION_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ColumnImpl
	 * @see views.impl.ViewsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 23;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewModelImpl <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewModelImpl
	 * @see views.impl.ViewsPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 24;

	/**
	 * The feature id for the '<em><b>Viewgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__VIEWGROUP = 0;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.EnumerationLiteralItemImpl <em>Enumeration Literal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.EnumerationLiteralItemImpl
	 * @see views.impl.ViewsPackageImpl#getEnumerationLiteralItem()
	 * @generated
	 */
	int ENUMERATION_LITERAL_ITEM = 25;

	/**
	 * The number of structural features of the '<em>Enumeration Literal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_ITEM_FEATURE_COUNT = SELECTION_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_ITEM_OPERATION_COUNT = SELECTION_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.LongImpl
	 * @see views.impl.ViewsPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 26;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__ELEMENT_ID = TEXT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__LABEL = TEXT__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__VISIBILITYCONDITION = TEXT__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Text Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__TEXT_TYPE = TEXT__TEXT_TYPE;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ShortImpl <em>Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ShortImpl
	 * @see views.impl.ViewsPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 27;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__ELEMENT_ID = TEXT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__LABEL = TEXT__LABEL;

	/**
	 * The feature id for the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__VISIBILITYCONDITION = TEXT__VISIBILITYCONDITION;

	/**
	 * The feature id for the '<em><b>Text Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__TEXT_TYPE = TEXT__TEXT_TYPE;

	/**
	 * The number of structural features of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DomainModelImpl
	 * @see views.impl.ViewsPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 28;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ENUMERATION = 2;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.NamedElementImpl
	 * @see views.impl.ViewsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ClassImpl
	 * @see views.impl.ViewsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPERCLASS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ASSOCIATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.EnumerationImpl
	 * @see views.impl.ViewsPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DataTypeImpl
	 * @see views.impl.ViewsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.PropertyImpl
	 * @see views.impl.ViewsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.LiteralImpl
	 * @see views.impl.ViewsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.AssociationImpl
	 * @see views.impl.ViewsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Associationend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATIONEND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.AssociationEndImpl
	 * @see views.impl.ViewsPackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CLASS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAVIGABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__COMPOSED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.ComparisonCondition <em>Comparison Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.ComparisonCondition
	 * @see views.impl.ViewsPackageImpl#getComparisonCondition()
	 * @generated
	 */
	int COMPARISON_CONDITION = 37;

	/**
	 * The meta object id for the '{@link views.CompositeConditionsType <em>Composite Conditions Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.CompositeConditionsType
	 * @see views.impl.ViewsPackageImpl#getCompositeConditionsType()
	 * @generated
	 */
	int COMPOSITE_CONDITIONS_TYPE = 38;

	/**
	 * The meta object id for the '{@link views.TextType <em>Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.TextType
	 * @see views.impl.ViewsPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 39;

	/**
	 * The meta object id for the '{@link views.DateType <em>Date Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.DateType
	 * @see views.impl.ViewsPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 40;

	/**
	 * The meta object id for the '{@link views.LayoutType <em>Layout Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.LayoutType
	 * @see views.impl.ViewsPackageImpl#getLayoutType()
	 * @generated
	 */
	int LAYOUT_TYPE = 41;

	/**
	 * The meta object id for the '{@link views.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.PropertyType
	 * @see views.impl.ViewsPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see views.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see views.View#getHeader()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Header();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see views.View#getDescription()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Description();

	/**
	 * Returns the meta object for the attribute '{@link views.View#isStartView <em>Start View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start View</em>'.
	 * @see views.View#isStartView()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_StartView();

	/**
	 * Returns the meta object for class '{@link views.ViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Group</em>'.
	 * @see views.ViewGroup
	 * @generated
	 */
	EClass getViewGroup();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.ViewGroup#getName()
	 * @see #getViewGroup()
	 * @generated
	 */
	EAttribute getViewGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewGroup#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see views.ViewGroup#getViews()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_Views();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewGroup#isWelcomeViewGroup <em>Welcome View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome View Group</em>'.
	 * @see views.ViewGroup#isWelcomeViewGroup()
	 * @see #getViewGroup()
	 * @generated
	 */
	EAttribute getViewGroup_WelcomeViewGroup();

	/**
	 * Returns the meta object for the reference '{@link views.ViewGroup#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see views.ViewGroup#getLayout()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_Layout();

	/**
	 * Returns the meta object for class '{@link views.ClassIndexView <em>Class Index View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Index View</em>'.
	 * @see views.ClassIndexView
	 * @generated
	 */
	EClass getClassIndexView();

	/**
	 * Returns the meta object for the reference list '{@link views.ClassIndexView#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see views.ClassIndexView#getLink()
	 * @see #getClassIndexView()
	 * @generated
	 */
	EReference getClassIndexView_Link();

	/**
	 * Returns the meta object for class '{@link views.ClassOperationView <em>Class Operation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation View</em>'.
	 * @see views.ClassOperationView
	 * @generated
	 */
	EClass getClassOperationView();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ClassOperationView#getViewelements <em>Viewelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewelements</em>'.
	 * @see views.ClassOperationView#getViewelements()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Viewelements();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ClassOperationView#getElementgroups <em>Elementgroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementgroups</em>'.
	 * @see views.ClassOperationView#getElementgroups()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Elementgroups();

	/**
	 * Returns the meta object for the reference '{@link views.ClassOperationView#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see views.ClassOperationView#getLink()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Link();

	/**
	 * Returns the meta object for the reference '{@link views.ClassOperationView#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Create</em>'.
	 * @see views.ClassOperationView#getCreate()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Create();

	/**
	 * Returns the meta object for the reference '{@link views.ClassOperationView#getRead <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read</em>'.
	 * @see views.ClassOperationView#getRead()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Read();

	/**
	 * Returns the meta object for the reference '{@link views.ClassOperationView#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update</em>'.
	 * @see views.ClassOperationView#getUpdate()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Update();

	/**
	 * Returns the meta object for the reference '{@link views.ClassOperationView#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delete</em>'.
	 * @see views.ClassOperationView#getDelete()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Delete();

	/**
	 * Returns the meta object for class '{@link views.ViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Elements</em>'.
	 * @see views.ViewElements
	 * @generated
	 */
	EClass getViewElements();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewElements#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see views.ViewElements#getElementID()
	 * @see #getViewElements()
	 * @generated
	 */
	EAttribute getViewElements_ElementID();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewElements#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see views.ViewElements#getLabel()
	 * @see #getViewElements()
	 * @generated
	 */
	EAttribute getViewElements_Label();

	/**
	 * Returns the meta object for the containment reference '{@link views.ViewElements#getVisibilitycondition <em>Visibilitycondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibilitycondition</em>'.
	 * @see views.ViewElements#getVisibilitycondition()
	 * @see #getViewElements()
	 * @generated
	 */
	EReference getViewElements_Visibilitycondition();

	/**
	 * Returns the meta object for class '{@link views.PropertyElements <em>Property Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Elements</em>'.
	 * @see views.PropertyElements
	 * @generated
	 */
	EClass getPropertyElements();

	/**
	 * Returns the meta object for class '{@link views.AssociationElements <em>Association Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Elements</em>'.
	 * @see views.AssociationElements
	 * @generated
	 */
	EClass getAssociationElements();

	/**
	 * Returns the meta object for the reference list '{@link views.AssociationElements#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see views.AssociationElements#getLink()
	 * @see #getAssociationElements()
	 * @generated
	 */
	EReference getAssociationElements_Link();

	/**
	 * Returns the meta object for class '{@link views.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see views.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link views.Text#getTextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Type</em>'.
	 * @see views.Text#getTextType()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextType();

	/**
	 * Returns the meta object for class '{@link views.DateTimePicker <em>Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Picker</em>'.
	 * @see views.DateTimePicker
	 * @generated
	 */
	EClass getDateTimePicker();

	/**
	 * Returns the meta object for the attribute '{@link views.DateTimePicker#getDateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Type</em>'.
	 * @see views.DateTimePicker#getDateType()
	 * @see #getDateTimePicker()
	 * @generated
	 */
	EAttribute getDateTimePicker_DateType();

	/**
	 * Returns the meta object for class '{@link views.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see views.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Selection#getSelectionitems <em>Selectionitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selectionitems</em>'.
	 * @see views.Selection#getSelectionitems()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Selectionitems();

	/**
	 * Returns the meta object for the attribute '{@link views.Selection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see views.Selection#getType()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Type();

	/**
	 * Returns the meta object for class '{@link views.ComparisonConditions <em>Comparison Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Conditions</em>'.
	 * @see views.ComparisonConditions
	 * @generated
	 */
	EClass getComparisonConditions();

	/**
	 * Returns the meta object for class '{@link views.CompositeConditions <em>Composite Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Conditions</em>'.
	 * @see views.CompositeConditions
	 * @generated
	 */
	EClass getCompositeConditions();

	/**
	 * Returns the meta object for the attribute '{@link views.CompositeConditions#getCompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Type</em>'.
	 * @see views.CompositeConditions#getCompositeType()
	 * @see #getCompositeConditions()
	 * @generated
	 */
	EAttribute getCompositeConditions_CompositeType();

	/**
	 * Returns the meta object for class '{@link views.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see views.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link views.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see views.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link views.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see views.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link views.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see views.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link views.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see views.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link views.ElementGroups <em>Element Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Groups</em>'.
	 * @see views.ElementGroups
	 * @generated
	 */
	EClass getElementGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ElementGroups#getViewelements <em>Viewelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewelements</em>'.
	 * @see views.ElementGroups#getViewelements()
	 * @see #getElementGroups()
	 * @generated
	 */
	EReference getElementGroups_Viewelements();

	/**
	 * Returns the meta object for the containment reference '{@link views.ElementGroups#getVisibilitycondition <em>Visibilitycondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibilitycondition</em>'.
	 * @see views.ElementGroups#getVisibilitycondition()
	 * @see #getElementGroups()
	 * @generated
	 */
	EReference getElementGroups_Visibilitycondition();

	/**
	 * Returns the meta object for the reference '{@link views.ElementGroups#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see views.ElementGroups#getLayout()
	 * @see #getElementGroups()
	 * @generated
	 */
	EReference getElementGroups_Layout();

	/**
	 * Returns the meta object for the attribute '{@link views.ElementGroups#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see views.ElementGroups#getHeader()
	 * @see #getElementGroups()
	 * @generated
	 */
	EAttribute getElementGroups_Header();

	/**
	 * Returns the meta object for class '{@link views.VisibilityCondition <em>Visibility Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Condition</em>'.
	 * @see views.VisibilityCondition
	 * @generated
	 */
	EClass getVisibilityCondition();

	/**
	 * Returns the meta object for the attribute '{@link views.VisibilityCondition#getConditionID <em>Condition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition ID</em>'.
	 * @see views.VisibilityCondition#getConditionID()
	 * @see #getVisibilityCondition()
	 * @generated
	 */
	EAttribute getVisibilityCondition_ConditionID();

	/**
	 * Returns the meta object for the attribute '{@link views.VisibilityCondition#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see views.VisibilityCondition#getConditionType()
	 * @see #getVisibilityCondition()
	 * @generated
	 */
	EAttribute getVisibilityCondition_ConditionType();

	/**
	 * Returns the meta object for class '{@link views.SelectionItems <em>Selection Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Items</em>'.
	 * @see views.SelectionItems
	 * @generated
	 */
	EClass getSelectionItems();

	/**
	 * Returns the meta object for class '{@link views.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see views.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link views.Layout#getLayoutType <em>Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Type</em>'.
	 * @see views.Layout#getLayoutType()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_LayoutType();

	/**
	 * Returns the meta object for class '{@link views.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see views.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link views.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see views.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Label();

	/**
	 * Returns the meta object for the reference '{@link views.Link#getClassoperationview <em>Classoperationview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classoperationview</em>'.
	 * @see views.Link#getClassoperationview()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Classoperationview();

	/**
	 * Returns the meta object for class '{@link views.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see views.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see views.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link views.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see views.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link views.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see views.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewModel#getViewgroup <em>Viewgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewgroup</em>'.
	 * @see views.ViewModel#getViewgroup()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_Viewgroup();

	/**
	 * Returns the meta object for class '{@link views.EnumerationLiteralItem <em>Enumeration Literal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal Item</em>'.
	 * @see views.EnumerationLiteralItem
	 * @generated
	 */
	EClass getEnumerationLiteralItem();

	/**
	 * Returns the meta object for class '{@link views.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see views.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link views.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short</em>'.
	 * @see views.Short
	 * @generated
	 */
	EClass getShort();

	/**
	 * Returns the meta object for class '{@link views.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see views.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see views.DomainModel#getClass_()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see views.DomainModel#getDatatype()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see views.DomainModel#getEnumeration()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Enumeration();

	/**
	 * Returns the meta object for class '{@link views.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see views.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Class#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see views.Class#getProperty()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Property();

	/**
	 * Returns the meta object for the reference '{@link views.Class#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see views.Class#getSuperclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Superclass();

	/**
	 * Returns the meta object for the reference list '{@link views.Class#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association</em>'.
	 * @see views.Class#getAssociation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Association();

	/**
	 * Returns the meta object for class '{@link views.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see views.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Enumeration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see views.Enumeration#getLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literal();

	/**
	 * Returns the meta object for class '{@link views.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see views.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link views.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see views.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link views.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see views.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link views.Property#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see views.Property#getLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link views.Property#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see views.Property#getUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link views.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see views.Property#getClass_()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Class();

	/**
	 * Returns the meta object for class '{@link views.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see views.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link views.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see views.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link views.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see views.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Association#getAssociationend <em>Associationend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associationend</em>'.
	 * @see views.Association#getAssociationend()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Associationend();

	/**
	 * Returns the meta object for class '{@link views.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see views.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the reference '{@link views.AssociationEnd#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see views.AssociationEnd#getClass_()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd_Class();

	/**
	 * Returns the meta object for the attribute '{@link views.AssociationEnd#isNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see views.AssociationEnd#isNavigable()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_Navigable();

	/**
	 * Returns the meta object for the attribute '{@link views.AssociationEnd#isComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composed</em>'.
	 * @see views.AssociationEnd#isComposed()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_Composed();

	/**
	 * Returns the meta object for the attribute '{@link views.AssociationEnd#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see views.AssociationEnd#getLowerBound()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link views.AssociationEnd#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see views.AssociationEnd#getUpperBound()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_UpperBound();

	/**
	 * Returns the meta object for class '{@link views.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see views.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link views.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link views.ComparisonCondition <em>Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Condition</em>'.
	 * @see views.ComparisonCondition
	 * @generated
	 */
	EEnum getComparisonCondition();

	/**
	 * Returns the meta object for enum '{@link views.CompositeConditionsType <em>Composite Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Conditions Type</em>'.
	 * @see views.CompositeConditionsType
	 * @generated
	 */
	EEnum getCompositeConditionsType();

	/**
	 * Returns the meta object for enum '{@link views.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Type</em>'.
	 * @see views.TextType
	 * @generated
	 */
	EEnum getTextType();

	/**
	 * Returns the meta object for enum '{@link views.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Type</em>'.
	 * @see views.DateType
	 * @generated
	 */
	EEnum getDateType();

	/**
	 * Returns the meta object for enum '{@link views.LayoutType <em>Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Type</em>'.
	 * @see views.LayoutType
	 * @generated
	 */
	EEnum getLayoutType();

	/**
	 * Returns the meta object for enum '{@link views.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see views.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link views.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewImpl
		 * @see views.impl.ViewsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__HEADER = eINSTANCE.getView_Header();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__DESCRIPTION = eINSTANCE.getView_Description();

		/**
		 * The meta object literal for the '<em><b>Start View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__START_VIEW = eINSTANCE.getView_StartView();

		/**
		 * The meta object literal for the '{@link views.impl.ViewGroupImpl <em>View Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewGroupImpl
		 * @see views.impl.ViewsPackageImpl#getViewGroup()
		 * @generated
		 */
		EClass VIEW_GROUP = eINSTANCE.getViewGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_GROUP__NAME = eINSTANCE.getViewGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__VIEWS = eINSTANCE.getViewGroup_Views();

		/**
		 * The meta object literal for the '<em><b>Welcome View Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_GROUP__WELCOME_VIEW_GROUP = eINSTANCE.getViewGroup_WelcomeViewGroup();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__LAYOUT = eINSTANCE.getViewGroup_Layout();

		/**
		 * The meta object literal for the '{@link views.impl.ClassIndexViewImpl <em>Class Index View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ClassIndexViewImpl
		 * @see views.impl.ViewsPackageImpl#getClassIndexView()
		 * @generated
		 */
		EClass CLASS_INDEX_VIEW = eINSTANCE.getClassIndexView();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INDEX_VIEW__LINK = eINSTANCE.getClassIndexView_Link();

		/**
		 * The meta object literal for the '{@link views.impl.ClassOperationViewImpl <em>Class Operation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ClassOperationViewImpl
		 * @see views.impl.ViewsPackageImpl#getClassOperationView()
		 * @generated
		 */
		EClass CLASS_OPERATION_VIEW = eINSTANCE.getClassOperationView();

		/**
		 * The meta object literal for the '<em><b>Viewelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__VIEWELEMENTS = eINSTANCE.getClassOperationView_Viewelements();

		/**
		 * The meta object literal for the '<em><b>Elementgroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__ELEMENTGROUPS = eINSTANCE.getClassOperationView_Elementgroups();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__LINK = eINSTANCE.getClassOperationView_Link();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__CREATE = eINSTANCE.getClassOperationView_Create();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__READ = eINSTANCE.getClassOperationView_Read();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__UPDATE = eINSTANCE.getClassOperationView_Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__DELETE = eINSTANCE.getClassOperationView_Delete();

		/**
		 * The meta object literal for the '{@link views.impl.ViewElementsImpl <em>View Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewElementsImpl
		 * @see views.impl.ViewsPackageImpl#getViewElements()
		 * @generated
		 */
		EClass VIEW_ELEMENTS = eINSTANCE.getViewElements();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENTS__ELEMENT_ID = eINSTANCE.getViewElements_ElementID();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENTS__LABEL = eINSTANCE.getViewElements_Label();

		/**
		 * The meta object literal for the '<em><b>Visibilitycondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENTS__VISIBILITYCONDITION = eINSTANCE.getViewElements_Visibilitycondition();

		/**
		 * The meta object literal for the '{@link views.impl.PropertyElementsImpl <em>Property Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.PropertyElementsImpl
		 * @see views.impl.ViewsPackageImpl#getPropertyElements()
		 * @generated
		 */
		EClass PROPERTY_ELEMENTS = eINSTANCE.getPropertyElements();

		/**
		 * The meta object literal for the '{@link views.impl.AssociationElementsImpl <em>Association Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.AssociationElementsImpl
		 * @see views.impl.ViewsPackageImpl#getAssociationElements()
		 * @generated
		 */
		EClass ASSOCIATION_ELEMENTS = eINSTANCE.getAssociationElements();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_ELEMENTS__LINK = eINSTANCE.getAssociationElements_Link();

		/**
		 * The meta object literal for the '{@link views.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.TextImpl
		 * @see views.impl.ViewsPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_TYPE = eINSTANCE.getText_TextType();

		/**
		 * The meta object literal for the '{@link views.impl.DateTimePickerImpl <em>Date Time Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DateTimePickerImpl
		 * @see views.impl.ViewsPackageImpl#getDateTimePicker()
		 * @generated
		 */
		EClass DATE_TIME_PICKER = eINSTANCE.getDateTimePicker();

		/**
		 * The meta object literal for the '<em><b>Date Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PICKER__DATE_TYPE = eINSTANCE.getDateTimePicker_DateType();

		/**
		 * The meta object literal for the '{@link views.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.SelectionImpl
		 * @see views.impl.ViewsPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Selectionitems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECTIONITEMS = eINSTANCE.getSelection_Selectionitems();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__TYPE = eINSTANCE.getSelection_Type();

		/**
		 * The meta object literal for the '{@link views.impl.ComparisonConditionsImpl <em>Comparison Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ComparisonConditionsImpl
		 * @see views.impl.ViewsPackageImpl#getComparisonConditions()
		 * @generated
		 */
		EClass COMPARISON_CONDITIONS = eINSTANCE.getComparisonConditions();

		/**
		 * The meta object literal for the '{@link views.impl.CompositeConditionsImpl <em>Composite Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.CompositeConditionsImpl
		 * @see views.impl.ViewsPackageImpl#getCompositeConditions()
		 * @generated
		 */
		EClass COMPOSITE_CONDITIONS = eINSTANCE.getCompositeConditions();

		/**
		 * The meta object literal for the '<em><b>Composite Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITIONS__COMPOSITE_TYPE = eINSTANCE.getCompositeConditions_CompositeType();

		/**
		 * The meta object literal for the '{@link views.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ListImpl
		 * @see views.impl.ViewsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link views.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.CreateImpl
		 * @see views.impl.ViewsPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link views.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ReadImpl
		 * @see views.impl.ViewsPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link views.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DeleteImpl
		 * @see views.impl.ViewsPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link views.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.UpdateImpl
		 * @see views.impl.ViewsPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link views.impl.ElementGroupsImpl <em>Element Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ElementGroupsImpl
		 * @see views.impl.ViewsPackageImpl#getElementGroups()
		 * @generated
		 */
		EClass ELEMENT_GROUPS = eINSTANCE.getElementGroups();

		/**
		 * The meta object literal for the '<em><b>Viewelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUPS__VIEWELEMENTS = eINSTANCE.getElementGroups_Viewelements();

		/**
		 * The meta object literal for the '<em><b>Visibilitycondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUPS__VISIBILITYCONDITION = eINSTANCE.getElementGroups_Visibilitycondition();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUPS__LAYOUT = eINSTANCE.getElementGroups_Layout();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUPS__HEADER = eINSTANCE.getElementGroups_Header();

		/**
		 * The meta object literal for the '{@link views.impl.VisibilityConditionImpl <em>Visibility Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.VisibilityConditionImpl
		 * @see views.impl.ViewsPackageImpl#getVisibilityCondition()
		 * @generated
		 */
		EClass VISIBILITY_CONDITION = eINSTANCE.getVisibilityCondition();

		/**
		 * The meta object literal for the '<em><b>Condition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CONDITION__CONDITION_ID = eINSTANCE.getVisibilityCondition_ConditionID();

		/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CONDITION__CONDITION_TYPE = eINSTANCE.getVisibilityCondition_ConditionType();

		/**
		 * The meta object literal for the '{@link views.impl.SelectionItemsImpl <em>Selection Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.SelectionItemsImpl
		 * @see views.impl.ViewsPackageImpl#getSelectionItems()
		 * @generated
		 */
		EClass SELECTION_ITEMS = eINSTANCE.getSelectionItems();

		/**
		 * The meta object literal for the '{@link views.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.LayoutImpl
		 * @see views.impl.ViewsPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Layout Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__LAYOUT_TYPE = eINSTANCE.getLayout_LayoutType();

		/**
		 * The meta object literal for the '{@link views.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.LinkImpl
		 * @see views.impl.ViewsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LABEL = eINSTANCE.getLink_Label();

		/**
		 * The meta object literal for the '<em><b>Classoperationview</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CLASSOPERATIONVIEW = eINSTANCE.getLink_Classoperationview();

		/**
		 * The meta object literal for the '{@link views.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.TableImpl
		 * @see views.impl.ViewsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link views.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ColumnImpl
		 * @see views.impl.ViewsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link views.impl.ViewModelImpl <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewModelImpl
		 * @see views.impl.ViewsPackageImpl#getViewModel()
		 * @generated
		 */
		EClass VIEW_MODEL = eINSTANCE.getViewModel();

		/**
		 * The meta object literal for the '<em><b>Viewgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__VIEWGROUP = eINSTANCE.getViewModel_Viewgroup();

		/**
		 * The meta object literal for the '{@link views.impl.EnumerationLiteralItemImpl <em>Enumeration Literal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.EnumerationLiteralItemImpl
		 * @see views.impl.ViewsPackageImpl#getEnumerationLiteralItem()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL_ITEM = eINSTANCE.getEnumerationLiteralItem();

		/**
		 * The meta object literal for the '{@link views.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.LongImpl
		 * @see views.impl.ViewsPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link views.impl.ShortImpl <em>Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ShortImpl
		 * @see views.impl.ViewsPackageImpl#getShort()
		 * @generated
		 */
		EClass SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '{@link views.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DomainModelImpl
		 * @see views.impl.ViewsPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__CLASS = eINSTANCE.getDomainModel_Class();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DATATYPE = eINSTANCE.getDomainModel_Datatype();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ENUMERATION = eINSTANCE.getDomainModel_Enumeration();

		/**
		 * The meta object literal for the '{@link views.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ClassImpl
		 * @see views.impl.ViewsPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTY = eINSTANCE.getClass_Property();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPERCLASS = eINSTANCE.getClass_Superclass();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ASSOCIATION = eINSTANCE.getClass_Association();

		/**
		 * The meta object literal for the '{@link views.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.EnumerationImpl
		 * @see views.impl.ViewsPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

		/**
		 * The meta object literal for the '{@link views.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DataTypeImpl
		 * @see views.impl.ViewsPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link views.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.PropertyImpl
		 * @see views.impl.ViewsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOWER_BOUND = eINSTANCE.getProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UPPER_BOUND = eINSTANCE.getProperty_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CLASS = eINSTANCE.getProperty_Class();

		/**
		 * The meta object literal for the '{@link views.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.LiteralImpl
		 * @see views.impl.ViewsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link views.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.AssociationImpl
		 * @see views.impl.ViewsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Associationend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATIONEND = eINSTANCE.getAssociation_Associationend();

		/**
		 * The meta object literal for the '{@link views.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.AssociationEndImpl
		 * @see views.impl.ViewsPackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__CLASS = eINSTANCE.getAssociationEnd_Class();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__NAVIGABLE = eINSTANCE.getAssociationEnd_Navigable();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__COMPOSED = eINSTANCE.getAssociationEnd_Composed();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__LOWER_BOUND = eINSTANCE.getAssociationEnd_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__UPPER_BOUND = eINSTANCE.getAssociationEnd_UpperBound();

		/**
		 * The meta object literal for the '{@link views.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.NamedElementImpl
		 * @see views.impl.ViewsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link views.ComparisonCondition <em>Comparison Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.ComparisonCondition
		 * @see views.impl.ViewsPackageImpl#getComparisonCondition()
		 * @generated
		 */
		EEnum COMPARISON_CONDITION = eINSTANCE.getComparisonCondition();

		/**
		 * The meta object literal for the '{@link views.CompositeConditionsType <em>Composite Conditions Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.CompositeConditionsType
		 * @see views.impl.ViewsPackageImpl#getCompositeConditionsType()
		 * @generated
		 */
		EEnum COMPOSITE_CONDITIONS_TYPE = eINSTANCE.getCompositeConditionsType();

		/**
		 * The meta object literal for the '{@link views.TextType <em>Text Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.TextType
		 * @see views.impl.ViewsPackageImpl#getTextType()
		 * @generated
		 */
		EEnum TEXT_TYPE = eINSTANCE.getTextType();

		/**
		 * The meta object literal for the '{@link views.DateType <em>Date Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.DateType
		 * @see views.impl.ViewsPackageImpl#getDateType()
		 * @generated
		 */
		EEnum DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '{@link views.LayoutType <em>Layout Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.LayoutType
		 * @see views.impl.ViewsPackageImpl#getLayoutType()
		 * @generated
		 */
		EEnum LAYOUT_TYPE = eINSTANCE.getLayoutType();

		/**
		 * The meta object literal for the '{@link views.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.PropertyType
		 * @see views.impl.ViewsPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

	}

} //ViewsPackage
