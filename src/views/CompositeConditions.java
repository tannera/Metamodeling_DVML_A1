/**
 */
package views;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.CompositeConditions#getCompositeType <em>Composite Type</em>}</li>
 *   <li>{@link views.CompositeConditions#getVisibilitycondition <em>Visibilitycondition</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getCompositeConditions()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComposedConditionTypesAreEqual'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ComposedConditionTypesAreEqual='self.visibilitycondition -> forAll(c | c.conditionType = self.conditionType)'"
 * @generated
 */
public interface CompositeConditions extends VisibilityCondition {
	/**
	 * Returns the value of the '<em><b>Composite Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link views.CompositeConditionsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Type</em>' attribute.
	 * @see views.CompositeConditionsType
	 * @see #setCompositeType(CompositeConditionsType)
	 * @see views.ViewsPackage#getCompositeConditions_CompositeType()
	 * @model default="AND"
	 * @generated
	 */
	CompositeConditionsType getCompositeType();

	/**
	 * Sets the value of the '{@link views.CompositeConditions#getCompositeType <em>Composite Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Type</em>' attribute.
	 * @see views.CompositeConditionsType
	 * @see #getCompositeType()
	 * @generated
	 */
	void setCompositeType(CompositeConditionsType value);

	/**
	 * Returns the value of the '<em><b>Visibilitycondition</b></em>' containment reference list.
	 * The list contents are of type {@link views.VisibilityCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilitycondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilitycondition</em>' containment reference list.
	 * @see views.ViewsPackage#getCompositeConditions_Visibilitycondition()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<VisibilityCondition> getVisibilitycondition();

} // CompositeConditions
