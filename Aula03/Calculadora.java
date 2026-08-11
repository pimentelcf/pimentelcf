package Aula03;

public class Calculadora {

    private double PrimeiroNumero;
    private double SegundoNumero;

    
    public double getPrimeiroNumero() {
        return PrimeiroNumero;
    }

    public void setPrimeiroNumero(double PrimeiroNumero) {
        this.PrimeiroNumero = PrimeiroNumero;
    }

    
    public double getSegundoNumero() {
        return SegundoNumero;
    }

    public void setSegundoNumero(double SegundoNumero) {
        this.SegundoNumero = SegundoNumero;
    }


    public double somar() {
        return PrimeiroNumero + SegundoNumero;
    }

    public double subtrair() {
        return PrimeiroNumero - SegundoNumero;
    }

    public double multiplicar() {
        return PrimeiroNumero * SegundoNumero;
    }

    public double dividir() {
        if (SegundoNumero == 0) {
            System.out.println("Erro: Não é possível dividir por zero!");
            return 0;
        }
        return PrimeiroNumero / SegundoNumero;
    }
}