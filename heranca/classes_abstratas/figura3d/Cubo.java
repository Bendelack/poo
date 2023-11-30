package heranca.classes_abstratas.figura3d;

public class cubo extends Figura3d {
    double lado;

    public Figura3d (double lado) {
        this.lado = lado;
    }

    @Override
    public double getVolume () {
        return Math.pow(this.lado, 3);
    }
}