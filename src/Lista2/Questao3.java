
package Lista2;
import java.util.Scanner;

        
public class Questao3 {

   
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int N1, N2, N3,Nmaior;
       float Media;
       
       System.out.println("Digite a 1ª Nota: ");
       N1 = ler.nextInt();
       System.out.println("Digite a 2ª Nota: ");
       N2 = ler.nextInt();
       System.out.println("Digite a 3ª Nota: ");
       N3 = ler.nextInt();
       
       Media = (N1 + N2 + N3)/3;
       Nmaior = N1;
       
       if(N2 > N1 && N2 > N3){
        Nmaior = N2;
    }  else if(N3 > N1 && N3 > N2){
        Nmaior = N3;
        
    }             
       System.out.println("A média das 3 nota é: "+Media);
       System.out.println("A maior nota é: "+Nmaior);
    }
        
}
