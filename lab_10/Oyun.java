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
public class Oyun {

    String tahta[][] = new String[3][3];
    Scanner input = new Scanner(System.in);

    Oyun() {
        for (int i = 0; i < tahta.length; i++) {
            for (int j = 0; j < tahta.length; j++) {
                tahta[i][j] = "-";
            }
        }
    }

    public void tahtayiCiz() {
        for (int i = 0; i < tahta.length; i++) {
            for (int j = 0; j < tahta.length; j++) {
                System.out.print(tahta[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void tasKoy(String hamle, int i, int j) {
        while (tahta[i][j].equalsIgnoreCase("S") || tahta[i][j].equalsIgnoreCase("O")) {
            System.out.println("Seçilen yere daha önceden hamle yapılmış");
            System.out.println("Yeni hamlenizi farklı bir yere yapınız");
            i = input.nextInt();
            j = input.nextInt();
        }
        tahta[i][j] = hamle;
        System.out.println("Hamle yapıldı");
    }

    public boolean bittiMi() {
        int a = 0;
        int b = 0;
        int s = 0;
        int d = 0;
        int j, i,e=0,f=0;
        for (i = 0; i < 3; i++) {
            if (tahta[i][i].equalsIgnoreCase("S")) {
                a++;
                if (a == 3) {
                    System.out.println("1. oyuncu kazandı");
                    return true;
                }
            }
            else if (tahta[i][i].equalsIgnoreCase("O")) {
                b++;
                if (b == 3) {
                    System.out.println("2. oyuncu kazandı");
                    return true;
                }
            }
            if(a==3 || b==3){
                break;
            }
        }
        for (i = 0; i < 3; i++) {
            s=0;
            d=0;
            for (j = 0; j < 3; j++) {
                if (tahta[i][j].equalsIgnoreCase("S")) {
                    s++;
                    if (s == 3) {
                        System.out.println("1. oyuncu kazandı");
                        return true;
                    }
                }
                else if (tahta[i][j].equalsIgnoreCase("O")) {
                    d++;
                    if (d == 3) {
                        System.out.println("2. oyuncu kazandı");
                        return true;
                    }
                }
            }
            if(s==3 || d==3){
                break;
            }
        }
        for(i=0;i<3;i++){
            e=0;
            f=0;
            for(j=0;j<3;j++){
                if (tahta[j][i].equalsIgnoreCase("S")) {
                    e++;
                    if (e == 3) {
                        System.out.println("1. oyuncu kazandı");
                        return true;
                    }
                }
                else if (tahta[j][i].equalsIgnoreCase("O")) {
                    f++;
                    if (f == 3) {
                        System.out.println("2. oyuncu kazandı");
                        return true;
                    }
                }
            }
            if(e==3 || f==3){
                break;
            }
        }
        int sayac=0;
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                if(tahta[k][l].equalsIgnoreCase("S") || tahta[k][l].equalsIgnoreCase("O")){
                    sayac++;
                }
            }
        }
        if(a==3 || b==3 || s==3 || d==3 || e==3 || f==3){
            return true;
        }
        if(sayac==9){
            System.out.println("Oyun berabere !");
            return true;
        }
        return false;
    }
}
