
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch11
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    for (int i=1; i<=5; i++){
    System.out.print ("Teclee el año actual:");
    int año_act = scanner.nextInt ();
    System.out.print ("Teclee su año de nacimiento:");
    int año_nac = scanner.nextInt ();
    int edad = año_act - año_nac;
    System.out.println ("Su edad es:" + edad);
    }
    scanner.close ();
            
   }
    
}
