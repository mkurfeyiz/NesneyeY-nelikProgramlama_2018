/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong.sayıları;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ArmstrongSayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        int sayi;
        int i=1;
        System.out.println("sayı girin: ");
        sayi=input.nextInt();
        int basamakSayisi=0;
        while(sayi>0)
        {
            basamakSayisi++;
            if(sayi>=i*1 && sayi<i*10)
            {
               break;
            }
            else
            {
                i=i*10;
            }
        }
        System.out.println(basamakSayisi);
        int birlerBas,onlarBas,yuzlerBas;
        birlerBas=sayi%10;
        onlarBas=((sayi%100)-birlerBas)/10;
        yuzlerBas=((sayi%1000)-onlarBas-birlerBas)/100;
        System.out.println(" "+yuzlerBas+" "+onlarBas+" "+birlerBas);
        int a,b,c;
        a=(int)Math.pow(birlerBas,basamakSayisi);
        b=(int)Math.pow(onlarBas,basamakSayisi);
        c=(int)Math.pow(yuzlerBas,basamakSayisi);
        if(a+b+c==sayi)
        {
            System.out.println("Armstrong sayısıdır.");
        }
        else
        {
            System.out.println("Armstrong sayısı değildir.");
        }
    }
}
