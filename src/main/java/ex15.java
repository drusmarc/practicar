import java.util.Scanner;
// Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
public class ex15 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Donam un numero superior o igual a 0");
            num = scanner.nextInt();


        }while (num < 0);

        System.out.println("Correcte");

    }
}
