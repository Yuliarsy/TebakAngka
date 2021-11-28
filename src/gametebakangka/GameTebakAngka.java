/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Yulia Rakhmah
 */
public class GameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("“Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!”");
        System.out.println("");
        
        Tebak angka = new Tebak();
        angka.input();
    }
    
}
