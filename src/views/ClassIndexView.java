/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Index View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ClassIndexView#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getClassIndexView()
 * @model
 * @generated
 */
public interface ClassIndexView extends View {
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
	 * @see views.ViewsPackage#getClassIndexView_Link()
	 * @model
	 * @generated
	 */
	EList<Link> getLink();

} // ClassIndexView
