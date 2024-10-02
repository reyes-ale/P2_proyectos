/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class JuegoCartas {
static int ganador, ganador2;
static Baraja baraja = new Baraja();
static ArrayList <Jugador> ganadores = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerS = new Scanner(System.in);
        ArrayList <Jugador> jugadores = new ArrayList();
        ArrayList <Carta> mano = new ArrayList();
        
        
        System.out.print("* * * * * M E N U * * * * *");
        System.out.print("\n 1. Agregar nuevo jugador \n 2. Barajar \n 3. Repartir \n 4. Imprimir ganadores \n "
                + "5. Imprimir listado de los ultimos 5 ganadores \n 6. Salir \n Ingrese una opcion: ");
        int op = leer.nextInt();
        
        
        while (op!=6){
            
            switch (op) {
                
                case 1:
                    if (jugadores.size()>=10){
                        System.out.println("Ya se ha llegado al maximo de jugadores");
                        System.out.println("No se pudo agregar otro jugador");
                    }
                    else{
                        System.out.print("Ingrese el nombre del jugador: ");
                        String nombre = leerS.nextLine();
                        jugadores.add(new Jugador(nombre));
                    }
                    break;
                    
                case 2:
                    baraja.barajarse();
                    System.out.println(baraja);
                    
                    break;
                    
                case 3:
                    if (baraja.cartas.size() < 5 * jugadores.size()) {
                        System.out.println("La ronda a terminado, ya no hay suficientes cartas");

                    } else {
                        for (int i = 0; i < jugadores.size(); i++) {
                            jugadores.get(i).getMano().clear();
                        }
                        mano.clear();
                        for (int j = 0; j < 5; j++) {
                            for (int i = 0; i < jugadores.size(); i++) {
                                Carta c = baraja.repartir();
                                jugadores.get(i).recibeCarta(c);
                            }

                        }

                        System.out.println(baraja);
                        System.out.println(jugadores);
                    }
                    break;
                    
                case 4:
                    ganador = (jugadores.get(0)).calculoMano();
                    ganador2=0;
                    String nombregan="";
                    String nombregan2="";
                    for (int i = 1; i < jugadores.size(); i++) {
                        int temp = jugadores.get(i).calculoMano();
                        if (temp > ganador) {
                            ganador = temp;
                            nombregan = jugadores.get(i).getNombre();
                            ganador2 = 0;
                            nombregan2 = "";
                            ganadores.add(jugadores.get(i));
                        }
                        else if (temp==ganador){
                            ganador2 = ganador;
                            nombregan2 = jugadores.get(i).getNombre();
                        }
                    }
                    if (ganador2 == 0) {
                        System.out.println(nombregan + " con " + ganador);
                    } else {
                        System.out.println("Empate entre " + nombregan + " y " + nombregan2 + " con " + ganador);
                    }
                    
                    
                    break;
                    
                case 5:
                    System.out.println(ganadores);
                    break;
            }

            System.out.println();
            System.out.print("* * * * * M E N U * * * * *");
            System.out.print("\n 1. Agregar nuevo jugador \n 2. Barajar \n 3. Repartir \n 4. Imprimir ganadores \n "
                + "5. Imprimir listado de los ultimos 5 ganadores \n 6. Salir \n Ingrese una opcion: ");
            op = leer.nextInt();
        }
        
        
        Baraja b = new Baraja();
        System.out.println(b);
    }
    
    
    
    
}
