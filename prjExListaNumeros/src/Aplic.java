
import fatec.poo.model.ListaNumeros;
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        int qtde;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a qtde de elementos da matriz: ");
        qtde = entrada.nextInt();
        
        ListaNumeros objLista = new ListaNumeros(qtde);
        
        for(int i = 0; i < objLista.getQtdeElem(); i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            objLista.insereNumero(entrada.nextDouble());
        }
        
        int opcao;
        
        do{
            System.out.println("\n1-Exibir Somatória");
            System.out.println("2-Exibir Média");
            System.out.println("3-Exibir Maior Valor");
            System.out.println("4-Exibir Menor Valor");
            System.out.println("5-Exibir Lista");
            System.out.println("6-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Somatória: " + objLista.calcSomatoria());
                    break;
                case 2:
                    System.out.println("Média: " + objLista.calcMedia());
                    break;
                case 3:
                    System.out.println("Maior Valor: " + objLista.pesqMaior());
                    break;
                case 4:
                    System.out.println("Menor Valor: " + objLista.pesqMenor());
                    break;
                case 5:
                    System.out.println("\n\nLista de números: ");
                    for(int i = 0; i < objLista.getQtdeElem(); i++){
                        System.out.println(objLista.getMatNum()[i] + " ");
                    }
                    break;
            }
            
        }while(opcao < 6);
        
    }
    
}
