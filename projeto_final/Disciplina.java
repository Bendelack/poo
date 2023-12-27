package projeto_final;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina ( String nome, String professor ) {
        this.nome = nome;
        this.professor = new Professor(professor, this.nome);
        this.alunos = new ArrayList<>();
    }

    public String getNome ( ) {
        return this.nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    //metodo para inserir aluno na disciplina
    public void inserirAluno (Aluno aluno){
        this.alunos.add(aluno);
    };

    //metodo para remover aluno da disciplina
    public void removerAluno (Aluno aluno){
        this.alunos.remove(aluno);
    };
}
