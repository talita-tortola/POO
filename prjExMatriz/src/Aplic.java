
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] matNum = new int[15];
        int par = 0, impar = 0;
        
        for(int i = 0; i < 15; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            matNum[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < 15; i++){
            if(matNum[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        
        System.out.println("\n\nQtde de números pares: " + par + ".");
        System.out.println("Qtde de números ímpares: " + impar + ".");
        
    }
    
}
