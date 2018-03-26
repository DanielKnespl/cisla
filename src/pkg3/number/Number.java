/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.number;
import java.util.Scanner;
/**
 *
 * @author daniel.knespl
 */
public class Number {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in,"ASCII");
        System.out.println("vloz cisla");
        double max = 0;
        double x = 0;
        double s = 0;
        for (int i = 0; i < 3; i++) {
        x = a.nextDouble();
        if (max==x){
                s=s+1;
            }  
            if (max<x){
                max=x;
            }
        }
        System.out.println();
        System.out.print("nejvetsi je: "+max+", ");
        if(0<s){
        System.out.println(s+"-krát");
        }
    }
}
