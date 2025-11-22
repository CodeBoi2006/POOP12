/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author Michel
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("primer hilo");
        hilo1.start();
        
        new Hilo("segundo hilo").start();
        System.out.println("Termina hilo principal");
    }
    
}
