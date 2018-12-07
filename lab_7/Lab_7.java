/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7;
/**
 *
 * @author user
 */
public class Lab_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack a=new stack();
        a.push(1);
        a.push(2);
        
        stack b=new stack(a);
        a.toString(a);
        a.pop();
        b.empty();
        a.empty();
        a.toString(a);
        a.pop();
        a.push(3);
        
        
    }
    
}
