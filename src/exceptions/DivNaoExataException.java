package exceptions;

public class DivNaoExataException extends Exception{
    private int numerador;
    private int denominador;

    public DivNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
