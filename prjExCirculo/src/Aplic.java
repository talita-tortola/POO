
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.####");
        Circulo objCirculo = new Circulo();
        
        int opcao;
        
        System.out.println("Insira o número do raio: ");
        objCirculo.setRaio(entrada.nextInt());
        
        do{
            System.out.println("\n1-Exibir o raio");
            System.out.println("2-Exibir área");
            System.out.println("3-Exibir perímetro");
            System.out.println("4-Exibir diâmetro");
            System.out.println("5-Sair");
            System.out.println("\n\tEscolha uma opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Raio: " + df.format(objCirculo.getRaio()));
                    break;
                case 2:
                    System.out.println("Área: " + df.format(objCirculo.calcArea()));
                    break;
                case 3:
                    System.out.println("Perímetro: " + df.format(objCirculo.calcPerimetro()));
                    break;
                case 4:
                    System.out.println("Diâmetro: " + df.format(objCirculo.calcDiametro()));
                    break;
            }
                 
        }while(opcao < 5);
        
    }
    
}