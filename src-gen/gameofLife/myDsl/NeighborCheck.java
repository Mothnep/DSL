/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neighbor Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameofLife.myDsl.NeighborCheck#getNeighborList <em>Neighbor List</em>}</li>
 * </ul>
 *
 * @see gameofLife.myDsl.MyDslPackage#getNeighborCheck()
 * @model
 * @generated
 */
public interface NeighborCheck extends EObject
{
  /**
   * Returns the value of the '<em><b>Neighbor List</b></em>' containment reference list.
   * The list contents are of type {@link gameofLife.myDsl.Neighbor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neighbor List</em>' containment reference list.
   * @see gameofLife.myDsl.MyDslPackage#getNeighborCheck_NeighborList()
   * @model containment="true"
   * @generated
   */
  EList<Neighbor> getNeighborList();

} // NeighborCheck