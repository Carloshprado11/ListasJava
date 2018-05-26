/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
 
public class Questao1 {
 
    Scanner ler = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
       
        int n1,n2,soma,dife,produt;
        float media;
       
        System.out.println("Digite o primeiro valor: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite o Segundo valor: ");
        n2 = ler.nextInt();
        
            soma = n1 + n2;
            dife = n1 - n2;
            produt = n1 * n2;
            media = (n1+n2)/2;
        
        System.out.println("Soma:\t"+soma); 
        System.out.println("Diferença:\t"+dife);
        System.out.println("Produto:\t"+produt);
        System.out.println("Média:\t"+media);
                    
        
        
        
         // TODO code application logic here
    }
}
