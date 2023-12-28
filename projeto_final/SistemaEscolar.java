package projeto_final;

import java.util.ArrayList;

public class SistemaEscolar {

    ArrayList<Disciplina> disciplinas;
    ArrayList<Professor> professores;

    // metodo construtor
    public SistemaEscolar ( ) {
        this.disciplinas = new ArrayList<>();
    }

    // metodo para cadastrar nova disciplina
    public void cadastrarDisciplina ( Disciplina disc ) {
        this.disciplinas.add(disc);
    }

    // metodo para remover um disciplina
    public void removerDisciplina ( Disciplina disc ) {
        this.disciplinas.remove(disc);
    }

    // metodo para cadastrar nova professor
    public void cadastrarProfessor ( Professor prof ) {
        this.professores.add(prof);
    }

    // metodo para remover um professor
    public void removerProfessor ( Professor prof ) {
        this.professores.remove(prof);
    }
    
}
