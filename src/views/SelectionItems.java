/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.SelectionItems#getSelectionValue <em>Selection Value</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getSelectionItems()
 * @model
 * @generated
 */
public interface SelectionItems extends EObject {

	/**
	 * Returns the value of the '<em><b>Selection Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Value</em>' attribute.
	 * @see #setSelectionValue(String)
	 * @see views.ViewsPackage#getSelectionItems_SelectionValue()
	 * @model
	 * @generated
	 */
	String getSelectionValue();

	/**
	 * Sets the value of the '{@link views.SelectionItems#getSelectionValue <em>Selection Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Value</em>' attribute.
	 * @see #getSelectionValue()
	 * @generated
	 */
	void setSelectionValue(String value);
} // SelectionItems
