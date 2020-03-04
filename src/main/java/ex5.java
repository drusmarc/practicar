import java.util.Scanner;

public class ex5 {
    //Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
    public static void main(String[] args) {
        double resultat,R;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donam el radi del cercle");
        R =  scanner.nextDouble();
        resultat=Math.PI * Math.pow(R,2);
        System.out.println("El resultat es: "+resultat);
    }
}
