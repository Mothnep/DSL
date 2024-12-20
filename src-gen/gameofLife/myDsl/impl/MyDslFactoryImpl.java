/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl.impl;

import gameofLife.myDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.GRID_DEFINITION: return creategridDefinition();
      case MyDslPackage.RULES_DEFINITION: return createrulesDefinition();
      case MyDslPackage.RULE_DEFINITION: return createruleDefinition();
      case MyDslPackage.LIVE_TO_DEAD_RULE: return createLiveToDeadRule();
      case MyDslPackage.LIVE_TO_ALIVE_RULE: return createLiveToAliveRule();
      case MyDslPackage.DEAD_TO_ALIVE_RULE: return createDeadToAliveRule();
      case MyDslPackage.STEPS_DEFINITION: return createstepsDefinition();
      case MyDslPackage.CONDITION: return createCondition();
      case MyDslPackage.CELL_COORD: return createCellCoord();
      case MyDslPackage.NEIGHBOR_CHECK: return createNeighborCheck();
      case MyDslPackage.NEIGHBOR: return createNeighbor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public gridDefinition creategridDefinition()
  {
    gridDefinitionImpl gridDefinition = new gridDefinitionImpl();
    return gridDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public rulesDefinition createrulesDefinition()
  {
    rulesDefinitionImpl rulesDefinition = new rulesDefinitionImpl();
    return rulesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ruleDefinition createruleDefinition()
  {
    ruleDefinitionImpl ruleDefinition = new ruleDefinitionImpl();
    return ruleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LiveToDeadRule createLiveToDeadRule()
  {
    LiveToDeadRuleImpl liveToDeadRule = new LiveToDeadRuleImpl();
    return liveToDeadRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LiveToAliveRule createLiveToAliveRule()
  {
    LiveToAliveRuleImpl liveToAliveRule = new LiveToAliveRuleImpl();
    return liveToAliveRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeadToAliveRule createDeadToAliveRule()
  {
    DeadToAliveRuleImpl deadToAliveRule = new DeadToAliveRuleImpl();
    return deadToAliveRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public stepsDefinition createstepsDefinition()
  {
    stepsDefinitionImpl stepsDefinition = new stepsDefinitionImpl();
    return stepsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellCoord createCellCoord()
  {
    CellCoordImpl cellCoord = new CellCoordImpl();
    return cellCoord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NeighborCheck createNeighborCheck()
  {
    NeighborCheckImpl neighborCheck = new NeighborCheckImpl();
    return neighborCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Neighbor createNeighbor()
  {
    NeighborImpl neighbor = new NeighborImpl();
    return neighbor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
