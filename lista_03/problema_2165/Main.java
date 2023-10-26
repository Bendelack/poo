import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String texto = obj.nextLine();
        if(texto.length() <= 140)
            System.out.println("TWEET");
        else
            System.out.println("MUTE");
    }
}