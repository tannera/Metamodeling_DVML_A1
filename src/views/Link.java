/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Link#getLabel <em>Label</em>}</li>
 *   <li>{@link views.Link#getClassoperationview <em>Classoperationview</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see views.ViewsPackage#getLink_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link views.Link#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Classoperationview</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link views.ClassOperationView#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classoperationview</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classoperationview</em>' reference.
	 * @see #setClassoperationview(ClassOperationView)
	 * @see views.ViewsPackage#getLink_Classoperationview()
	 * @see views.ClassOperationView#getLink
	 * @model opposite="link"
	 * @generated
	 */
	ClassOperationView getClassoperationview();

	/**
	 * Sets the value of the '{@link views.Link#getClassoperationview <em>Classoperationview</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classoperationview</em>' reference.
	 * @see #getClassoperationview()
	 * @generated
	 */
	void setClassoperationview(ClassOperationView value);

} // Link
