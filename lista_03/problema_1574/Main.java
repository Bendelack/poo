import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int qinst, p, x;
        String inst;
        String vetor[];
        String[] rep = new String[3];

        for(int i = 0; i < n; i++){
            p = 0;
            qinst = obj.nextInt();
            obj.nextLine();
            vetor = new String[qinst];

            for (int j = 0; j < qinst; j++) {

                inst = obj.nextLine();
                if(inst.equals("LEFT")){
                    p -= 1;
                } else if(inst.equals("RIGHT")){
                    p += 1;
                } else {
                    rep = inst.split(" ");
                    x = Integer.parseInt(rep[2]) - 1;
                    inst = vetor[x];

                    if(inst.equals("LEFT")){
                        p -= 1;
                    } else if(inst.equals("RIGHT")){
                        p += 1;
                    }
                }

                vetor[j] = inst;
            }

            System.out.println(p);
        }
        obj.close();
    }
}
