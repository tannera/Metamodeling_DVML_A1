/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Picker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.DateTimePicker#getDateType <em>Date Type</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getDateTimePicker()
 * @model
 * @generated
 */
public interface DateTimePicker extends PropertyElements {
	/**
	 * Returns the value of the '<em><b>Date Type</b></em>' attribute.
	 * The literals are from the enumeration {@link views.DateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Type</em>' attribute.
	 * @see views.DateType
	 * @see #setDateType(DateType)
	 * @see views.ViewsPackage#getDateTimePicker_DateType()
	 * @model required="true"
	 * @generated
	 */
	DateType getDateType();

	/**
	 * Sets the value of the '{@link views.DateTimePicker#getDateType <em>Date Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Type</em>' attribute.
	 * @see views.DateType
	 * @see #getDateType()
	 * @generated
	 */
	void setDateType(DateType value);

} // DateTimePicker
