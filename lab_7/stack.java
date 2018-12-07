/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class stack {
    int n=100,i=0;
    ArrayList<Integer> liste=new ArrayList<Integer>(n);
    stack(){
       
    }
    stack(int a){
        liste.add(a);
    }
    stack(stack a){
        this.liste=(ArrayList<Integer>)a.liste.clone();
    }
    public void empty(){
        if(liste.size()==0){
            System.out.println("Stack boştur.");
        }
        else{
            System.out.println("Eleman var.");
        }
    }
    public int full(){
        if(liste.size()==n){
            System.out.println("Stack doludur.");
            return 1;
        }
        else return 0;
    }
    public void push(int a){
        if(this.full()==0){
           liste.add(a);
        }
        else{
            System.out.println("Yer bulunamadı.");
        }
    }
    public void pop(){
        if(liste.size()>0){
            liste.remove(liste.size()-1);
        }
        else{
            System.out.println("Stackin elemanı yok");
        }
    }
    public int peek(){
        return liste.get(liste.size()-1);
    }
    public void toString(stack a){
        for(i=0;i<a.liste.size();i++){
            System.out.println(a.liste.get(i).toString());
        }
    }
}
