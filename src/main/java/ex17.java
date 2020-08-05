//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.

import java.util.Date;
import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        String dia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donam un dia de la setmana:");
        dia = scanner.next();

        switch (dia){
            case "dilluns":
            case "dimarts":
            case "dimecres":
            case "dijous":
            case "divendres":
                System.out.println("És un dia laboral");
                break;
            case "dissabte":
            case "diumenge":
                System.out.println("És un dia festiu");
                break;
        }
    }

}
