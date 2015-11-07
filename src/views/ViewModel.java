/**
 */
package views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ViewModel#getViewgroup <em>Viewgroup</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getViewModel()
 * @model
 * @generated
 */
public interface ViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Viewgroup</b></em>' containment reference list.
	 * The list contents are of type {@link views.ViewGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewgroup</em>' containment reference list.
	 * @see views.ViewsPackage#getViewModel_Viewgroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewGroup> getViewgroup();

} // ViewModel
