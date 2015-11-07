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

import views.ClassOperationView;
import views.Create;
import views.Delete;
import views.ElementGroups;
import views.Link;
import views.Read;
import views.Update;
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
 *   <li>{@link views.impl.ClassOperationViewImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link views.impl.ClassOperationViewImpl#getRead <em>Read</em>}</li>
 *   <li>{@link views.impl.ClassOperationViewImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link views.impl.ClassOperationViewImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassOperationViewImpl extends ViewImpl implements ClassOperationView {
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
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected Create create;

	/**
	 * The cached value of the '{@link #getRead() <em>Read</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead()
	 * @generated
	 * @ordered
	 */
	protected Read read;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected Update update;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected Delete delete;

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
	public Link getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (Link)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_OPERATION_VIEW__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(Link newLink, NotificationChain msgs) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, ViewsPackage.LINK__CLASSOPERATIONVIEW, Link.class, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, ViewsPackage.LINK__CLASSOPERATIONVIEW, Link.class, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create getCreate() {
		if (create != null && create.eIsProxy()) {
			InternalEObject oldCreate = (InternalEObject)create;
			create = (Create)eResolveProxy(oldCreate);
			if (create != oldCreate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_OPERATION_VIEW__CREATE, oldCreate, create));
			}
		}
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create basicGetCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(Create newCreate) {
		Create oldCreate = create;
		create = newCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__CREATE, oldCreate, create));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read getRead() {
		if (read != null && read.eIsProxy()) {
			InternalEObject oldRead = (InternalEObject)read;
			read = (Read)eResolveProxy(oldRead);
			if (read != oldRead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_OPERATION_VIEW__READ, oldRead, read));
			}
		}
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read basicGetRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead(Read newRead) {
		Read oldRead = read;
		read = newRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__READ, oldRead, read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update getUpdate() {
		if (update != null && update.eIsProxy()) {
			InternalEObject oldUpdate = (InternalEObject)update;
			update = (Update)eResolveProxy(oldUpdate);
			if (update != oldUpdate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_OPERATION_VIEW__UPDATE, oldUpdate, update));
			}
		}
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update basicGetUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(Update newUpdate) {
		Update oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete getDelete() {
		if (delete != null && delete.eIsProxy()) {
			InternalEObject oldDelete = (InternalEObject)delete;
			delete = (Delete)eResolveProxy(oldDelete);
			if (delete != oldDelete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_OPERATION_VIEW__DELETE, oldDelete, delete));
			}
		}
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete basicGetDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(Delete newDelete) {
		Delete oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.CLASS_OPERATION_VIEW__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, ViewsPackage.LINK__CLASSOPERATIONVIEW, Link.class, msgs);
				return basicSetLink((Link)otherEnd, msgs);
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
				return basicSetLink(null, msgs);
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
				if (resolve) return getLink();
				return basicGetLink();
			case ViewsPackage.CLASS_OPERATION_VIEW__CREATE:
				if (resolve) return getCreate();
				return basicGetCreate();
			case ViewsPackage.CLASS_OPERATION_VIEW__READ:
				if (resolve) return getRead();
				return basicGetRead();
			case ViewsPackage.CLASS_OPERATION_VIEW__UPDATE:
				if (resolve) return getUpdate();
				return basicGetUpdate();
			case ViewsPackage.CLASS_OPERATION_VIEW__DELETE:
				if (resolve) return getDelete();
				return basicGetDelete();
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
				setLink((Link)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__CREATE:
				setCreate((Create)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__READ:
				setRead((Read)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__UPDATE:
				setUpdate((Update)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__DELETE:
				setDelete((Delete)newValue);
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
				setLink((Link)null);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__CREATE:
				setCreate((Create)null);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__READ:
				setRead((Read)null);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__UPDATE:
				setUpdate((Update)null);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__DELETE:
				setDelete((Delete)null);
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
				return link != null;
			case ViewsPackage.CLASS_OPERATION_VIEW__CREATE:
				return create != null;
			case ViewsPackage.CLASS_OPERATION_VIEW__READ:
				return read != null;
			case ViewsPackage.CLASS_OPERATION_VIEW__UPDATE:
				return update != null;
			case ViewsPackage.CLASS_OPERATION_VIEW__DELETE:
				return delete != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassOperationViewImpl
