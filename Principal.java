import java.util.*;
public class Principal{
    public static void main(String[] args){
        char eror = 0;
        Scanner in = new Scanner(System.in);
        do{ 
            char elec;
            System.out.println("---AHORCADOS EL JUEGO---");
            System.out.println("Quieres Jugar en Multijugador? s/n");
            elec = in.next().charAt(0);
            switch (elec) {
                case 'n':
                    Individual obj = new Individual();
                    obj.Individual();
                    System.out.println("Quieres volver al menu? s/n");
                    eror = in.next().charAt(0);
                    break;
                case 's':
                    Multijugador obj1 = new Multijugador();
                    obj1.Multijugador();
                    System.out.println("Quieres volver al menu? s/n");
                    eror = in.next().charAt(0);
                    break;
                default:
                    System.out.print("Solo s/n");
                    eror = 's';
                break;
            }
        }while(eror == 's');
        System.out.println("Gracias por jugar :)");
    }
}