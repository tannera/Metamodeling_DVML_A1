/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Text#getTextType <em>Text Type</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getText()
 * @model
 * @generated
 */
public interface Text extends PropertyElements {
	/**
	 * Returns the value of the '<em><b>Text Type</b></em>' attribute.
	 * The literals are from the enumeration {@link views.TextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Type</em>' attribute.
	 * @see views.TextType
	 * @see #setTextType(TextType)
	 * @see views.ViewsPackage#getText_TextType()
	 * @model required="true"
	 * @generated
	 */
	TextType getTextType();

	/**
	 * Sets the value of the '{@link views.Text#getTextType <em>Text Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Type</em>' attribute.
	 * @see views.TextType
	 * @see #getTextType()
	 * @generated
	 */
	void setTextType(TextType value);

} // Text
