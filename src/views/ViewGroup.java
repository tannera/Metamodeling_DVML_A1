/**
 */
package views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ViewGroup#getName <em>Name</em>}</li>
 *   <li>{@link views.ViewGroup#getViews <em>Views</em>}</li>
 *   <li>{@link views.ViewGroup#isWelcomeViewGroup <em>Welcome View Group</em>}</li>
 *   <li>{@link views.ViewGroup#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getViewGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExactlyOneWelcomeViewGroupExists FirstLetterInViewGroupIsUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ExactlyOneWelcomeViewGroupExists='ViewGroup.allInstances() -> select(f | f.welcomeViewGroup = true) -> size() = 1' FirstLetterInViewGroupIsUpperCase='self.name.at(1).matches(\'[A-Z]\')'"
 * @generated
 */
public interface ViewGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see views.ViewsPackage#getViewGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link views.ViewGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link views.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see views.ViewsPackage#getViewGroup_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Welcome View Group</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome View Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome View Group</em>' attribute.
	 * @see #setWelcomeViewGroup(boolean)
	 * @see views.ViewsPackage#getViewGroup_WelcomeViewGroup()
	 * @model default="false"
	 * @generated
	 */
	boolean isWelcomeViewGroup();

	/**
	 * Sets the value of the '{@link views.ViewGroup#isWelcomeViewGroup <em>Welcome View Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome View Group</em>' attribute.
	 * @see #isWelcomeViewGroup()
	 * @generated
	 */
	void setWelcomeViewGroup(boolean value);

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
	 * @see views.ViewsPackage#getViewGroup_Layout()
	 * @model required="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link views.ViewGroup#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // ViewGroup
