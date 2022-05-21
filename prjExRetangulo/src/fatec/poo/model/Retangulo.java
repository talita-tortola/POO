package fatec.poo.model;

/**
 *
 * @author Talita
 */
public class Retangulo {
    
    private double altura;
    private double base;
    private String unidadeMedida;

    public Retangulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public double calcArea(){
        return(altura * base);
    }
    
    public double calcPerimetro(){
        return(2 * (altura + base));
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
    
}
