
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String unidade;
        
        System.out.println("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        Retangulo objRet = new Retangulo(unidade);
        
        System.out.println("Insira a altura: ");
        objRet.setAltura(entrada.nextDouble());
        System.out.println("Insira a base: ");
        objRet.setBase(entrada.nextDouble());
        System.out.println("\nAltura: " + objRet.getAltura() + objRet.getUnidadeMedida());
        System.out.println("Base: " + objRet.getBase() + objRet.getUnidadeMedida());
        System.out.println("\nÁrea: " + objRet.calcArea() + objRet.getUnidadeMedida() + "²");
        System.out.println("Perímetro: " + objRet.calcPerimetro() + objRet.getUnidadeMedida());
        System.out.println("Diagonal: " + objRet.calcDiagonal() + objRet.getUnidadeMedida());
        
    }
    
}
