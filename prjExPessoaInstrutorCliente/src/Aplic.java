
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;


/**
 *
 * @author Talita
 */
public class Aplic {

    public static void main(String[] args) {
        
        Instrutor objInst = new Instrutor(123, "Jiang Cheng" , "(15) 99999-9999");
        
        objInst.setAreaAtuacao("Personal Trainer");
        
        System.out.println("\nIdentificação: " + objInst.getIdentificacao());
        System.out.println("Nome: " + objInst.getNome());
        System.out.println("Telefone: " + objInst.getTelefone());
        System.out.println("Área de atuação: " + objInst.getAreaAtuacao());
        
        Cliente objCli = new Cliente("123.456.789-10","Lan Xichen","(15) 98888-8888");
        
        objCli.setAltura(1.88);
        objCli.setPeso(70.5);
        
        System.out.println("\nCPF: " + objCli.getCpf());
        System.out.println("Nome: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("Altura: " + objCli.getAltura());
        System.out.println("Peso: " + objCli.getPeso());
        
    }
    
}
