/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import views.ComparisonConditions;
import views.ComparisonValue;
import views.ViewElements;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ComparisonConditionsImpl#getValue <em>Value</em>}</li>
 *   <li>{@link views.impl.ComparisonConditionsImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link views.impl.ComparisonConditionsImpl#getViewelements <em>Viewelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonConditionsImpl extends VisibilityConditionImpl implements ComparisonConditions {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonValue COMPARISON_EDEFAULT = ComparisonValue.EQUALS;
	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected ComparisonValue comparison = COMPARISON_EDEFAULT;
	/**
	 * The cached value of the '{@link #getViewelements() <em>Viewelements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewelements()
	 * @generated
	 * @ordered
	 */
	protected ViewElements viewelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonConditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.COMPARISON_CONDITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPARISON_CONDITIONS__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonValue getComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison(ComparisonValue newComparison) {
		ComparisonValue oldComparison = comparison;
		comparison = newComparison == null ? COMPARISON_EDEFAULT : newComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPARISON_CONDITIONS__COMPARISON, oldComparison, comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElements getViewelements() {
		if (viewelements != null && viewelements.eIsProxy()) {
			InternalEObject oldViewelements = (InternalEObject)viewelements;
			viewelements = (ViewElements)eResolveProxy(oldViewelements);
			if (viewelements != oldViewelements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.COMPARISON_CONDITIONS__VIEWELEMENTS, oldViewelements, viewelements));
			}
		}
		return viewelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElements basicGetViewelements() {
		return viewelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewelements(ViewElements newViewelements) {
		ViewElements oldViewelements = viewelements;
		viewelements = newViewelements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPARISON_CONDITIONS__VIEWELEMENTS, oldViewelements, viewelements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.COMPARISON_CONDITIONS__VALUE:
				return getValue();
			case ViewsPackage.COMPARISON_CONDITIONS__COMPARISON:
				return getComparison();
			case ViewsPackage.COMPARISON_CONDITIONS__VIEWELEMENTS:
				if (resolve) return getViewelements();
				return basicGetViewelements();
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
			case ViewsPackage.COMPARISON_CONDITIONS__VALUE:
				setValue((String)newValue);
				return;
			case ViewsPackage.COMPARISON_CONDITIONS__COMPARISON:
				setComparison((ComparisonValue)newValue);
				return;
			case ViewsPackage.COMPARISON_CONDITIONS__VIEWELEMENTS:
				setViewelements((ViewElements)newValue);
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
			case ViewsPackage.COMPARISON_CONDITIONS__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ViewsPackage.COMPARISON_CONDITIONS__COMPARISON:
				setComparison(COMPARISON_EDEFAULT);
				return;
			case ViewsPackage.COMPARISON_CONDITIONS__VIEWELEMENTS:
				setViewelements((ViewElements)null);
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
			case ViewsPackage.COMPARISON_CONDITIONS__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ViewsPackage.COMPARISON_CONDITIONS__COMPARISON:
				return comparison != COMPARISON_EDEFAULT;
			case ViewsPackage.COMPARISON_CONDITIONS__VIEWELEMENTS:
				return viewelements != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", comparison: ");
		result.append(comparison);
		result.append(')');
		return result.toString();
	}

} //ComparisonConditionsImpl
