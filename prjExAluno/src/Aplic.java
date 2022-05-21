
import fatec.poo.model.Aluno;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.#");
        
        int opcao;
        
        System.out.println("Insira o RA: ");
        objAluno.setRa(entrada.nextInt());
        System.out.println("Insira a nota da primeira prova: ");
        objAluno.setNtPrv1(entrada.nextInt());
        System.out.println("Insira a nota da segunda prova: ");
        objAluno.setNtPrv2(entrada.nextInt());
        System.out.println("Insira a nota do primeiro trabalho: ");
        objAluno.setNtTrab1(entrada.nextInt());
        System.out.println("Insira a nota do segundo trabalho: ");
        objAluno.setNtTrab2(entrada.nextInt());
        
        do{
            System.out.println("\n1-Exibir Nota das Provas/Trabalhos");
            System.out.println("2-Exibir Média dos Trabalhos/Provas");
            System.out.println("3-Exibir Média Final");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("1ª prova: " + objAluno.getNtPrv1());
                    System.out.println("2ª prova: " + objAluno.getNtPrv2());
                    System.out.println("1º trabalho: " + objAluno.getNtTrab1());
                    System.out.println("2º trabalho: " + objAluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("Média dos trabalhos: " + df.format(objAluno.calcMediaTrab()));
                    System.out.println("Média das provas: " + df.format(objAluno.calcMediaProva()));
                    break;
                case 3:
                    System.out.println("Média Final: " + df.format(objAluno.calcMediaFinal()));
                    break;
            }
                       
        }while(opcao < 4);
        
    }
    
}
