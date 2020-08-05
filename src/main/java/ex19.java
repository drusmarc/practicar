import javafx.scene.transform.Scale;

import java.util.Scanner;

//Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
// Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
public class ex19 {
    public static void main(String[] args) {
        int num,contador=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donam un numero enter");
        num = scanner.nextInt();

        do{
            num = num/10;
            contador++;
            System.out.println(contador);
        }while (num>0);

    }
}
