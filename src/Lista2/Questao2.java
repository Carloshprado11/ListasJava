
package Lista2;
import java.util.Scanner;


public class Questao2 {


    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int Lado1, Lado2, Lado3;
        
        System.out.println("Escreva a medida dos 3 lados do Triângulo");
        System.out.println("Lado 1: ");
        Lado1 = ler.nextInt();
        System.out.println("Lado 2: ");
        Lado2 = ler.nextInt();
        System.out.println("Lado 3: ");
        Lado3 = ler.nextInt();
        
       if ((Lado1 < Lado2 + Lado3) && (Lado2 < Lado1 + Lado3) && (Lado3 < Lado1 + Lado2)) {
                if (Lado1 == Lado2 && Lado1 == Lado3) {
                    System.out.println("Triangulo Equilatero");
                } else if ((Lado1 == Lado2) || (Lado1 == Lado3)) {
                    System.out.println("Triangulo Isosceles");
                } else
                    System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Não é um triangulo!");
            } 
    }
       
    
    
    }    
    

