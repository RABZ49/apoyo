/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Scanner entrada;

    public Metodos() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Insertar completo                         [1]: ");
        System.out.println("presentar                                 [2]: ");
        System.out.println("verificar si existe espacio disponible    [3]: ");
        System.out.println("insertar ordenado                         [4]: ");
        System.out.println("verificar si existe espacio disponible    [5]: ");
        System.out.println("Salir                                     [0]: ");
        return entrada.nextInt();
    }

    public int insFull(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingresar elemento " + i + ": ");
            x[i] = entrada.nextInt();

        }
        return x.length;
    }

    public void presenta(int[] x, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.println(x[i] + " ");

        }

    }

    public int insFinal(int[] x, int ev) {
        if (ev < x.length) {
            System.out.println("si hay espacio disponible");
            System.out.println("Ingresa numero:  ");
            x[ev] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("\nno hay espacio\n");
        }
        return ev;
    }
    public void recorreDer(int[] x ,int ev,int pos){
        for (int i = ev; i >pos; i--) {
            x[i]=x[i-1];
            
        }
    }
    public int insInicio(int[] x, int ev){
        if (ev < x.length) {
            recorreDer(x,ev,0);
            System.out.println("Ingresa numero:  ");
            x[0] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("\nNo hay espacio\n");
        }
        return ev;
            
            
        }
        public int insOrden(int x[], int ev) {
        int num, pos = 0;
        if (ev < x.length) {
            System.out.println("Ingrese Dato:  ");
            num = entrada.nextInt();
            if (ev == 0) {
                x[ev] = num;
                
            } else {
                while ((pos < ev) && (num > x[pos])) {
                    pos++;
                    recorreDer(x,ev,pos);
                    x[pos]= num;
                }
            }
        } else {
            System.out.println("\nNo hay espacio\n");
        }
        return ev;
    }
    }

