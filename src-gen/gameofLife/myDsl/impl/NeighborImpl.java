/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl.impl;

import gameofLife.myDsl.MyDslPackage;
import gameofLife.myDsl.Neighbor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neighbor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gameofLife.myDsl.impl.NeighborImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link gameofLife.myDsl.impl.NeighborImpl#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeighborImpl extends MinimalEObjectImpl.Container implements Neighbor
{
  /**
   * The default value of the '{@link #getDx() <em>Dx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDx()
   * @generated
   * @ordered
   */
  protected static final int DX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDx() <em>Dx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDx()
   * @generated
   * @ordered
   */
  protected int dx = DX_EDEFAULT;

  /**
   * The default value of the '{@link #getDy() <em>Dy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDy()
   * @generated
   * @ordered
   */
  protected static final int DY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDy() <em>Dy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDy()
   * @generated
   * @ordered
   */
  protected int dy = DY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeighborImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.NEIGHBOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDx()
  {
    return dx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDx(int newDx)
  {
    int oldDx = dx;
    dx = newDx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NEIGHBOR__DX, oldDx, dx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDy()
  {
    return dy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDy(int newDy)
  {
    int oldDy = dy;
    dy = newDy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NEIGHBOR__DY, oldDy, dy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.NEIGHBOR__DX:
        return getDx();
      case MyDslPackage.NEIGHBOR__DY:
        return getDy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.NEIGHBOR__DX:
        setDx((Integer)newValue);
        return;
      case MyDslPackage.NEIGHBOR__DY:
        setDy((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.NEIGHBOR__DX:
        setDx(DX_EDEFAULT);
        return;
      case MyDslPackage.NEIGHBOR__DY:
        setDy(DY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.NEIGHBOR__DX:
        return dx != DX_EDEFAULT;
      case MyDslPackage.NEIGHBOR__DY:
        return dy != DY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (dx: ");
    result.append(dx);
    result.append(", dy: ");
    result.append(dy);
    result.append(')');
    return result.toString();
  }

} //NeighborImpl
