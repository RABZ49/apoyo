/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.clase03;
//arreglos

/**
 *
 * @author SALA H
 */
public class Clase03 {

    public static void main(String[] args) {
        int lim, op;
        Metodos obj = new Metodos();
        System.out.println("Ingrese tamaño del arreglo:  ");
        lim = obj.entrada.nextInt();
        int[] myArreglo = new int[lim];
        int ev = 0;
        do {
            op = obj.menu();
            switch (op) {
                case 1 ->
                    ev = obj.insFull(myArreglo);
                case 2 ->
                    obj.presenta(myArreglo, ev);
                case 3 ->
                    obj.insFinal(myArreglo, ev);
                case 4 ->
                    obj.insFinal(myArreglo, ev);
                case 5 ->
                    obj.insFinal(myArreglo, ev);
                default -> {
                }
            }
        } while (op != 0);

    }


}
