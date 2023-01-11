package uf2practica9.pablo.ruben;

import utils.Utils;

/**
 *
 * @author ausias
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingresa el numero N: ");
        int n = Utils.LlegirInt();
        System.out.println("Ingresa el numero X: ");
        double x = Utils.LlegirInt();
        System.out.println("Resultat: " + m4(n));
        
    }

    //Problema a
    static int m1(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //Problema B
    static int m2(double x, int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    
    //Problema c
    static int m3(int n){
        int resultat = 0;
        
        for(int i = n; i >= 2; i/=2){
            resultat += 1;
        }
        
        return resultat;
    }
    
    //Problema d
    static int m4(int n){
        int resultat = 0;
        
        for(int i = n; i > 0; i /= 10){
            resultat += i%10;
        }
        
        return resultat;
    }
}
