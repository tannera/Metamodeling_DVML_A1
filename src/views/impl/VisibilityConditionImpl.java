/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.ComparisonCondition;
import views.ViewsPackage;
import views.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.VisibilityConditionImpl#getConditionID <em>Condition ID</em>}</li>
 *   <li>{@link views.impl.VisibilityConditionImpl#getConditionType <em>Condition Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VisibilityConditionImpl extends MinimalEObjectImpl.Container implements VisibilityCondition {
	/**
	 * The default value of the '{@link #getConditionID() <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionID()
	 * @generated
	 * @ordered
	 */
	protected static final int CONDITION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConditionID() <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionID()
	 * @generated
	 * @ordered
	 */
	protected int conditionID = CONDITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionType() <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonCondition CONDITION_TYPE_EDEFAULT = ComparisonCondition.SHOWN;

	/**
	 * The cached value of the '{@link #getConditionType() <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionType()
	 * @generated
	 * @ordered
	 */
	protected ComparisonCondition conditionType = CONDITION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VISIBILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConditionID() {
		return conditionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionID(int newConditionID) {
		int oldConditionID = conditionID;
		conditionID = newConditionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID, oldConditionID, conditionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCondition getConditionType() {
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionType(ComparisonCondition newConditionType) {
		ComparisonCondition oldConditionType = conditionType;
		conditionType = newConditionType == null ? CONDITION_TYPE_EDEFAULT : newConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VISIBILITY_CONDITION__CONDITION_TYPE, oldConditionType, conditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				return getConditionID();
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_TYPE:
				return getConditionType();
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
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				setConditionID((Integer)newValue);
				return;
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_TYPE:
				setConditionType((ComparisonCondition)newValue);
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
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				setConditionID(CONDITION_ID_EDEFAULT);
				return;
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_TYPE:
				setConditionType(CONDITION_TYPE_EDEFAULT);
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
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				return conditionID != CONDITION_ID_EDEFAULT;
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_TYPE:
				return conditionType != CONDITION_TYPE_EDEFAULT;
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
		result.append(" (conditionID: ");
		result.append(conditionID);
		result.append(", conditionType: ");
		result.append(conditionType);
		result.append(')');
		return result.toString();
	}

} //VisibilityConditionImpl
