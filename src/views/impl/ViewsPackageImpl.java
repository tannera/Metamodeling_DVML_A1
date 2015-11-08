/**
 */
package views.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import views.Association;
import views.AssociationElements;
import views.AssociationEnd;
import views.ClassIndexView;
import views.ClassOperationView;
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
import views.ViewsFactory;
import views.ViewsPackage;
import views.VisibilityCondition;

import views.util.ViewsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classIndexViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOperationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimePickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeConditionsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonValueEEnum = null;

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
	 * @see views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited) return (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewsPackage.createPackageContents();

		// Initialize created meta-data
		theViewsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theViewsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ViewsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Header() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Description() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_StartView() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewGroup() {
		return viewGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewGroup_Name() {
		return (EAttribute)viewGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewGroup_Views() {
		return (EReference)viewGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewGroup_WelcomeViewGroup() {
		return (EAttribute)viewGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassIndexView() {
		return classIndexViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassIndexView_Link() {
		return (EReference)classIndexViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperationView() {
		return classOperationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperationView_Viewelements() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperationView_Elementgroups() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperationView_Link() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperationView_Layout() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElements() {
		return viewElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElements_ElementID() {
		return (EAttribute)viewElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElements_Label() {
		return (EAttribute)viewElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElements_Visibilitycondition() {
		return (EReference)viewElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyElements() {
		return propertyElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationElements() {
		return associationElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationElements_Link() {
		return (EReference)associationElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_TextType() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Format() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_IsShort() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_IsLong() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimePicker() {
		return dateTimePickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimePicker_DateType() {
		return (EAttribute)dateTimePickerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimePicker_Format() {
		return (EAttribute)dateTimePickerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Selectionitems() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Type() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonConditions() {
		return comparisonConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonConditions_Value() {
		return (EAttribute)comparisonConditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonConditions_Comparison() {
		return (EAttribute)comparisonConditionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonConditions_Viewelements() {
		return (EReference)comparisonConditionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeConditions() {
		return compositeConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeConditions_CompositeType() {
		return (EAttribute)compositeConditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeConditions_Visibilitycondition() {
		return (EReference)compositeConditionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRead() {
		return readEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementGroups() {
		return elementGroupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroups_Viewelements() {
		return (EReference)elementGroupsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroups_Visibilitycondition() {
		return (EReference)elementGroupsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroups_Layout() {
		return (EReference)elementGroupsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroups_Header() {
		return (EAttribute)elementGroupsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityCondition() {
		return visibilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityCondition_ConditionID() {
		return (EAttribute)visibilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityCondition_ConditionType() {
		return (EAttribute)visibilityConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionItems() {
		return selectionItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionItems_SelectionValue() {
		return (EAttribute)selectionItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_LayoutType() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Label() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Classoperationview() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModel() {
		return viewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModel_Viewgroup() {
		return (EReference)viewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteralItem() {
		return enumerationLiteralItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Class() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Datatype() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Enumeration() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Property() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Superclass() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Association() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literal() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_LowerBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_UpperBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Class() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsID() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Associationend() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEnd() {
		return associationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEnd_Class() {
		return (EReference)associationEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_Navigable() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_Composed() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_LowerBound() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_UpperBound() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonCondition() {
		return comparisonConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositeConditionsType() {
		return compositeConditionsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextType() {
		return textTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateType() {
		return dateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutType() {
		return layoutTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonValue() {
		return comparisonValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory)getEFactoryInstance();
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
		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEAttribute(viewEClass, VIEW__HEADER);
		createEAttribute(viewEClass, VIEW__DESCRIPTION);
		createEAttribute(viewEClass, VIEW__START_VIEW);

		viewGroupEClass = createEClass(VIEW_GROUP);
		createEAttribute(viewGroupEClass, VIEW_GROUP__NAME);
		createEReference(viewGroupEClass, VIEW_GROUP__VIEWS);
		createEAttribute(viewGroupEClass, VIEW_GROUP__WELCOME_VIEW_GROUP);

		classIndexViewEClass = createEClass(CLASS_INDEX_VIEW);
		createEReference(classIndexViewEClass, CLASS_INDEX_VIEW__LINK);

		classOperationViewEClass = createEClass(CLASS_OPERATION_VIEW);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__VIEWELEMENTS);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__ELEMENTGROUPS);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__LINK);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__LAYOUT);

		viewElementsEClass = createEClass(VIEW_ELEMENTS);
		createEAttribute(viewElementsEClass, VIEW_ELEMENTS__ELEMENT_ID);
		createEAttribute(viewElementsEClass, VIEW_ELEMENTS__LABEL);
		createEReference(viewElementsEClass, VIEW_ELEMENTS__VISIBILITYCONDITION);

		propertyElementsEClass = createEClass(PROPERTY_ELEMENTS);

		associationElementsEClass = createEClass(ASSOCIATION_ELEMENTS);
		createEReference(associationElementsEClass, ASSOCIATION_ELEMENTS__LINK);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT_TYPE);
		createEAttribute(textEClass, TEXT__FORMAT);
		createEAttribute(textEClass, TEXT__IS_SHORT);
		createEAttribute(textEClass, TEXT__IS_LONG);

		dateTimePickerEClass = createEClass(DATE_TIME_PICKER);
		createEAttribute(dateTimePickerEClass, DATE_TIME_PICKER__DATE_TYPE);
		createEAttribute(dateTimePickerEClass, DATE_TIME_PICKER__FORMAT);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__SELECTIONITEMS);
		createEAttribute(selectionEClass, SELECTION__TYPE);

		comparisonConditionsEClass = createEClass(COMPARISON_CONDITIONS);
		createEAttribute(comparisonConditionsEClass, COMPARISON_CONDITIONS__VALUE);
		createEAttribute(comparisonConditionsEClass, COMPARISON_CONDITIONS__COMPARISON);
		createEReference(comparisonConditionsEClass, COMPARISON_CONDITIONS__VIEWELEMENTS);

		compositeConditionsEClass = createEClass(COMPOSITE_CONDITIONS);
		createEAttribute(compositeConditionsEClass, COMPOSITE_CONDITIONS__COMPOSITE_TYPE);
		createEReference(compositeConditionsEClass, COMPOSITE_CONDITIONS__VISIBILITYCONDITION);

		listEClass = createEClass(LIST);

		createEClass = createEClass(CREATE);

		readEClass = createEClass(READ);

		deleteEClass = createEClass(DELETE);

		updateEClass = createEClass(UPDATE);

		elementGroupsEClass = createEClass(ELEMENT_GROUPS);
		createEReference(elementGroupsEClass, ELEMENT_GROUPS__VIEWELEMENTS);
		createEReference(elementGroupsEClass, ELEMENT_GROUPS__VISIBILITYCONDITION);
		createEReference(elementGroupsEClass, ELEMENT_GROUPS__LAYOUT);
		createEAttribute(elementGroupsEClass, ELEMENT_GROUPS__HEADER);

		visibilityConditionEClass = createEClass(VISIBILITY_CONDITION);
		createEAttribute(visibilityConditionEClass, VISIBILITY_CONDITION__CONDITION_ID);
		createEAttribute(visibilityConditionEClass, VISIBILITY_CONDITION__CONDITION_TYPE);

		selectionItemsEClass = createEClass(SELECTION_ITEMS);
		createEAttribute(selectionItemsEClass, SELECTION_ITEMS__SELECTION_VALUE);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__LAYOUT_TYPE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__LABEL);
		createEReference(linkEClass, LINK__CLASSOPERATIONVIEW);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);

		columnEClass = createEClass(COLUMN);

		viewModelEClass = createEClass(VIEW_MODEL);
		createEReference(viewModelEClass, VIEW_MODEL__VIEWGROUP);

		enumerationLiteralItemEClass = createEClass(ENUMERATION_LITERAL_ITEM);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__CLASS);
		createEReference(domainModelEClass, DOMAIN_MODEL__DATATYPE);
		createEReference(domainModelEClass, DOMAIN_MODEL__ENUMERATION);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__PROPERTY);
		createEReference(classEClass, CLASS__SUPERCLASS);
		createEReference(classEClass, CLASS__ASSOCIATION);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERAL);

		dataTypeEClass = createEClass(DATA_TYPE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__LOWER_BOUND);
		createEAttribute(propertyEClass, PROPERTY__UPPER_BOUND);
		createEReference(propertyEClass, PROPERTY__CLASS);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__VALUE);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATIONEND);

		associationEndEClass = createEClass(ASSOCIATION_END);
		createEReference(associationEndEClass, ASSOCIATION_END__CLASS);
		createEAttribute(associationEndEClass, ASSOCIATION_END__NAVIGABLE);
		createEAttribute(associationEndEClass, ASSOCIATION_END__COMPOSED);
		createEAttribute(associationEndEClass, ASSOCIATION_END__LOWER_BOUND);
		createEAttribute(associationEndEClass, ASSOCIATION_END__UPPER_BOUND);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		comparisonConditionEEnum = createEEnum(COMPARISON_CONDITION);
		compositeConditionsTypeEEnum = createEEnum(COMPOSITE_CONDITIONS_TYPE);
		textTypeEEnum = createEEnum(TEXT_TYPE);
		dateTypeEEnum = createEEnum(DATE_TYPE);
		layoutTypeEEnum = createEEnum(LAYOUT_TYPE);
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
		comparisonValueEEnum = createEEnum(COMPARISON_VALUE);
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
		classIndexViewEClass.getESuperTypes().add(this.getView());
		classOperationViewEClass.getESuperTypes().add(this.getView());
		propertyElementsEClass.getESuperTypes().add(this.getViewElements());
		associationElementsEClass.getESuperTypes().add(this.getViewElements());
		textEClass.getESuperTypes().add(this.getPropertyElements());
		dateTimePickerEClass.getESuperTypes().add(this.getPropertyElements());
		selectionEClass.getESuperTypes().add(this.getPropertyElements());
		comparisonConditionsEClass.getESuperTypes().add(this.getVisibilityCondition());
		compositeConditionsEClass.getESuperTypes().add(this.getVisibilityCondition());
		listEClass.getESuperTypes().add(this.getAssociationElements());
		createEClass.getESuperTypes().add(this.getClassOperationView());
		readEClass.getESuperTypes().add(this.getClassOperationView());
		deleteEClass.getESuperTypes().add(this.getClassOperationView());
		updateEClass.getESuperTypes().add(this.getClassOperationView());
		tableEClass.getESuperTypes().add(this.getAssociationElements());
		enumerationLiteralItemEClass.getESuperTypes().add(this.getSelectionItems());
		classEClass.getESuperTypes().add(this.getNamedElement());
		enumerationEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getNamedElement());
		propertyEClass.getESuperTypes().add(this.getNamedElement());
		literalEClass.getESuperTypes().add(this.getNamedElement());
		associationEClass.getESuperTypes().add(this.getNamedElement());
		associationEndEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Header(), ecorePackage.getEString(), "header", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Description(), ecorePackage.getEString(), "description", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_StartView(), ecorePackage.getEBoolean(), "startView", "false", 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewGroupEClass, ViewGroup.class, "ViewGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewGroup_Views(), this.getView(), null, "views", null, 0, -1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewGroup_WelcomeViewGroup(), ecorePackage.getEBoolean(), "welcomeViewGroup", "false", 0, 1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classIndexViewEClass, ClassIndexView.class, "ClassIndexView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassIndexView_Link(), this.getLink(), null, "link", null, 0, -1, ClassIndexView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classOperationViewEClass, ClassOperationView.class, "ClassOperationView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperationView_Viewelements(), this.getViewElements(), null, "viewelements", null, 0, -1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassOperationView_Elementgroups(), this.getElementGroups(), null, "elementgroups", null, 0, -1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassOperationView_Link(), this.getLink(), this.getLink_Classoperationview(), "link", null, 0, -1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassOperationView_Layout(), this.getLayout(), null, "layout", null, 1, 1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewElementsEClass, ViewElements.class, "ViewElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewElements_ElementID(), ecorePackage.getEString(), "elementID", null, 1, 1, ViewElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElements_Label(), ecorePackage.getEString(), "label", null, 1, 1, ViewElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElements_Visibilitycondition(), this.getVisibilityCondition(), null, "visibilitycondition", null, 0, 1, ViewElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyElementsEClass, PropertyElements.class, "PropertyElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationElementsEClass, AssociationElements.class, "AssociationElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationElements_Link(), this.getLink(), null, "link", null, 1, 1, AssociationElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_TextType(), this.getTextType(), "textType", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Format(), ecorePackage.getEString(), "format", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_IsShort(), ecorePackage.getEBoolean(), "isShort", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_IsLong(), ecorePackage.getEBoolean(), "isLong", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimePickerEClass, DateTimePicker.class, "DateTimePicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimePicker_DateType(), this.getDateType(), "dateType", null, 1, 1, DateTimePicker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimePicker_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateTimePicker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_Selectionitems(), this.getSelectionItems(), null, "selectionitems", null, 1, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Type(), this.getTextType(), "type", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonConditionsEClass, ComparisonConditions.class, "ComparisonConditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonConditions_Value(), ecorePackage.getEString(), "value", null, 1, 1, ComparisonConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonConditions_Comparison(), this.getComparisonValue(), "comparison", null, 0, 1, ComparisonConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonConditions_Viewelements(), this.getViewElements(), null, "viewelements", null, 0, 1, ComparisonConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeConditionsEClass, CompositeConditions.class, "CompositeConditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeConditions_CompositeType(), this.getCompositeConditionsType(), "compositeType", "AND", 0, 1, CompositeConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeConditions_Visibilitycondition(), this.getVisibilityCondition(), null, "visibilitycondition", null, 2, 2, CompositeConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementGroupsEClass, ElementGroups.class, "ElementGroups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementGroups_Viewelements(), this.getViewElements(), null, "viewelements", null, 0, -1, ElementGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroups_Visibilitycondition(), this.getVisibilityCondition(), null, "visibilitycondition", null, 0, 1, ElementGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroups_Layout(), this.getLayout(), null, "layout", null, 1, 1, ElementGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementGroups_Header(), ecorePackage.getEString(), "header", null, 0, 1, ElementGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityConditionEClass, VisibilityCondition.class, "VisibilityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityCondition_ConditionID(), ecorePackage.getEInt(), "conditionID", "0", 1, 1, VisibilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityCondition_ConditionType(), this.getComparisonCondition(), "conditionType", "shown", 0, 1, VisibilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionItemsEClass, SelectionItems.class, "SelectionItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionItems_SelectionValue(), ecorePackage.getEString(), "SelectionValue", null, 0, 1, SelectionItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_LayoutType(), this.getLayoutType(), "layoutType", "HORIZONTAL", 1, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Label(), ecorePackage.getEString(), "label", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Classoperationview(), this.getClassOperationView(), this.getClassOperationView_Link(), "classoperationview", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 1, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewModelEClass, ViewModel.class, "ViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewModel_Viewgroup(), this.getViewGroup(), null, "viewgroup", null, 0, -1, ViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralItemEClass, EnumerationLiteralItem.class, "EnumerationLiteralItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_Class(), this.getClass_(), null, "class", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Datatype(), this.getDataType(), null, "datatype", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Enumeration(), this.getEnumeration(), null, "enumeration", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, views.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Property(), this.getProperty(), null, "property", null, 1, -1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Superclass(), this.getClass_(), null, "superclass", null, 0, 1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Association(), this.getAssociation(), null, "association", null, 0, -1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literal(), this.getLiteral(), null, "literal", null, 1, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Type(), this.getPropertyType(), "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_LowerBound(), ecorePackage.getEInt(), "LowerBound", "0", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_UpperBound(), ecorePackage.getEInt(), "UpperBound", "1", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Class(), this.getClass_(), null, "class", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsID(), ecorePackage.getEBoolean(), "isID", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Associationend(), this.getAssociationEnd(), null, "associationend", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationEnd_Class(), this.getClass_(), null, "class", null, 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_Navigable(), ecorePackage.getEBoolean(), "navigable", "false", 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_Composed(), ecorePackage.getEBoolean(), "Composed", "false", 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_LowerBound(), theXMLTypePackage.getInt(), "LowerBound", "0", 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_UpperBound(), theXMLTypePackage.getInt(), "UpperBound", "1", 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonConditionEEnum, ComparisonCondition.class, "ComparisonCondition");
		addEEnumLiteral(comparisonConditionEEnum, ComparisonCondition.HIDDEN);
		addEEnumLiteral(comparisonConditionEEnum, ComparisonCondition.SHOWN);
		addEEnumLiteral(comparisonConditionEEnum, ComparisonCondition.ENABLED);
		addEEnumLiteral(comparisonConditionEEnum, ComparisonCondition.DISABLED);
		addEEnumLiteral(comparisonConditionEEnum, ComparisonCondition.NONE);

		initEEnum(compositeConditionsTypeEEnum, CompositeConditionsType.class, "CompositeConditionsType");
		addEEnumLiteral(compositeConditionsTypeEEnum, CompositeConditionsType.AND);
		addEEnumLiteral(compositeConditionsTypeEEnum, CompositeConditionsType.OR);

		initEEnum(textTypeEEnum, TextType.class, "TextType");
		addEEnumLiteral(textTypeEEnum, TextType.USER_DEFINED_DATA_TYPE);
		addEEnumLiteral(textTypeEEnum, TextType.ENUMERATION);

		initEEnum(dateTypeEEnum, DateType.class, "DateType");
		addEEnumLiteral(dateTypeEEnum, DateType.DATE);
		addEEnumLiteral(dateTypeEEnum, DateType.TIME);
		addEEnumLiteral(dateTypeEEnum, DateType.DATETIME);

		initEEnum(layoutTypeEEnum, LayoutType.class, "LayoutType");
		addEEnumLiteral(layoutTypeEEnum, LayoutType.HORIZONTAL);
		addEEnumLiteral(layoutTypeEEnum, LayoutType.VERTICAL);

		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
		addEEnumLiteral(propertyTypeEEnum, PropertyType.CLASS);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.DATA_TYPE);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.ENUMERATION);

		initEEnum(comparisonValueEEnum, ComparisonValue.class, "ComparisonValue");
		addEEnumLiteral(comparisonValueEEnum, ComparisonValue.EQUALS);
		addEEnumLiteral(comparisonValueEEnum, ComparisonValue.LESS_THAN);
		addEEnumLiteral(comparisonValueEEnum, ComparisonValue.GREATER_THAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "ecore.xml.type", "http://www.eclipse.org/emf/2003/XMLType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (viewEClass, 
		   source, 
		   new String[] {
			 "constraints", "FirstLetterInViewTitleIsUpperCase NameInViewIsNotEmpty"
		   });	
		addAnnotation
		  (viewGroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "ExactlyOneWelcomeViewGroupExists FirstLetterInViewGroupIsUpperCase"
		   });	
		addAnnotation
		  (viewElementsEClass, 
		   source, 
		   new String[] {
			 "constraints", "ElementIDIsUnique"
		   });	
		addAnnotation
		  (compositeConditionsEClass, 
		   source, 
		   new String[] {
			 "constraints", "ComposedConditionTypesAreEqual"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "ClassNotInheritSelf ExactlyOneClassID"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "LowerBoundMaxOne LowerBoundMinZero UpperBoundEqualsOne ClassPropertyTypeIsValid"
		   });	
		addAnnotation
		  (associationEndEClass, 
		   source, 
		   new String[] {
			 "constraints", "associationEndUpperGreaterThanLower"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (viewEClass, 
		   source, 
		   new String[] {
			 "FirstLetterInViewTitleIsUpperCase", "self.name.at(1).matches(\'[A-Z]\')",
			 "NameInViewIsNotEmpty", "self.name.size() <> 0"
		   });	
		addAnnotation
		  (viewGroupEClass, 
		   source, 
		   new String[] {
			 "ExactlyOneWelcomeViewGroupExists", "ViewGroup.allInstances() -> select(f | f.welcomeViewGroup = true) -> size() = 1",
			 "FirstLetterInViewGroupIsUpperCase", "self.name.at(1).matches(\'[A-Z]\')"
		   });	
		addAnnotation
		  (viewElementsEClass, 
		   source, 
		   new String[] {
			 "ElementIDIsUnique", "ViewElements.allInstances() -> select(n | n.elementID = self.elementID) ->excluding(self) ->isEmpty()"
		   });	
		addAnnotation
		  (compositeConditionsEClass, 
		   source, 
		   new String[] {
			 "ComposedConditionTypesAreEqual", "self.visibilitycondition -> forAll(c | c.conditionType = self.conditionType)"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "ClassNotInheritSelf", "self.superclass->excludes(self)",
			 "ExactlyOneClassID", " (self.Property -> select(k | k.isID=true)-> size() = 1) or (self.superclass -> size() > 0)"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "LowerBoundMaxOne", "self.LowerBound <= 1",
			 "LowerBoundMinZero", "self.LowerBound >= 0",
			 "UpperBoundEqualsOne", "self.UpperBound = 1",
			 "ClassPropertyTypeIsValid", "self.type = PropertyType::DataType or self.type = PropertyType::Enumeration"
		   });	
		addAnnotation
		  (associationEndEClass, 
		   source, 
		   new String[] {
			 "associationEndUpperGreaterThanLower", "self.LowerBound <= self.UpperBound or self.UpperBound = -1 and (self.LowerBound >= 0 and self.UpperBound > 0 or self.UpperBound = -1)"
		   });
	}

} //ViewsPackageImpl
