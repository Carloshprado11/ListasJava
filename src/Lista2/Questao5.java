
package Lista2;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Questao5 {

 
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, Esc;
        float Med, Mult, Soma;
        Med=0;
        Mult=0;
        Soma=0;
               
        System.out.println("Digite o 1º valor: ");
        n1=ler.nextInt();
        System.out.println("Digite o 2º valor: ");
        n2=ler.nextInt();
        System.out.println("Digite o 3º valor: ");
        n3=ler.nextInt();
        
        System.out.println("Escolha uma das opções");
        System.out.println("Para calcular a soma tecle 1");
        System.out.println("Para calcular a Media tecle 2");
        System.out.println("Para calcular a Multiplicação tecle 3");
        Esc=ler.nextInt();
        
        switch(Esc){
            case 1: 
                Soma=n1+n2+n3;
                System.out.println("A soma dos valores é: "+Soma);
            break;
            case 2: 
                Med=((n1+n2+n3)/3);
                System.out.println("A Média dos valores é: "+Med);
            break;
            case 3: 
                Mult=n1*n2*n3;
                System.out.println("A Multiplicação dos valores é: "+Mult);
            break;
            default: 
                System.out.println("Opção incorreta!");
        }
        
        
        
        
        
        
    }
    
}
