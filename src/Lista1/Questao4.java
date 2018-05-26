/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.Scanner;
 
        
public class Questao4 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int a, b, c;
        
        System.out.println("Escreva o valor de A: ");
        a = ler.nextInt();
        System.out.println("Escreva o valor de B: ");
        b = ler.nextInt();
        
        c = a;
        a = b;
        b = c;  
        
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        
              
        
               
        
        
    }
    
}
