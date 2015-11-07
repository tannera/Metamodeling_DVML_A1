/**
 */
package views;


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
 * </ul>
 *
 * @see views.ViewsPackage#getCompositeConditions()
 * @model
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

} // CompositeConditions
