package Lista1;
 
       
import java.util.Scanner;  


public class Questao5 {

  
    public static void main(String[] args) {
       
        Scanner ler = new Scanner (System.in);
        float Num, Quad;
        
        System.out.println("Digite  o numero que deseja elevar ao quadrado: ");
        Num = ler.nextFloat();
        
        Quad = (float) Math.pow(Num, 2);
        
        System.out.println("O resultado é: "+Quad);
        
        
        
        
    
}
}
