import java.util.Scanner;
//Pide por teclado dos número y genera 10 números aleatorios entre esos números.
// Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
public class ex18 {
    public static void main(String[] args) {
        int M,N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donam un numero:");
        N = scanner.nextInt();
        System.out.println("Donam un altre numero:");
        M = scanner.nextInt();


        for (int i=0;i<10;i++){
            int valorEntero = (int) Math.floor(Math.random()*(N-M+1)+M);
            System.out.println(valorEntero);

        }
    }

}
