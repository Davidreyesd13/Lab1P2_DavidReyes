package com.mycompany.lab1_davidreyes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab1_DavidReyes {

    public static void main(String[] args) {
        int opcion;
        Scanner l = new Scanner(System.in);
        char resp = 's';
        while (resp == 's') {
            System.out.println("1. torres hanoi\n2. Buscar fechas\n3. Formula\n0.Salir");
            opcion = l.nextInt();
            switch (opcion) {
                case 1:
                    int n,
                     origen = 1,
                     aux = 2,
                     destino = 3;
                    System.out.println("Ingrese la cantidad de discos: ");
                    n = l.nextInt();
                    hanoi(n, origen, aux, destino);
                    break;
                case 2:
                    String prin;
                    String[] fecha;
                    System.out.println("Ingrese la cadena");
                    prin = l.nextLine();
                    fecha = prin.split(",");
                    SimpleDateFormat formt = new SimpleDateFormat("dd/mm/yyyy");
                    Date fech;
                    prin = "";
                    for (int i = 0; i < fecha.length; i++) {
                        System.out.print(fecha[i]);
                    }

                    break;

                case 3:
                    System.out.println("Ingrese un numero");
                    double num = l.nextDouble();
                    double result = 0;
                    System.out.println(formula(num, result,0));
                    break;
                case 0:
                    System.exit(0);

            }

        }
    }

    public static void hanoi(int n, int origen, int aux, int destino) {
        if (n == 1) {
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            return;
        } else {
            hanoi(n - 1, origen, destino, aux);
        }
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        hanoi(n - 1, aux, origen, destino);
    }

    public static double formula(double num, double result,int n) {
        
        if (n == num) {
            result *= 4;
            return result;
        } else {
            result += Math.pow(-1, n) / (2 * n + 1);
            n++;
            return formula(num, result,n);
        }
    }
}
