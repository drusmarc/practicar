import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
public class ex20    {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donam un numero");
        num = scanner.nextInt();

        int num2 = (int) Math.sqrt(num);
        int contador;
        for (contador=num2;contador>0;contador--){
            if (num/num2==0){

            }
        }



    }
}
