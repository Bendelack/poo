package heranca.retangulo;

public class Quadrado extends Retangulo {
    double lado;
    public Quadrado (double lado) {
        super(lado, lado);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "lado: " + this.lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }
}
