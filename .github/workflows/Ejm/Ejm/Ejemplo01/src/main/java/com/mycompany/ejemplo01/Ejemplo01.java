/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplo01;

/**
 *
 * @author SALA H
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        Procesos obj = new Procesos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->obj.carxcar();
                case 2 ->obj.cuenta();
                case 3 ->obj.palindromo();
                case 4 ->obj.contar();

                default -> {
                    

                }
            }

        } while (opc != 0);
        {
        }
    }
    
}
