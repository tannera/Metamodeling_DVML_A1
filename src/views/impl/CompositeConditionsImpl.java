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
import views.CompositeConditions;
import views.CompositeConditionsType;
import views.ViewsPackage;
import views.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.CompositeConditionsImpl#getCompositeType <em>Composite Type</em>}</li>
 *   <li>{@link views.impl.CompositeConditionsImpl#getVisibilitycondition <em>Visibilitycondition</em>}</li>
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
	 * The cached value of the '{@link #getVisibilitycondition() <em>Visibilitycondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilitycondition()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibilityCondition> visibilitycondition;

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
	public EList<VisibilityCondition> getVisibilitycondition() {
		if (visibilitycondition == null) {
			visibilitycondition = new EObjectContainmentEList<VisibilityCondition>(VisibilityCondition.class, this, ViewsPackage.COMPOSITE_CONDITIONS__VISIBILITYCONDITION);
		}
		return visibilitycondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.COMPOSITE_CONDITIONS__VISIBILITYCONDITION:
				return ((InternalEList<?>)getVisibilitycondition()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE:
				return getCompositeType();
			case ViewsPackage.COMPOSITE_CONDITIONS__VISIBILITYCONDITION:
				return getVisibilitycondition();
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
			case ViewsPackage.COMPOSITE_CONDITIONS__COMPOSITE_TYPE:
				setCompositeType((CompositeConditionsType)newValue);
				return;
			case ViewsPackage.COMPOSITE_CONDITIONS__VISIBILITYCONDITION:
				getVisibilitycondition().clear();
				getVisibilitycondition().addAll((Collection<? extends VisibilityCondition>)newValue);
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
			case ViewsPackage.COMPOSITE_CONDITIONS__VISIBILITYCONDITION:
				getVisibilitycondition().clear();
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
			case ViewsPackage.COMPOSITE_CONDITIONS__VISIBILITYCONDITION:
				return visibilitycondition != null && !visibilitycondition.isEmpty();
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
