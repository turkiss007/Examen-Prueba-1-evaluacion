package examen;

public class Pregunta3 {
    public static void encontrarMaximoMinimo(int[] arreglo) {

        int minimo = arreglo[0];
        int maximo = arreglo[0];

        for (int i= 0; i<arreglo.length; i++){
            if (arreglo[i]<minimo){
                minimo = arreglo[i];
            }
            if(arreglo[i]>maximo){
                maximo = arreglo[i];
            }
        }
        System.out.println("El valor minimo es " + minimo);
        System.out.println("El valor máximo es " + maximo);
    }

    public static void main(String[] args) {
        int arreglo[] = new int[] { 3, 7, 2, 8, 4 };
        encontrarMaximoMinimo(arreglo);
    }
}
