package somma_n_numeri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Somma_n_numeri {
    static int N, cont = 0, Numero, voto;
    static InputStreamReader input;
    static BufferedReader tastiera ;
    static String str;
    static int Somma = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       input = new InputStreamReader(System.in);
       tastiera = new BufferedReader (input);
       System.out.println("Inserisci il numero delle materie, in modo da fare la pagella ");
       str = tastiera.readLine();
       N = Integer.parseInt(str);
       System.out.println("Le materie sono" + N);
       
       while (cont<N){
           System.out.print("Inserisci il " + (cont+1)+"° voto-->");
           str = tastiera.readLine();
            Numero = Integer.parseInt(str); 
           Somma+= Numero;
           voto= Somma/ N ;
           cont++;

           if(voto>5){
               System.out.println("Sei ammesso la tua media è --> " + voto);
           } if(voto>6){

               System.out.println("Sei bocciato la tua media è --> " + voto);
           }
       } 

    }   
        
        
} 
    

