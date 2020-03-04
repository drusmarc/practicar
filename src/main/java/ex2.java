public class ex2 {
    // Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
    public static void main(String[] args) {
        int num1 = 5,num2 =5;

        if(num1 > num2){
            System.out.println("El numero "+num1+" és major "+num2);
        }else if(num2 > num1){
            System.out.println("El numero "+num2+" és major que "+num1);
        }else {
            System.out.println("Els numeros són iguals");
        }
    }
}
