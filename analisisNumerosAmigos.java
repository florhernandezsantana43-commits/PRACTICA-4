package Tema3;

import java.util.Scanner;

public class analisisNumerosAmigos {
    static void main() {
        Scanner scanner = new Scanner (System.in);
        int num1,num2,res,opc;
        int sumaDivisoresNum1=0;
        int sumaDivisoresNum2=0;

        do {

            System.out.println("Ingrese el primer numero:");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero:");
            num2 = scanner.nextInt();

            while (num1 <= 0 || num2 <= 0) {
                System.out.println("Todos los numeros deben de ser mayores que cero.");
                System.out.println("Ingrese el primer numero:");
                num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero:");
                num2 = scanner.nextInt();
            }

            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDivisoresNum1 += i;
                }
            }
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumaDivisoresNum2 += i;
                }
            }
            if (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1) {
                System.out.println("Siii, los numeros " + num1 + " y " + num2 + " son numeros amigos");
            } else {
                System.out.println("No, los numeros " + num1 + " y " + num2 + " no son numeros amigos");
            }

            System.out.println("-------OPCIONES--------");
            System.out.println(" 1) Ver la suma de los divisores de cada numero");
            System.out.println(" 2) Visualizar unicamente el resultado de la comparacion ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("La suma de sus divisores del " + num1 + " es: " + sumaDivisoresNum1++);
                    System.out.println("La suma de sus divisores del " +  num2 + " es: " + sumaDivisoresNum2++);
                    break;
                case 2:
                    if (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1){
                        System.out.println("Los numeros son amigos");
                    } else {
                        System.out.println("Los numeros no son amigos");
                    }

            }

            System.out.println("¿Quiere volver a intentarlo con otra pareja de numeros? \n 1) Si \n 2) No");
            res = scanner.nextInt();

        } while (res == 1);
    }
}
