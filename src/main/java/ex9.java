import javax.swing.*;

public class ex9 {
    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Donam el preu del producte");
        double preu = Double.parseDouble(text);

        double preuAmbIVA = preu*0.21+preu;

        System.out.println("El preu sense Iva és de "+preu);
        System.out.println("El preu amb Iva és de "+preuAmbIVA);
    }
}
