package fatec.poo.model;

/**
 *
 * @author Talita
 */
public class Circulo {
    
    private double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double calcArea(){
        return(Math.PI * Math.pow(raio, 2));
    }
    
    public double calcPerimetro(){
        return(2 * Math.PI * raio);
    }
    
    public double calcDiametro(){
        return(2 * raio);
    }
}
