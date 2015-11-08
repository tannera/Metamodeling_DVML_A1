/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Operation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ClassOperationView#getViewelements <em>Viewelements</em>}</li>
 *   <li>{@link views.ClassOperationView#getElementgroups <em>Elementgroups</em>}</li>
 *   <li>{@link views.ClassOperationView#getLink <em>Link</em>}</li>
 *   <li>{@link views.ClassOperationView#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getClassOperationView()
 * @model abstract="true"
 * @generated
 */
public interface ClassOperationView extends View {
	/**
	 * Returns the value of the '<em><b>Viewelements</b></em>' containment reference list.
	 * The list contents are of type {@link views.ViewElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewelements</em>' containment reference list.
	 * @see views.ViewsPackage#getClassOperationView_Viewelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElements> getViewelements();

	/**
	 * Returns the value of the '<em><b>Elementgroups</b></em>' containment reference list.
	 * The list contents are of type {@link views.ElementGroups}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementgroups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementgroups</em>' containment reference list.
	 * @see views.ViewsPackage#getClassOperationView_Elementgroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementGroups> getElementgroups();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link views.Link}.
	 * It is bidirectional and its opposite is '{@link views.Link#getClassoperationview <em>Classoperationview</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see views.ViewsPackage#getClassOperationView_Link()
	 * @see views.Link#getClassoperationview
	 * @model opposite="classoperationview"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' reference.
	 * @see #setLayout(Layout)
	 * @see views.ViewsPackage#getClassOperationView_Layout()
	 * @model required="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // ClassOperationView
