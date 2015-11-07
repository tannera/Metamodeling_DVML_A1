/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import views.CompositeConditions;
import views.CompositeConditionsType;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.CompositeConditionsImpl#getCompositeType <em>Composite Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionsImpl extends VisibilityConditionImpl implements CompositeConditions {
	/**
	 * The default value of the '{@link #getCompositeType() <em>Composite Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeType()
	 * @generated
	 * @ordered
	 */
	protected static final CompositeConditionsType COMPOSITE_TYPE_EDEFAULT = CompositeConditionsType.AND;

	/**
	 * The cached value of the '{@link #getCompositeType() <em>Composite Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeType()
	 * @generated
	 * @ordered
	 */
	protected CompositeConditionsType compositeType = COMPOSITE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.COMPOSITE_CONDITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionsType getCompositeType() {
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeType(CompositeConditionsType newCompositeType) {
		CompositeConditionsType oldCompositeType = compositeType;
		compositeType = newCompositeType == null ? COMPOSITE_TYPE_EDEFAULT : newCompositeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE, oldCompositeType, compositeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE:
				return getCompositeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE:
				setCompositeType((CompositeConditionsType)newValue);
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
			case ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE:
				setCompositeType(COMPOSITE_TYPE_EDEFAULT);
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
			case ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE:
				return compositeType != COMPOSITE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (compositeType: ");
		result.append(compositeType);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionsImpl
