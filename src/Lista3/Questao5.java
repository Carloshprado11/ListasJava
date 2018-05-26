
package Lista3;


public class Questao5 {

  
    public static void main(String[] args) {
        int impar, par, soma1=0, soma2=0;
       
        for(par=0; par<1001; par=par+2){
            soma1=soma1+par;            
        }
        for (impar=1; impar<1001; impar=impar+2){
            soma2=soma2+impar;          
            
        }
        System.out.println("De 0 até 1000");
        System.out.println("A soma de todos numeros impares é: "+soma2);
        System.out.println("A soma de todos numeros pares é: "+soma1);
    }
    
}
