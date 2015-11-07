/**
 */
package views.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.DataType;
import views.DomainModel;
import views.Enumeration;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.DomainModelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link views.impl.DomainModelImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link views.impl.DomainModelImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<views.Class> class_;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatype;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumeration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<views.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<views.Class>(views.Class.class, this, ViewsPackage.DOMAIN_MODEL__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentEList<DataType>(DataType.class, this, ViewsPackage.DOMAIN_MODEL__DATATYPE);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumeration() {
		if (enumeration == null) {
			enumeration = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, ViewsPackage.DOMAIN_MODEL__ENUMERATION);
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.DOMAIN_MODEL__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case ViewsPackage.DOMAIN_MODEL__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
			case ViewsPackage.DOMAIN_MODEL__ENUMERATION:
				return ((InternalEList<?>)getEnumeration()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.DOMAIN_MODEL__CLASS:
				return getClass_();
			case ViewsPackage.DOMAIN_MODEL__DATATYPE:
				return getDatatype();
			case ViewsPackage.DOMAIN_MODEL__ENUMERATION:
				return getEnumeration();
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
			case ViewsPackage.DOMAIN_MODEL__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends views.Class>)newValue);
				return;
			case ViewsPackage.DOMAIN_MODEL__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends DataType>)newValue);
				return;
			case ViewsPackage.DOMAIN_MODEL__ENUMERATION:
				getEnumeration().clear();
				getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
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
			case ViewsPackage.DOMAIN_MODEL__CLASS:
				getClass_().clear();
				return;
			case ViewsPackage.DOMAIN_MODEL__DATATYPE:
				getDatatype().clear();
				return;
			case ViewsPackage.DOMAIN_MODEL__ENUMERATION:
				getEnumeration().clear();
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
			case ViewsPackage.DOMAIN_MODEL__CLASS:
				return class_ != null && !class_.isEmpty();
			case ViewsPackage.DOMAIN_MODEL__DATATYPE:
				return datatype != null && !datatype.isEmpty();
			case ViewsPackage.DOMAIN_MODEL__ENUMERATION:
				return enumeration != null && !enumeration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainModelImpl
