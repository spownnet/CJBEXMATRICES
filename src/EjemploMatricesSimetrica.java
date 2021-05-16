public class EjemploMatricesSimetrica {
        public static void main(String[] args) {
                  int[][] matirz = {
                          {1,2,3,4},
                          {2,1,0,5},
                          {3,0,1,6},
                          {4,5,6,7},
                  };

                  boolean esimetrica = true;
                int i,j;

                //Comprobacion de si una matrix es simetrica
                //Con el ciclo While
//                i=0;
//                while(i<matirz.length && esimetrica){
//                j=0;
//                while(j < i && esimetrica){
//                        if(matirz[i][j] != matirz[j][i]){
//                                esimetrica = false;
//                        }
//                        j++;
//                }
//                i++;
//                }

                //Comprobacion de si una matrix es simetrica
                //Con el ciclo For
                for (i = 0; i < matirz.length && esimetrica; i++) {
                        for (j = 0; j < i && esimetrica; j++) {
                                if(matirz[i][j] != matirz[j][i]){
                                        esimetrica = false;
                                }
                        }
                }

                if(esimetrica){
                        System.out.println("Es simetriza la matriz");
                }else{
                        System.out.println("NO Es simetriza la matriz");
                }


        }
}
