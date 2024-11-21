package gameofLife.generator

import gameofLife.myDsl.Condition
import gameofLife.myDsl.Model
import java.util.List
import gameofLife.myDsl.LiveToDeadRule
import gameofLife.myDsl.LiveToAliveRule
import gameofLife.myDsl.DeadToAliveRule

class FileGenerator {
	
	static class RulesDefinition {
    	public List<LiveToDeadRule> liveToDead;
    	public List<LiveToAliveRule> liveToAlive;
    	public List<DeadToAliveRule> deadToAlive;
	}
	
	def static CharSequence toFile(Model root) '''
        package GameOfLife;

        import java.awt.Point;
        import java.util.ArrayList; 

        public class RulesOfLife {

            private static final int WIDTH = «root.grid.width»;
            private static final int HEIGHT = «root.grid.height»;
            private boolean[][] gameBoard = new boolean[WIDTH][HEIGHT];

            public RulesOfLife() {
                initializeBoard();
            }

            private void initializeBoard() {
                «FOR cell : root.grid.aliveCells»
                gameBoard[«cell.x»][«cell.y»] = true;
                «ENDFOR»
            }

            public void computeSurvivors(ArrayList<Point> survivingCells) {
                for (int i = 1; i < gameBoard.length - 1; i++) {
                    for (int j = 1; j < gameBoard[0].length - 1; j++) {
                        int surrounding = 0;
                        if (gameBoard[i - 1][j - 1]) surrounding++;
                        if (gameBoard[i - 1][j]) surrounding++;
                        if (gameBoard[i - 1][j + 1]) surrounding++;
                        if (gameBoard[i][j - 1]) surrounding++;
                        if (gameBoard[i][j + 1]) surrounding++;
                        if (gameBoard[i + 1][j - 1]) surrounding++;
                        if (gameBoard[i + 1][j]) surrounding++;
                        if (gameBoard[i + 1][j + 1]) surrounding++;

                        «generateRules(root.rules, "i-1", "j-1")»
                    }
                }
            }

            «generateApplyRulesMethod(root.rules)»

            public static void main(String[] args) {
                RulesOfLife rules = new RulesOfLife();
                ArrayList<Point> survivingCells = new ArrayList<>();
                rules.computeSurvivors(survivingCells);

                System.out.println("Surviving Cells: ");
                for (Point cell : survivingCells) {
                    System.out.println("(" + cell.x + ", " + cell.y + ")");
                }
            }
        }
    '''
	
	def CharSequence generateRules(RulesDefinition rulesDefinition, String x, String y) '''
        «FOR rule : rulesDefinition.liveToDead»
        // Rule: Live to Dead
        if (gameBoard[i][j] && surrounding «conditionToSymbol(rule.condition)» «rule.condition.number») {
            // Live to Dead rule does not add cell to survivingCells
        }
        «ENDFOR»
        «FOR rule : rulesDefinition.liveToAlive»
        // Rule: Live to Alive
        if (gameBoard[i][j] && surrounding «conditionToSymbol(rule.condition)» «rule.condition.number») {
            survivingCells.add(new Point(«x», «y»));
        }
        «ENDFOR»
        «FOR rule : rulesDefinition.deadToAlive»
        // Rule: Dead to Alive
        if (!gameBoard[i][j] && surrounding «conditionToSymbol(rule.condition)» «rule.condition.number») {
            survivingCells.add(new Point(«x», «y»));
        }
        «ENDFOR»
    '''
    
    def CharSequence generateApplyRulesMethod(RulesDefinition rulesDefinition) '''
        private boolean applyRules(boolean isAlive, int liveNeighbors) {
            «FOR rule : rulesDefinition.liveToDead»
            if (isAlive && liveNeighbors «conditionToSymbol(rule.condition)» «rule.condition.number») {
                return false;
            }
            «ENDFOR»
            «FOR rule : rulesDefinition.liveToAlive»
            if (isAlive && liveNeighbors «conditionToSymbol(rule.condition)» «rule.condition.number») {
                return true;
            }
            «ENDFOR»
            «FOR rule : rulesDefinition.deadToAlive»
            if (!isAlive && liveNeighbors «conditionToSymbol(rule.condition)» «rule.condition.number») {
                return true;
            }
            «ENDFOR»
            return isAlive;
        }
    '''

    def String conditionToSymbol(Condition condition) {
        switch (condition) {
            case ">": return ">"
            case "<": return "<"
            case "=": return "=="
            //default: throw new IllegalArgumentException("Unknown operator: " + condition.operator);
        }
	}
}