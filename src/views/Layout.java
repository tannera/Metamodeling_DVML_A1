/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Layout#getLayoutType <em>Layout Type</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout Type</b></em>' attribute.
	 * The default value is <code>"HORIZONTAL"</code>.
	 * The literals are from the enumeration {@link views.LayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Type</em>' attribute.
	 * @see views.LayoutType
	 * @see #setLayoutType(LayoutType)
	 * @see views.ViewsPackage#getLayout_LayoutType()
	 * @model default="HORIZONTAL"
	 * @generated
	 */
	LayoutType getLayoutType();

	/**
	 * Sets the value of the '{@link views.Layout#getLayoutType <em>Layout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Type</em>' attribute.
	 * @see views.LayoutType
	 * @see #getLayoutType()
	 * @generated
	 */
	void setLayoutType(LayoutType value);

} // Layout
