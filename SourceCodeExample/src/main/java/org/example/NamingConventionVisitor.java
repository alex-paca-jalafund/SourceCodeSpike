package org.example;
import java.util.regex.Pattern;

public class NamingConventionVisitor extends JavaFunctionBaseVisitor<Void> {

    private StringBuilder instrumentedCode = new StringBuilder();

    @Override
    public Void visitMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx) {
        // Agregar código antes del método
        instrumentedCode.append("// Instrumentación: Registro de entrada al método\n");
        instrumentedCode.append("System.out.println(\"Entrando en \" + \"" + ctx.identifier().getText() + "\");\n");
        return visitChildren(ctx);
    }

    public String getInstrumentedCode() {
        return instrumentedCode.toString();
    }
}

