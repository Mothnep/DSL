/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>grid Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameofLife.myDsl.gridDefinition#getWidth <em>Width</em>}</li>
 *   <li>{@link gameofLife.myDsl.gridDefinition#getHeight <em>Height</em>}</li>
 *   <li>{@link gameofLife.myDsl.gridDefinition#getAliveCells <em>Alive Cells</em>}</li>
 * </ul>
 *
 * @see gameofLife.myDsl.MyDslPackage#getgridDefinition()
 * @model
 * @generated
 */
public interface gridDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see gameofLife.myDsl.MyDslPackage#getgridDefinition_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link gameofLife.myDsl.gridDefinition#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see gameofLife.myDsl.MyDslPackage#getgridDefinition_Height()
   * @model
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link gameofLife.myDsl.gridDefinition#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Alive Cells</b></em>' containment reference list.
   * The list contents are of type {@link gameofLife.myDsl.CellCoord}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alive Cells</em>' containment reference list.
   * @see gameofLife.myDsl.MyDslPackage#getgridDefinition_AliveCells()
   * @model containment="true"
   * @generated
   */
  EList<CellCoord> getAliveCells();

} // gridDefinition