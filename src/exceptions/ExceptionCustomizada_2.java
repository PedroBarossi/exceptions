package exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i< denominador.length; i++) {
            try {
                if (numerador[i] %2 != 0)
                    throw new DivNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivNaoExataException e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0!");
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falta um numerador na lista de numeradores");
            }
        }
        System.out.println("O programa continua...");
    }
}

