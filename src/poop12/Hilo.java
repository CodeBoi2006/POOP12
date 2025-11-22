/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Michel
 */
public class Hilo extends Thread {
    public Hilo (String name){
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" de "+ getName());
        }
        System.out.println("Termina el "+getName());
    }
    
}
