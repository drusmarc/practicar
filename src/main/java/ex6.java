import javax.swing.*;

public class ex6 {
    //Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Donam un numero enter");
        int num = Integer.parseInt(text);
        if(num%2==0){
            System.out.println("El numero "+num+" és divisible entre 2");
        }else {
            System.out.println("El numero "+num+" no és divisible entre 2");
        }
    }
}
