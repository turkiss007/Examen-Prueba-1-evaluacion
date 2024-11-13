package examen;

public class Pregunta2 {
    public static void calcularSumaHastaN(int n){
        int suma = 0;
        for(int i=1; i<=n; i++){
            suma = suma + i;
        }
        if (n>0) {
            System.out.println("La suma de los digitos hasta " + n + " es " + suma);
        } else {
            System.out.println(suma);
        }
        
    }
    public static void main(String[] args) {
        calcularSumaHastaN(10);
        calcularSumaHastaN(-2);
    }
}
