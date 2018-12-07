/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

/**
 *
 * @author user
 */
public class Lab_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kayit a=new Kayit();
        a.kayitEkle("adem", "bas","872343","bhasd@gmail.com");
        a.kayitEkle("berkay", "bas","37392304","dghsb@hotmail.com");
        a.kayitYazdir(1);
        a.kayitEkle("ceren", "kas","273486","ahsdj@outlook.com");
        a.emailGuncelle("berkay", "bas", "asd@gmail.com");
        a.kayitYazdir(0);
        a.kayitYazdir(1);
        a.kayitSilme("ceren","kas");
        a.kayitYazdir(2);
    }
    
}
