//Implementar un programa que façi l'algorisme d'euclides de manera recursiva
package uf2practica9.pablo.ruben;

import utils.Utils;

public class Exercici2 {

   

    public static int euclides(int numA, int numB) {
        int resultat;
        if (numB==0)
            resultat = numA;  
        else 
            resultat =  euclides(numB, numA%numB);
        return resultat;
    }

    public static void main(String[] args) {
        int numeroA = Utils.LlegirInt("Introdueix el numero A: ");
        int numeroB = Utils.LlegirInt("Introdueix el numero B: ");
        int resultat = euclides(numeroA, numeroB);
        
        System.out.println(resultat);
    }

    

}

