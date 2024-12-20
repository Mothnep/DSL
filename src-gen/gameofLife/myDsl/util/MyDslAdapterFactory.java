/**
 * generated by Xtext 2.36.0
 */
package gameofLife.myDsl.util;

import gameofLife.myDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gameofLife.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyDslSwitch<Adapter> modelSwitch =
    new MyDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casegridDefinition(gridDefinition object)
      {
        return creategridDefinitionAdapter();
      }
      @Override
      public Adapter caserulesDefinition(rulesDefinition object)
      {
        return createrulesDefinitionAdapter();
      }
      @Override
      public Adapter caseruleDefinition(ruleDefinition object)
      {
        return createruleDefinitionAdapter();
      }
      @Override
      public Adapter caseLiveToDeadRule(LiveToDeadRule object)
      {
        return createLiveToDeadRuleAdapter();
      }
      @Override
      public Adapter caseLiveToAliveRule(LiveToAliveRule object)
      {
        return createLiveToAliveRuleAdapter();
      }
      @Override
      public Adapter caseDeadToAliveRule(DeadToAliveRule object)
      {
        return createDeadToAliveRuleAdapter();
      }
      @Override
      public Adapter casestepsDefinition(stepsDefinition object)
      {
        return createstepsDefinitionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseCellCoord(CellCoord object)
      {
        return createCellCoordAdapter();
      }
      @Override
      public Adapter caseNeighborCheck(NeighborCheck object)
      {
        return createNeighborCheckAdapter();
      }
      @Override
      public Adapter caseNeighbor(Neighbor object)
      {
        return createNeighborAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.gridDefinition <em>grid Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.gridDefinition
   * @generated
   */
  public Adapter creategridDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.rulesDefinition <em>rules Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.rulesDefinition
   * @generated
   */
  public Adapter createrulesDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.ruleDefinition <em>rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.ruleDefinition
   * @generated
   */
  public Adapter createruleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.LiveToDeadRule <em>Live To Dead Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.LiveToDeadRule
   * @generated
   */
  public Adapter createLiveToDeadRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.LiveToAliveRule <em>Live To Alive Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.LiveToAliveRule
   * @generated
   */
  public Adapter createLiveToAliveRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.DeadToAliveRule <em>Dead To Alive Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.DeadToAliveRule
   * @generated
   */
  public Adapter createDeadToAliveRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.stepsDefinition <em>steps Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.stepsDefinition
   * @generated
   */
  public Adapter createstepsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.CellCoord <em>Cell Coord</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.CellCoord
   * @generated
   */
  public Adapter createCellCoordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.NeighborCheck <em>Neighbor Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.NeighborCheck
   * @generated
   */
  public Adapter createNeighborCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gameofLife.myDsl.Neighbor <em>Neighbor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gameofLife.myDsl.Neighbor
   * @generated
   */
  public Adapter createNeighborAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyDslAdapterFactory
