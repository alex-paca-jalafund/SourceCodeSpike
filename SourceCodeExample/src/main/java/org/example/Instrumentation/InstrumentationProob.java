package org.example.Instrumentation;

public class InstrumentationProob {

    public static void main() {
        System.out.println("Hello, World!");
        System.out.println("hello" + conditionalProob(true));
    }

    public static boolean conditionalProob(boolean bool){
        if(bool == true){
            System.out.println("bool its true");
        }else{
            System.out.println("bool its false");
        }
        return bool;
    }
}
