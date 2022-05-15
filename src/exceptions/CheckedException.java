package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        String nomeDoArquivo = "albums.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo a ser impresso");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. Entre em contato com o suporte");
            e.printStackTrace();
        }

        System.out.println("Com ou sem exception, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}