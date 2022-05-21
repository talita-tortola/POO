package fatec.poo.model;

/**
 *
 * @author Talita
 */
public class PessoaJuridica extends Pessoa {

    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String cgc, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    @Override
    public double calcBonus(int anoAtual) {
        return(((taxaIncentivo / 100) * super.getTotalCompras()) * (anoAtual - super.getAnoInscricao()));
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }
    
}
