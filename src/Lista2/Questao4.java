
package Lista2;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Questao4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int V1, V2, V3, Vmaior, Vmenor, Vmedio;
        
            Vmaior = 0;
            Vmedio = 0;
            Vmenor = 0;
        System.out.println("Digite 3 valores que não podem se repetir:");
        System.out.println("------------------------------------------");
        System.out.println("Valor 1: ");
        V1 = ler.nextInt();
        System.out.println("Valor 2: ");
        V2 = ler.nextInt();
        System.out.println("Valor 3: ");
        V3 = ler.nextInt();
        
        if(V1 == V2 || V2 == V3 || V1 == V3){
            System.out.println("Erro: Eu falei que não podia se repetir :/ ");
                  
        }
        else if(V1>V2 && V1>V3 && V2>V3){
            Vmaior = V1;
            Vmedio = V2;
            Vmenor = V3;
                       
        }
        else if(V1>V2 && V1>V3 && V3>V2){
            Vmaior = V1;
            Vmedio = V3;
            Vmenor = V2;
            
        }
        else if(V2>V1 && V2>V3 && V1>V3){
            Vmaior = V2;
            Vmedio = V1;
            Vmenor = V3;
            
        }
        else if(V2>V1 && V2>V3 && V3>V1){
            Vmaior = V2;
            Vmedio = V3;
            Vmenor = V1;
        }
        else if(V3>V1 && V3>V2 && V1>V2){
            Vmaior = V3;
            Vmedio = V1;
            Vmenor = V2;
            
        }
        else if(V3>V1 && V3>V2 && V2>V1){
            Vmaior = V3;
            Vmedio = V2;
            Vmenor = V1;
            
        }
        char opcao, C, D;
        System.out.println("Digite C para ver na ordem Crescente.");
        System.out.println("Digite D para ver na ordem Decrescente."); 
        opcao = ler.next().charAt(0);
        
        switch(opcao){
            case 'c': 
                System.out.printf("Ordem Crescente: "+Vmenor +Vmedio+Vmaior);
            break;
            case 'd':
                System.out.printf("Ordem Decrescente: " +Vmaior +Vmedio+Vmenor);
            break;
            default: 
                System.out.println("Erro!");
                  
                
            
            
        }
        
        
        
        
        
        
        
    }
    
}
