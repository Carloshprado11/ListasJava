
package Lista3;
import java.util.Scanner;

public class Questao9 {

  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n,x,contador=0;
        
        System.out.println("Escreva o número que deseja descobrir se é primo: ");
        n=ler.nextInt();
        
        for(x=0; x<=n; x++){
            if(n%x==0){
                contador=contador+1;                              
            }           
            
        }
        if(contador==2){
            System.out.println("Este numero é primo");           
        }
        else{
            System.out.println("Este numero não é primo.");
        }
               
              
    }
    
}
