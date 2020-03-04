import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDeVentas,sumatotal = 0,numasumar;
        System.out.println("Donam el nombre de ventas que necessitis:");
        numDeVentas = scanner.nextInt();

        for (int i=1;i <= numDeVentas;i++){
            System.out.println("Donam el valor de la venta numero "+i);
            numasumar = scanner.nextInt();
            sumatotal = sumatotal + numasumar;
        }

        System.out.println("El valor total de les ventas és de: "+sumatotal);

    }
}
