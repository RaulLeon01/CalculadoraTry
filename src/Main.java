import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Variables
        double num1;
        double num2;
        double result;

        // Capturas de numeros
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = captura.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = captura.nextInt();

        // Suma
        try {
            result = num1 + num2;
        } catch (ArithmeticException e) {
            System.out.println("Error por letra" + e.getMessage());
        }

        // resta



    }


}