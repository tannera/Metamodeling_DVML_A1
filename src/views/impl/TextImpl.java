/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import views.Text;
import views.TextType;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.TextImpl#getTextType <em>Text Type</em>}</li>
 *   <li>{@link views.impl.TextImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link views.impl.TextImpl#isIsShort <em>Is Short</em>}</li>
 *   <li>{@link views.impl.TextImpl#isIsLong <em>Is Long</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends PropertyElementsImpl implements Text {
	/**
	 * The default value of the '{@link #getTextType() <em>Text Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextType()
	 * @generated
	 * @ordered
	 */
	protected static final TextType TEXT_TYPE_EDEFAULT = TextType.USER_DEFINED_DATA_TYPE;

	/**
	 * The cached value of the '{@link #getTextType() <em>Text Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextType()
	 * @generated
	 * @ordered
	 */
	protected TextType textType = TEXT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsShort() <em>Is Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShort() <em>Is Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShort()
	 * @generated
	 * @ordered
	 */
	protected boolean isShort = IS_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLong() <em>Is Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LONG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLong() <em>Is Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLong()
	 * @generated
	 * @ordered
	 */
	protected boolean isLong = IS_LONG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType getTextType() {
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextType(TextType newTextType) {
		TextType oldTextType = textType;
		textType = newTextType == null ? TEXT_TYPE_EDEFAULT : newTextType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TEXT__TEXT_TYPE, oldTextType, textType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TEXT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShort() {
		return isShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShort(boolean newIsShort) {
		boolean oldIsShort = isShort;
		isShort = newIsShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TEXT__IS_SHORT, oldIsShort, isShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLong() {
		return isLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLong(boolean newIsLong) {
		boolean oldIsLong = isLong;
		isLong = newIsLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TEXT__IS_LONG, oldIsLong, isLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.TEXT__TEXT_TYPE:
				return getTextType();
			case ViewsPackage.TEXT__FORMAT:
				return getFormat();
			case ViewsPackage.TEXT__IS_SHORT:
				return isIsShort();
			case ViewsPackage.TEXT__IS_LONG:
				return isIsLong();
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
			case ViewsPackage.TEXT__TEXT_TYPE:
				setTextType((TextType)newValue);
				return;
			case ViewsPackage.TEXT__FORMAT:
				setFormat((String)newValue);
				return;
			case ViewsPackage.TEXT__IS_SHORT:
				setIsShort((Boolean)newValue);
				return;
			case ViewsPackage.TEXT__IS_LONG:
				setIsLong((Boolean)newValue);
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
			case ViewsPackage.TEXT__TEXT_TYPE:
				setTextType(TEXT_TYPE_EDEFAULT);
				return;
			case ViewsPackage.TEXT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case ViewsPackage.TEXT__IS_SHORT:
				setIsShort(IS_SHORT_EDEFAULT);
				return;
			case ViewsPackage.TEXT__IS_LONG:
				setIsLong(IS_LONG_EDEFAULT);
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
			case ViewsPackage.TEXT__TEXT_TYPE:
				return textType != TEXT_TYPE_EDEFAULT;
			case ViewsPackage.TEXT__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case ViewsPackage.TEXT__IS_SHORT:
				return isShort != IS_SHORT_EDEFAULT;
			case ViewsPackage.TEXT__IS_LONG:
				return isLong != IS_LONG_EDEFAULT;
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
		result.append(" (textType: ");
		result.append(textType);
		result.append(", format: ");
		result.append(format);
		result.append(", isShort: ");
		result.append(isShort);
		result.append(", isLong: ");
		result.append(isLong);
		result.append(')');
		return result.toString();
	}

} //TextImpl
