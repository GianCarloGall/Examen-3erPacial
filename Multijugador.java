import java.util.*;
public class Multijugador{
    char v;
    int puntuacion = 0, puntuacion1 = 0;
    public void Multijugador(){
        Scanner teclado = new Scanner(System.in);
        Scanner tec = new Scanner(System.in);
        final int INTENTOS_TOTALES = 20;
        final int dINTENTOS_TOTALES = 20;  
        int intentos = 0, aciertos = 0, aleatorio = 0, edad = 0, edad1 = 0, aleatorio1 = 0, dintentos = 0, daciertos = 0;
        String nombre;
        String nombre1;
        char resp;
        char dresp;
        System.out.println("Inserta el nombre del jugador 1: ");
        nombre = tec.nextLine();
        System.out.println("Inserta la edad del jugador 1: ");
        edad = tec.nextInt();
        System.out.println("Inserta el nombre del jugador 2: ");
        nombre1 = teclado.nextLine();
        System.out.println("Inserta la edad del jugador 2: ");
        edad1 = teclado.nextInt();
        teclado.useDelimiter("\n");
        System.out.println("Bienvenidos "+nombre+" y "+nombre1+" a este Gran juego Ahorcados! \nDonde las palabras son de muchos temas pero sobre todo muy divertidas!");
        do{
            System.out.println("Es el turno del jugador1 "+nombre+" con "+puntuacion+"pts");
            aleatorio = (int)(Math.random()*201);
            String arrayPalabras[] = new String[201];
            // control+g+229 para saltarse las 200 palabras 
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
            arrayPalabras[55] = "montserrat";
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
                System.out.println("Has sumado +1 a tu puntuacion \nLa puntuacion de "+nombre+" actual es de "+puntuacion+ " pts");
            }
            else{
                System.out.print("\nHas Fallado la Palabra era ");
                System.out.println(" ");
                puntuacion = puntuacion - 1 ;
                System.out.println("Has restado -1 a tu puntuacion \nLa puntuacion de "+nombre+" actual es de "+puntuacion+ " pts");
                for(int i = 0; i < copia.length; i++){
                    System.out.print(copia[i] + " ");
                }
            }
            intentos = 0;
            aciertos = 0;
            System.out.println("El turno del jugardor 2 "+nombre1+" con "+puntuacion1+"pts");
            aleatorio1 = (int)(Math.random()*201);
            String aarrayPalabras[] = new String[201];
            // control+g+529 para saltarse las 200 palabras 
            aarrayPalabras[0] = "terminal";
            aarrayPalabras[1] = "holamundo";
            aarrayPalabras[2] = "java";
            aarrayPalabras[3] = "jimmy";
            aarrayPalabras[4] = "netbeans";
            aarrayPalabras[5] = "herencia";
            aarrayPalabras[6] = "cadenas";
            aarrayPalabras[7] = "programacion";
            aarrayPalabras[8] = "condiciones";
            aarrayPalabras[9] = "bucle";
            aarrayPalabras[10] = "leon";
            aarrayPalabras[11] = "jirafa";
            aarrayPalabras[12] = "elefante";
            aarrayPalabras[13] = "panda";
            aarrayPalabras[14] = "murcielago";
            aarrayPalabras[15] = "vaca";
            aarrayPalabras[16] = "perro";
            aarrayPalabras[17] = "gato";
            aarrayPalabras[18] = "delfin";
            aarrayPalabras[19] = "tortuga";
            aarrayPalabras[20] = "batman";
            aarrayPalabras[21] = "superman";
            aarrayPalabras[22] = "flash";
            aarrayPalabras[23] = "cyborg";
            aarrayPalabras[24] = "murjermaravilla";
            aarrayPalabras[25] = "linternaverde";
            aarrayPalabras[26] = "guason";
            aarrayPalabras[27] = "doscaras";
            aarrayPalabras[28] = "aquaman";
            aarrayPalabras[29] = "pinguino";
            aarrayPalabras[30] = "lucy";
            aarrayPalabras[31] = "dictador";
            aarrayPalabras[32] = "rocky";
            aarrayPalabras[33] = "sherk";
            aarrayPalabras[34] = "ted";
            aarrayPalabras[35] = "elhoyo";
            aarrayPalabras[36] = "titanic";
            aarrayPalabras[37] = "forestgump";
            aarrayPalabras[38] = "grinch";
            aarrayPalabras[39] = "bobesponja";
            aarrayPalabras[40] = "bulgaria";
            aarrayPalabras[41] = "portugal";
            aarrayPalabras[42] = "italia";
            aarrayPalabras[43] = "francia";
            aarrayPalabras[44] = "noruega";
            aarrayPalabras[45] = "suiza";
            aarrayPalabras[46] = "alemania";
            aarrayPalabras[47] = "austria";
            aarrayPalabras[48] = "grecia";
            aarrayPalabras[49] = "croacia";
            aarrayPalabras[50] = "carlos";
            aarrayPalabras[51] = "juan";
            aarrayPalabras[52] = "viviana";
            aarrayPalabras[53] = "miguel";
            aarrayPalabras[54] = "cesar";
            aarrayPalabras[55] = "montserrat";
            aarrayPalabras[56] = "laura";
            aarrayPalabras[57] = "sebastian";
            aarrayPalabras[58] = "gian";
            aarrayPalabras[59] = "adrian";
            aarrayPalabras[60] = "fresa";
            aarrayPalabras[61] = "platano";
            aarrayPalabras[62] = "papaya";
            aarrayPalabras[63] = "durazno";
            aarrayPalabras[64] = "melon";
            aarrayPalabras[65] = "sandia";
            aarrayPalabras[66] = "guayaba";
            aarrayPalabras[67] = "manzana";
            aarrayPalabras[68] = "naranja";
            aarrayPalabras[69] = "mandarina";
            aarrayPalabras[70] = "lechuga";
            aarrayPalabras[71] = "aguacate";
            aarrayPalabras[72] = "jitomate";
            aarrayPalabras[73] = "tomate";
            aarrayPalabras[74] = "zanahoria";
            aarrayPalabras[75] = "chayote";
            aarrayPalabras[76] = "cebolla";
            aarrayPalabras[77] = "chile";
            aarrayPalabras[78] = "papa";
            aarrayPalabras[79] = "espinaca";
            aarrayPalabras[80] = "azul";
            aarrayPalabras[81] = "verde";
            aarrayPalabras[82] = "rojo";
            aarrayPalabras[83] = "amarillo";
            aarrayPalabras[84] = "negro";
            aarrayPalabras[85] = "blanco";
            aarrayPalabras[86] = "morado";
            aarrayPalabras[87] = "naranja";
            aarrayPalabras[88] = "turquesa";
            aarrayPalabras[89] = "cian";
            aarrayPalabras[90] = "cromo";
            aarrayPalabras[91] = "estroncio";
            aarrayPalabras[92] = "azufre";
            aarrayPalabras[93] = "uranio";
            aarrayPalabras[94] = "magnesio";
            aarrayPalabras[95] = "cesio";
            aarrayPalabras[96] = "helio";
            aarrayPalabras[97] = "hidrogeno";
            aarrayPalabras[98] = "rutherfordio";
            aarrayPalabras[99] = "oxigeno";
            aarrayPalabras[100] = "hitler";
            aarrayPalabras[102] = "hidalgo";
            aarrayPalabras[103] = "lincon";
            aarrayPalabras[104] = "bilivar";
            aarrayPalabras[105] = "lenin";
            aarrayPalabras[106] = "napoleon";
            aarrayPalabras[107] = "hernan";
            aarrayPalabras[108] = "alejandromagno";
            aarrayPalabras[109] = "tutankamon";
            aarrayPalabras[110] = "rust";
            aarrayPalabras[111] = "minecraft";
            aarrayPalabras[112] = "fifa";
            aarrayPalabras[113] = "mariobros";
            aarrayPalabras[114] = "tetris";
            aarrayPalabras[115] = "gta";
            aarrayPalabras[116] = "callofduty";
            aarrayPalabras[117] = "zelda";
            aarrayPalabras[118] = "csgo";
            aarrayPalabras[119] = "valorant";
            aarrayPalabras[120] = "ingles";
            aarrayPalabras[121] = "frances";
            aarrayPalabras[122] = "matematicas";
            aarrayPalabras[123] = "historia";
            aarrayPalabras[124] = "biologia";
            aarrayPalabras[125] = "quimica";
            aarrayPalabras[126] = "fisica";
            aarrayPalabras[127] = "geometria";
            aarrayPalabras[128] = "geologia";
            aarrayPalabras[129] = "algebra";
            aarrayPalabras[130] = "chile";
            aarrayPalabras[131] = "mexico";
            aarrayPalabras[132] = "argentina";
            aarrayPalabras[133] = "brasil";
            aarrayPalabras[134] = "venezuela";
            aarrayPalabras[135] = "estadosunidos";
            aarrayPalabras[136] = "canada";
            aarrayPalabras[137] = "peru";
            aarrayPalabras[138] = "colombia";
            aarrayPalabras[139] = "ecuador";
            aarrayPalabras[140] = "guerrero";
            aarrayPalabras[141] = "sinaloa";
            aarrayPalabras[142] = "sonora";
            aarrayPalabras[143] = "chihuahua";
            aarrayPalabras[144] = "chiapas";
            aarrayPalabras[145] = "oaxaca";
            aarrayPalabras[146] = "yucatan";
            aarrayPalabras[147] = "veracruz";
            aarrayPalabras[148] = "jalisco";
            aarrayPalabras[149] = "queretaro"; 
            aarrayPalabras[150] = "rusia";
            aarrayPalabras[151] = "japon";
            aarrayPalabras[152] = "china";
            aarrayPalabras[153] = "india";
            aarrayPalabras[154] = "iran";
            aarrayPalabras[155] = "indonesia";
            aarrayPalabras[156] = "tailandia";
            aarrayPalabras[157] = "israel";
            aarrayPalabras[158] = "mongolia";
            aarrayPalabras[159] = "afganistan";
            aarrayPalabras[160] = "marruecos";
            aarrayPalabras[161] = "egipto";
            aarrayPalabras[162] = "sudafrica";
            aarrayPalabras[163] = "nigeria";
            aarrayPalabras[164] = "madagascar";
            aarrayPalabras[165] = "sudan";
            aarrayPalabras[166] = "etiopia";
            aarrayPalabras[167] = "angola";
            aarrayPalabras[168] = "camerun";
            aarrayPalabras[169] = "argelia";
            aarrayPalabras[170] = "pastor";
            aarrayPalabras[171] = "lengua";
            aarrayPalabras[172] = "bistec";
            aarrayPalabras[173] = "ojo";
            aarrayPalabras[174] = "campechano";
            aarrayPalabras[175] = "tripa";
            aarrayPalabras[176] = "pancita";
            aarrayPalabras[177] = "costilla";
            aarrayPalabras[178] = "milanesa";
            aarrayPalabras[179] = "arrachera";
            aarrayPalabras[180] = "mosco";
            aarrayPalabras[181] = "mosca";
            aarrayPalabras[182] = "cienpies";
            aarrayPalabras[183] = "zancudo";
            aarrayPalabras[184] = "mariquita";
            aarrayPalabras[185] = "mariposa";
            aarrayPalabras[186] = "mantis";
            aarrayPalabras[187] = "escarabajo";
            aarrayPalabras[188] = "colibri";
            aarrayPalabras[189] = "cucaracha";
            aarrayPalabras[190] = "thedoors";
            aarrayPalabras[191] = "coldplay";
            aarrayPalabras[192] = "thewhitestripes";
            aarrayPalabras[193] = "adele";
            aarrayPalabras[194] = "rollingstones";
            aarrayPalabras[195] = "queen";
            aarrayPalabras[196] = "thebeatles";
            aarrayPalabras[197] = "metalica";
            aarrayPalabras[198] = "davidbowie";
            aarrayPalabras[199] = "kiss";
            aarrayPalabras[200] = "nirvana";
            System.out.println("Espero que las puedas acertar tu palabra \nRecuerda que algunas palabras son dos palabras sin espacio \nQue empiece el juego!");
            int alea1 = aleatorio1;
            if(alea1 > 0 && alea1 < 10){
                System.out.println("El tema es Programacion!!");
            }
            if(alea1 > 9 && alea1 < 20){
            System.out.println("El tema es Animales!!");
            }
            if(alea1 > 19 && alea1 < 30){
                System.out.println("El tema es Personajes de DC!!");
            }
            if(alea1 > 29 && alea1 < 40){
                System.out.println("El tema es Peliculas!!");
            }
            if(alea1 > 39 && alea1 < 50){
            System.out.println("El tema es Paises de Europa!!");
            }
            if(alea1 > 49 && alea1 < 60){
            System.out.println("El tema es Nombres!!");
            }
            if(alea1 > 59 && alea1 < 70){
                System.out.println("El tema es Frutas!!");
            }
            if(alea1 > 69 && alea1 < 80){
                System.out.println("El tema es Verduras!!");
            }
            if(alea1 > 79 && alea1 < 90){
                System.out.println("El tema es Colores!!");
            }
            if(alea1 > 89 && alea1 < 100){
                System.out.println("El tema es Elementos Quimicos!!");
            }
            if(alea1 > 99 && alea1 < 110){
                System.out.println("El tema es Personajes Historicos!!");
            }
            if(alea1 > 109 && alea1 < 120){
                System.out.println("El tema es Videojuegos!!");
            }
            if(alea1 > 119 && alea1 < 130){
                System.out.println("El tema es Materias!!");
            }
            if(alea1 > 129 && alea1 < 140){
                System.out.println("El tema es Paises de America!");
            }
            if(alea1 > 139 && alea1 < 150){
                System.out.println("El tema es Estados de Mexico!!");
            }
            if(alea1 > 149 && alea1 < 160){
                System.out.println("El tema es Paises de Asia!!");
            }
            if(alea1 > 159 && alea1 < 170){
                System.out.println("El tema es Paises de Africa!!");
            }
            if(alea1 > 169 && alea1 < 180){
                System.out.println("El tema es Tacos!!");
            }
            if(alea1 > 179 && alea1 < 190){
                System.out.println("El tema es Insectos!!");
            }
            if(alea1 > 189 && alea1 < 201){
                System.out.println("El tema es Bandas de Musica o Cantantes!!");
            }  
            char[] ddesguazada = ddesguaza(aarrayPalabras[alea1]);
            char[] dcopia = ddesguaza(aarrayPalabras[alea1]);
            char[] dtusRespuestas = new char[ddesguazada.length];
            for(int i = 0; i < dtusRespuestas.length; i++){
                dtusRespuestas[i] = '_';
            }
            System.out.println("Adivina la palabra!");
            while(dintentos < dINTENTOS_TOTALES && daciertos != dtusRespuestas.length){
                dimprimeOculta(dtusRespuestas);
                System.out.println("\nIntroduce una letra: ");
                dresp = tec.next().toLowerCase().charAt(0);
                for(int i = 0; i < ddesguazada.length; i++){
                    if(ddesguazada[i]==dresp){
                        dtusRespuestas[i] = ddesguazada[i];
                        ddesguazada[i] = ' ';
                        daciertos++;
                    }
                }    
                dintentos++;
            }
            if(daciertos == dtusRespuestas.length){
                System.out.print("\nFelicidades!! has acertado la palabra: ");
                puntuacion1 = puntuacion1 + 1 ;
                imprimeOculta(dtusRespuestas);
                System.out.println(" ");
                System.out.println("Has sumado +1 a tu puntuacion \nLa puntuacion de "+nombre1+" actual es de "+puntuacion1+ "pts");
            }
            else{
                System.out.print("\nHas Fallado la Palabra era ");
                System.out.println(" ");
                puntuacion1 = puntuacion1 - 1 ;
                System.out.println("Has restado -1 a tu puntuacion \nLa puntuacion de "+nombre1+" actual es de "+puntuacion1+ "pts");
                for(int i = 0; i < dcopia.length; i++){
                    System.out.print(dcopia[i] + " ");
                }
            }
            dintentos = 0;
            daciertos = 0;
            System.out.println("Quieren seguir jugando? s/n");
            v = tec.next().charAt(0);
            switch (v){
                case 's':
                    v = 's';
                    break;
                case 'n':
                    v = 'n';
                    break;
                default:
                    v = 's';
                break;
            }
        }while(v == 's'); 
        if(puntuacion > puntuacion1){
            System.out.println("Puntuacion Final: \n"+puntuacion+" - "+puntuacion1);
            System.out.println("Gracias por jugar! y el ganador es: "+nombre+"!! con "+puntuacion+"pts");
            System.out.println("Suerte para la proxima "+nombre1);
        }
        else{
            System.out.println("Puntuacion Final: \n"+puntuacion+" - "+puntuacion1);
            System.out.println("Gracias por jugar! y el ganador es: "+nombre1+" con "+puntuacion1+"pts");
            System.out.println("Suerte para la proxima "+nombre);
        }
        if(puntuacion1 == puntuacion){
            System.out.println("Puntuacion Final: \n"+puntuacion+" - "+puntuacion1);
            System.out.println("Hubo un Empate ambos ganaron!!!!");
            System.out.println("Felicidades "+nombre1+" y "+nombre);
            System.out.println("Graciaspor jugar!!");
        }
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
    private static char[] ddesguaza(String dpalAzar){
        char[] dletras;
            dletras = new char[dpalAzar.length()];
            for(int i = 0; i < dpalAzar.length(); i++){
                dletras[i] = dpalAzar.charAt(i);
            }
            return dletras;
        }
    private static void dimprimeOculta(char[] dtusRespuestas){
        for(int i = 0; i < dtusRespuestas.length; i++){
            System.out.print(dtusRespuestas[i] + " ");
        }
    }
}