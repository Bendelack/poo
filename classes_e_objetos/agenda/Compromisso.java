package agenda;

import java.util.Date;

public class Compromisso {
    private String assunto;
    private String local;
    private Date data;

    public Compromisso(String assunto, String local, Date data){
        this.assunto = assunto;
        this.local = local;
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }

    public Date getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}
