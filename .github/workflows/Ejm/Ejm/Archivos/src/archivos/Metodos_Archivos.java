/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author UTPL
 */
public class Metodos_Archivos {
    Scanner entrada;
    File archivo = new File("miArchivo.txt");
    public Metodos_Archivos(){
    this.entrada = new Scanner(System.in);
    
    }
    public int menu(){
        System.out.println("Escribir a archivo [1]");
        System.out.println("Leer desde archivo [2]");
        System.out.println("Salir              [0]");
        return entrada.nextInt();
    }
    public void ingresar (){
    FileWriter escribir;
    PrintWriter linea;
    String nombre="", correo="", dir="";
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }try {
            entrada.nextLine();
            System.out.println("Digite el nombre: ");
            nombre= entrada.nextLine();
            System.out.println("Digite el correo: ");
            correo= entrada.nextLine();
            System.out.println("Digite la direccion: ");
            dir= entrada.nextLine();
            escribir = new FileWriter(archivo,true);
            linea = new PrintWriter(escribir);
            linea.println(nombre+"\n"+correo+"\n"+dir);
            linea.close();
        } catch (Exception e) {
        }
        
    }

    void presentar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "", nombre="", correo="",dir="";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while(cadena!= null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    correo = almacenamiento.readLine();
                    nombre = cadena;
                    dir = almacenamiento.readLine();
                    nombre = cadena;
                    if (cadena!=null) 
                        System.out.println("Nombre: " + nombre +"\nCorreo: " +
                                "\nDireccion: " + dir);
                    {
                        
                    }
                } catch (Exception e) {
                }
}
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
        }
    }
}
