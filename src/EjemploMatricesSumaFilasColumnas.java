public class EjemploMatricesSumaFilasColumnas {
        public static void main(String[] args) {

                int[][] a = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

                int sumaFila, sumaColumna;

                //Se suma totales de cada fila y columna
                System.out.println("Totales");
                for (int i = 0; i < a.length; i++) {
                        sumaFila=0;
                        sumaColumna=0;
                        for (int j = 0; j < a[i].length; j++) {
                                sumaFila += a[i][j];
                                sumaColumna += a[j][i];
                        }
                        System.out.println("Suma Fila ["+i + "] = " + sumaFila);
                        System.out.println("Suma Columna ["+i + "] = " + sumaColumna);
                }
                
                

        }
}
