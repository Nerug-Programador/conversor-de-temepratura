import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Bucle para permitir múltiples conversiones
        while (continuar) {
            // Imprime el mensaje de bienvenida
            System.out.println("""
                    **************************************************************
                    Bienvenido al conversor de temperatura...por favor selecciona una opción.
                    1 - Celsius  (C°) a Fahrenheit (°F)
                    2 - Fahrenheit (°F) a Celsius  (C°)
                    3 - Salir
                    **************************************************************
                    """);

            // Lee la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Realiza la conversión según la opción seleccionada
            switch(opcion) {
                case 1:
                    // Si el usuario selecciona convertir de Celsius a Fahrenheit
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    double celsius = scanner.nextDouble(); // Lee la temperatura en Celsius
                    double fahrenheit = (celsius * 1.8) + 32; // Convierte Celsius a Fahrenheit
                    System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit."); // Imprime el resultado
                    break;
                case 2:
                    // Si el usuario selecciona convertir de Fahrenheit a Celsius
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    fahrenheit = scanner.nextDouble(); // Lee la temperatura en Fahrenheit
                    celsius = (fahrenheit - 32) / 1.8; // Convierte Fahrenheit a Celsius
                    System.out.println(fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius."); // Imprime el resultado
                    break;
                case 3:
                    // Si el usuario selecciona salir del programa
                    System.out.println("Gracias por usar el conversor de temperatura. ¡Hasta luego!");
                    continuar = false; // Termina el bucle
                    break;
                default:
                    // Si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida. Por favor, selecciona 1, 2 o 3.");
                    break;
            }
        }
    }
}