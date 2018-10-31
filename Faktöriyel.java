/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktöriyel;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Faktöriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int a=input.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int b=input.nextInt();
        System.out.println("Sayıların toplamı = "+(a+b));
        int i,faktoriyel=1;
        for(i=a+b;i>0;i--)
        {
            faktoriyel=faktoriyel*i;
        }
        System.out.println("Faktöriyel = "+faktoriyel);
    }
    
}
