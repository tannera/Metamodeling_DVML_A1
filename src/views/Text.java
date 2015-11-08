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
 *   <li>{@link views.Text#getFormat <em>Format</em>}</li>
 *   <li>{@link views.Text#isIsShort <em>Is Short</em>}</li>
 *   <li>{@link views.Text#isIsLong <em>Is Long</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see views.ViewsPackage#getText_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link views.Text#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Is Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Short</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Short</em>' attribute.
	 * @see #setIsShort(boolean)
	 * @see views.ViewsPackage#getText_IsShort()
	 * @model
	 * @generated
	 */
	boolean isIsShort();

	/**
	 * Sets the value of the '{@link views.Text#isIsShort <em>Is Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Short</em>' attribute.
	 * @see #isIsShort()
	 * @generated
	 */
	void setIsShort(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Long</em>' attribute.
	 * @see #setIsLong(boolean)
	 * @see views.ViewsPackage#getText_IsLong()
	 * @model
	 * @generated
	 */
	boolean isIsLong();

	/**
	 * Sets the value of the '{@link views.Text#isIsLong <em>Is Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Long</em>' attribute.
	 * @see #isIsLong()
	 * @generated
	 */
	void setIsLong(boolean value);

} // Text
