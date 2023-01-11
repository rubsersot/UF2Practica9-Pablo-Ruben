//Implementar un programa que façi l'algorisme d'euclides de manera recursiva
package uf2practica9.pablo.ruben;

import utils.Utils;

public class Exercici2 {

   

    public static int euclides(int numA, int numB) {
        int resultat;
        //Casos base 0, 1 i si els nombres són iguals
        if (numA == 0 || numB==0)
            resultat = 0;  
        else if(numA == 1 || numB == 1){
            resultat = 1;
        }
        else if(numA == numB){
            resultat = numA;
        }
        else{
            //Al màxim li restem el mínim i tornem a realitzar la funció amb la resta i el que era el més petit dels dos
            resultat = euclides(Math.max(numA, numB)-Math.min(numA, numB), Math.min(numA, numB));
        }

        return resultat;
    }

    public static void main(String[] args) {
        int numeroA = Utils.LlegirInt("Introdueix el numero A: ");
        int numeroB = Utils.LlegirInt("Introdueix el numero B: ");
        int resultat = euclides(numeroA, numeroB);
        
        System.out.println(resultat);
    }

    

}

