/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraespecial;

/**
 *
 * @author desarrollador
 */
public class Operacion {
    
    public Operacion (){
        
    }
    
    public float factorial(int numero){
       float factorial = 1;
       if(numero > 1){
           for(int i=1; i<=numero; i++){
               factorial = factorial*i;
           }
       }
       return factorial;
    }
    
    public float sumarPrimos(int cantidadPrimos){
        float sumaPrimos = 0;
        int contadorPrimos = 0;
        int i = 2;
        while(contadorPrimos != cantidadPrimos){
            if(verificarPrimo(i)){
                sumaPrimos += i;
                contadorPrimos++;
            }
            i++;
        }
        return sumaPrimos;
    }
    
    public int calcularMCM(int numero1, int numero2) {
        return Math.abs(numero1 * numero2) / mcd(numero1, numero2);
      }

   public static int mcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return mcd(num2, num1 % num2);
    }

   
    
    public boolean verificarPrimo(int numero){
        boolean esPrimoActual = true;
        if(numero<2){
            return false;
        }
        for(int x=2; x*x<=numero; x++){
            if( numero%x==0 ){
                esPrimoActual = false;
                break;
            }
        }
        return esPrimoActual;
    }
    
}
