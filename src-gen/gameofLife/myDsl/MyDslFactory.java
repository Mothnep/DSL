/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gameofLife.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = gameofLife.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>grid Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>grid Definition</em>'.
   * @generated
   */
  gridDefinition creategridDefinition();

  /**
   * Returns a new object of class '<em>rules Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rules Definition</em>'.
   * @generated
   */
  rulesDefinition createrulesDefinition();

  /**
   * Returns a new object of class '<em>Live To Dead Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Live To Dead Rule</em>'.
   * @generated
   */
  LiveToDeadRule createLiveToDeadRule();

  /**
   * Returns a new object of class '<em>Live To Alive Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Live To Alive Rule</em>'.
   * @generated
   */
  LiveToAliveRule createLiveToAliveRule();

  /**
   * Returns a new object of class '<em>Dead To Alive Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dead To Alive Rule</em>'.
   * @generated
   */
  DeadToAliveRule createDeadToAliveRule();

  /**
   * Returns a new object of class '<em>steps Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>steps Definition</em>'.
   * @generated
   */
  stepsDefinition createstepsDefinition();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Cell Coord</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Coord</em>'.
   * @generated
   */
  CellCoord createCellCoord();

  /**
   * Returns a new object of class '<em>Neighbor Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neighbor Check</em>'.
   * @generated
   */
  NeighborCheck createNeighborCheck();

  /**
   * Returns a new object of class '<em>Neighbor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neighbor</em>'.
   * @generated
   */
  Neighbor createNeighbor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory