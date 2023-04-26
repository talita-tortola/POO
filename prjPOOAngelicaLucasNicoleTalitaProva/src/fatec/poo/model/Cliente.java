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
public class Cliente extends Pessoa {
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;
    
    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        pedidos = new ArrayList<Pedido>();
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }
    
    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setCliente(this);
    }
    
}
