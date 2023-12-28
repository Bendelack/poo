package projeto_final;

public class Nota {
    private double nota1;
    private double nota2;
    private double notaFinal;

    public Nota ( ) {

        this.nota1 = 0;
        this.nota2 = 0;
        this.notaFinal = 0;

    }

    public void setNota1 ( double nota1 ) {
        this.nota1 = nota1;
    }

    public void setNota2 ( double nota2 ) {
        this.nota2 = nota2;
    }

    public void setNotaFinal ( double notaFinal ) {
        this.notaFinal = notaFinal;
    }

    public double getNota1 ( ) {
        return this.nota1;
    }

    public double getNota2 ( ) {
        return this.nota2;
    }

    public double getNotaFinal ( ) {
        return this.notaFinal;
    }

    public double calcularMediaParcial ( ) {
        return ( ( this.nota1 * 2 ) + ( this.nota2 * 3 ) )/5;
    }

    public double calcularMediaFinal ( ) {
        // calculo da Media Final do aluno
        double mfd1 = (this.calcularMediaParcial() + this.notaFinal)/2;
        double mfd2 = ( ( 2 * this.notaFinal ) + ( 3 * this.nota2 ) )/5;
        double mfd3 = ( ( 2 * this.nota1 ) + ( 3 * this.notaFinal ) )/5;

        if ( mfd1 >= mfd2 && mfd1 >= mfd3 )
            return mfd1;
        else if ( mfd2 >= mfd1 && mfd2 >= mfd3 )
            return mfd2;

        return mfd3;

    }

}
