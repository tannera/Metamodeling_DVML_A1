/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Selection#getSelectionitems <em>Selectionitems</em>}</li>
 *   <li>{@link views.Selection#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends PropertyElements {
	/**
	 * Returns the value of the '<em><b>Selectionitems</b></em>' containment reference list.
	 * The list contents are of type {@link views.SelectionItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectionitems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectionitems</em>' containment reference list.
	 * @see views.ViewsPackage#getSelection_Selectionitems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SelectionItems> getSelectionitems();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link views.TextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see views.TextType
	 * @see #setType(TextType)
	 * @see views.ViewsPackage#getSelection_Type()
	 * @model required="true"
	 * @generated
	 */
	TextType getType();

	/**
	 * Sets the value of the '{@link views.Selection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see views.TextType
	 * @see #getType()
	 * @generated
	 */
	void setType(TextType value);

} // Selection
