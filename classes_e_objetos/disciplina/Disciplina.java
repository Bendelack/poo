/*
A classe deve ter atributos para armazenar o nome da disciplina e as notas dos dois bimestres e da prova final. Os métodos da classe devem permitir calcular a média parcial (com as notas bimestrais) e a média final (com todas as notas, caso o aluno tenha ficado em prova final). Considere como média de aprovação o valor 60, notas de 0 a 100, média parcial ponderada com pesos 2 e 3 e média final como a média aritmética da média parcial com a nota da prova final, caso o aluno não seja aprovado por média.
Escrever um programa para testar a classe.
*/

public class Disciplina {
    private String nome;
    private double nota1;
    private double nota2;
    private double provaFinal;
  
    public Disciplina() {
      this.nome = "";
      this.nota1 = 0.0;
      this.nota2 = 0.0;
      //this.notaFinal = 0.0;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public void setNota1(double nota1) {
      this.nota1 = nota1;
    }
  
    public void setNota2(double nota2) {
      this.nota2 = nota2;
    }

    public String getNome(){
      return this.nome;
    }
  
    public double calculaMediaParcial(){
      double mediaParcial = (this.nota1 * 2 + this.nota2 * 3) / 5;
      return mediaParcial;
    }
  
    public double calculaMediaFinal() {
      double mediaParcial = this.calculaMediaParcial();
      if (mediaParcial >= 60) {
        return mediaParcial;
      }
      return (mediaParcial + this.provaFinal)/2;
    }
  }