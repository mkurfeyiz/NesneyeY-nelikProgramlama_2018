/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class kume {
    int elem_sayisi;
    int i=0;
    ArrayList<Integer>kume1=new ArrayList<Integer>();
    kume(){
        
    }
    kume(int[] a){
        for(i=0;i<a.length;i++)
        {
            kume1.add(a[i]);
        }
    }
     kume(kume a){
        for(i=0;i<this.kume1.size();i++)
        {
            a.kume1.add(this.kume1.get(i));
        }
    }
    public void ekle(int a){
        kume1.add(a);
    }
    public void yazdir(){
        for(i=0;i<kume1.size();i++)
        {
            System.out.print(" "+kume1.get(i));
        }
        System.out.println("\n");
    }
    public boolean denk(kume a){
        boolean sonuc=true;
        for(i=0;i<kume1.size();i++)
        {
            if(kume1.get(i)==a.kume1.get(i))
            {
                sonuc=true;
            }
            else{
                sonuc=false;
                break;
            }
        }
        if(sonuc==true)
            System.out.println("Denk");
        else
            System.out.println("Denk Değil");
        return sonuc;
    }
    public boolean esit(kume a){
        boolean sonuc=true;
        for(i=0;i<kume1.size();i++)
        {
            if(kume1.get(i)==a.kume1.get(i))
            {
                sonuc=true;
            }
            else{
                sonuc=false;
                break;
            }
        }
        if(sonuc==true)
            System.out.println("Esit");
        else
            System.out.println("Esit Değil");
        return sonuc;
    }
    kume birlesim(kume a){
        for(i=0;i<this.kume1.size();i++)
        {
            a.kume1.add(kume1.get(i));
        }
        return a;
    }
}
