/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.ViewElements;
import views.ViewsPackage;
import views.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ViewElementsImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link views.impl.ViewElementsImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link views.impl.ViewElementsImpl#getVisibilitycondition <em>Visibilitycondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewElementsImpl extends MinimalEObjectImpl.Container implements ViewElements {
	/**
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected String elementID = ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibilitycondition() <em>Visibilitycondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilitycondition()
	 * @generated
	 * @ordered
	 */
	protected VisibilityCondition visibilitycondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEW_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(String newElementID) {
		String oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_ELEMENTS__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_ELEMENTS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityCondition getVisibilitycondition() {
		return visibilitycondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilitycondition(VisibilityCondition newVisibilitycondition, NotificationChain msgs) {
		VisibilityCondition oldVisibilitycondition = visibilitycondition;
		visibilitycondition = newVisibilitycondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION, oldVisibilitycondition, newVisibilitycondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilitycondition(VisibilityCondition newVisibilitycondition) {
		if (newVisibilitycondition != visibilitycondition) {
			NotificationChain msgs = null;
			if (visibilitycondition != null)
				msgs = ((InternalEObject)visibilitycondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION, null, msgs);
			if (newVisibilitycondition != null)
				msgs = ((InternalEObject)newVisibilitycondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION, null, msgs);
			msgs = basicSetVisibilitycondition(newVisibilitycondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION, newVisibilitycondition, newVisibilitycondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION:
				return basicSetVisibilitycondition(null, msgs);
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
			case ViewsPackage.VIEW_ELEMENTS__ELEMENT_ID:
				return getElementID();
			case ViewsPackage.VIEW_ELEMENTS__LABEL:
				return getLabel();
			case ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION:
				return getVisibilitycondition();
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
			case ViewsPackage.VIEW_ELEMENTS__ELEMENT_ID:
				setElementID((String)newValue);
				return;
			case ViewsPackage.VIEW_ELEMENTS__LABEL:
				setLabel((String)newValue);
				return;
			case ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION:
				setVisibilitycondition((VisibilityCondition)newValue);
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
			case ViewsPackage.VIEW_ELEMENTS__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case ViewsPackage.VIEW_ELEMENTS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION:
				setVisibilitycondition((VisibilityCondition)null);
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
			case ViewsPackage.VIEW_ELEMENTS__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case ViewsPackage.VIEW_ELEMENTS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ViewsPackage.VIEW_ELEMENTS__VISIBILITYCONDITION:
				return visibilitycondition != null;
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
		result.append(" (elementID: ");
		result.append(elementID);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ViewElementsImpl
