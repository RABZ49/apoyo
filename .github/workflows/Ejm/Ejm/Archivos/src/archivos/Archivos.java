/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

/**
 *
 * @author UTPL
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos_Archivos obj = new Metodos_Archivos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->
                    obj.ingresar();
                case 2 ->
                    obj.presentar();
                default -> {
                }
            }
            
            

        }while (opc != 0);
    }
}
