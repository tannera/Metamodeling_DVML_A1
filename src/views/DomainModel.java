/**
 */
package views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.DomainModel#getClass_ <em>Class</em>}</li>
 *   <li>{@link views.DomainModel#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link views.DomainModel#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link views.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<views.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link views.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatype();

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link views.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumeration();

} // DomainModel
