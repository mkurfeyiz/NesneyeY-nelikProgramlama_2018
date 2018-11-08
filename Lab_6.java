/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6;

/**
 *
 * @author user
 */
public class Lab_6 {

    
    public static void main(String[] args) {
        int[] dizi1={1,2,3,4,5,6};
        int[] dizi2={1,2,3,4,5,6};
       kume k1=new kume(dizi2);
       kume k2=new kume(dizi1);
       kume k3=new kume();
       k2.denk(k1);
       k2.esit(k1);
       k1.yazdir();
       k2.yazdir();
       k1.ekle(25);
       k2.ekle(10);
       k2.esit(k1);
       k2.denk(k1);
       k2.yazdir();
       k1.yazdir();
       k1.birlesim(k2);
       k2.yazdir();
       
       
    }
    
}
