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

    @SuppressWarnings("empty-statement")
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
                    obj.recorreDer(myArreglo, ev,0);
                case 5 ->
                    obj.insInicio(myArreglo, ev);
                case 6 ->
                    obj.insOrden(myArreglo, ev);
                case 7 -> {
                    System.out.println("Numero a Buscar: ");
                    int num = obj.entrada.nextInt();
                    int encontrado = obj.busqueda(myArreglo, 0, ev - 1, num);
                    if (encontrado != -1) {
                        System.out.println("Numero no encontrado");
                        {
                        }
                    }

                }
                case 8 -> {
                    System.out.println("Numero a eliminar : ");
                    int num = obj.entrada.nextInt();
                    ev= obj.elimina(myArreglo,num,ev);
                    

                }
                
                default -> {
                }
            }

        } while (op != 0);
    }
}
