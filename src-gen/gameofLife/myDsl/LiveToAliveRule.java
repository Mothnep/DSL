/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live To Alive Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameofLife.myDsl.LiveToAliveRule#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see gameofLife.myDsl.MyDslPackage#getLiveToAliveRule()
 * @model
 * @generated
 */
public interface LiveToAliveRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see gameofLife.myDsl.MyDslPackage#getLiveToAliveRule_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link gameofLife.myDsl.LiveToAliveRule#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

} // LiveToAliveRule