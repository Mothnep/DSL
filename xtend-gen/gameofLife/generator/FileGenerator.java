package gameofLife.generator;

import gameofLife.myDsl.Condition;
import gameofLife.myDsl.DeadToAliveRule;
import gameofLife.myDsl.LiveToAliveRule;
import gameofLife.myDsl.LiveToDeadRule;
import gameofLife.myDsl.Model;
import java.util.List;
import java.util.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FileGenerator {
  public static class RulesDefinition {
    public List<LiveToDeadRule> liveToDead;

    public List<LiveToAliveRule> liveToAlive;

    public List<DeadToAliveRule> deadToAlive;
  }

  public static CharSequence toFile(final Model root) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot make a static reference to the non-static method generateRules from the type FileGenerator"
      + "\nCannot make a static reference to the non-static method generateApplyRulesMethod from the type FileGenerator"
      + "\nType mismatch: cannot convert from rulesDefinition to RulesDefinition"
      + "\nType mismatch: cannot convert from rulesDefinition to RulesDefinition");
  }

  public CharSequence generateRules(final FileGenerator.RulesDefinition rulesDefinition, final String x, final String y) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final LiveToDeadRule rule : rulesDefinition.liveToDead) {
        _builder.append("// Rule: Live to Dead");
        _builder.newLine();
        _builder.append("if (gameBoard[i][j] && surrounding ");
        String _conditionToSymbol = this.conditionToSymbol(rule.getCondition());
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
        String _conditionToSymbol_1 = this.conditionToSymbol(rule_1.getCondition());
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
        String _conditionToSymbol_2 = this.conditionToSymbol(rule_2.getCondition());
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

  public CharSequence generateApplyRulesMethod(final FileGenerator.RulesDefinition rulesDefinition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private boolean applyRules(boolean isAlive, int liveNeighbors) {");
    _builder.newLine();
    {
      for(final LiveToDeadRule rule : rulesDefinition.liveToDead) {
        _builder.append("    ");
        _builder.append("if (isAlive && liveNeighbors ");
        String _conditionToSymbol = this.conditionToSymbol(rule.getCondition());
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
        String _conditionToSymbol_1 = this.conditionToSymbol(rule_1.getCondition());
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
        String _conditionToSymbol_2 = this.conditionToSymbol(rule_2.getCondition());
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

  public String conditionToSymbol(final Condition condition) {
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
