
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
        df.applyPattern("#.##");

        int codProd, qtdeVend;
        String descProd;
        double precUnit, valCompra, valDesc, valTotal = 0;

        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt();
        while (codProd > 0) {
            System.out.print("Digite a descrição: ");
            descProd = entrada.next();
            System.out.print("Digite o preço unitário: ");
            precUnit = entrada.nextDouble();
            System.out.print("Digite a qtde. vendida: ");
            qtdeVend = entrada.nextInt();
            valCompra = precUnit * qtdeVend;
            System.out.print("\nDigite o código do produto: ");
            codProd = entrada.nextInt();
            valTotal += valCompra;
        }
        if (valTotal >= 850) {
            valDesc = 0.1 * valTotal;
            valTotal = valTotal - valDesc;
        } else {
            valDesc = 0;
        }
        System.out.print("\n\nValor do Desconto == > R$ " + df.format(valDesc));
        System.out.print("\n\nValor da compra ==> R$ " + df.format(valTotal));
    }

}
