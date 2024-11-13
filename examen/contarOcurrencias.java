package examen;

import java.util.*;

public class contarOcurrencias {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el texto: ");
        String texto = leer.nextLine();
        
        System.out.println("Introduzca la subcadena: ");
        String subcadena = leer.nextLine();
        
        int contador = 0;
        while (texto.contains(subcadena)) {
            contador = contador + 1;
            texto = texto.replaceFirst(subcadena, "");
        }
        
        System.out.println("El texto contiene " + contador + " \"" + subcadena + "\"");
    }
}
