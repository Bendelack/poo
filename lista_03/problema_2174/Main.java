import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int total = 151;
    int soma = 0;
    String[] vetor;
    vetor = new String[n];
    for(int i = 0; i < n; i++){
      vetor[i] = obj.next();
    }
    
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        if(vetor[i].equals(vetor[j])){
          vetor[j] = "x";
        }
      }
    }

    for(int i = 0; i < n; i++){
      if(!vetor[i].equals("x")){
        soma++;
      }
    }

    total -= soma;

    System.out.println("Falta(m) " + total + " pomekon(s).");
  }
}
