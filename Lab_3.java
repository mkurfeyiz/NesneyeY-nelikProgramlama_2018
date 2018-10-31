/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] dizi={1,2,3,4};
        int i,j;
        int sayac=0;
        for(i=0;i<dizi.length;i++)
        {
            for(j=0;j<dizi.length;j++)
            {
                if(dizi[i]>dizi[j] && i<j)
                    sayac++;
            }
        }
        System.out.println("Dizinin evirme sayısı : "+sayac);
        System.out.println("\n");
    //////////////////////////////////////////////////////////////
        String c=input.nextLine();
        int a,sayac1=0;
        for(i=0;i<c.length();i++)
        {
          if(c.charAt(i)>'d')
          {
              sayac1++;
          }
        }
        System.out.println("d den sonraki elemanların sayısı : "+sayac1);
    }
}
