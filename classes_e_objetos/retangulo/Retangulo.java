
/*
5. Um Retângulo
Escrever a classe Retangulo de acordo com o diagrama. 
A classe deve ter como atributos: base (b) e altura (h) do retângulo. O construtor da classe recebe os valores iniciais da base e altura do retângulo, que devem ser positivos. Os métodos setBase e setAltura podem modificar os valores da base e da altura, respectivamente; os métodos getBase e getAltura retornam os valores armazenados nos atributos; getArea e getDiagonal calculam a área e a diagonal do retângulo. O método toString deve retornar um texto com os atributos do objeto.

*/

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
    
  }