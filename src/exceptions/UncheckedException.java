package exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, impossível dividir por zero");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);


        System.out.println("Chegou até o final :D");
    }

    public static int dividir(int a, int b) {return a/b;}
}
