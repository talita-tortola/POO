
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        ContaCorrente objConta = new ContaCorrente(1010,1250.00);
        
        do{
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("Numero da conta: " + objConta.getNumero());
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    objConta.depositar(entrada.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    objConta.sacar(entrada.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo: " + objConta.getSaldo());
                    break;
            }
            
        }while(opcao < 4);
        
    }
    
}
