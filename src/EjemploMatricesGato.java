
import java.util.Random;
import java.util.Scanner;

public class EjemploMatricesGato {

        public static boolean ganadorCPU=false;
        public static boolean ganadorUSR=false;
        public static Random random = new Random();
        public static int eleccionCPU = 0;
        public static String cpu = " O ";
        public static int cpuindexinsert = 0;

        public static String usr = " X ";
        public static int usrindexinsert = 0;
        public static String[] cpuPS = {"99","99","99","99","99"};
        public static String[] usrPS = {"99","99","99","99","99"};
        public static int usraciertos = 0;
        public static int cpuaciertos = 0;

        //                                  0     1   2    3    4    5    6    7    8
        public static String[] psSelect = {"00","02","04","20","22","24","40","42","44"};
        public static String[][] win  = {{psSelect[0], psSelect[1],psSelect[2]},//fila
                                        {psSelect[0], psSelect[3],psSelect[6]},//columna
                                        {psSelect[3], psSelect[4],psSelect[5]},//fila
                                        {psSelect[1], psSelect[4],psSelect[7]},//columna
                                        {psSelect[6], psSelect[7],psSelect[8]},//fila
                                        {psSelect[2], psSelect[5],psSelect[8]},//columna
                                        {psSelect[0], psSelect[4],psSelect[8]},//diagonal
                                        {psSelect[2], psSelect[4],psSelect[6]}};//diagonal


        public static String blank = "   ";
        public static String col = "||";
        public static String row = "===";
        public static boolean errortrycatchinput = false;

        public static String[][] a = new String[5][5];

        public static int Valor;
//               {
//                        {"CPU","||","   ","||","   "},
//                        {"===","||","===","||","==="},
//                        {"   ","||","CPU","||","   "},
//                        {"===","||","===","||","==="},
//                        {"   ","||","   ","||","CPU"}
//                };

        public static void main(String[] args) {
                //La CPU verifica si no hay mas turnos.
                if (usrindexinsert+cpuindexinsert == 9){
                        System.err.println(" NADIE GANA - FIN DEL JUEGO !!!!");
                        System.exit(1);
                }

                if (usrindexinsert == 0 && !errortrycatchinput){
                        System.out.println("||=========================================||");
                        System.out.println("||            El juego del Gato            ||");
                        System.out.println("||=========================================||");
                        construirPlantillaVacia();
                }
                System.out.print("Por favor Ingrese valores numericos no repetidos entre 0 y 8 solamente:");

                Scanner sc = new Scanner(System.in);

                try{
                        Valor = sc.nextInt();
                } catch(Exception e){
                        errortrycatchinput = true;
                        //Volver a llamar al programa
                        main(args);
                }

                if(Valor < 0 || Valor > 8){
                        errortrycatchinput = true;
                        //Volver a llamar al programa
                        main(args);
                }
                errortrycatchinput = false;

                if((usrindexinsert <= 5 || cpuindexinsert <= 5) && (!ganadorCPU && !ganadorUSR)){

                if (respExiste(Valor)){
                        //Volver a llamar al programa
                        main(args);
                }

                modificarPlantillaSeleccion(1, Valor);
                turnoCPU();

                //Volver a llamar al programa
                main(args);
                }

        }

public static boolean respExiste(int position){
                boolean resp = false;
                String ps = psSelect[position];
                for (int i = 0; i < cpuPS.length; i++) {
                        if (ps.compareTo(cpuPS[i]) == 0
                                || ps.compareTo(usrPS[i]) == 0) {
                                resp = true;
                                break;
                        }
                }
                return resp;
        }
public static boolean respExiste(String position){
        boolean resp = false;

        for (int i = 0; i < cpuPS.length; i++) {
                if (position.compareTo(cpuPS[i]) == 0
                        || position.compareTo(usrPS[i]) == 0) {
                        resp = true;
                        break;
                }
        }
        return resp;
}
        public static void turnoCPU(){
                //La CPU verifica si no hay mas turnos.
                if (usrindexinsert+cpuindexinsert == 9){
                        return;
                }

                boolean eleccioncorrecta = false;
                String v;
                while(!eleccioncorrecta){
                        eleccionCPU = random.nextInt(8);
                        v = psSelect[eleccionCPU];
                        //Verifico que no exista la seleccion de la CPU
                        if(!respExiste(v)){
                                modificarPlantillaSeleccion(2, eleccionCPU);
                                eleccioncorrecta = true;
                        }
                }
        }

