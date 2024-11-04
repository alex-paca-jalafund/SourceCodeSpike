package org.example.Instrumentation;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.LineComment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InstrumentationSourceCode {
    public static void main(String[] args) {
        try {
            // Carga el archivo Java a modificar
            FileInputStream in = new FileInputStream(new File("src/main/java/org/example/Instrumentation/InstrumentationProob.java"));
            JavaParser javaParser = new JavaParser();
            CompilationUnit compilationUnit = javaParser.parse(in).getResult().get();

            // Obtiene la clase del archivo
            ClassOrInterfaceDeclaration myClass = compilationUnit
                    .getClassByName("InstrumentationProob")
                    .orElseThrow(() -> new RuntimeException("Clase no encontrada"));


            // Agregamos el comentario a la clase
            Comment comment = new LineComment("Este es un comentario agregado por JavaParser");
            myClass.setComment(comment);
            // Guarda el archivo modificado
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/example/Instrumentation/output/InstrumentationProob.java");
            fileOutputStream.write(compilationUnit.toString().getBytes());
            fileOutputStream.close();

            System.out.println("Comentario agregado exitosamente al final de la clase.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
