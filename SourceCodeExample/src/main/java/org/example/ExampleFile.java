package org.example;

public class ExampleFile {
 private int contador;
 private String nombre;

 public ExampleFile(String nombre) {
     this.nombre = nombre;
     this.contador = 0;
 }

 public void incrementarContador() {
     contador++;
 }

 public String obtenerEstadoContador() {
     if (contador > 10) {
         return "Contador alto";
     } else if (contador > 5) {
         return "Contador medio";
     } else {
         return "Contador bajo";
     }
 }

 public void imprimirNumeros(int n) {
     System.out.println("Imprimiendo los primeros " + n + " números:");
     for (int i = 1; i <= n; i++) {
         System.out.print(i + " ");
     }
     System.out.println();
 }

 public void reducirContador() {
     System.out.println("Reduciendo el contador a cero:");
     while (contador > 0) {
         System.out.println("Contador: " + contador);
         contador--;
     }
     System.out.println("Contador reducido a cero.");
 }

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
