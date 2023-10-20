/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_alisonguillen;

import java.util.Scanner;

/**
 *
 * @author Dell i7
 */
public class Lab2P1_AlisonGuillen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pd = new Scanner(System.in);
        int bandera = 0;
        while (bandera != 1) {

            System.out.println("\nMenu: ");
            System.out.println("1. Piedra, Papel o tijera ");
            System.out.println("2. Numeros deficientes, abundantes y perfecto");
            System.out.println("3. Potencia Iterativa");
            System.out.println("4. Salir");
            System.out.print("Escoja su opcion: ");
            int opcion = pd.nextInt();

            if (opcion == 1) {
                System.out.println("Bienvenido a piedra, papel o tijera");
                System.out.println("Sus opciones son las siguientes:");
                System.out.println("0.piedra");
                System.out.println("1.papel");
                System.out.println("2.tijeras");
                System.out.println("Jugador 1 elija una de esas opciones");
                int Jg1 = pd.nextInt();
                System.out.println("Jugador 2 elija una de esas opciones");
                int Jg2 = pd.nextInt();
                if ((Jg1 == Jg2)) {
                    System.out.println("Empate");
                } else if ((Jg1 == 0) && (Jg2 == 2)) {
                    System.out.println("Gana jugador 1");
                } else if ((Jg1 == 2) && (Jg2 == 0)) {
                    System.out.println("Gana jugador 2");
                } else if ((Jg1 == 1) && (Jg2 == 0)) {
                    System.out.println("Gana jugador 1");
                } else if ((Jg1 == 0) && (Jg2 == 1)) {
                    System.out.println("Gana jugador 2");
                } else if ((Jg1 == 2) && (Jg2 == 1)) {
                    System.out.println("Gana jugador 1");
                } else if ((Jg1 == 1) && (Jg2 == 2)) {
                    System.out.println("Gana jugador 2");
                }
            }

            if (opcion == 2) {
                System.out.println("Ingrese su numero: ");
                int velocidad = pd.nextInt();

            }
            if (opcion == 3) {
                int Nbase, Npot, Res = 0, ter;
                System.out.println("Elija su número de Base:");
                Nbase = pd.nextInt();
                System.out.println("Elija su número de potencia:");
                Npot = pd.nextInt();
                ter = Nbase;
                int i = 1;
                while (i <= Npot - 1) {
                    int j = 1;
                    while (j <= Nbase) {
                        Res = Res + ter;
                        j++;
                    }
                    ter = Res;
                    Res = 0;
                    i++;
                }

                System.out.println("El resultado es " + ter);
            }
                if (opcion == 4) {
                    System.out.println("Gracias!");
                    bandera=1;
                }
            }

        }
    }

