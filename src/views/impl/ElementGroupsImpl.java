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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.ElementGroups;
import views.Layout;
import views.ViewElements;
import views.ViewsPackage;
import views.VisibilityCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ElementGroupsImpl#getViewelements <em>Viewelements</em>}</li>
 *   <li>{@link views.impl.ElementGroupsImpl#getVisibilitycondition <em>Visibilitycondition</em>}</li>
 *   <li>{@link views.impl.ElementGroupsImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link views.impl.ElementGroupsImpl#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementGroupsImpl extends MinimalEObjectImpl.Container implements ElementGroups {
	/**
	 * The cached value of the '{@link #getViewelements() <em>Viewelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElements> viewelements;

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
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ELEMENT_GROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElements> getViewelements() {
		if (viewelements == null) {
			viewelements = new EObjectContainmentEList<ViewElements>(ViewElements.class, this, ViewsPackage.ELEMENT_GROUPS__VIEWELEMENTS);
		}
		return viewelements;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION, oldVisibilitycondition, newVisibilitycondition);
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
				msgs = ((InternalEObject)visibilitycondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION, null, msgs);
			if (newVisibilitycondition != null)
				msgs = ((InternalEObject)newVisibilitycondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION, null, msgs);
			msgs = basicSetVisibilitycondition(newVisibilitycondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION, newVisibilitycondition, newVisibilitycondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		if (layout != null && layout.eIsProxy()) {
			InternalEObject oldLayout = (InternalEObject)layout;
			layout = (Layout)eResolveProxy(oldLayout);
			if (layout != oldLayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ELEMENT_GROUPS__LAYOUT, oldLayout, layout));
			}
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ELEMENT_GROUPS__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ELEMENT_GROUPS__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.ELEMENT_GROUPS__VIEWELEMENTS:
				return ((InternalEList<?>)getViewelements()).basicRemove(otherEnd, msgs);
			case ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION:
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
			case ViewsPackage.ELEMENT_GROUPS__VIEWELEMENTS:
				return getViewelements();
			case ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION:
				return getVisibilitycondition();
			case ViewsPackage.ELEMENT_GROUPS__LAYOUT:
				if (resolve) return getLayout();
				return basicGetLayout();
			case ViewsPackage.ELEMENT_GROUPS__HEADER:
				return getHeader();
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
			case ViewsPackage.ELEMENT_GROUPS__VIEWELEMENTS:
				getViewelements().clear();
				getViewelements().addAll((Collection<? extends ViewElements>)newValue);
				return;
			case ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION:
				setVisibilitycondition((VisibilityCondition)newValue);
				return;
			case ViewsPackage.ELEMENT_GROUPS__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case ViewsPackage.ELEMENT_GROUPS__HEADER:
				setHeader((String)newValue);
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
			case ViewsPackage.ELEMENT_GROUPS__VIEWELEMENTS:
				getViewelements().clear();
				return;
			case ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION:
				setVisibilitycondition((VisibilityCondition)null);
				return;
			case ViewsPackage.ELEMENT_GROUPS__LAYOUT:
				setLayout((Layout)null);
				return;
			case ViewsPackage.ELEMENT_GROUPS__HEADER:
				setHeader(HEADER_EDEFAULT);
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
			case ViewsPackage.ELEMENT_GROUPS__VIEWELEMENTS:
				return viewelements != null && !viewelements.isEmpty();
			case ViewsPackage.ELEMENT_GROUPS__VISIBILITYCONDITION:
				return visibilitycondition != null;
			case ViewsPackage.ELEMENT_GROUPS__LAYOUT:
				return layout != null;
			case ViewsPackage.ELEMENT_GROUPS__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
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
		result.append(" (header: ");
		result.append(header);
		result.append(')');
		return result.toString();
	}

} //ElementGroupsImpl
