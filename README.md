# Conversor de Temperatura

## Descripción

Este es un programa sencillo de conversión de temperatura desarrollado en Java. El programa permite convertir temperaturas entre Celsius y Fahrenheit, y viceversa. Además, permite al usuario realizar múltiples conversiones y proporciona una opción para finalizar el programa.

## Características

- Conversión de Celsius a Fahrenheit.
- Conversión de Fahrenheit a Celsius.
- Permite realizar múltiples conversiones sin reiniciar el programa.
- Opción para salir del programa.

## ¿Por qué Java?

Java es un lenguaje de programación ampliamente utilizado por su portabilidad y robustez. Ofrece una rica biblioteca estándar y es conocido por su seguridad y manejo automático de la memoria. Estas características lo hacen ideal para desarrollar aplicaciones simples y eficientes como este conversor de temperatura.

## Instrucciones

1. Clona este repositorio.
    ```sh
    git clone https://github.com/Nerug-Programador/conversor-de-temepratura.git
    ```
2. Navega al directorio del proyecto.
    ```sh
    cd conversor-de-temperatura
    ```
3. Compila y ejecuta el programa.
    ```sh
    javac ConversorDeTemperatura.java
    java ConversorDeTemperatura
    ```
## Requisitos Java JDK 8 o superior

    Un entorno de desarrollo (IDE) como IntelliJ IDEA, Eclipse, o simplemente un editor de texto y la terminal.

    Autor William Aranguren - https://github.com/Nerug-Programador

## Licencia

    Este proyecto no tiene una licencia específica.


## Ejemplo de Uso

1. Ejecuta el programa.
2. Selecciona la opción de conversión deseada:
    ```
    **************************************************************
    Bienvenido al conversor de temperatura...por favor selecciona una opción.
    1 - Celsius  (C°) a Fahrenheit (°F)
    2 - Fahrenheit (°F) a Celsius  (C°)
    3 - Salir
    **************************************************************
    ```
3. Ingresa la temperatura en la unidad seleccionada.
4. El programa mostrará la temperatura convertida en la unidad correspondiente.
5. Puedes realizar otra conversión o seleccionar la opción para salir del programa.

## Ejemplo de Código

```java
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
                    double fahrenheit = (celsius * 9/5) + 32; // Convierte Celsius a Fahrenheit
                    System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit."); // Imprime el resultado
                    break;
                case 2:
                    // Si el usuario selecciona convertir de Fahrenheit a Celsius
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    fahrenheit = scanner.nextDouble(); // Lee la temperatura en Fahrenheit
                    celsius = (fahrenheit - 32) * 5/9; // Convierte Fahrenheit a Celsius
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
