/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclasep2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author darie
 */
public class EjerciciosClaseP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("Seleccione el ejercicio a realizar: ");
            System.out.println("1-recorrer una matriz\n2-suma matriz\n3-Imprimir matriz por columna\n4-Numero Mayor\n5-Numero primo\n6-Numero maximo con backtracking\n7-Factorial\n8-Numeros primos\n9-Salir");
            op = lea.nextInt();

            switch (op) {
                case 1:
                    int[][] matriz = {{2, 6, 0, 6}, {2, 1, 0, 9}, {7, 4, 5, 3}};

                    imprimirMatrizRecursiva2(matriz, 0, 0);
                    System.out.println("");

                    break;
                case 2:
                    int[][] matriz2 = {{2, 6, 0, 6}, {2, 1, 0, 9}, {7, 4, 5, 3}};
                    imprimirMatrizRecursiva(matriz2, 0, 0);
                    System.out.println("");
                    System.out.println("la suma de la matriz es " + sumaMatriz(matriz2, 0, 0));
                    break;
                case 3:

                    int[][] matrix = {{2, 6, 0, 6}, {2, 1, 0, 9}, {7, 4, 5, 3}};
                    imprimirMatrizPorColumnas(matrix, 0, 0);
                    System.out.println("");
                    break;
                case 4:
                    ArrayList<Integer> lista = new ArrayList<>();
                    lista.add(5);
                    lista.add(6);
                    lista.add(4);
                    lista.add(5);
                    lista.add(2);
                    int mayor = 0;
                    imprimirLista(lista, 0);
                    System.out.println("");

                    //con recursivo
                    System.out.println(numeroMayor(lista, 0, 0));

                    break;
                case 5:
                    System.out.println("Ingrese un numero: ");
                    int num = lea.nextInt();
                    if (numeroPrimo(num, 1, 0)) {
                        System.out.println("El numero es primo");
                    } else {
                        System.out.println("El nuemero no es primo");
                    }
                    break;
                case 6:
                    int[] array = {3, 7, 1, 4, 1};
                    System.out.println("El numero maximo es: " + maximo(array, 0));
                    break;
                case 7:
                    System.out.println("Ingrese un numero: ");
                    num = lea.nextInt();
                    System.out.println("El factorial de " + num + " es " + factorial(num));
                    break;
                case 8:
                    int[][] matrizPrimos = {{2, 6, 0, 6},{7, 4, 5, 3}};
                    ArrayList<Integer> primos = new ArrayList<Integer>();
                    primos = arregloNumerosPrimos(matrizPrimos, 0, 0, primos);
                    System.out.println("Numeros primos: ");
                    for (int i = 0; i < primos.size(); i++) {
                        System.out.print(primos.get(i) + " ");
                    }
            }

        } while (op != 8);
    }

    public static void imprimirMatrizRecursiva(int[][] matriz, int fil, int col) {
        System.out.print("[" + matriz[fil][col] + "]");
        if (col != matriz[0].length - 1) {
            imprimirMatrizRecursiva(matriz, fil, col + 1);
        } else if (fil != matriz.length - 1) {
            System.out.println("");
            imprimirMatrizRecursiva(matriz, fil + 1, 0);
        }

    }

    public static void imprimirMatrizPorColumnas(int[][] matriz, int fil, int col) {
        if (fil == matriz.length - 1 && col == matriz[0].length - 1) {
             System.out.print("[" + matriz[fil][col] + "]");
        } else if (fil != matriz.length - 1) {
             System.out.print("[" + matriz[fil][col] + "]");
            imprimirMatrizPorColumnas(matriz, fil+1, col);
        } else {
             System.out.println("[" + matriz[fil][col] + "]");

            imprimirMatrizPorColumnas(matriz, 0, col+1);
        }

    }

    public static void imprimirMatrizRecursiva2(int[][] matriz, int fil, int col) {

        if (fil == matriz.length - 1 && col == matriz[0].length - 1) {
            System.out.print("[" + matriz[fil][col] + "]");
        } else if ( col != matriz[0].length - 1) {
            System.out.print("[" + matriz[fil][col] + "]");
            imprimirMatrizRecursiva2(matriz, fil, col + 1);
        } else {
            System.out.println("[" + matriz[fil][col] + "]");

            imprimirMatrizRecursiva2(matriz, fil + 1, 0);
        }

    }

    public static void imprimirLista(ArrayList<Integer> list, int index) {
        if (list.size() != 0) {
            System.out.print(list.get(index));
            if (index != list.size() - 1) {
                System.out.print(", ");
                imprimirLista(list, index + 1);
            }
        }
    }

    public static int[][] llenarMatrizRecursiva(int[][] matriz, int fil, int col) {
        Random random = new Random();

        matriz[fil][col] = random.nextInt(10);
        col++;
        if (col != 5) {
            return llenarMatrizRecursiva(matriz, fil, col);
        } else {
            col = 0;
            fil++;

            if (fil != 5) {
                return llenarMatrizRecursiva(matriz, fil, col);
            } else {
                return matriz;
            }
        }

    }

    public static int numeroMayor(ArrayList<Integer> list, int index, int mayor) {
        if (index == 0) {
            mayor = list.get(index);
        } else {
            if (mayor < list.get(index)) {
                mayor = list.get(index);
            }
        }

        index++;

        if (index == list.size()) {
            return mayor;
        } else {
            return numeroMayor(list, index, mayor);
        }
    }

    public static int factorial(int numero) {
        if (numero == 1) {
            return numero;
        } else {
            int previousMult = factorial(numero - 1);
          
            return numero* previousMult;
        }
    }

    public static boolean numeroPrimo(int numero, int index, int cont) {
        int divisible = numero % index;
        if (divisible == 0) {
            cont++;
        }
        if (index == numero) {
            return cont == 2;
        }
        index++;
        
        return numeroPrimo(numero, index, cont);
    }

    public static int maximo(int[] array, int x) {
        int max = 0;
        if (x == array.length - 1) {
            return array[x];
        } else {
            max = maximo(array, x + 1);
            if (array[x] > max) {
                return array[x];
            } else {
                return max;
            }
        }
    }
    
    public static int sumaMatriz(int matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            return matriz[filas][cols];            
        } else {
            if (cols == matriz[0].length-1) {   
                return matriz[filas][cols] +sumaMatriz(matriz, filas+1, 0);
            } else {
                return matriz[filas][cols] + sumaMatriz(matriz, filas, cols+1);
            }
        }       
    }
    
    public static int sumaPares(int matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            return matriz[filas][cols]%2==0?matriz[filas][cols]:0;
        } else {
            if (cols == matriz[0].length-1) {                
                return (matriz[filas][cols]%2==0?matriz[filas][cols]:0) + sumaPares(matriz, filas+1, 0);
            } else {
                return (matriz[filas][cols]%2==0?matriz[filas][cols]:0) + sumaPares(matriz, filas, cols+1);
            }
        }       
    }
    
    
    public static ArrayList<Integer> arregloNumerosPrimos(int matriz[][], int filas, int cols, ArrayList<Integer> primos) {
        if(matriz[filas][cols] != 0){
            if(numeroPrimo(matriz[filas][cols],1,0) == true){
                primos.add(matriz[filas][cols]);
            
            }
        }
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            return primos;
        } else {
            if (cols != matriz[0].length-1) {                
                return arregloNumerosPrimos(matriz, filas, cols+1, primos);
            } else {
                return arregloNumerosPrimos(matriz, filas+1, 0, primos);
            }
        }       
    }


}

    