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


    public class Lab_9{

        private Calisan[] calisanlar = new Calisan[3];

        public Lab_9() {
            calisanlar[0] = new Calisan("ahmet", 4000);
            calisanlar[1] = new Calisan("mehmet", 5000);
            calisanlar[2] = new Yonetici("cevdet", 6000);
        }
        public void calisanlariGoster() {
            for (int i = 0; i < calisanlar.length; i++) {
                System.out.println(this.calisanlar[i].isim + " aldığı maaş : " + this.calisanlar[i].maas);
            }
        }

        public static void main(String[] args) {
            Lab_9 sirket = new Lab_9();
            sirket.calisanlariGoster();
            
        }
    }

