
package Lista3;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Questao10 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contp, n, cont2;
        float primo;
        
        System.out.println("Digite um numero: ");
        n=ler.nextInt();
        
        if(n>0){
            for(contp=0; contp<=n; contp++){
              primo=0;
                for(cont2=0; cont2>=contp; cont2++){
                    if(contp%cont2 == 0){
                        primo=primo+1;                        
                    }
                }
            if(primo==2){
                System.out.println(contp);                
            }
                
            }            
        }
    }
    
}
