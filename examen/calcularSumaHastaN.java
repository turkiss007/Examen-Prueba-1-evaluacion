package examen;

import java.util.Scanner;

public class calcularSumaHastaN {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int n = leer.nextInt();
        int suma = 0;
        if(n>0){
            for(int i=1; i<=n; i++){
                suma = suma + i;
            }
            System.out.println("La suma de los digitos hasta n es " + suma);
        }else{
            System.out.println("0");
        }
    }
}