        public static void modificarPlantillaSeleccion(int playeer, int posicion){

                if (usrindexinsert <= psSelect.length || cpuindexinsert <= psSelect.length) {
                        if (playeer == 1) {
                                a[Integer.parseInt(psSelect[posicion].substring(0,1))][Integer.parseInt(psSelect[posicion].substring(1,2))] = usr;
                                usrPS[usrindexinsert++] = psSelect[posicion];
                        }
                        if (playeer == 2) {
                                a[Integer.parseInt(psSelect[posicion].substring(0,1))][Integer.parseInt(psSelect[posicion].substring(1,2))] = cpu;
                                cpuPS[cpuindexinsert++] = psSelect[posicion];
                        }

                        //LLamar a mostrar Plantilla
                        mostrarPlantillaModificada(playeer);
                        if(usrindexinsert >= 3 || cpuindexinsert >= 3){
                                if (verificaganador(playeer)){
                                        if (playeer==2){
                                                System.err.println(" HA GANADO LA COMPUTADORA!!");
                                                System.err.println(" FIN DEL JUEGO!!");
                                                System.exit(1);
                                        }
                                        if (playeer==1){
                                                System.err.println(" FELICIDADES JUGADOR HAS GANADO!!");
                                                System.err.println(" FIN DEL JUEGO!!");
                                                System.exit(1);
                                        }
                                }
                        }
                }

        }

        public static void mostrarPlantillaModificada(int tipoJugador){
                if(tipoJugador == 1){
                        System.out.println("Jugador usa simbolo \"X\" Responde:");
                }else if(tipoJugador == 2){
                        System.out.println("Computadora usa simbolo \"O\" Responde:");
                }
                //imprimir Plantilla vacia inicia el Juego
                for (String[] strings : a) {
                        for (String string : strings) {
                                System.out.print(string);
                        }
                        System.out.println();
                }

                if(tipoJugador !=0) {
                        System.out.println("==================================");
                }
        }
        public static void construirPlantillaVacia(){
                //Construir Plantilla vacia inicia el Juego
                for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {

                                if(j%2 == 0 && i%2 == 0){

                                        a[i][j] = blank;

                                }
                                if (i%2 != 0){
                                        a[i][j] = row;
                                }
                                if (j%2 != 0){
                                        a[i][j] = col;
                                }
                        }

                }

                //imprimir Plantilla vacia inicia el Juego
                for (String[] strings : a) {
                        for (String string : strings) {
                                System.out.print(string);
                        }
                        System.out.println();
                }
        }

        public static boolean verificaganador(int playertoVerify){

                boolean ganador=false;

                if (playertoVerify == 1 && usrindexinsert >= 3){
                        salircicloUSR:
                        for (String[] strings : win) {
                                if (usraciertos < 3) {
                                        usraciertos = 0;
                                }
                                for (String string : strings) {
                                        //incluimos el ciclo de verificacion de las respuesta del usuario
                                        for (String usrP : usrPS) {
                                                if (Integer.parseInt(usrP.substring(0, 1)) != 9
                                                        && Integer.parseInt(usrP.substring(1, 2)) != 9
                                                        && Integer.parseInt(string.substring(0, 1)) == Integer.parseInt(usrP.substring(0, 1))
                                                        && Integer.parseInt(string.substring(1, 2)) == Integer.parseInt(usrP.substring(1, 2))
                                                ) {
                                                        if (++usraciertos == 3) {
                                                                ganador = true;
                                                                break salircicloUSR;
                                                        }
                                                }
                                        }
                                }

                        }

                }

                if (playertoVerify == 2 && cpuindexinsert >= 3){
                        salircicloCPU:
                        for (String[] strings : win) {
                                if (cpuaciertos < 3) {
                                        cpuaciertos = 0;
                                }
                                for (String string : strings) {
                                        //incluimos el ciclo de verificacion de las respuesta del usuario
                                        for (int k = 0; k < usrPS.length; k++) {
                                                if (Integer.parseInt(cpuPS[k].substring(0, 1)) != 9
                                                        && Integer.parseInt(cpuPS[k].substring(1, 2)) != 9
                                                        && Integer.parseInt(string.substring(0, 1)) == Integer.parseInt(cpuPS[k].substring(0, 1))
                                                        && Integer.parseInt(string.substring(1, 2)) == Integer.parseInt(cpuPS[k].substring(1, 2))
                                                ) {
                                                        if (++cpuaciertos == 3) {
                                                                ganador = true;
                                                                break salircicloCPU;
                                                        }
                                                }
                                        }
                                }

                        }

                }

                return ganador;
        }
}
