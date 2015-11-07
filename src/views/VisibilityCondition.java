/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.VisibilityCondition#getConditionID <em>Condition ID</em>}</li>
 *   <li>{@link views.VisibilityCondition#getConditionType <em>Condition Type</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getVisibilityCondition()
 * @model abstract="true"
 * @generated
 */
public interface VisibilityCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition ID</em>' attribute.
	 * @see #setConditionID(int)
	 * @see views.ViewsPackage#getVisibilityCondition_ConditionID()
	 * @model default="0" id="true" required="true"
	 * @generated
	 */
	int getConditionID();

	/**
	 * Sets the value of the '{@link views.VisibilityCondition#getConditionID <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition ID</em>' attribute.
	 * @see #getConditionID()
	 * @generated
	 */
	void setConditionID(int value);

	/**
	 * Returns the value of the '<em><b>Condition Type</b></em>' attribute.
	 * The default value is <code>"shown"</code>.
	 * The literals are from the enumeration {@link views.ComparisonCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Type</em>' attribute.
	 * @see views.ComparisonCondition
	 * @see #setConditionType(ComparisonCondition)
	 * @see views.ViewsPackage#getVisibilityCondition_ConditionType()
	 * @model default="shown"
	 * @generated
	 */
	ComparisonCondition getConditionType();

	/**
	 * Sets the value of the '{@link views.VisibilityCondition#getConditionType <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Type</em>' attribute.
	 * @see views.ComparisonCondition
	 * @see #getConditionType()
	 * @generated
	 */
	void setConditionType(ComparisonCondition value);

} // VisibilityCondition
