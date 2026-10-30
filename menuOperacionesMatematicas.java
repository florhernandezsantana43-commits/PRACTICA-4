package Tema3;

import java.util.Scanner;

public class menuOperacionesMatematicas {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcion, numero,suma,i;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Calcular el cuadrado de un numero");
            System.out.println("2. Calcular el cubo de un numero");
            System.out.println("3. Determinar si un numero es par o impar");
            System.out.println("4. Calcular la suma de los numeros del 1 hasta un numero");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un numero positivo: ");
                    numero = scanner.nextInt();
                    if (numero > 0) {
                        System.out.println("El cuadrado es: " + (numero * numero));
                    } else {
                        System.out.println("Error, ingrese un numero positivo.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese un numero positivo: ");
                    numero = scanner.nextInt();

                    if (numero > 0) {
                        System.out.println("El cubo es: " + (numero * numero * numero));
                    } else {
                        System.out.println("Error, ingrese un numero positivo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese un numero: ");
                    numero = scanner.nextInt();

                    if (numero % 2 == 0) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese un numero positivo: ");
                    numero = scanner.nextInt();

                    if (numero > 0) {
                        suma = 0;
                        for (i = 1; i <= numero; i++) {
                            suma += i;
                        }
                        System.out.println("La suma es: " + suma);
                    } else {
                        System.out.println("Error, ingrese un numero positivo.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Error, opcion no valida.");
            }
        } while (opcion != 5);
    }
}