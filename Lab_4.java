/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author user
 */
public class Lab_4 {

    public static double findMax(double[][] matris){
        int i;
        int j;
        double enB=0;
        for(i=0;i<matris.length;i++)
        {
            for(j=0;j<matris.length;j++)
            {
                if(matris[i][j]>matris[i][j+1])
                {
                    enB=matris[i][j];
                }
            }
            System.out.println("En büyük eleman = "+enB);
        }
        return enB;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double[][] a={{1,2,8},{3,5,9},{7,4,5}};
        findMax(a);
       
        int i;
        int sayac=0;
        int[] b={1,4,7,3,8,9,4,6,7,0};
      /*  ArrayList<Integer>ints=new ArrayList<Integer>();
        ArrayList<Integer>ints2=new ArrayList<Integer>();
        for(i=0;i<b.length;i++)
        {
            ints.add(b[i]);
        }
        for(i=0;i<ints.size();i++)
        {
            sayac++;
            if(ints.get(i)>ints.get(i+1))
            {
                ints2.add(ints.get(i));
                sayac=0;
            }
        }
        for(i=0;i<ints2.size();i++)
        {
            System.out.println(ints2.get(i));
        }*/
    }
}
