import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String palavra;
        String maior = "";
        String[] div;
        while( true ){
            palavra = obj.nextLine();
            if ( palavra.equals("0") )
                break;
            div = palavra.split(" ");
            System.out.print(div[0].length());
            if ( div[0].length() >= maior.length() )
                maior = div[0];
            for ( int i = 1; i < div.length; i++ ){
                System.out.print("-" + div[i].length());
                if ( div[i].length() >= maior.length() )
                    maior = div[i];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The biggest word: " + maior);
    }
}