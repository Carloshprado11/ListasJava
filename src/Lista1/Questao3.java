/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import static java.lang.Math.PI;
import java.util.Scanner;
/**
 *
 * @author Cliente
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float Vol, Raio, Altura;
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite o raio da lata: \nDigite a atura da lata:\n");
        Raio = ler.nextFloat();  
        Altura = ler.nextFloat();
        
            Vol = (float) (Math.PI * (Math.pow(Raio,2)*Altura));
        System.out.println("O volume da lata é : "+Vol);
        
    }
    
}
