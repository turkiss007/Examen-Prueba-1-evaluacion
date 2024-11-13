package examen;

public class Pregunta1 {
    
    public static void evaluarNumero (int n) {
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

    public static void main(String[] args) {
        evaluarNumero(-5);
        evaluarNumero(0);
        evaluarNumero(8);
        evaluarNumero(15);
        
    }
}
