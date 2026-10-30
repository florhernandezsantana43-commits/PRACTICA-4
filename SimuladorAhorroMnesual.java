package Tema3;

import java.util.Scanner;

public class SimuladorAhorroMnesual {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int otraSimulacion,cantidadInicial,metaAhorro,ahorroMensual,plazo,opcion,mesMeta;
        double saldo,interesesGenerados,interes;

        do {

            interesesGenerados = 0;
            mesMeta = 0;

            System.out.print("Ingrese la cantidad inicial de dinero: ");
            cantidadInicial = scanner.nextInt();

            System.out.print("Ingrese su meta de ahorro: ");
            metaAhorro = scanner.nextInt();

            System.out.print("Ingrese su ahorro mensual fijo: ");
            ahorroMensual = scanner.nextInt();

            while (cantidadInicial <= 0 || metaAhorro <= 0 || ahorroMensual <= 0) {

                System.out.println("Error, ingrese valores mayores a cero.");

                System.out.print("Cantidad inicial: ");
                cantidadInicial = scanner.nextInt();

                System.out.print("Meta de ahorro: ");
                metaAhorro = scanner.nextInt();

                System.out.print("Ahorro mensual: ");
                ahorroMensual = scanner.nextInt();
            }

            System.out.println("\nSeleccione el plazo de simulacion:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    plazo = 6;
                    break;
                case 2:
                    plazo = 12;
                    break;
                case 3:
                    plazo = 24;
                    break;
                default:
                    System.out.println("Opcion no valida, se tomaran 24 meses.");
                    plazo = 24;
            }

            saldo = cantidadInicial;

            for (int i = 1; i <= plazo; i++) {
                saldo += ahorroMensual;

                interes = (saldo * 1) / 100;

                saldo += interes;
                interesesGenerados += interes;

                if (saldo >= metaAhorro && mesMeta == 0) {
                    mesMeta = i;
                }
            }

            System.out.println("\n----- RESULTADOS -----");
            System.out.println("Saldo final: " + saldo);
            System.out.println("Intereses generados: " + interesesGenerados);

            if (saldo >= metaAhorro) {
                System.out.println("La meta de ahorro fue alcanzada.");
                System.out.println("Mes en que se alcanzo: " + mesMeta);
            } else {
                System.out.println("No fue posible alcanzar la meta de ahorro.");
            }

            System.out.print("\nDesea realizar otra simulacion?\n1)Si\n2)No ");
            otraSimulacion = scanner.nextInt();

        } while (otraSimulacion == 1);

    }
}