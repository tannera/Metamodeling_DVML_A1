/**
 */
package views;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link views.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see views.ViewsPackage#getAssociationElements_Link()
	 * @model required="true"
	 * @generated
	 */
	EList<Link> getLink();

} // AssociationElements
