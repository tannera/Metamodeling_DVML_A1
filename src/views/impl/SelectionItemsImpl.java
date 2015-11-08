/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.SelectionItems;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.SelectionItemsImpl#getSelectionValue <em>Selection Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionItemsImpl extends MinimalEObjectImpl.Container implements SelectionItems {
	/**
	 * The default value of the '{@link #getSelectionValue() <em>Selection Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSelectionValue() <em>Selection Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionValue()
	 * @generated
	 * @ordered
	 */
	protected String selectionValue = SELECTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SELECTION_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectionValue() {
		return selectionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionValue(String newSelectionValue) {
		String oldSelectionValue = selectionValue;
		selectionValue = newSelectionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SELECTION_ITEMS__SELECTION_VALUE, oldSelectionValue, selectionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.SELECTION_ITEMS__SELECTION_VALUE:
				return getSelectionValue();
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
			case ViewsPackage.SELECTION_ITEMS__SELECTION_VALUE:
				setSelectionValue((String)newValue);
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
			case ViewsPackage.SELECTION_ITEMS__SELECTION_VALUE:
				setSelectionValue(SELECTION_VALUE_EDEFAULT);
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
			case ViewsPackage.SELECTION_ITEMS__SELECTION_VALUE:
				return SELECTION_VALUE_EDEFAULT == null ? selectionValue != null : !SELECTION_VALUE_EDEFAULT.equals(selectionValue);
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
		result.append(" (SelectionValue: ");
		result.append(selectionValue);
		result.append(')');
		return result.toString();
	}

} //SelectionItemsImpl
