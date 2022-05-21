package fatec.poo.model;

/**
 *
 * @author Talita
 */
public class ListaNumeros {
    
    private double[] matNum;
    private int qtdeElem;
    private int indice;
    
    public ListaNumeros(int qtdeElem){
        this.qtdeElem = qtdeElem;
        matNum = new double[this.qtdeElem];
        indice = 0;
    }

    public double[] getMatNum() {
        return matNum;
    }

    public int getQtdeElem() {
        return qtdeElem;
    }
    
    public void insereNumero(double num){
        matNum[indice] = num;
        indice++;
    }
    
    public double calcSomatoria(){
        int soma = 0;
        for(int i = 0; i < qtdeElem; i++){
            soma += matNum[i];
        }
        return soma;
    }
    
    public double calcMedia(){
        return calcSomatoria() / qtdeElem;
    }
    
    public double pesqMaior(){
        double maior = matNum[0];
        for(int i = 0; i < qtdeElem; i++){
            if(matNum[i] > maior){
                maior = matNum[i];
            }
        }
        return maior;
    }
    
    public double pesqMenor(){
        double menor = matNum[0];
        for(int i = 1; i < qtdeElem; i++){
            if(matNum[i] < menor){
                menor = matNum[i];
            }
        }
        return menor;
    }
    
}
