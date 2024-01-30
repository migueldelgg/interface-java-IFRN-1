package entities;

public class Circle implements AreaCalculavel{
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.pow(raio, 2);
    }
}
