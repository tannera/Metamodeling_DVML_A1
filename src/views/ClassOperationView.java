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
 *   <li>{@link views.ClassOperationView#getCreate <em>Create</em>}</li>
 *   <li>{@link views.ClassOperationView#getRead <em>Read</em>}</li>
 *   <li>{@link views.ClassOperationView#getUpdate <em>Update</em>}</li>
 *   <li>{@link views.ClassOperationView#getDelete <em>Delete</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getClassOperationView()
 * @model
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
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link views.Link#getClassoperationview <em>Classoperationview</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see views.ViewsPackage#getClassOperationView_Link()
	 * @see views.Link#getClassoperationview
	 * @model opposite="classoperationview"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' reference.
	 * @see #setCreate(Create)
	 * @see views.ViewsPackage#getClassOperationView_Create()
	 * @model
	 * @generated
	 */
	Create getCreate();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getCreate <em>Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(Create value);

	/**
	 * Returns the value of the '<em><b>Read</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' reference.
	 * @see #setRead(Read)
	 * @see views.ViewsPackage#getClassOperationView_Read()
	 * @model
	 * @generated
	 */
	Read getRead();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getRead <em>Read</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' reference.
	 * @see #getRead()
	 * @generated
	 */
	void setRead(Read value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' reference.
	 * @see #setUpdate(Update)
	 * @see views.ViewsPackage#getClassOperationView_Update()
	 * @model
	 * @generated
	 */
	Update getUpdate();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getUpdate <em>Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(Update value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' reference.
	 * @see #setDelete(Delete)
	 * @see views.ViewsPackage#getClassOperationView_Delete()
	 * @model
	 * @generated
	 */
	Delete getDelete();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getDelete <em>Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(Delete value);

} // ClassOperationView
