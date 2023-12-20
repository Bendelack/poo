

public class Banco extends Conta {

    public Banco ( double numero, double saldo ) {
        super(numero, saldo);

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