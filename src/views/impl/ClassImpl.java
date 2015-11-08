/**
 */
package views.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.Association;
import views.Property;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ClassImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends NamedElementImpl implements views.Class {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected views.Class superclass;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, ViewsPackage.CLASS__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public views.Class getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (views.Class)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public views.Class basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(views.Class newSuperclass) {
		views.Class oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<Association>(Association.class, this, ViewsPackage.CLASS__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.CLASS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case ViewsPackage.CLASS__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CLASS__PROPERTY:
				return getProperty();
			case ViewsPackage.CLASS__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case ViewsPackage.CLASS__ASSOCIATION:
				return getAssociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.CLASS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ViewsPackage.CLASS__SUPERCLASS:
				setSuperclass((views.Class)newValue);
				return;
			case ViewsPackage.CLASS__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.CLASS__PROPERTY:
				getProperty().clear();
				return;
			case ViewsPackage.CLASS__SUPERCLASS:
				setSuperclass((views.Class)null);
				return;
			case ViewsPackage.CLASS__ASSOCIATION:
				getAssociation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.CLASS__PROPERTY:
				return property != null && !property.isEmpty();
			case ViewsPackage.CLASS__SUPERCLASS:
				return superclass != null;
			case ViewsPackage.CLASS__ASSOCIATION:
				return association != null && !association.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
