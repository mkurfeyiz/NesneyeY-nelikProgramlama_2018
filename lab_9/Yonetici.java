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
public class Yonetici extends Calisan{
    int bonus;
    Yonetici(String isim,int maas){
        super(isim,maas);
    }
    int setBonus(int bonus){
        this.bonus=bonus;
        return this.bonus;
    }
    int getBonus(){
        return this.bonus;
    }
    @Override
    public int getMaas(){
        return this.maas+this.bonus;
    }
}
