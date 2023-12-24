import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();
        String palavra;
        char[] linhaUmArr;
        String linhaUm;
        char[] linhaDoisArr;
        String linhaDois;
        String novaPalavra;
        boolean diferente = false;

        for ( int i = 0; i < n; i++ ) {

            linhaUm = obj.nextLine();
            linhaDois = obj.nextLine();

            if ( linhaUm.length() != linhaDois.length() ) {
                linhaDois += " ";
                diferente = true;
            }

            linhaUmArr = linhaUm.toCharArray();
            linhaDoisArr = linhaDois.toCharArray();


            novaPalavra = "";
                
            int x = 0;
            while ( x < linhaUm.length()){
                novaPalavra = novaPalavra + linhaUmArr[x] + linhaUmArr[x+1] + linhaDoisArr[x] + linhaDoisArr[x+1];
                x += 2;
            }
            if ( diferente )
                novaPalavra = novaPalavra.substring(0, novaPalavra.length()-1);
            System.out.println(novaPalavra);
            
        }

    }
}
