/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Kayit {
    ArrayList<String> ad=new ArrayList<String>();
    ArrayList<String> soyad=new ArrayList<String>();
    ArrayList<String> tel=new ArrayList<String>();
    ArrayList<String> email=new ArrayList<String>();
    Kayit(){
        
    }
    public void kayitEkle(String ad,String soyad,String tel,String email){
        if(this.ad.contains(ad) && this.soyad.contains(soyad)){
            System.out.println("Aynı kayıt bulunmaktadır.");
        }
        else{
        this.ad.add(ad);
        this.soyad.add(soyad);
        this.tel.add(tel);
        this.email.add(email);
        }
    }
    public void kayitSilme(String ad,String soyad){
        int temp=this.ad.indexOf(ad);
        this.ad.remove(temp);
        this.soyad.remove(temp);
        this.tel.remove(temp);
        this.email.remove(temp);
    }
    public void emailGuncelle(String ad,String soyad,String email){
        int temp;
        temp=this.ad.indexOf(ad);
        this.email.remove(temp);
        this.email.set(temp,email);
    }
    public void kayitAra(String ad,String soyad){
        int a,b;
        a=this.ad.indexOf(ad);
        b=this.soyad.indexOf(soyad);
        if(a==b){
            System.out.println(this.ad.get(b)+this.soyad.get(b)+this.tel.get(b)+this.email.get(b));
        }
        else{
            System.out.println("Kayit bulunamadı.");
        }
    }
    public void kayitYazdir(int b){
        System.out.println(this.ad.get(b)+" "+this.soyad.get(b)+" "+this.tel.get(b)+" "+this.email.get(b));
    }
    public void kayitListele(){
        
    }
}
