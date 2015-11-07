/**
 */
package views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ElementGroups#getViewelements <em>Viewelements</em>}</li>
 *   <li>{@link views.ElementGroups#getVisibilitycondition <em>Visibilitycondition</em>}</li>
 *   <li>{@link views.ElementGroups#getLayout <em>Layout</em>}</li>
 *   <li>{@link views.ElementGroups#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getElementGroups()
 * @model
 * @generated
 */
public interface ElementGroups extends EObject {
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
	 * @see views.ViewsPackage#getElementGroups_Viewelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElements> getViewelements();

	/**
	 * Returns the value of the '<em><b>Visibilitycondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilitycondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilitycondition</em>' containment reference.
	 * @see #setVisibilitycondition(VisibilityCondition)
	 * @see views.ViewsPackage#getElementGroups_Visibilitycondition()
	 * @model containment="true"
	 * @generated
	 */
	VisibilityCondition getVisibilitycondition();

	/**
	 * Sets the value of the '{@link views.ElementGroups#getVisibilitycondition <em>Visibilitycondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilitycondition</em>' containment reference.
	 * @see #getVisibilitycondition()
	 * @generated
	 */
	void setVisibilitycondition(VisibilityCondition value);

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
	 * @see views.ViewsPackage#getElementGroups_Layout()
	 * @model required="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link views.ElementGroups#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see views.ViewsPackage#getElementGroups_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link views.ElementGroups#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

} // ElementGroups
