/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_9;

/**
 *
 * @author user
 */
public class Calisan extends Kisi{
    int maas;
    Calisan(String isim,int maas){
        super(isim);
        this.maas=maas;
    }
    public int getMaas(){
        return this.maas;
    }
    public int setMaas(int maas){
        this.maas=maas;
        return this.maas;
    }
}
