package projeto_final;

public class Professor {
    private String nome;
    private int matricula;
    private Disciplina disciplina;
    private boolean possuiDisciplina;

    public Professor ( String nome, int matricula ) {
        this.nome = nome;
        this.matricula = matricula;
        this.possuiDisciplina = false;
    }

    public String getNome ( ) {
        return this.nome;
    }

    public int getMatricula ( ) {
        return this.matricula;
    }

    // atribuir disciplina
    public void atribuirDisciplina ( Disciplina disc ) {
        this.disciplina = disc;
        this.possuiDisciplina = true;
    }

    // remover disciplina
    public void removerDisciplina ( ) {
        this.disciplina = null;
        this.possuiDisciplina = false;
    }

    public boolean getPossuiDisciplina ( ) {
        return this.possuiDisciplina;
    }


}