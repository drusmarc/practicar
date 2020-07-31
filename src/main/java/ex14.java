import java.util.Scanner;

public class ex14 {

    //Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante
    // (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
    public static void main(String[] args) {
        //variables
        int a,b,c,forarrel,arrel,divisor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Donam el valor de la variable a: ");
        a = scanner.nextInt();

        System.out.println("Donam el valor de la variable b: ");
        b = scanner.nextInt();

        System.out.println("Donam el valor de la variable c: ");
        c = scanner.nextInt();

        //Preparacio del divident

        //Preparació de la variable b
        if (b < 0){
            forarrel = b * -1;
        }else{
            forarrel = b * -1;
        }
        //Preparacio de nums dins l'arrel
        arrel= (int) (Math.pow(b,2)-4*a*c);
        System.out.println(arrel);
        arrel = (int) Math.sqrt(arrel);

        //Preparació del divisor
        divisor = a*2;

        //Resultat positiu
        int resultat_positiu;
        resultat_positiu = (forarrel + arrel)/divisor;


        //Resultat negatiu
        int resultat_negatiu;
        resultat_negatiu = (forarrel - arrel)/divisor;

        System.out.println("Resultat de l'arrel de les variables:");
        System.out.println("Primer resultat:  "+resultat_positiu);
        System.out.println("Segon  resultat:  "+resultat_negatiu);
    }
}

