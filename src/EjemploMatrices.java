public class EjemploMatrices {
        public static void main(String[] args) {
                //declaracion de matrices
                int[][] m = new int[2][4];

                m[0][0] = 1;
                m[0][1] = 2;
                m[0][2] = 3;
                m[0][3] = 4;
                m[1][0] = 5;
                m[1][1] = 6;
                m[1][2] = 7;
                m[1][3] = 8;

                System.out.println("Cantidad de Filas = " + m.length);
                System.out.println("Cantidad de Columnas = " + m[0].length);
                System.out.println("Primer elemento de la matriz = " + m[0][0]);
                System.out.println("Ultimo elemento de la matriz = " + m[m.length-1][m[1].length-1]);


                int num1 = m[0][0];
                int num2 = m[0][1];
                int num3 = m[0][2];
                int num4 = m[0][3];

                int num5 = m[1][0];
                int num6 = m[1][1];
                int num7 = m[1][2];
                int num8 = m[1][3];

                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2);
                System.out.println("num3 = " + num3);
                System.out.println("num4 = " + num4);
                System.out.println("num5 = " + num5);
                System.out.println("num6 = " + num6);
                System.out.println("num7 = " + num7);
                System.out.println("num8 = " + num8);
        }
}
