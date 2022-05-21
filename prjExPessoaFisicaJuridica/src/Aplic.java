
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.##");
        
        PessoaFisica PesFis = new PessoaFisica("123.456.789-10","Wei Wuxian",2013);
        
        PesFis.setBase(1035.02);
        PesFis.addCompras(12000.25);
        PesFis.addCompras(652.41);
        
        System.out.println("\nCPF                 => " + PesFis.getCpf());
        System.out.println("Nome                => " + PesFis.getNome());
        System.out.println("Ano de Inscrição    => " + PesFis.getAnoInscricao());
        System.out.println("Total de Compras    => " + df.format(PesFis.getTotalCompras()));
        System.out.println("Base                => " + PesFis.getBase());
        System.out.println("Bônus               => " + df.format(PesFis.calcBonus(2022)));
        
        PessoaJuridica PesJur = new PessoaJuridica("12.345.678/0001-91","Lan Wangji",2000);

        PesJur.setTaxaIncentivo(2);
        PesJur.addCompras(12000.50);
        
        System.out.println("\nCGC                 => " + PesJur.getCgc());
        System.out.println("Nome                => " + PesJur.getNome());
        System.out.println("Ano de Inscrição    => " + PesJur.getAnoInscricao());
        System.out.println("Total de Compras    => " + df.format(PesJur.getTotalCompras()));
        System.out.println("Taxa de Incentivo   => " + PesJur.getTaxaIncentivo() + "%");
        System.out.println("Bônus               => " + df.format(PesJur.calcBonus(2022)));
        
    }
    
}
