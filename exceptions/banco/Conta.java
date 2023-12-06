public class Conta {

    double numero;
    double saldo;
    
    public Conta ( double numero, double saldo ) {
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar ( double valor ) {
        this.saldo += valor;
    }

    void sacar ( double valor ) {
        this.saldo -= valor;
    }

}