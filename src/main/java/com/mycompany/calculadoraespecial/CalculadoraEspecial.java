/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraespecial;

/**
 *
 * @author el-n0
 */
public class CalculadoraEspecial {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Menu menu = new Menu();
        menu.setTitle("Calculadora Avanzada");
        menu.setAlwaysOnTop(true);
        menu.setLocationRelativeTo(null);
        menu.setSize(480, 400);
        menu.setVisible(true);
    }
}
