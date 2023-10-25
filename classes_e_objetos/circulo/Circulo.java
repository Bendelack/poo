public class Circulo {

  private double raio;

  public Circulo() {
    this.raio = 0.0;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return this.raio;
  }

  public double calculaArea() {
    double area = Math.PI * Math.pow(raio, 2);
    return area;
  }

  public double calculaCircunferencia() {
    double circunferencia = 2 * Math.PI * raio;
    return circunferencia;
  }
}