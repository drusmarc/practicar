import javax.swing.*;

public class ex4 {
    // Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
    public static void main(String[] args) {
        String nom = (String) JOptionPane.showInputDialog("Introdueix el nom: ");
        System.out.println("Benvingut "+nom);

    }
}
