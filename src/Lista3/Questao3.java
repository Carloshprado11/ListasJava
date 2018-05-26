
package Lista3;


public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float divi, result=0; 
       int N1, contador=0;
       
        for(N1=0; N1<100; N1=N1+2){
            contador=contador+1;
            divi=(N1/contador);
            result=result+divi;            
        }
        System.out.println(N1+"+"+contador+" = "+result);
        
       
    }
    
}
