import java.util.Scanner;
//Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos.
// Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y
// si acierta sale, aunque le queden intentos).
public class ex16 {
    public static void main(String[] args) {

        String passwd = "password",contra;
        Scanner scanner = new Scanner(System.in);
        int intents=3;

        do {
            System.out.println("Password:");
            contra = scanner.next();
            if (contra.equals(passwd)){
                break;
            }else {
                System.out.println("Password incorrecte torna a intentar-ho");
                intents--;
                System.out.println("intents restants: "+intents);
            }
        }while (intents != 0);

        if (intents <= 0){
            System.out.println("Has fallat els 3 intents, no saps el password");
        }else {
            System.out.println("Enhorabona!!!");
        }


    }
}
