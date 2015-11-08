/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ComparisonConditions#getValue <em>Value</em>}</li>
 *   <li>{@link views.ComparisonConditions#getComparison <em>Comparison</em>}</li>
 *   <li>{@link views.ComparisonConditions#getViewelements <em>Viewelements</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getComparisonConditions()
 * @model
 * @generated
 */
public interface ComparisonConditions extends VisibilityCondition {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see views.ViewsPackage#getComparisonConditions_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link views.ComparisonConditions#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link views.ComparisonValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see views.ComparisonValue
	 * @see #setComparison(ComparisonValue)
	 * @see views.ViewsPackage#getComparisonConditions_Comparison()
	 * @model
	 * @generated
	 */
	ComparisonValue getComparison();

	/**
	 * Sets the value of the '{@link views.ComparisonConditions#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see views.ComparisonValue
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(ComparisonValue value);

	/**
	 * Returns the value of the '<em><b>Viewelements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewelements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewelements</em>' reference.
	 * @see #setViewelements(ViewElements)
	 * @see views.ViewsPackage#getComparisonConditions_Viewelements()
	 * @model
	 * @generated
	 */
	ViewElements getViewelements();

	/**
	 * Sets the value of the '{@link views.ComparisonConditions#getViewelements <em>Viewelements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewelements</em>' reference.
	 * @see #getViewelements()
	 * @generated
	 */
	void setViewelements(ViewElements value);
} // ComparisonConditions
