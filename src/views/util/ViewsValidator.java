/**
 */
package views.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import views.Association;
import views.AssociationElements;
import views.AssociationEnd;
import views.ClassIndexView;
import views.ClassOperationView;
import views.Column;
import views.ComparisonCondition;
import views.ComparisonConditions;
import views.CompositeConditions;
import views.CompositeConditionsType;
import views.Create;
import views.DataType;
import views.DateTimePicker;
import views.DateType;
import views.Delete;
import views.DomainModel;
import views.ElementGroups;
import views.Enumeration;
import views.EnumerationLiteralItem;
import views.Layout;
import views.LayoutType;
import views.Link;
import views.List;
import views.Literal;
import views.NamedElement;
import views.Property;
import views.PropertyElements;
import views.PropertyType;
import views.Read;
import views.Selection;
import views.SelectionItems;
import views.Table;
import views.Text;
import views.TextType;
import views.Update;
import views.View;
import views.ViewElements;
import views.ViewGroup;
import views.ViewModel;
import views.ViewsPackage;
import views.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see views.ViewsPackage
 * @generated
 */
public class ViewsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ViewsValidator INSTANCE = new ViewsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "views";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ViewsPackage.eINSTANCE;
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
			case ViewsPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case ViewsPackage.VIEW_GROUP:
				return validateViewGroup((ViewGroup)value, diagnostics, context);
			case ViewsPackage.CLASS_INDEX_VIEW:
				return validateClassIndexView((ClassIndexView)value, diagnostics, context);
			case ViewsPackage.CLASS_OPERATION_VIEW:
				return validateClassOperationView((ClassOperationView)value, diagnostics, context);
			case ViewsPackage.VIEW_ELEMENTS:
				return validateViewElements((ViewElements)value, diagnostics, context);
			case ViewsPackage.PROPERTY_ELEMENTS:
				return validatePropertyElements((PropertyElements)value, diagnostics, context);
			case ViewsPackage.ASSOCIATION_ELEMENTS:
				return validateAssociationElements((AssociationElements)value, diagnostics, context);
			case ViewsPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case ViewsPackage.DATE_TIME_PICKER:
				return validateDateTimePicker((DateTimePicker)value, diagnostics, context);
			case ViewsPackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case ViewsPackage.COMPARISON_CONDITIONS:
				return validateComparisonConditions((ComparisonConditions)value, diagnostics, context);
			case ViewsPackage.COMPOSITE_CONDITIONS:
				return validateCompositeConditions((CompositeConditions)value, diagnostics, context);
			case ViewsPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case ViewsPackage.CREATE:
				return validateCreate((Create)value, diagnostics, context);
			case ViewsPackage.READ:
				return validateRead((Read)value, diagnostics, context);
			case ViewsPackage.DELETE:
				return validateDelete((Delete)value, diagnostics, context);
			case ViewsPackage.UPDATE:
				return validateUpdate((Update)value, diagnostics, context);
			case ViewsPackage.ELEMENT_GROUPS:
				return validateElementGroups((ElementGroups)value, diagnostics, context);
			case ViewsPackage.VISIBILITY_CONDITION:
				return validateVisibilityCondition((VisibilityCondition)value, diagnostics, context);
			case ViewsPackage.SELECTION_ITEMS:
				return validateSelectionItems((SelectionItems)value, diagnostics, context);
			case ViewsPackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			case ViewsPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case ViewsPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case ViewsPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case ViewsPackage.VIEW_MODEL:
				return validateViewModel((ViewModel)value, diagnostics, context);
			case ViewsPackage.ENUMERATION_LITERAL_ITEM:
				return validateEnumerationLiteralItem((EnumerationLiteralItem)value, diagnostics, context);
			case ViewsPackage.LONG:
				return validateLong((views.Long)value, diagnostics, context);
			case ViewsPackage.SHORT:
				return validateShort((views.Short)value, diagnostics, context);
			case ViewsPackage.DOMAIN_MODEL:
				return validateDomainModel((DomainModel)value, diagnostics, context);
			case ViewsPackage.CLASS:
				return validateClass((views.Class)value, diagnostics, context);
			case ViewsPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case ViewsPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case ViewsPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ViewsPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case ViewsPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case ViewsPackage.ASSOCIATION_END:
				return validateAssociationEnd((AssociationEnd)value, diagnostics, context);
			case ViewsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case ViewsPackage.COMPARISON_CONDITION:
				return validateComparisonCondition((ComparisonCondition)value, diagnostics, context);
			case ViewsPackage.COMPOSITE_CONDITIONS_TYPE:
				return validateCompositeConditionsType((CompositeConditionsType)value, diagnostics, context);
			case ViewsPackage.TEXT_TYPE:
				return validateTextType((TextType)value, diagnostics, context);
			case ViewsPackage.DATE_TYPE:
				return validateDateType((DateType)value, diagnostics, context);
			case ViewsPackage.LAYOUT_TYPE:
				return validateLayoutType((LayoutType)value, diagnostics, context);
			case ViewsPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(view, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_FirstLetterInViewTitleIsUpperCase(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_NameInViewIsNotEmpty(view, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FirstLetterInViewTitleIsUpperCase constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW__FIRST_LETTER_IN_VIEW_TITLE_IS_UPPER_CASE__EEXPRESSION = "self.name.at(1).matches('[A-Z]')";

	/**
	 * Validates the FirstLetterInViewTitleIsUpperCase constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView_FirstLetterInViewTitleIsUpperCase(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW,
				 view,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FirstLetterInViewTitleIsUpperCase",
				 VIEW__FIRST_LETTER_IN_VIEW_TITLE_IS_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NameInViewIsNotEmpty constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW__NAME_IN_VIEW_IS_NOT_EMPTY__EEXPRESSION = "self.name.size() <> 0";

	/**
	 * Validates the NameInViewIsNotEmpty constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView_NameInViewIsNotEmpty(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW,
				 view,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameInViewIsNotEmpty",
				 VIEW__NAME_IN_VIEW_IS_NOT_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewGroup_ExactlyOneWelcomeViewGroupExists(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewGroup_FirstLetterInViewGroupIsUpperCase(viewGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ExactlyOneWelcomeViewGroupExists constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW_GROUP__EXACTLY_ONE_WELCOME_VIEW_GROUP_EXISTS__EEXPRESSION = "ViewGroup.allInstances() -> select(f | f.welcomeViewGroup = true) -> size() = 1";

	/**
	 * Validates the ExactlyOneWelcomeViewGroupExists constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup_ExactlyOneWelcomeViewGroupExists(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW_GROUP,
				 viewGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExactlyOneWelcomeViewGroupExists",
				 VIEW_GROUP__EXACTLY_ONE_WELCOME_VIEW_GROUP_EXISTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FirstLetterInViewGroupIsUpperCase constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW_GROUP__FIRST_LETTER_IN_VIEW_GROUP_IS_UPPER_CASE__EEXPRESSION = "self.name.at(1).matches('[A-Z]')";

	/**
	 * Validates the FirstLetterInViewGroupIsUpperCase constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup_FirstLetterInViewGroupIsUpperCase(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW_GROUP,
				 viewGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FirstLetterInViewGroupIsUpperCase",
				 VIEW_GROUP__FIRST_LETTER_IN_VIEW_GROUP_IS_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassIndexView(ClassIndexView classIndexView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classIndexView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_FirstLetterInViewTitleIsUpperCase(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_NameInViewIsNotEmpty(classIndexView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperationView(ClassOperationView classOperationView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classOperationView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_FirstLetterInViewTitleIsUpperCase(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_NameInViewIsNotEmpty(classOperationView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewElements(ViewElements viewElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyElements(PropertyElements propertyElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationElements(AssociationElements associationElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePicker(DateTimePicker dateTimePicker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimePicker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonConditions(ComparisonConditions comparisonConditions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonConditions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeConditions(CompositeConditions compositeConditions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeConditions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(create, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRead(Read read, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(read, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdate(Update update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(update, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementGroups(ElementGroups elementGroups, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementGroups, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityCondition(VisibilityCondition visibilityCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visibilityCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionItems(SelectionItems selectionItems, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionItems, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewModel(ViewModel viewModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteralItem(EnumerationLiteralItem enumerationLiteralItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteralItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(views.Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShort(views.Short short_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(short_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(class_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(association, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnd(AssociationEnd associationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonCondition(ComparisonCondition comparisonCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeConditionsType(CompositeConditionsType compositeConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextType(TextType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(DateType dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutType(LayoutType layoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ViewsValidator
