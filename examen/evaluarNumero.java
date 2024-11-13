package examen;

import java.util.*;

public class evaluarNumero {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int n = leer.nextInt();
        if(n>0){
            if (n%2==0){
                System.out.println("El numero es positivo y par");
            } else {
                System.out.println("El numero es positivo e impar");
            }
        }
        if(n<0){
            System.out.println("El numero es negativo");
        }
        if (n==0){
            System.out.println("El numero es cero");
        }
    }
}
