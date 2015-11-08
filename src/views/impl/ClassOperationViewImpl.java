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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.ClassOperationView;
import views.ElementGroups;
import views.Layout;
import views.Link;
import views.ViewElements;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Operation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ClassOperationViewImpl#getViewelements <em>Viewelements</em>}</li>
 *   <li>{@link views.impl.ClassOperationViewImpl#getElementgroups <em>Elementgroups</em>}</li>
 *   <li>{@link views.impl.ClassOperationViewImpl#getLink <em>Link</em>}</li>
 *   <li>{@link views.impl.ClassOperationViewImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassOperationViewImpl extends ViewImpl implements ClassOperationView {
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
	 * The cached value of the '{@link #getElementgroups() <em>Elementgroups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementgroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementGroups> elementgroups;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOperationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CLASS_OPERATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElements> getViewelements() {
		if (viewelements == null) {
			viewelements = new EObjectContainmentEList<ViewElements>(ViewElements.class, this, ViewsPackage.CLASS_OPERATION_VIEW__VIEWELEMENTS);
		}
		return viewelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementGroups> getElementgroups() {
		if (elementgroups == null) {
			elementgroups = new EObjectContainmentEList<ElementGroups>(ElementGroups.class, this, ViewsPackage.CLASS_OPERATION_VIEW__ELEMENTGROUPS);
		}
		return elementgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectWithInverseResolvingEList<Link>(Link.class, this, ViewsPackage.CLASS_OPERATION_VIEW__LINK, ViewsPackage.LINK__CLASSOPERATIONVIEW);
		}
		return link;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT, oldLayout, layout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink()).basicAdd(otherEnd, msgs);
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
			case ViewsPackage.CLASS_OPERATION_VIEW__VIEWELEMENTS:
				return ((InternalEList<?>)getViewelements()).basicRemove(otherEnd, msgs);
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENTGROUPS:
				return ((InternalEList<?>)getElementgroups()).basicRemove(otherEnd, msgs);
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.CLASS_OPERATION_VIEW__VIEWELEMENTS:
				return getViewelements();
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENTGROUPS:
				return getElementgroups();
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				return getLink();
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				if (resolve) return getLayout();
				return basicGetLayout();
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
			case ViewsPackage.CLASS_OPERATION_VIEW__VIEWELEMENTS:
				getViewelements().clear();
				getViewelements().addAll((Collection<? extends ViewElements>)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENTGROUPS:
				getElementgroups().clear();
				getElementgroups().addAll((Collection<? extends ElementGroups>)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				setLayout((Layout)newValue);
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
			case ViewsPackage.CLASS_OPERATION_VIEW__VIEWELEMENTS:
				getViewelements().clear();
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENTGROUPS:
				getElementgroups().clear();
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				getLink().clear();
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				setLayout((Layout)null);
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
			case ViewsPackage.CLASS_OPERATION_VIEW__VIEWELEMENTS:
				return viewelements != null && !viewelements.isEmpty();
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENTGROUPS:
				return elementgroups != null && !elementgroups.isEmpty();
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				return link != null && !link.isEmpty();
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				return layout != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassOperationViewImpl
