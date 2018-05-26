

package Lista2;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int Num;
        
        System.out.println("Digite um numero para descobrir se ele é impar ou par: ");
        Num = ler.nextInt();
        
        if (Num % 2 == 0){
            System.out.println("Esse número é PAR.");
        } else {
            System.out.println ("Esse número é IMPAR");
            
        }
        
        
    }
    
}
