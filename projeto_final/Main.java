package projeto_final;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // open Scanner
        Scanner obj = new Scanner(System.in);
        SistemaEscolar sistemaEscolar = new SistemaEscolar();

        System.out.println("Quantas disiciplinas desejas cadastrar?");
        double nDisciplinas = obj.nextInt();

        // cadastro de disciplinas
        for ( int i = 0; i < nDisciplinas; i++ ) {
            System.out.println("Qual é o nome da disciplina?");
            String nome = obj.next();

            System.out.println("Qual é o nome da disciplina?");
            String professor = obj.next();
            Disciplina disc = new Disciplina(nome, professor);
            sistemaEscolar.cadastrarDisciplina(disc);

        }



        // close Scanner
        obj.close();
    }
}
