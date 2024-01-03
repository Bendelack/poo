package projeto_final;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int matricula;
    private ArrayList<Nota> notas;

    public Aluno ( String nome, int matricula ) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public String getNome ( ) {
        return this.nome;
    }

    public int getMatricula ( ) {
        return this.matricula;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public void setMatricula ( int matricula ) {
        this.matricula = matricula;
    }


}
