import java.util.Iterator;

public class EjemploMatricesColumnasVariables {
        public static void main(String[] args) {
                int[][] matiz = new int[3][];

                matiz[0] = new int[2];
                matiz[1] = new int[3];
                matiz[2] = new int[4];

                System.out.println("Tamaño de la matriz = " + matiz.length);
                System.out.println("Tamaño de la matriz fila[0] = " + matiz[0].length);
                System.out.println("Tamaño de la matriz fila[1] = " + matiz[1].length);
                System.out.println("Tamaño de la matriz fila[2] = " + matiz[2].length);

                //Auto Cargamos la matriz
                for (int i = 0; i < matiz.length; i++) {
                        for (int j = 0; j < matiz[i].length; j++) {
                                matiz[i][j] = i*j;
                        }
                }

                //Mostramos los datos
                for (int[] ints : matiz) {
                        for (int anInt : ints) {
                                System.out.print(anInt+" ");
                        }
                        System.out.println();
                } 

        }

}
