package org.example;

public class ExampleFile {
 // Atributos de la clase
 private int contador;
 private String nombre;

 // Constructor de la clase
 public ExampleFile(String nombre) {
     this.nombre = nombre;
     this.contador = 0;
 }

 // Método para incrementar el contador
 public void incrementarContador() {
     contador++;
 }

 // Método que utiliza un if-else para determinar el estado del contador
 public String obtenerEstadoContador() {
     if (contador > 10) {
         return "Contador alto";
     } else if (contador > 5) {
         return "Contador medio";
     } else {
         return "Contador bajo";
     }
 }

 // Método que usa un bucle for para imprimir los primeros n números
 public void imprimirNumeros(int n) {
     System.out.println("Imprimiendo los primeros " + n + " números:");
     for (int i = 1; i <= n; i++) {
         System.out.print(i + " ");
     }
     System.out.println();
 }

 // Método que usa un bucle while para reducir el contador a cero
 public void reducirContador() {
     System.out.println("Reduciendo el contador a cero:");
     while (contador > 0) {
         System.out.println("Contador: " + contador);
         contador--;
     }
     System.out.println("Contador reducido a cero.");
 }

 // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de la clase Ejemplo
        ExampleFile ejemplo = new ExampleFile("Mi Ejemplo");

        // Incrementar el contador varias veces
        for (int i = 0; i < 8; i++) {
            ejemplo.incrementarContador();
        }

        // Mostrar el estado del contador
        System.out.println("Estado del contador: " + ejemplo.obtenerEstadoContador());

        // Imprimir los primeros 5 números
        ejemplo.imprimirNumeros(5);

        // Reducir el contador a cero
        ejemplo.reducirContador();
    }

}
