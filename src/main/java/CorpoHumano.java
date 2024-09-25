package main.java;

public class CorpoHumano {
    private double massa;
    private double altura;

    public CorpoHumano(){

    }

    public CorpoHumano(double massa, double altura) {
        this.massa = massa;
        this.altura = altura;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcIMC(){
        return this.massa / this.altura;
    }
    
}
