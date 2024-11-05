package org.example;

public class ExampleFile {

    private int contador;

    public ExampleFile() {
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

    }
