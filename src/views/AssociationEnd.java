/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.AssociationEnd#getClass_ <em>Class</em>}</li>
 *   <li>{@link views.AssociationEnd#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link views.AssociationEnd#isComposed <em>Composed</em>}</li>
 *   <li>{@link views.AssociationEnd#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link views.AssociationEnd#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getAssociationEnd()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='associationEndUpperGreaterThanLower'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot associationEndUpperGreaterThanLower='self.LowerBound <= self.UpperBound or self.UpperBound = -1 and (self.LowerBound >= 0 and self.UpperBound > 0 or self.UpperBound = -1)'"
 * @generated
 */
public interface AssociationEnd extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(views.Class)
	 * @see views.ViewsPackage#getAssociationEnd_Class()
	 * @model required="true"
	 * @generated
	 */
	views.Class getClass_();

	/**
	 * Sets the value of the '{@link views.AssociationEnd#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(views.Class value);

	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(boolean)
	 * @see views.ViewsPackage#getAssociationEnd_Navigable()
	 * @model default="false"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * Sets the value of the '{@link views.AssociationEnd#isNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #isNavigable()
	 * @generated
	 */
	void setNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Composed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' attribute.
	 * @see #setComposed(boolean)
	 * @see views.ViewsPackage#getAssociationEnd_Composed()
	 * @model default="false"
	 * @generated
	 */
	boolean isComposed();

	/**
	 * Sets the value of the '{@link views.AssociationEnd#isComposed <em>Composed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed</em>' attribute.
	 * @see #isComposed()
	 * @generated
	 */
	void setComposed(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see views.ViewsPackage#getAssociationEnd_LowerBound()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link views.AssociationEnd#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see views.ViewsPackage#getAssociationEnd_UpperBound()
	 * @model default="1" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link views.AssociationEnd#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // AssociationEnd
