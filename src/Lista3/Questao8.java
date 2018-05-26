
package Lista3;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Questao8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n,x,par, impar;
        
        System.out.println("Digite um numero: ");
        n=ler.nextInt();
        
        for (x=0; x<=n; x++){
            if (x%2==0){
                par=x;
                System.out.println("Par: "+par);
            }
            else{
                impar=x;
                System.out.println("Impar: "+impar);
            }
            
        }
        
    }
    
}
