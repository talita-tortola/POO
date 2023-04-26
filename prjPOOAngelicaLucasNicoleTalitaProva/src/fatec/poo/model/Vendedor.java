package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * Aluna: Angélica Shigematsu.
 * Aluno: Lucas Henrique Cardoso da Aparecida.
 * Aluna: Nicole Baraldi dos Santos.
 * Aluna: Talita Tortola Almeida.
 * 
 */
public class Vendedor extends Pessoa {
    
    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setVendedor(this);
        
    }
    
}
