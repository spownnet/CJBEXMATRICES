public class EjemploMatricesStringFor {
        public static void main(String[] args) {
                String[][] nombres = new String[3][2];

                nombres[0][0] = "Edgardo";
                nombres[0][1] = "Nazir";

                nombres[1][0] = "Uziel";
                nombres[1][1] = "Marvelin";

                nombres[2][0] = "Pedro";
                nombres[2][1] = "Jose";

                System.out.println("Iterando con For");
                for (int i = 0; i < nombres.length; i++) {

                        for (int j = 0; j < nombres[i].length; j++) {
                                System.out.print(nombres[i][j] + "\t");
                        }
                        System.out.println();
                }
                System.out.println();
                System.out.println("Iterando con ForEach");
                for (String[] col: nombres){

                        for (String nomb: col){
                                System.out.print(nomb + "\t");
                        }
                        System.out.println();
                }

        }
}
