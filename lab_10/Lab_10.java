/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lab_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Oyun o=new Oyun();
        o.tahtayiCiz();
        int sira=0,i,j;
        while(o.bittiMi()==false){
            if(sira%2==0){
                System.out.println("Sıra 1. oyuncuda");
                System.out.println("Hamle yapacağınız yeri belirleyiniz");
                i=input.nextInt();
                j=input.nextInt();
                o.tasKoy("S", i, j);
            }
            if(sira%2==1){
                System.out.println("Sıra 2. oyuncuda");
                System.out.println("Hamle yapacağınız yeri belirleyiniz");
                i=input.nextInt();
                j=input.nextInt();
                o.tasKoy("O", i, j);
            }
            o.tahtayiCiz();
            sira++;
        }   
    }   
}
