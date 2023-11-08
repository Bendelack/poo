package agenda;

public class Agenda {
    private Compromisso[] compromissos;
    private int k;
    private int qtd;

    public Agenda(){
        this.k = 10;
        this.compromissos = new Compromisso[k];
        this.qtd = 0;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void inserir(Compromisso compromisso){}
        // this.compromissos[this.compromissos.length] = compromisso;

    public void excluir(Compromisso compromisso) {}

    public void listar(){
        for (Compromisso compromisso : compromissos) {
            System.out.println(compromisso);
        }
    }

    public void pesquisar(int mes, int dia){
        // Compromisso[] comps = new Compromisso[this.qtd];

        for (Compromisso compromisso : compromissos) {
            System.out.println(compromisso.getData());
        }

    }

    
}
