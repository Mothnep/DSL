/*
 * generated by Xtext 2.36.0
 */
package gameofLife.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("gameofLife/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
