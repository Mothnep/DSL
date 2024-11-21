package gameofLife.generator;

import gameofLife.myDsl.CellCoord;
import gameofLife.myDsl.Condition;
import gameofLife.myDsl.DeadToAliveRule;
import gameofLife.myDsl.LiveToAliveRule;
import gameofLife.myDsl.LiveToDeadRule;
import gameofLife.myDsl.Model;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FileGenerator {
  public static class RulesDefinition {
    public List<LiveToDeadRule> liveToDead;

    public List<LiveToAliveRule> liveToAlive;

    public List<DeadToAliveRule> deadToAlive;
  }

  public static CharSequence toFile(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList; ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final int WIDTH = ");
    int _width = root.getGrid().getWidth();
    _builder.append(_width, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private static final int HEIGHT = ");
    int _height = root.getGrid().getHeight();
    _builder.append(_height, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private boolean[][] gameBoard = new boolean[WIDTH][HEIGHT];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public RulesOfLife() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("initializeBoard();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void initializeBoard() {");
    _builder.newLine();
    {
      EList<CellCoord> _aliveCells = root.getGrid().getAliveCells();
      for(final CellCoord cell : _aliveCells) {
        _builder.append("        ");
        _builder.append("gameBoard[");
        int _x = cell.getX();
        _builder.append(_x, "        ");
        _builder.append("][");
        int _y = cell.getY();
        _builder.append(_y, "        ");
        _builder.append("] = true;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = 1; i < gameBoard.length - 1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j = 1; j < gameBoard[0].length - 1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i - 1][j - 1]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i - 1][j]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i - 1][j + 1]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j - 1]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j + 1]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i + 1][j - 1]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i + 1][j]) surrounding++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i + 1][j + 1]) surrounding++;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("                ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public static ArrayList<Point> initialCoords(){");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _startBoard = FileGenerator.startBoard(root);
    _builder.append(_startBoard, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence startBoard(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ArrayList<Point> coords = new ArrayList<>();");
    _builder.newLine();
    {
      EList<CellCoord> _aliveCells = root.getGrid().getAliveCells();
      for(final CellCoord coord : _aliveCells) {
        _builder.append("coords.add(new Point(");
        int _x = coord.getX();
        _builder.append(_x);
        _builder.append(", ");
        int _y = coord.getY();
        _builder.append(_y);
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("return coords;");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateRules(final FileGenerator.RulesDefinition rulesDefinition, final String x, final String y) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final LiveToDeadRule rule : rulesDefinition.liveToDead) {
        _builder.append("// Rule: Live to Dead");
        _builder.newLine();
        _builder.append("if (gameBoard[i][j] && surrounding ");
        String _conditionToSymbol = FileGenerator.conditionToSymbol(rule.getCondition());
        _builder.append(_conditionToSymbol);
        _builder.append(" ");
        int _number = rule.getCondition().getNumber();
        _builder.append(_number);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("// Live to Dead rule does not add cell to survivingCells");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      for(final LiveToAliveRule rule_1 : rulesDefinition.liveToAlive) {
        _builder.append("// Rule: Live to Alive");
        _builder.newLine();
        _builder.append("if (gameBoard[i][j] && surrounding ");
        String _conditionToSymbol_1 = FileGenerator.conditionToSymbol(rule_1.getCondition());
        _builder.append(_conditionToSymbol_1);
        _builder.append(" ");
        int _number_1 = rule_1.getCondition().getNumber();
        _builder.append(_number_1);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("survivingCells.add(new Point(");
        _builder.append(x, "    ");
        _builder.append(", ");
        _builder.append(y, "    ");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      for(final DeadToAliveRule rule_2 : rulesDefinition.deadToAlive) {
        _builder.append("// Rule: Dead to Alive");
        _builder.newLine();
        _builder.append("if (!gameBoard[i][j] && surrounding ");
        String _conditionToSymbol_2 = FileGenerator.conditionToSymbol(rule_2.getCondition());
        _builder.append(_conditionToSymbol_2);
        _builder.append(" ");
        int _number_2 = rule_2.getCondition().getNumber();
        _builder.append(_number_2);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("survivingCells.add(new Point(");
        _builder.append(x, "    ");
        _builder.append(", ");
        _builder.append(y, "    ");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  public static CharSequence generateApplyRulesMethod(final FileGenerator.RulesDefinition rulesDefinition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private boolean applyRules(boolean isAlive, int liveNeighbors) {");
    _builder.newLine();
    {
      for(final LiveToDeadRule rule : rulesDefinition.liveToDead) {
        _builder.append("    ");
        _builder.append("if (isAlive && liveNeighbors ");
        String _conditionToSymbol = FileGenerator.conditionToSymbol(rule.getCondition());
        _builder.append(_conditionToSymbol, "    ");
        _builder.append(" ");
        int _number = rule.getCondition().getNumber();
        _builder.append(_number, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      for(final LiveToAliveRule rule_1 : rulesDefinition.liveToAlive) {
        _builder.append("    ");
        _builder.append("if (isAlive && liveNeighbors ");
        String _conditionToSymbol_1 = FileGenerator.conditionToSymbol(rule_1.getCondition());
        _builder.append(_conditionToSymbol_1, "    ");
        _builder.append(" ");
        int _number_1 = rule_1.getCondition().getNumber();
        _builder.append(_number_1, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      for(final DeadToAliveRule rule_2 : rulesDefinition.deadToAlive) {
        _builder.append("    ");
        _builder.append("if (!isAlive && liveNeighbors ");
        String _conditionToSymbol_2 = FileGenerator.conditionToSymbol(rule_2.getCondition());
        _builder.append(_conditionToSymbol_2, "    ");
        _builder.append(" ");
        int _number_2 = rule_2.getCondition().getNumber();
        _builder.append(_number_2, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return isAlive;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public static String conditionToSymbol(final Condition condition) {
    boolean _matched = false;
    if (Objects.equals(condition, ">")) {
      _matched=true;
      return ">";
    }
    if (!_matched) {
      if (Objects.equals(condition, "<")) {
        _matched=true;
        return "<";
      }
    }
    if (!_matched) {
      if (Objects.equals(condition, "=")) {
        _matched=true;
        return "==";
      }
    }
    return null;
  }
}
