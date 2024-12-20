/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gameofLife.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.MyDsl.gameofLife";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = gameofLife.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.ModelImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Grid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GRID = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 1;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STEPS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.gridDefinitionImpl <em>grid Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.gridDefinitionImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getgridDefinition()
   * @generated
   */
  int GRID_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_DEFINITION__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_DEFINITION__HEIGHT = 1;

  /**
   * The feature id for the '<em><b>Alive Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_DEFINITION__ALIVE_CELLS = 2;

  /**
   * The number of structural features of the '<em>grid Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.rulesDefinitionImpl <em>rules Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.rulesDefinitionImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getrulesDefinition()
   * @generated
   */
  int RULES_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_DEFINITION__RULES = 0;

  /**
   * The number of structural features of the '<em>rules Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.ruleDefinitionImpl <em>rule Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.ruleDefinitionImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getruleDefinition()
   * @generated
   */
  int RULE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__CONDITION = 0;

  /**
   * The number of structural features of the '<em>rule Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.LiveToDeadRuleImpl <em>Live To Dead Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.LiveToDeadRuleImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getLiveToDeadRule()
   * @generated
   */
  int LIVE_TO_DEAD_RULE = 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIVE_TO_DEAD_RULE__CONDITION = RULE_DEFINITION__CONDITION;

  /**
   * The number of structural features of the '<em>Live To Dead Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIVE_TO_DEAD_RULE_FEATURE_COUNT = RULE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.LiveToAliveRuleImpl <em>Live To Alive Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.LiveToAliveRuleImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getLiveToAliveRule()
   * @generated
   */
  int LIVE_TO_ALIVE_RULE = 5;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIVE_TO_ALIVE_RULE__CONDITION = RULE_DEFINITION__CONDITION;

  /**
   * The number of structural features of the '<em>Live To Alive Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIVE_TO_ALIVE_RULE_FEATURE_COUNT = RULE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.DeadToAliveRuleImpl <em>Dead To Alive Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.DeadToAliveRuleImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getDeadToAliveRule()
   * @generated
   */
  int DEAD_TO_ALIVE_RULE = 6;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAD_TO_ALIVE_RULE__CONDITION = RULE_DEFINITION__CONDITION;

  /**
   * The number of structural features of the '<em>Dead To Alive Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEAD_TO_ALIVE_RULE_FEATURE_COUNT = RULE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.stepsDefinitionImpl <em>steps Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.stepsDefinitionImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getstepsDefinition()
   * @generated
   */
  int STEPS_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEPS_DEFINITION__COUNT = 0;

  /**
   * The number of structural features of the '<em>steps Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEPS_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.ConditionImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__NUMBER = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.CellCoordImpl <em>Cell Coord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.CellCoordImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getCellCoord()
   * @generated
   */
  int CELL_COORD = 9;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COORD__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COORD__Y = 1;

  /**
   * The number of structural features of the '<em>Cell Coord</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COORD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.NeighborCheckImpl <em>Neighbor Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.NeighborCheckImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getNeighborCheck()
   * @generated
   */
  int NEIGHBOR_CHECK = 10;

  /**
   * The feature id for the '<em><b>Neighbor List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBOR_CHECK__NEIGHBOR_LIST = 0;

  /**
   * The number of structural features of the '<em>Neighbor Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBOR_CHECK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gameofLife.myDsl.impl.NeighborImpl <em>Neighbor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameofLife.myDsl.impl.NeighborImpl
   * @see gameofLife.myDsl.impl.MyDslPackageImpl#getNeighbor()
   * @generated
   */
  int NEIGHBOR = 11;

  /**
   * The feature id for the '<em><b>Dx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBOR__DX = 0;

  /**
   * The feature id for the '<em><b>Dy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBOR__DY = 1;

  /**
   * The number of structural features of the '<em>Neighbor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEIGHBOR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see gameofLife.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link gameofLife.myDsl.Model#getGrid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Grid</em>'.
   * @see gameofLife.myDsl.Model#getGrid()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Grid();

  /**
   * Returns the meta object for the containment reference '{@link gameofLife.myDsl.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rules</em>'.
   * @see gameofLife.myDsl.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for the containment reference '{@link gameofLife.myDsl.Model#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Steps</em>'.
   * @see gameofLife.myDsl.Model#getSteps()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Steps();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.gridDefinition <em>grid Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>grid Definition</em>'.
   * @see gameofLife.myDsl.gridDefinition
   * @generated
   */
  EClass getgridDefinition();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.gridDefinition#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see gameofLife.myDsl.gridDefinition#getWidth()
   * @see #getgridDefinition()
   * @generated
   */
  EAttribute getgridDefinition_Width();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.gridDefinition#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see gameofLife.myDsl.gridDefinition#getHeight()
   * @see #getgridDefinition()
   * @generated
   */
  EAttribute getgridDefinition_Height();

  /**
   * Returns the meta object for the containment reference list '{@link gameofLife.myDsl.gridDefinition#getAliveCells <em>Alive Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alive Cells</em>'.
   * @see gameofLife.myDsl.gridDefinition#getAliveCells()
   * @see #getgridDefinition()
   * @generated
   */
  EReference getgridDefinition_AliveCells();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.rulesDefinition <em>rules Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rules Definition</em>'.
   * @see gameofLife.myDsl.rulesDefinition
   * @generated
   */
  EClass getrulesDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link gameofLife.myDsl.rulesDefinition#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see gameofLife.myDsl.rulesDefinition#getRules()
   * @see #getrulesDefinition()
   * @generated
   */
  EReference getrulesDefinition_Rules();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.ruleDefinition <em>rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule Definition</em>'.
   * @see gameofLife.myDsl.ruleDefinition
   * @generated
   */
  EClass getruleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link gameofLife.myDsl.ruleDefinition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see gameofLife.myDsl.ruleDefinition#getCondition()
   * @see #getruleDefinition()
   * @generated
   */
  EReference getruleDefinition_Condition();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.LiveToDeadRule <em>Live To Dead Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Live To Dead Rule</em>'.
   * @see gameofLife.myDsl.LiveToDeadRule
   * @generated
   */
  EClass getLiveToDeadRule();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.LiveToAliveRule <em>Live To Alive Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Live To Alive Rule</em>'.
   * @see gameofLife.myDsl.LiveToAliveRule
   * @generated
   */
  EClass getLiveToAliveRule();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.DeadToAliveRule <em>Dead To Alive Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dead To Alive Rule</em>'.
   * @see gameofLife.myDsl.DeadToAliveRule
   * @generated
   */
  EClass getDeadToAliveRule();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.stepsDefinition <em>steps Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>steps Definition</em>'.
   * @see gameofLife.myDsl.stepsDefinition
   * @generated
   */
  EClass getstepsDefinition();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.stepsDefinition#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see gameofLife.myDsl.stepsDefinition#getCount()
   * @see #getstepsDefinition()
   * @generated
   */
  EAttribute getstepsDefinition_Count();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see gameofLife.myDsl.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.Condition#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see gameofLife.myDsl.Condition#getNumber()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Number();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.CellCoord <em>Cell Coord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Coord</em>'.
   * @see gameofLife.myDsl.CellCoord
   * @generated
   */
  EClass getCellCoord();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.CellCoord#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see gameofLife.myDsl.CellCoord#getX()
   * @see #getCellCoord()
   * @generated
   */
  EAttribute getCellCoord_X();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.CellCoord#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see gameofLife.myDsl.CellCoord#getY()
   * @see #getCellCoord()
   * @generated
   */
  EAttribute getCellCoord_Y();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.NeighborCheck <em>Neighbor Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neighbor Check</em>'.
   * @see gameofLife.myDsl.NeighborCheck
   * @generated
   */
  EClass getNeighborCheck();

  /**
   * Returns the meta object for the containment reference list '{@link gameofLife.myDsl.NeighborCheck#getNeighborList <em>Neighbor List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Neighbor List</em>'.
   * @see gameofLife.myDsl.NeighborCheck#getNeighborList()
   * @see #getNeighborCheck()
   * @generated
   */
  EReference getNeighborCheck_NeighborList();

  /**
   * Returns the meta object for class '{@link gameofLife.myDsl.Neighbor <em>Neighbor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neighbor</em>'.
   * @see gameofLife.myDsl.Neighbor
   * @generated
   */
  EClass getNeighbor();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.Neighbor#getDx <em>Dx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dx</em>'.
   * @see gameofLife.myDsl.Neighbor#getDx()
   * @see #getNeighbor()
   * @generated
   */
  EAttribute getNeighbor_Dx();

  /**
   * Returns the meta object for the attribute '{@link gameofLife.myDsl.Neighbor#getDy <em>Dy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dy</em>'.
   * @see gameofLife.myDsl.Neighbor#getDy()
   * @see #getNeighbor()
   * @generated
   */
  EAttribute getNeighbor_Dy();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.ModelImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GRID = eINSTANCE.getModel_Grid();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STEPS = eINSTANCE.getModel_Steps();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.gridDefinitionImpl <em>grid Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.gridDefinitionImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getgridDefinition()
     * @generated
     */
    EClass GRID_DEFINITION = eINSTANCE.getgridDefinition();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID_DEFINITION__WIDTH = eINSTANCE.getgridDefinition_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID_DEFINITION__HEIGHT = eINSTANCE.getgridDefinition_Height();

    /**
     * The meta object literal for the '<em><b>Alive Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_DEFINITION__ALIVE_CELLS = eINSTANCE.getgridDefinition_AliveCells();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.rulesDefinitionImpl <em>rules Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.rulesDefinitionImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getrulesDefinition()
     * @generated
     */
    EClass RULES_DEFINITION = eINSTANCE.getrulesDefinition();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES_DEFINITION__RULES = eINSTANCE.getrulesDefinition_Rules();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.ruleDefinitionImpl <em>rule Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.ruleDefinitionImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getruleDefinition()
     * @generated
     */
    EClass RULE_DEFINITION = eINSTANCE.getruleDefinition();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DEFINITION__CONDITION = eINSTANCE.getruleDefinition_Condition();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.LiveToDeadRuleImpl <em>Live To Dead Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.LiveToDeadRuleImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getLiveToDeadRule()
     * @generated
     */
    EClass LIVE_TO_DEAD_RULE = eINSTANCE.getLiveToDeadRule();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.LiveToAliveRuleImpl <em>Live To Alive Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.LiveToAliveRuleImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getLiveToAliveRule()
     * @generated
     */
    EClass LIVE_TO_ALIVE_RULE = eINSTANCE.getLiveToAliveRule();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.DeadToAliveRuleImpl <em>Dead To Alive Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.DeadToAliveRuleImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getDeadToAliveRule()
     * @generated
     */
    EClass DEAD_TO_ALIVE_RULE = eINSTANCE.getDeadToAliveRule();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.stepsDefinitionImpl <em>steps Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.stepsDefinitionImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getstepsDefinition()
     * @generated
     */
    EClass STEPS_DEFINITION = eINSTANCE.getstepsDefinition();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEPS_DEFINITION__COUNT = eINSTANCE.getstepsDefinition_Count();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.ConditionImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__NUMBER = eINSTANCE.getCondition_Number();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.CellCoordImpl <em>Cell Coord</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.CellCoordImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getCellCoord()
     * @generated
     */
    EClass CELL_COORD = eINSTANCE.getCellCoord();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_COORD__X = eINSTANCE.getCellCoord_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_COORD__Y = eINSTANCE.getCellCoord_Y();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.NeighborCheckImpl <em>Neighbor Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.NeighborCheckImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getNeighborCheck()
     * @generated
     */
    EClass NEIGHBOR_CHECK = eINSTANCE.getNeighborCheck();

    /**
     * The meta object literal for the '<em><b>Neighbor List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEIGHBOR_CHECK__NEIGHBOR_LIST = eINSTANCE.getNeighborCheck_NeighborList();

    /**
     * The meta object literal for the '{@link gameofLife.myDsl.impl.NeighborImpl <em>Neighbor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameofLife.myDsl.impl.NeighborImpl
     * @see gameofLife.myDsl.impl.MyDslPackageImpl#getNeighbor()
     * @generated
     */
    EClass NEIGHBOR = eINSTANCE.getNeighbor();

    /**
     * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEIGHBOR__DX = eINSTANCE.getNeighbor_Dx();

    /**
     * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEIGHBOR__DY = eINSTANCE.getNeighbor_Dy();

  }

} //MyDslPackage
