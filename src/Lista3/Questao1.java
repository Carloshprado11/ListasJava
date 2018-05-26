
package Lista3;
import java.util.Scanner;

public class Questao1 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Nmaior, Nmenor, Num, cont;
        Nmaior=0;
        Nmenor=0;
        
        
        for (cont=0;cont<15;cont++){
            System.out.println("Digite um numero: "); 
            Num = ler.nextInt();
                        
            if(cont==0){
                 Nmaior=Num;
                 Nmenor=Num;        
                                      
            } 
            else if(Num<Nmenor){
               Nmenor=Num; 
            }
            else if(Num>Nmaior){
                Nmaior=Num;                               
            }
                                 
        }
        System.out.println("O número maior é: "+Nmaior);
        System.out.println("O número menor é: "+Nmenor);
    }
    
}
