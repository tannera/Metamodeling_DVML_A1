/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Association#getAssociationend <em>Associationend</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Associationend</b></em>' containment reference list.
	 * The list contents are of type {@link views.AssociationEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associationend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associationend</em>' containment reference list.
	 * @see views.ViewsPackage#getAssociation_Associationend()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<AssociationEnd> getAssociationend();

} // Association
