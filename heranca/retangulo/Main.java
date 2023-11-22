package heranca.retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(10, 25);
        Retangulo quad = new Quadrado(10);

        System.out.println(ret.toString());
        System.out.println(quad.toString());

        System.out.println(ret.getDiagonal());
        System.out.println(quad.getDiagonal());
        System.out.println(quad.getArea());
    }
}
