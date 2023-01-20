
package com.mycompany.lab1_davidreyes;

import java.util.Scanner;



public class Lab1_DavidReyes {

    public static void main(String[] args) {
        int opcion;
       Scanner l = new Scanner(System.in);
       
        System.out.println("1. torres hanoi\n2. Buscar fechas\n 3. Formula\n0.Salir");
        opcion= l.nextInt();
        switch(opcion){
            case 1:
                int n,origen=1,aux=2,destino=3;
                System.out.println("Ingrese la cantidad de discos: ");
                n=l.nextInt();
                hanoi(n,origen,aux,destino);
                break;
            case 2:
                String prin;
                String[] fecha;
                System.out.println("Ingrese la cadena");
                l.next();
                prin=l.nextLine();
                fecha=prin.split(",");
                for (int i = 0; i < fecha.length; i++) {
                    
                }
                
                break;
                
            case 3:
                
                break;
            case 0:
                System.exit(0);
                
        }
        
        
    }
    
    public static void hanoi(int n, int origen, int aux,int destino){
        if (n==1) {
            System.out.println("Mover disco"+n+"de"+origen+"a"+destino);
        }else{
            hanoi(n-1,origen,destino,aux);
        }
        System.out.println("Mover disco"+n+"de"+origen+"a"+destino);
            
        }
}
