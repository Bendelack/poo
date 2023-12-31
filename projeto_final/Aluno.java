package projeto_final;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int matricula;
    private ArrayList<Nota> notas;
    private ArrayList<Disciplina> disciplinas;

    public Aluno ( ) {
        this.notas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

}
