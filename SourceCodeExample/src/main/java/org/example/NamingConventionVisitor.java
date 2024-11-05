package org.example;

import java.util.HashSet;
import java.util.Set;

public class NamingConventionVisitor extends JavaFunctionBaseVisitor<Void> {

    private StringBuilder instrumentedCode = new StringBuilder();
    private static int blockId = 0;

    // A set to store IDs of visited blocks during runtime
    private static Set<Integer> visitedBlocks = new HashSet<>();

    @Override
    public Void visitMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx) {
        int currentBlockId = blockId++;

        // Add code to mark this block as visited
        instrumentedCode.append("visitedBlocks.add(").append(currentBlockId).append("); // Block ID: ")
                .append(currentBlockId).append("\n");

        // Add entry logging for the method
        instrumentedCode.append("System.out.println(\"Entering method: ").append(ctx.identifier().getText()).append("\");\n");

        return visitChildren(ctx);
    }

    @Override
    public Void visitBlock(JavaFunctionParser.BlockContext ctx) {
        int currentBlockId = blockId++;

        // Insert code at the start of each block to mark it as visited
        instrumentedCode.append("visitedBlocks.add(").append(currentBlockId).append("); // Block ID: ")
                .append(currentBlockId).append("\n");

        return visitChildren(ctx);
    }

    public String getInstrumentedCode() {
        // Include the visitedBlocks initialization and final output
        String prelude = """
            import java.util.HashSet;
            import java.util.Set;

            // Initialize set to keep track of visited blocks
            static Set<Integer> visitedBlocks = new HashSet<>();

            static void reportCoverage() {
                System.out.println("Covered Blocks: " + visitedBlocks);
            }
            """;

        return prelude + "\n" + instrumentedCode.toString();
    }
}
