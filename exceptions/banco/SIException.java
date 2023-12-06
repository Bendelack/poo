public class SIException extends Exception {

    double saldo;
    double numero;

    public SIException ( double saldo,  double numero ) {

        super ( "Saldo Indisponível!" );
        this.saldo = saldo;
        this.numero = numero;

    }

    public double getSaldo (  ) {
        
        return this.saldo;

    }

}