/**
 */
package views.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import views.Association;
import views.AssociationEnd;
import views.ClassIndexView;
import views.Column;
import views.ComparisonCondition;
import views.ComparisonConditions;
import views.ComparisonValue;
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
import views.Property;
import views.PropertyType;
import views.Read;
import views.Selection;
import views.SelectionItems;
import views.Table;
import views.Text;
import views.TextType;
import views.Update;
import views.ViewGroup;
import views.ViewModel;
import views.ViewsFactory;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsFactoryImpl extends EFactoryImpl implements ViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewsFactory init() {
		try {
			ViewsFactory theViewsFactory = (ViewsFactory)EPackage.Registry.INSTANCE.getEFactory(ViewsPackage.eNS_URI);
			if (theViewsFactory != null) {
				return theViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactoryImpl() {
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
			case ViewsPackage.VIEW_GROUP: return createViewGroup();
			case ViewsPackage.CLASS_INDEX_VIEW: return createClassIndexView();
			case ViewsPackage.TEXT: return createText();
			case ViewsPackage.DATE_TIME_PICKER: return createDateTimePicker();
			case ViewsPackage.SELECTION: return createSelection();
			case ViewsPackage.COMPARISON_CONDITIONS: return createComparisonConditions();
			case ViewsPackage.COMPOSITE_CONDITIONS: return createCompositeConditions();
			case ViewsPackage.LIST: return createList();
			case ViewsPackage.CREATE: return createCreate();
			case ViewsPackage.READ: return createRead();
			case ViewsPackage.DELETE: return createDelete();
			case ViewsPackage.UPDATE: return createUpdate();
			case ViewsPackage.ELEMENT_GROUPS: return createElementGroups();
			case ViewsPackage.SELECTION_ITEMS: return createSelectionItems();
			case ViewsPackage.LAYOUT: return createLayout();
			case ViewsPackage.LINK: return createLink();
			case ViewsPackage.TABLE: return createTable();
			case ViewsPackage.COLUMN: return createColumn();
			case ViewsPackage.VIEW_MODEL: return createViewModel();
			case ViewsPackage.ENUMERATION_LITERAL_ITEM: return createEnumerationLiteralItem();
			case ViewsPackage.DOMAIN_MODEL: return createDomainModel();
			case ViewsPackage.CLASS: return createClass();
			case ViewsPackage.ENUMERATION: return createEnumeration();
			case ViewsPackage.DATA_TYPE: return createDataType();
			case ViewsPackage.PROPERTY: return createProperty();
			case ViewsPackage.LITERAL: return createLiteral();
			case ViewsPackage.ASSOCIATION: return createAssociation();
			case ViewsPackage.ASSOCIATION_END: return createAssociationEnd();
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
			case ViewsPackage.COMPARISON_CONDITION:
				return createComparisonConditionFromString(eDataType, initialValue);
			case ViewsPackage.COMPOSITE_CONDITIONS_TYPE:
				return createCompositeConditionsTypeFromString(eDataType, initialValue);
			case ViewsPackage.TEXT_TYPE:
				return createTextTypeFromString(eDataType, initialValue);
			case ViewsPackage.DATE_TYPE:
				return createDateTypeFromString(eDataType, initialValue);
			case ViewsPackage.LAYOUT_TYPE:
				return createLayoutTypeFromString(eDataType, initialValue);
			case ViewsPackage.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case ViewsPackage.COMPARISON_VALUE:
				return createComparisonValueFromString(eDataType, initialValue);
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
			case ViewsPackage.COMPARISON_CONDITION:
				return convertComparisonConditionToString(eDataType, instanceValue);
			case ViewsPackage.COMPOSITE_CONDITIONS_TYPE:
				return convertCompositeConditionsTypeToString(eDataType, instanceValue);
			case ViewsPackage.TEXT_TYPE:
				return convertTextTypeToString(eDataType, instanceValue);
			case ViewsPackage.DATE_TYPE:
				return convertDateTypeToString(eDataType, instanceValue);
			case ViewsPackage.LAYOUT_TYPE:
				return convertLayoutTypeToString(eDataType, instanceValue);
			case ViewsPackage.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case ViewsPackage.COMPARISON_VALUE:
				return convertComparisonValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewGroup createViewGroup() {
		ViewGroupImpl viewGroup = new ViewGroupImpl();
		return viewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassIndexView createClassIndexView() {
		ClassIndexViewImpl classIndexView = new ClassIndexViewImpl();
		return classIndexView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePicker createDateTimePicker() {
		DateTimePickerImpl dateTimePicker = new DateTimePickerImpl();
		return dateTimePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonConditions createComparisonConditions() {
		ComparisonConditionsImpl comparisonConditions = new ComparisonConditionsImpl();
		return comparisonConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditions createCompositeConditions() {
		CompositeConditionsImpl compositeConditions = new CompositeConditionsImpl();
		return compositeConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroups createElementGroups() {
		ElementGroupsImpl elementGroups = new ElementGroupsImpl();
		return elementGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionItems createSelectionItems() {
		SelectionItemsImpl selectionItems = new SelectionItemsImpl();
		return selectionItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModel createViewModel() {
		ViewModelImpl viewModel = new ViewModelImpl();
		return viewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteralItem createEnumerationLiteralItem() {
		EnumerationLiteralItemImpl enumerationLiteralItem = new EnumerationLiteralItemImpl();
		return enumerationLiteralItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public views.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd createAssociationEnd() {
		AssociationEndImpl associationEnd = new AssociationEndImpl();
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCondition createComparisonConditionFromString(EDataType eDataType, String initialValue) {
		ComparisonCondition result = ComparisonCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionsType createCompositeConditionsTypeFromString(EDataType eDataType, String initialValue) {
		CompositeConditionsType result = CompositeConditionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeConditionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType createTextTypeFromString(EDataType eDataType, String initialValue) {
		TextType result = TextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateTypeFromString(EDataType eDataType, String initialValue) {
		DateType result = DateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutType createLayoutTypeFromString(EDataType eDataType, String initialValue) {
		LayoutType result = LayoutType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonValue createComparisonValueFromString(EDataType eDataType, String initialValue) {
		ComparisonValue result = ComparisonValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsPackage getViewsPackage() {
		return (ViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewsPackage getPackage() {
		return ViewsPackage.eINSTANCE;
	}

} //ViewsFactoryImpl
