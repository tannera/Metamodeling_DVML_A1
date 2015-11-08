/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Property#getType <em>Type</em>}</li>
 *   <li>{@link views.Property#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link views.Property#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link views.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link views.Property#isIsID <em>Is ID</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowerBoundMaxOne LowerBoundMinZero UpperBoundEqualsOne ClassPropertyTypeIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LowerBoundMaxOne='self.LowerBound <= 1' LowerBoundMinZero='self.LowerBound >= 0' UpperBoundEqualsOne='self.UpperBound = 1' ClassPropertyTypeIsValid='self.type = PropertyType::DataType or self.type = PropertyType::Enumeration'"
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link views.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see views.PropertyType
	 * @see #setType(PropertyType)
	 * @see views.ViewsPackage#getProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	PropertyType getType();

	/**
	 * Sets the value of the '{@link views.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see views.PropertyType
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyType value);

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
	 * @see views.ViewsPackage#getProperty_LowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link views.Property#getLowerBound <em>Lower Bound</em>}' attribute.
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
	 * @see views.ViewsPackage#getProperty_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link views.Property#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

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
	 * @see views.ViewsPackage#getProperty_Class()
	 * @model required="true"
	 * @generated
	 */
	views.Class getClass_();

	/**
	 * Sets the value of the '{@link views.Property#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(views.Class value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(boolean)
	 * @see views.ViewsPackage#getProperty_IsID()
	 * @model
	 * @generated
	 */
	boolean isIsID();

	/**
	 * Sets the value of the '{@link views.Property#isIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #isIsID()
	 * @generated
	 */
	void setIsID(boolean value);

} // Property
