package heranca.retangulo;

public class Retangulo {

    private double base;
    private double altura;
  
    public Retangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
    }
  
    public void setBase(double base) {
      this.base = base;
    }
  
    public void setAltura(double altura) {
      this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getArea()  {
        return (base * altura)/2;
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }

    @Override
    public String toString() {
        return "base: " + this.base + " altura: " + this.altura;
    }
    
  }