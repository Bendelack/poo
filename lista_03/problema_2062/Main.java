import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String el;
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = obj.next();
            if ( array[i].length() == 3 ){
                char[] palavra = array[i].toCharArray();
                if( palavra[0] == 'O' && palavra[1] == 'B' )
                    array[i] = "OBI";
                else if ( palavra[0] == 'U' && palavra[1] == 'R' )
                    array[i] = "URI";
            }
        }

        System.out.print(array[0]);

        for (int i = 1; i < n; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}