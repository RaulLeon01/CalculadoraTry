import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        double num1;
        double num2;
        double result = 0;
        int opc;

        // Capturas de numeros
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = captura.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = captura.nextDouble();

        // Menú
        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        opc = captura.nextInt();

        // Realizar operación seleccionada
        switch(opc) {
            case 1:
                result = suma(num1, num2);
                System.out.println("\nEl resultado de la suma es: " + result);
                break;
            case 2:
                result = resta(num1, num2);
                System.out.println("\nEl resultado de la resta es: " + result);
                break;
            case 3:
                result = multiplicacion(num1, num2);
                System.out.println("\nEl resultado de la multiplicación es: " + result);
                break;
            case 4:
                try {
                    result = division(num1, num2);
                    System.out.println("\nEl resultado de la división es: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("\nError: " + e.getMessage());
                }
                break;
            default:
                System.out.println("\nOpción no válida");
        }
    }

    // Función para suma
    public static double suma(double a, double b) {
        return a + b;
    }

    // Función para resta
    public static double resta(double a, double b) {
        return a - b;
    }

    // Función para multiplicación
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Función para división
    public static double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
}