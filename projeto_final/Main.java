package projeto_final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // open Scanner
        Scanner obj = new Scanner(System.in);
        SistemaEscolar sistemaEscolar = new SistemaEscolar();
        int option;

        while (true) {
            System.out.println();
            System.out.println("0 - sair");
            System.out.println("1 - cadastrar disciplina");
            System.out.println("2 - cadastrar professor");
            System.out.println("3 - atribuir disciplina para professor");
            System.out.println("4 - remover disciplina de professor");
            System.out.println("5 - remover disciplina");
            System.out.println("6 - remover professor");
            System.out.println("7 - cadastrar aluno");
            System.out.println("8 - remover aluno de disciplina");
            System.out.println("9 - Listar professores");
            System.out.println("10 - Listar disciplinas");
            System.out.println("11 - Listar Alunos de disciplina");
            System.out.println("x - sair");
            System.out.println("x - sair");
            System.out.println("...");
            System.out.println();

            option = obj.nextInt();
            if ( option == 0 )
                break;
            if ( option == 1 ) {
                // cadastro de disciplinas
                System.out.println("Quantas disciplinas desejas cadastrar?");
                double nDisciplinas = obj.nextInt();

                // cadastro de cada disciplinas
                for ( int i = 0; i < nDisciplinas; i++ ) {
                    System.out.println("Qual é o código da disciplina?");
                    int codigo = obj.nextInt();

                    System.out.println("Qual é o nome da disciplina?");
                    String nome = obj.next();

                    Disciplina disc = new Disciplina(nome, codigo);
                    sistemaEscolar.cadastrarDisciplina(disc);
                    System.out.println();
                }
            } else if (option == 2) {
                // cadastro de professores
                System.out.println("Quantos professores desejas cadastrar?");
                double nProfessores = obj.nextInt();

                // cadastro de cada professores
                for ( int i = 0; i < nProfessores; i++ ) {
                    System.out.println("Qual é o nome do Professor?");
                    String nome = obj.next();

                    System.out.println("Qual é a matrícula do Professor?");
                    int matricula = obj.nextInt();

                    Professor prof = new Professor(nome, matricula);
                    sistemaEscolar.cadastrarProfessor(prof);
                }
            } else if (option == 3) {
                System.out.println("Qual é a matrícula do Professor?");
                int mat = obj.nextInt();

                System.out.println("Qual é código da disciplina?");
                int cod = obj.nextInt();

                sistemaEscolar.atribuirDisciplina(mat, cod);
            } else if (option == 4) {
                System.out.println("Qual é a matrícula do Professor?");
                int mat = obj.nextInt();

                sistemaEscolar.removerDisciplinaDeProfessor(mat);
            } else if (option == 5) {
                System.out.println("Qual é o código da disciplina?");
                int codigo = obj.nextInt();

                sistemaEscolar.removerDisciplina(codigo);
            } else if (option == 6) {
                System.out.println("Qual é a matrícula do Professor?");
                int mat = obj.nextInt();

                sistemaEscolar.removerProfessor(mat);
            } else if (option == 7) {
                System.out.println("Qual é o nome do aluno?");
                String nome = obj.next();

                System.out.println("Qual é a matrícula do aluno?");
                int mat = obj.nextInt();

                Aluno aluno = new Aluno(nome, mat);

                System.out.println("Em quantas disciplinas quer inserir o aluno?");
                int n = obj.nextInt();

                for (int i = 0; i < n; i++) {
                    System.out.println("Qual é o código da disciplina?");
                    int cod = obj.nextInt();

                    sistemaEscolar.adicionarAluno(aluno, cod);
                }

            } else if (option == 8) {
                System.out.println("Qual é o código da disciplina?");
                int cod = obj.nextInt();

                System.out.println("Qual é a matrícula do aluno?");
                int mat = obj.nextInt();

                sistemaEscolar.excluirAluno(mat, cod);
            } else if (option == 9) {
                sistemaEscolar.listarProfessores();
            } else if (option == 10) {
                sistemaEscolar.listarDisciplinas();;
            } else if (option == 11) {
                System.out.println("Qual é o código da disciplina?");
                int cod = obj.nextInt();

                sistemaEscolar.listarAlunos(cod);;
            }
        }






        // close Scanner
        obj.close();
    }
}
