/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Selviana Dwi A
 */

//NOMOR 4
public class Lampu {
     boolean nyala;

    void nyalakanLampu() {
        nyala = true;
    }
   
    void matikanLampu() {
        nyala = false;
    }
    
     public static void main(String[] args) {
        Lampu lampu = new Lampu();
        lampu.nyalakanLampu();
        System.out.println("Apakah lampu menyala? " + lampu.nyala);
        lampu.matikanLampu();
        System.out.println("Apakah lampu menyala? " + lampu.nyala);
    }
}
