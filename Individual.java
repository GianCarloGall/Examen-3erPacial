import java.util.*;
public class Individual{
    public void Individual() {
        Scanner teclado = new Scanner(System.in);
        Scanner tec = new Scanner(System.in);
        final int INTENTOS_TOTALES = 20; 
        int intentos = 0, aciertos = 0, aleatorio = 0, edad = 0, puntuacion = 0;
        String nombre = " ";
        char resp;
        System.out.println("Inserta tu nombre: ");
        nombre = tec.nextLine();
        System.out.println("Inserta tu edad: ");
        edad = tec.nextInt();
        teclado.useDelimiter("\n");
        System.out.println("Bienvenido "+nombre+" a este Gran juego Ahorcados! \nDonde las palabras son de muchos temas pero sobre todo muy divertidas!");
        do{
            aleatorio = (int)(Math.random()*201);
            String arrayPalabras[] = new String[201];
            // control+g+220 para saltarse las 200 palabras 
            arrayPalabras[0] = "terminal";
            arrayPalabras[1] = "holamundo";
            arrayPalabras[2] = "java";
            arrayPalabras[3] = "jimmy";
            arrayPalabras[4] = "netbeans";
            arrayPalabras[5] = "herencia";
            arrayPalabras[6] = "cadenas";
            arrayPalabras[7] = "programacion";
            arrayPalabras[8] = "condiciones";
            arrayPalabras[9] = "bucle";
            arrayPalabras[10] = "leon";
            arrayPalabras[11] = "jirafa";
            arrayPalabras[12] = "elefante";
            arrayPalabras[13] = "panda";
            arrayPalabras[14] = "murcielago";
            arrayPalabras[15] = "vaca";
            arrayPalabras[16] = "perro";
            arrayPalabras[17] = "gato";
            arrayPalabras[18] = "delfin";
            arrayPalabras[19] = "tortuga";
            arrayPalabras[20] = "batman";
            arrayPalabras[21] = "superman";
            arrayPalabras[22] = "flash";
            arrayPalabras[23] = "cyborg";
            arrayPalabras[24] = "murjermaravilla";
            arrayPalabras[25] = "linternaverde";
            arrayPalabras[26] = "guason";
            arrayPalabras[27] = "doscaras";
            arrayPalabras[28] = "aquaman";
            arrayPalabras[29] = "pinguino";
            arrayPalabras[30] = "lucy";
            arrayPalabras[31] = "dictador";
            arrayPalabras[32] = "rocky";
            arrayPalabras[33] = "sherk";
            arrayPalabras[34] = "ted";
            arrayPalabras[35] = "elhoyo";
            arrayPalabras[36] = "titanic";
            arrayPalabras[37] = "forestgump";
            arrayPalabras[38] = "grinch";
            arrayPalabras[39] = "bobesponja";
            arrayPalabras[40] = "bulgaria";
            arrayPalabras[41] = "portugal";
            arrayPalabras[42] = "italia";
            arrayPalabras[43] = "francia";
            arrayPalabras[44] = "noruega";
            arrayPalabras[45] = "suiza";
            arrayPalabras[46] = "alemania";
            arrayPalabras[47] = "austria";
            arrayPalabras[48] = "grecia";
            arrayPalabras[49] = "croacia";
            arrayPalabras[50] = "carlos";
            arrayPalabras[51] = "juan";
            arrayPalabras[52] = "viviana";
            arrayPalabras[53] = "miguel";
            arrayPalabras[54] = "cesar";
            arrayPalabras[55] = "antonio";
            arrayPalabras[56] = "laura";
            arrayPalabras[57] = "sebastian";
            arrayPalabras[58] = "gian";
            arrayPalabras[59] = "adrian";
            arrayPalabras[60] = "fresa";
            arrayPalabras[61] = "platano";
            arrayPalabras[62] = "papaya";
            arrayPalabras[63] = "durazno";
            arrayPalabras[64] = "melon";
            arrayPalabras[65] = "sandia";
            arrayPalabras[66] = "guayaba";
            arrayPalabras[67] = "manzana";
            arrayPalabras[68] = "naranja";
            arrayPalabras[69] = "mandarina";
            arrayPalabras[70] = "lechuga";
            arrayPalabras[71] = "aguacate";
            arrayPalabras[72] = "jitomate";
            arrayPalabras[73] = "tomate";
            arrayPalabras[74] = "zanahoria";
            arrayPalabras[75] = "chayote";
            arrayPalabras[76] = "cebolla";
            arrayPalabras[77] = "chile";
            arrayPalabras[78] = "papa";
            arrayPalabras[79] = "espinaca";
            arrayPalabras[80] = "azul";
            arrayPalabras[81] = "verde";
            arrayPalabras[82] = "rojo";
            arrayPalabras[83] = "amarillo";
            arrayPalabras[84] = "negro";
            arrayPalabras[85] = "blanco";
            arrayPalabras[86] = "morado";
            arrayPalabras[87] = "naranja";
            arrayPalabras[88] = "turquesa";
            arrayPalabras[89] = "cian";
            arrayPalabras[90] = "cromo";
            arrayPalabras[91] = "estroncio";
            arrayPalabras[92] = "azufre";
            arrayPalabras[93] = "uranio";
            arrayPalabras[94] = "magnesio";
            arrayPalabras[95] = "cesio";
            arrayPalabras[96] = "helio";
            arrayPalabras[97] = "hidrogeno";
            arrayPalabras[98] = "rutherfordio";
            arrayPalabras[99] = "oxigeno";
            arrayPalabras[100] = "hitler";
            arrayPalabras[102] = "hidalgo";
            arrayPalabras[103] = "lincon";
            arrayPalabras[104] = "bilivar";
            arrayPalabras[105] = "lenin";
            arrayPalabras[106] = "napoleon";
            arrayPalabras[107] = "hernan";
            arrayPalabras[108] = "alejandromagno";
            arrayPalabras[109] = "tutankamon";
            arrayPalabras[110] = "rust";
            arrayPalabras[111] = "minecraft";
            arrayPalabras[112] = "fifa";
            arrayPalabras[113] = "mariobros";
            arrayPalabras[114] = "tetris";
            arrayPalabras[115] = "gta";
            arrayPalabras[116] = "callofduty";
            arrayPalabras[117] = "zelda";
            arrayPalabras[118] = "csgo";
            arrayPalabras[119] = "valorant";
            arrayPalabras[120] = "ingles";
            arrayPalabras[121] = "frances";
            arrayPalabras[122] = "matematicas";
            arrayPalabras[123] = "historia";
            arrayPalabras[124] = "biologia";
            arrayPalabras[125] = "quimica";
            arrayPalabras[126] = "fisica";
            arrayPalabras[127] = "geometria";
            arrayPalabras[128] = "geologia";
            arrayPalabras[129] = "algebra";
            arrayPalabras[130] = "chile";
            arrayPalabras[131] = "mexico";
            arrayPalabras[132] = "argentina";
            arrayPalabras[133] = "brasil";
            arrayPalabras[134] = "venezuela";
            arrayPalabras[135] = "estadosunidos";
            arrayPalabras[136] = "canada";
            arrayPalabras[137] = "peru";
            arrayPalabras[138] = "colombia";
            arrayPalabras[139] = "ecuador";
            arrayPalabras[140] = "guerrero";
            arrayPalabras[141] = "sinaloa";
            arrayPalabras[142] = "sonora";
            arrayPalabras[143] = "chihuahua";
            arrayPalabras[144] = "chiapas";
            arrayPalabras[145] = "oaxaca";
            arrayPalabras[146] = "yucatan";
            arrayPalabras[147] = "veracruz";
            arrayPalabras[148] = "jalisco";
            arrayPalabras[149] = "queretaro"; 
            arrayPalabras[150] = "rusia";
            arrayPalabras[151] = "japon";
            arrayPalabras[152] = "china";
            arrayPalabras[153] = "india";
            arrayPalabras[154] = "iran";
            arrayPalabras[155] = "indonesia";
            arrayPalabras[156] = "tailandia";
            arrayPalabras[157] = "israel";
            arrayPalabras[158] = "mongolia";
            arrayPalabras[159] = "afganistan";
            arrayPalabras[160] = "marruecos";
            arrayPalabras[161] = "egipto";
            arrayPalabras[162] = "sudafrica";
            arrayPalabras[163] = "nigeria";
            arrayPalabras[164] = "madagascar";
            arrayPalabras[165] = "sudan";
            arrayPalabras[166] = "etiopia";
            arrayPalabras[167] = "angola";
            arrayPalabras[168] = "camerun";
            arrayPalabras[169] = "argelia";
            arrayPalabras[170] = "pastor";
            arrayPalabras[171] = "lengua";
            arrayPalabras[172] = "bistec";
            arrayPalabras[173] = "ojo";
            arrayPalabras[174] = "campechano";
            arrayPalabras[175] = "tripa";
            arrayPalabras[176] = "pancita";
            arrayPalabras[177] = "costilla";
            arrayPalabras[178] = "milanesa";
            arrayPalabras[179] = "arrachera";
            arrayPalabras[180] = "mosco";
            arrayPalabras[181] = "mosca";
            arrayPalabras[182] = "cienpies";
            arrayPalabras[183] = "zancudo";
            arrayPalabras[184] = "mariquita";
            arrayPalabras[185] = "mariposa";
            arrayPalabras[186] = "mantis";
            arrayPalabras[187] = "escarabajo";
            arrayPalabras[188] = "colibri";
            arrayPalabras[189] = "cucaracha";
            arrayPalabras[190] = "thedoors";
            arrayPalabras[191] = "coldplay";
            arrayPalabras[192] = "thewhitestripes";
            arrayPalabras[193] = "adele";
            arrayPalabras[194] = "rollingstones";
            arrayPalabras[195] = "queen";
            arrayPalabras[196] = "thebeatles";
            arrayPalabras[197] = "metalica";
            arrayPalabras[198] = "davidbowie";
            arrayPalabras[199] = "kiss";
            arrayPalabras[200] = "nirvana";
            System.out.println("Espero que las puedas acertar tu palabra \nRecuerda que algunas palabras son dos palabras sin espacio \nQue empiece el juego!");
            int alea = aleatorio;
            if(alea > 0 && alea < 10){
                System.out.println("El tema es Programacion!!");
            }
            if(alea > 9 && alea < 20){
            System.out.println("El tema es Animales!!");
            }
            if(alea > 19 && alea < 30){
                System.out.println("El tema es Personajes de DC!!");
            }
            if(alea > 29 && alea < 40){
                System.out.println("El tema es Peliculas!!");
            }
            if(alea > 39 && alea < 50){
            System.out.println("El tema es Paises de Europa!!");
            }
            if(alea > 49 && alea < 60){
            System.out.println("El tema es Nombres!!");
            }
            if(alea > 59 && alea < 70){
                System.out.println("El tema es Frutas!!");
            }
            if(alea > 69 && alea < 80){
                System.out.println("El tema es Verduras!!");
            }
            if(alea > 79 && alea < 90){
                System.out.println("El tema es Colores!!");
            }
            if(alea > 89 && alea < 100){
                System.out.println("El tema es Elementos Quimicos!!");
            }
            if(alea > 99 && alea < 110){
                System.out.println("El tema es Personajes Historicos!!");
            }
            if(alea > 109 && alea < 120){
                System.out.println("El tema es Videojuegos!!");
            }
            if(alea > 119 && alea < 130){
                System.out.println("El tema es Materias!!");
            }
            if(alea > 129 && alea < 140){
                System.out.println("El tema es Paises de America!");
            }
            if(alea > 139 && alea < 150){
                System.out.println("El tema es Estados de Mexico!!");
            }
            if(alea > 149 && alea < 160){
                System.out.println("El tema es Paises de Asia!!");
            }
            if(alea > 159 && alea < 170){
                System.out.println("El tema es Paises de Africa!!");
            }
            if(alea > 169 && alea < 180){
                System.out.println("El tema es Tacos!!");
            }
            if(alea > 179 && alea < 190){
                System.out.println("El tema es Insectos!!");
            }
            if(alea > 189 && alea < 201){
                System.out.println("El tema es Bandas de Musica o Cantantes!!");
            }  
            char[] desguazada = desguaza(arrayPalabras[alea]);
            char[] copia = desguaza(arrayPalabras[alea]);
            char[] tusRespuestas = new char[desguazada.length];
            for(int i = 0; i < tusRespuestas.length; i++){
                tusRespuestas[i] = '_';
            }
            System.out.println("Adivina la palabra!");
            while(intentos < INTENTOS_TOTALES && aciertos != tusRespuestas.length){
                imprimeOculta(tusRespuestas);
                System.out.println("\nIntroduce una letra: ");
                resp = tec.next().toLowerCase().charAt(0);
                for(int i = 0; i < desguazada.length; i++){
                    if(desguazada[i]==resp){
                        tusRespuestas[i] = desguazada[i];
                        desguazada[i] = ' ';
                        aciertos++;
                    }
                }    
                intentos++;
            }
            if(aciertos == tusRespuestas.length){
                System.out.print("\nFelicidades!! has acertado la palabra: ");
                puntuacion = puntuacion + 1 ;
                imprimeOculta(tusRespuestas);
                System.out.println(" ");
                System.out.println("Has sumado +1 a tu puntuacion \nLa puntuacion de actual "+nombre+" es de "+puntuacion+ " pts");
            }
            else{
                System.out.print("\nHas Fallado la Palabra era ");
                System.out.println(" ");
                puntuacion = puntuacion - 1 ;
                System.out.println("Has restado -1 a tu puntuacion \nLa puntuacion de actual "+nombre+" es de "+puntuacion+ " pts");
                for(int i = 0; i < copia.length; i++){
                    System.out.print(copia[i] + " ");
                }
            }
            intentos = 0;
            aciertos = 0;
            System.out.println("\nQuieres volver a jugar? s/n");
            resp = tec.next().charAt(0);
        }while( resp == 's');
    }
    private static char[] desguaza(String palAzar){
        char[] letras;
            letras = new char[palAzar.length()];
            for(int i = 0; i < palAzar.length(); i++){
                letras[i] = palAzar.charAt(i);
            }
            return letras;
        }
    private static void imprimeOculta(char[] tusRespuestas){
        for(int i = 0; i < tusRespuestas.length; i++){
            System.out.print(tusRespuestas[i] + " ");
        }
    }
    public static char pregunta(String men, Scanner teclado) {
        char resp;
            System.out.println(men + " (s/n)");
            resp = teclado.next().toLowerCase().charAt(0);
            while (resp != 's' && resp != 'n') {
                System.out.println("Error! solo se admite S o N");
                resp = teclado.next().toLowerCase().charAt(0);
            }
            return resp;
        }   
    }  