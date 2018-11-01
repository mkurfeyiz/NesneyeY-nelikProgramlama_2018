/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>A=new ArrayList<Integer>(5);
        ArrayList<Integer>B=new ArrayList<Integer>(3);
        ArrayList<Integer>C=new ArrayList<Integer>();
        int i,a;
        /*System.out.println("A nın elemanlarını girin");
        for(i=0;i<5;i++)
        {
            a=input.nextInt();
            A.add(a);
        }
        System.out.println("B nin elemanlarını girin");
        for(i=0;i<3;i++)
        {
            a=input.nextInt();
            B.add(a);
        }
        for(i=0;i<A.size();i++)
        {
            for(int j=0;j<B.size();j++)
            {
                if(A.get(i)==B.get(j))
                {
                    C.add(A.get(i));
                }
            }
        }
        String c=C.toString();
        System.out.println("Ortak Elemanlar");
        System.out.println(c);
       *////////////////////////////////////////////////////////////
        int sayi,bolum,kalan=0;
        ArrayList<Integer>yeniSayi=new ArrayList<Integer>();
        System.out.println("Bir sayı girin: ");
        sayi=input.nextInt();
        i=0;
        while(sayi>=2)
        {
            bolum=sayi/2;
            kalan=sayi-2*bolum;
            yeniSayi.add(i,kalan);
            sayi=bolum;
            i++;
            if(sayi<2)
            {
                yeniSayi.add(i,bolum);
            }
        }
        for(i=yeniSayi.size()-1;i>=0;i--){
            System.out.print(yeniSayi.get(i));
        }
        System.out.println("");
    }
}
