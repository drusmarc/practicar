import javax.swing.*;

public class ex7 {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Introdueix un caracter de la taula ASCII");
        int codigo=Integer.parseInt(texto);

        char caracter=(char)codigo;

        System.out.println(caracter);
    }
}
