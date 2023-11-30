package heranca.classes_abstratas.figura3d;

public class Main {
    public static void main(String[] args){
        Esfera fig1 = new Esfera(7.13);
        double volumeFig1 = fig1.getVolume();
        System.out.println(volumeFig1);

        Cubo fig2 = new Cubo(3.04);
        double volumeFig2 = fig2.getVolume();
        System.out.println(volumeFig2);
    }
}