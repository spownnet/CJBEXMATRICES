public class EjemploMatricesTransponerMatrices {
        public static void main(String[] args) {
                int[][] a,b;
                a = new int[8][4];
                b = new int[4][8];

                //Llenar el arreglo a e imprirlo
                System.out.println("Matriz A Original");
                for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                                a[i][j] = i + j  * 3;
                                System.out.print(a[i][j] + "\t");
                        }
                        System.out.println();
                }

                //Transponer Matriz "a" para almacenarlo en Matriz "b"
                for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                                b[j][i] = a[i][j];
                        }
                }

                //Imprimir Matriz b
                System.out.println("Matriz B Transpuesta");
                for (int i = 0; i < b.length; i++) {
                        for (int j = 0; j < b[i].length;j++) {
                                System.out.print(b[i][j]+"\t");
                        }
                        System.out.println();
                }



        }
}
