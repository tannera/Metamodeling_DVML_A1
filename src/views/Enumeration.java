/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Enumeration#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link views.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see views.ViewsPackage#getEnumeration_Literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getLiteral();

} // Enumeration
