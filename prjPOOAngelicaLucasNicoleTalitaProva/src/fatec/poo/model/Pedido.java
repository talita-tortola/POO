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
public class Pedido {
    
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private ArrayList<ItemPedido> itemPedidos;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itemPedidos = new ArrayList<ItemPedido>();
    }

    public void addItemPedido(ItemPedido p){
        itemPedidos.add(p);
        p.setPedidos(this);
        cliente.setLimiteDisp(getCliente().getLimiteDisp() - (p.getProduto().getPreco() * p.getQtdeVendida()));
    }
    
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }
        
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }
    
}