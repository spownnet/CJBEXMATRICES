public class EjemploMatricesTranspuestas {
        public static void main(String[] args) {
                int[][] matriz = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                };

                int aux;

                //Matriz Original
                System.out.println("Matriz Original");
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                }
                //Transponer Matrix
                for (int i = 1; i < matriz.length; i++) {
                        for (int j = 0; j < i; j++) {
                                aux= matriz[i][j];
                                matriz[i][j] = matriz[j][i];
                                matriz[j][i] = aux;
                        }
                }

                //Imprimir Matriz Transpuesta
                System.out.println("Matriz Transpuesta");
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                }
        }
}
