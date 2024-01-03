package projeto_final;

import java.util.ArrayList;

public class SistemaEscolar {

    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;

    // metodo construtor
    public SistemaEscolar ( ) {
        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    // metodo para cadastrar nova disciplina
    public void cadastrarDisciplina ( Disciplina disc ) {
        this.disciplinas.add(disc);
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    // metodo para remover um disciplina
    public void removerDisciplina ( int cod ) {
        for ( int i = 0; i < this.disciplinas.size(); i++ ){
            if ( this.disciplinas.get(i).getCodigo() == cod ){
                this.disciplinas.remove(this.disciplinas.get(i));
                System.out.println("Disciplina removida com sucesso!");
                return;
            }
        }
        System.out.println("Disciplina não existe");
    }

    // metodo para cadastrar nova professor
    public void cadastrarProfessor ( Professor prof ) {
        this.professores.add(prof);
        System.out.println("Professor cadastrado com sucesso!");
    }

    // metodo para remover um professor
    public void removerProfessor ( int mat ) {
        for ( int i = 0; i < this.professores.size(); i++ ){
            if ( this.professores.get(i) == null ){
                System.out.println("Professor não existe!");
                return;
            } else {
                this.professores.remove(this.professores.get(i));
                System.out.println("Professor removido com sucesso!");
            }
        }
    }

    // atribuir disciplina para professor
    public void atribuirDisciplina ( int mat, int cod ) {
        for ( int i = 0; i < this.professores.size(); i++ )
            if (this.professores.get(i).getMatricula() == mat){
                if (this.professores.get(i).getPossuiDisciplina() == true){
                    System.out.println("Professor já possui disciplina");
                    return;
                }

                for ( int j = 0; j < this.professores.size(); j++ )
                    if( this.disciplinas.get(j).getCodigo() == cod ){
                        this.professores.get(i).atribuirDisciplina(this.disciplinas.get(j));
                        System.out.println("Disciplina atribuida com sucesso!");
                    }
            }
    }

    // remover disciplina de professor
    public void removerDisciplinaDeProfessor ( int mat ) {
        for ( int i = 0; i < this.professores.size(); i++ )
            if (this.professores.get(i).getMatricula() == mat){
                if (this.professores.get(i).getPossuiDisciplina() == false){
                    System.out.println("Professor não possui disciplina");
                    return;
                }

                this.professores.get(i).removerDisciplina();
                System.out.println("Disciplina removida de professor com sucesso!");
            }
    }

    public void adicionarAluno ( Aluno aluno, int cod )  {
        for ( int i = 0; i < this.disciplinas.size(); i++ )
            if ( this.disciplinas.get(i).getCodigo() == cod ) {
                this.disciplinas.get(i).inserirAluno(aluno);
                System.out.println("Aluno cadastrado com sucesso na disciplina " + this.disciplinas.get(i).getNome());
                return;
            }
        System.out.println("A disciplina não existe");
        return;
    }

    public void excluirAluno ( int mat, int cod )  {
        for ( int i = 0; i < this.disciplinas.size(); i++ )
            if ( this.disciplinas.get(i).getCodigo() == cod ) {
                this.disciplinas.get(i).removerAluno(mat);
                System.out.println("Aluno removido com sucesso na disciplina " + this.disciplinas.get(i).getNome());
                return;
            }
        System.out.println("A disciplina não existe");
        return;
    }

    public void listarProfessores ( ) {
        for (Professor prof : this.professores) {
            System.out.print("Matrícula: " + prof.getMatricula() + " - ");
            System.out.println("Nome: " + prof.getNome());
            System.out.println();
        }
    }

    public void listarDisciplinas ( ) {
        for (Disciplina disc : this.disciplinas) {
            System.out.print("Código: " + disc.getCodigo() + " - ");
            System.out.println("Nome: " + disc.getNome());
            System.out.println();
        }
    }

    public void listarAlunos ( int cod ) {
        for (Disciplina disc : this.disciplinas) {
            if (disc.getCodigo() == cod) {
                disc.listarAlunosDaDisciplina();
            }
        }
    }

    
}
