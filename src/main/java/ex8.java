import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donam un caracter");
        char caracter = scanner.next().charAt(0);

        int codigo = (int) caracter;
        System.out.println(codigo);
    }
}
