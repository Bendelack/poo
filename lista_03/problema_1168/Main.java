import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int soma = 0;
    String str;
    char vetor[];

    for(int i = 0; i < n; i++){
      str = obj.next();
      vetor = str.toCharArray();

      for (int j = 0; j < vetor.length; j++) {
        
        if(vetor[j] == '1'){
          soma += 2;
        } else if(vetor[j] == '7'){
          soma += 3;        
        } else if(vetor[j] == '4'){
          soma += 4;
        } else if(vetor[j] == '2' || vetor[j] == '3' || vetor[j] == '5'){
          soma += 5;
        } else if(vetor[j] == '9' || vetor[j] == '0' || vetor[j] == '6'){
          soma += 6;
        } else {
          soma += 7;
        }        
      }

      System.out.println(soma + " leds");
      soma = 0;
    }
  }
}
