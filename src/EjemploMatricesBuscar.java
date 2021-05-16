public class EjemploMatricesBuscar {
        public static void main(String[] args) {
                int[][] matrizEnteros = {
                        {12,123,3,93},
                        {0, 98, 349, 2},
                        {43, 87, 97, 23}
                };

                int numberoBuscar = 97;
                boolean encontrado = false;
                int i;
                int j = 0;

                cicloFila:
                for (i = 0; i < matrizEnteros.length; i++) {
                        for (j = 0; j < matrizEnteros[i].length; j++) {
                                if (matrizEnteros[i][j] == numberoBuscar){
                                        encontrado= true;
                                        break cicloFila;
                                }
                        }
                }

                if (encontrado){
                        System.out.println("Se encontro el elmento en la matriz en la posicion [" + i+"]["+ j+"]" );
                } else {
                        System.out.println("Elemento no encontrado en la matriz");
                }
        }
}
