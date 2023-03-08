/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Selviana Dwi A
 */

//NOMOR 2 DAN OUTPUT NOMOR 3
public class AksiSepeda {
     public static void main(String[] args){
        Sepeda sepedaBayi = new Sepeda(3, "Bayi", "ABC");
        System.out.println("Jumlah gear " + sepedaBayi.gear);
        sepedaBayi.ngerem();
        
        Sepeda sepedaGunung = new Sepeda(2, "Gunung", "ABC");
        System.out.println("Jumlah gear " + sepedaGunung.gear);
        sepedaGunung.ngerem();
        
    }
}
