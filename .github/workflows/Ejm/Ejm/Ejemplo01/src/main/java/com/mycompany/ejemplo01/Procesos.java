/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Procesos {

    Scanner entrada;

    public Procesos() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("presentar caracter por caracter [1]");
        System.out.println("contar caracteres en cadena     [2]");
        System.out.println("Es palindromo                   [3]");
        System.out.println("Contar vocales y consonantes    [4]");
        System.out.println("salir                           [0]");
        return entrada.nextInt();
    }

    public void carxcar() {
        String cadena = "";
        entrada.nextLine();
        System.out.println("Digite una cadena:     ");
        cadena = entrada.nextLine();
        System.out.println(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public void cuenta() {
        String cadena = "";
        char caracter;
        entrada.nextLine();
        int cont = 0;
        System.out.println("Digite una cadena:      ");
        cadena = entrada.nextLine();
        System.out.println("Digite un caracter:     ");
        caracter = entrada.nextLine().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cont++;

            }

        }
        System.out.println("El caracter " + caracter + " se repite "
                + cont + "veces");

    }

    public String eliminaEspacios(String cad) {
        return cad.replace("", "");
    }

    public void palindromo() {
        int j;
        boolean noes = false;
        String cadena = "", cad = "";
        entrada.nextLine();
        System.out.println("Digite una cadena de caracteres:  ");
        cadena = entrada.nextLine();
        cad = eliminaEspacios(cadena);
        j = cad.length() - 1;
        for (int i = 0; i < cad.length() / 2; i++) {
            if (cad.charAt(i) != cad.charAt(j)) {
                noes = true;
                System.out.println("No es palindromo");
                break;

            }
            j--;
        }
        if (noes == false) {
            System.out.println("Si es palindromo ");

        }
    }

    public void contar() {
        String cadena = "", cad = "";
        entrada.nextLine();
        System.out.println("digite una cadena de caracteres:   ");
        cadena = entrada.nextLine();
        cad = eliminaEspacios(cadena);
        int contV = 0;
        int contC = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == 'a' || cad.charAt(i) == 'e'
                    || cad.charAt(i) == 'i' || cad.charAt(i) == 'o'
                    || cad.charAt(i) == 'u') {
                contV++;

            } else {
                contC++;
            }

        }
        System.out.println("el nuemro de vocales es de = " + contV
                + " El numero de consonantes es de = " + contC);
    }
}
