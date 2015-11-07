/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.ClassOperationView;
import views.Link;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.LinkImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link views.impl.LinkImpl#getClassoperationview <em>Classoperationview</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
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
	 * The cached value of the '{@link #getClassoperationview() <em>Classoperationview</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassoperationview()
	 * @generated
	 * @ordered
	 */
	protected ClassOperationView classoperationview;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.LINK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOperationView getClassoperationview() {
		if (classoperationview != null && classoperationview.eIsProxy()) {
			InternalEObject oldClassoperationview = (InternalEObject)classoperationview;
			classoperationview = (ClassOperationView)eResolveProxy(oldClassoperationview);
			if (classoperationview != oldClassoperationview) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.LINK__CLASSOPERATIONVIEW, oldClassoperationview, classoperationview));
			}
		}
		return classoperationview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOperationView basicGetClassoperationview() {
		return classoperationview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassoperationview(ClassOperationView newClassoperationview, NotificationChain msgs) {
		ClassOperationView oldClassoperationview = classoperationview;
		classoperationview = newClassoperationview;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.LINK__CLASSOPERATIONVIEW, oldClassoperationview, newClassoperationview);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassoperationview(ClassOperationView newClassoperationview) {
		if (newClassoperationview != classoperationview) {
			NotificationChain msgs = null;
			if (classoperationview != null)
				msgs = ((InternalEObject)classoperationview).eInverseRemove(this, ViewsPackage.CLASS_OPERATION_VIEW__LINK, ClassOperationView.class, msgs);
			if (newClassoperationview != null)
				msgs = ((InternalEObject)newClassoperationview).eInverseAdd(this, ViewsPackage.CLASS_OPERATION_VIEW__LINK, ClassOperationView.class, msgs);
			msgs = basicSetClassoperationview(newClassoperationview, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.LINK__CLASSOPERATIONVIEW, newClassoperationview, newClassoperationview));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.LINK__CLASSOPERATIONVIEW:
				if (classoperationview != null)
					msgs = ((InternalEObject)classoperationview).eInverseRemove(this, ViewsPackage.CLASS_OPERATION_VIEW__LINK, ClassOperationView.class, msgs);
				return basicSetClassoperationview((ClassOperationView)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.LINK__CLASSOPERATIONVIEW:
				return basicSetClassoperationview(null, msgs);
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
			case ViewsPackage.LINK__LABEL:
				return getLabel();
			case ViewsPackage.LINK__CLASSOPERATIONVIEW:
				if (resolve) return getClassoperationview();
				return basicGetClassoperationview();
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
			case ViewsPackage.LINK__LABEL:
				setLabel((String)newValue);
				return;
			case ViewsPackage.LINK__CLASSOPERATIONVIEW:
				setClassoperationview((ClassOperationView)newValue);
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
			case ViewsPackage.LINK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ViewsPackage.LINK__CLASSOPERATIONVIEW:
				setClassoperationview((ClassOperationView)null);
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
			case ViewsPackage.LINK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ViewsPackage.LINK__CLASSOPERATIONVIEW:
				return classoperationview != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
