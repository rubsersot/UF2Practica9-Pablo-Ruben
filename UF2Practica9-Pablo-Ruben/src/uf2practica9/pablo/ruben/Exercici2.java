//Implementar un programa que façi l'algorisme d'euclides de manera recursiva
package uf2practica9.pablo.ruben;

import java.util.Scanner;

public class Exercici2 {

    public static Scanner scan = new Scanner(System.in);

    public static int euclides(int numA, int numB) {
        if (numB==0)
            return numA;  
        else 
            return euclides(numB, numA%numB);
        

    }

    public static void main(String[] args) {
        int numeroA = escanearEntero("Introdueix el numero A: ");
        int numeroB = escanearEntero("Introdueix el numero B: ");
        int resultat = euclides(numeroA, numeroB);
        
        System.out.println(resultat);
    }

    static int escanearEntero(String msj) {
        int num;
        System.out.print(msj);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Ha de ser enter.");
            System.out.print(msj);
        }
        num = scan.nextInt();
        return num;
    }

}
