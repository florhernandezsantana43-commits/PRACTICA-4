package Tema3;

import java.util.Scanner;

public class SecuenciaNumerica {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num,res;
        String pares=" ",impares=" ",multiplos5=" ";
        int sumaDivisibles4=0;
        int contadorMultiplos3=0;
        int contadorDivisibles34 = 0;

        System.out.println("-----ESTADISTICAS DE UNA SECUENCIA NUMERICA-----");
        System.out.println("Ingrese un numero:");
        num= scanner.nextInt();
        while (num <= 0) {
            System.out.print("Ingresa un numero mayor que cero: ");
            num= scanner.nextInt();
        }
        do {
            int opcion;

            System.out.println("Seleccione una opcion:");
            System.out.println("1) Visualisar los numeros pares.\n2) Visualisar los numeros impares.\n" +
                    "3) Aquellos numeros multiplos de 5.\n4) La suma de los numeros divisibles entre 4.\n" +
                    "5) Cuantos numeros son multiplos de 3.\n" +
                    "6) La determinacion de cuantos numeros son divisbles entre 4 y 3");
            opcion= scanner.nextInt();

            for (int i = 1; i < num; i++) {
                switch (opcion) {
                    case 1:
                        if (i % 2 == 0) {
                            pares += i + " ";
                        }
                        break;
                    case 2:
                        if (i % 2 != 0) {
                            impares += i + " ";
                        }
                        break;
                    case 3:
                        if (i % 5 == 0) {
                            multiplos5 += i + " ";
                        }
                        break;
                    case 4:
                        if(i % 4 == 0){
                            sumaDivisibles4 += i;
                        }
                        break;
                    case 5:
                        if (i % 3 == 0) {
                            contadorMultiplos3++;
                        }
                        break;
                    case 6:
                        if (i % 3 == 0 && i % 4 == 0) {
                            contadorDivisibles34++;
                        }
                        break;
                }
            }
            System.out.println("¿Desea elegir otra opcion?\n1) Si\n2) No");
            res= scanner.nextInt();



        }while(res==1);
        System.out.println("------RESUMEN------");
        System.out.println("Numeros pares:" + pares);
        System.out.println("Numeros impares: " + impares);
        System.out.println("Numeros multiplos de 5: " + multiplos5);
        System.out.println("Suma de los numeros divisibles entre 4: " + sumaDivisibles4);
        System.out.println("Cantidad de numeros multiplos de 3: " + contadorMultiplos3);
        System.out.println("Cantidad de numeros divisbles entres 3 y 4: " + contadorDivisibles34);

    }
}
