/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ViewElements#getElementID <em>Element ID</em>}</li>
 *   <li>{@link views.ViewElements#getLabel <em>Label</em>}</li>
 *   <li>{@link views.ViewElements#getVisibilitycondition <em>Visibilitycondition</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getViewElements()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ElementIDIsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ElementIDIsUnique='ViewElements.allInstances() -> select(n | n.elementID = self.elementID) ->excluding(self) ->isEmpty()'"
 * @generated
 */
public interface ViewElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(String)
	 * @see views.ViewsPackage#getViewElements_ElementID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getElementID();

	/**
	 * Sets the value of the '{@link views.ViewElements#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(String value);

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
	 * @see views.ViewsPackage#getViewElements_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link views.ViewElements#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see views.ViewsPackage#getViewElements_Visibilitycondition()
	 * @model containment="true"
	 * @generated
	 */
	VisibilityCondition getVisibilitycondition();

	/**
	 * Sets the value of the '{@link views.ViewElements#getVisibilitycondition <em>Visibilitycondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilitycondition</em>' containment reference.
	 * @see #getVisibilitycondition()
	 * @generated
	 */
	void setVisibilitycondition(VisibilityCondition value);

} // ViewElements
