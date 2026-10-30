package Tema3;

import java.util.Scanner;

public class competenciaDeResistencia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int cantPart,ronda,part,opc,rondasAltas,ganador,repetir;
        double distancia,mayor,promedio;

        do {
            System.out.print("Ingrese la cantidad de participantes: ");
            cantPart = scanner.nextInt();

            double[] total = new double[cantPart];

            rondasAltas = 0;

            for (ronda = 1; ronda <= 5; ronda++) {
                System.out.println("\n----- RONDA " + ronda + " -----");

                for (part = 0; part < cantPart; part++) {
                    System.out.print("Ingrese la distancia del participante "
                            + (part + 1) + ": ");
                    distancia = scanner.nextDouble();

                    while (distancia < 0) {
                        System.out.print("Error. Ingrese una distancia mayor o igual a 0: ");
                        distancia = scanner.nextDouble();
                    }

                    total[part] += distancia;

                    if (distancia < 2) {
                        System.out.println("Categoria: Bajo");
                    } else if (distancia <= 4) {
                        System.out.println("Categoria: Medio");
                    } else {
                        System.out.println("Categoria: Alto");
                        rondasAltas++;
                    }
                }
            }

            mayor = total[0];
            ganador = 1;

            for (part = 1; part < cantPart; part++) {
                if (total[part] > mayor) {
                    mayor = total[part];
                    ganador = part + 1;
                }
            }

                System.out.println("\n===== MENU =====");
                System.out.println("1. Distancia total");
                System.out.println("2. Promedio");
                System.out.println("3. Ganador");
                System.out.println("4. Mostrar todo");

                opc = scanner.nextInt();

                switch (opc) {
                    case 1:
                        for (part = 0; part < cantPart; part++) {
                            System.out.println("Participante "
                                    + (part + 1)
                                    + " total: "
                                    + total[part] + " km");
                        }
                        break;
                    case 2:
                        for (part = 0; part < cantPart; part++) {
                            promedio = total[part] / 5;
                            System.out.println("Participante "
                                    + (part + 1)
                                    + " promedio: "
                                    + promedio + " km");
                        }
                        break;
                    case 3:
                        System.out.println("Ganador: Participante " + ganador);
                        System.out.println("Distancia acumulada: " + mayor + " km");
                        break;
                    case 4:
                        for (part = 0; part < cantPart; part++) {
                            promedio = total[part] / 5;
                            System.out.println("\nParticipante " + (part + 1));
                            System.out.println("Total: " + total[part] + " km");
                            System.out.println("Promedio: " + promedio + " km");
                        }

                        System.out.println("Rondas categoria alta: " + rondasAltas);
                        System.out.println("Ganador: Participante " + ganador);
                        System.out.println("Distancia acumulada: " + mayor + " km");

                        break;

                    default:
                        System.out.println("Opcion no valida");
                }

            System.out.print("\n¿Desea registrar otra competencia?\n1) Si\n2) No ");
            repetir = scanner.nextInt();

        } while (repetir == 1);

    }
}