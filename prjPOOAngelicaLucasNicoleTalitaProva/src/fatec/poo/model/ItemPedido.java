package fatec.poo.model;

/**
 *
 * Aluna: Angélica Shigematsu.
 * Aluno: Lucas Henrique Cardoso da Aparecida.
 * Aluna: Nicole Baraldi dos Santos.
 * Aluna: Talita Tortola Almeida.
 * 
 */
public class ItemPedido {

    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido;
    private Produto produto;

    public ItemPedido(int sequencia, double qtdeVendida, Produto p) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = p;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    
    public void setPedidos(Pedido pedido){
        this.pedido = pedido;
    }
    
    public Pedido getPedidos(){
        return pedido;
    }  

    public Produto getProduto() {
        return produto;
    }
}
