/**
 */
package views;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.AssociationElements#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getAssociationElements()
 * @model abstract="true"
 * @generated
 */
public interface AssociationElements extends ViewElements {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see views.ViewsPackage#getAssociationElements_Link()
	 * @model required="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link views.AssociationElements#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // AssociationElements
