/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2practica9.pablo.ruben;

import utils.Utils;

/**
 *
 * @author ausias
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Demanar números
        System.out.print("Introdueix el primer número: ");
        int numero1 = Utils.LlegirInt();
        System.out.print("Introdueix el segon número: ");
        int numero2 = Utils.LlegirInt();
        //Calcular multiplicació (si el número més grans és a la dreta i el més petit a l'esquerra estalviem iteracions
        //perquè a la funció el primer nomre creix i el segon es redueix
        //El resultat serà el mateix, ja que l'ordre dels factors no importa a les multiplicacions
        int resultat = Multiplicar(Math.max(numero1, numero2), Math.min(numero1, numero2));
        //Mostrar resultat
        System.out.println("El resultat de la multiplicació és: " + resultat);
    }

    //Funció recursiva per multiplicar dos números
    static int Multiplicar(int num1, int num2){
        int resultat = 0;
        //Casos base multiplicar per 0, 1 i 2
        //Per a totes les comprovacions només fa falta comprovar el segon nombre que serà el més petit,
        //ja que hem fet que el més gran dels dos sigui el número 1 i el més petit el número 2
        //Si els nombres o un d'ells és dos el resultat serà 0 
        if(num2 == 0){
            resultat = 0;
        }
        //Si un d'ells o els dos són 1 el resultat serà el nombre més gran. 
        else if(num2 == 1){
            resultat = num1;
        }
        //Si un d'ells és 2 podem fer la multiplicació directament
        else if(num2 == 2){
            resultat = MultiplicarPer2(num1);
        }
        //Si el multiplicand és parell tornem a cridar aquesta funció,
        //però el primer nombre multiplicat per 2 i el segon nombre dividit entre 2
        else if(Parell(num2)){
            resultat = Multiplicar(MultiplicarPer2(num1), DividirEntre2(num2));
        }
        //El mateix que abans però amb un multiplicand senar i canviant l'operació
        else if(Senar(num2)){
            resultat = Multiplicar(MultiplicarPer2(num1), DividirEntre2(num2))+num1;
        }
        
        return resultat;
    }
    
    //Funció per comprovar si un nombre donat és parell
    static boolean Parell(int numero){
        boolean result;
        if(numero == 0) result = true;
        else result = Senar(numero-1);
        return result;
    }
    
    //Funció per comprovar si un nombre donat és senar
    static boolean Senar(int numero){
        boolean result;
        if(numero == 0) result = false;
        else result = Parell(numero-1);
        return result;
    }
    
    //Funció per multiplicar per 2 sense l'operand de multiplicació
    //Es tracta d'afegir un 0 a la dreta en binari on es poden fer multiplicacions en base 2 afegint zeros
    static int MultiplicarPer2(int numero){
        int resultat;
        //Convertir el número a un string binari
        String binari = Integer.toBinaryString(numero);
        //Afegir el 0
        binari += "0";
        //Tornar a convertir a decimal (especifiquem la base 2)
        resultat = Integer.parseInt(binari, 2);
        
        return resultat;
    }
    
    //Funció per dividir entre 2 sense l'operand de divisió
    //El mateix que l'anterior, però per dividir treiem un número per la dreta en binari
    static int DividirEntre2(int numero){
        int resultat;
        
        String binari = Integer.toBinaryString(numero);
        //Agafem el mateix string sense l'últim caràcter, d'aquesta manera el treiem
        String binari_dividit = binari.substring(0, binari.length()-1);
        
        resultat = Integer.parseInt(binari_dividit, 2);
        
        return resultat;
    }
}
