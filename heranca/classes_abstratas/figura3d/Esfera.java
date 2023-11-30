package heranca.classes_abstratas.figura3d;

public class Esfera extends Figura3d {
    double raio;
    public Esfera (double raio) {
        this.raio = raio;
    }

    @Override
    public double getVolume () {
        return 4/3 * Math.PI * Math.pow(this.raio, 3);
    }
}