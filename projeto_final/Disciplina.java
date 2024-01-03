package projeto_final;

import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina ( String nome, int codigo ) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome ( ) {
        return this.nome;
    }
    
    public int getCodigo ( ) {
        return this.codigo;
    }

    //metodo para inserir aluno na disciplina
    public void inserirAluno (Aluno aluno){
        this.alunos.add(aluno);
    };

    //metodo para remover aluno da disciplina
    public void removerAluno (int mat){
        for ( int i = 0; i < this.alunos.size(); i++ )
            if ( this.alunos.get(i).getMatricula() == mat ) {
                this.alunos.remove(this.alunos.get(i));
                break;
            }
    };

    public void listarAlunosDaDisciplina( ) {
        for (Aluno aluno : this.alunos) {
            System.out.print("Matrícula: " + aluno.getMatricula() + " - ");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println();
        }
    }

}
