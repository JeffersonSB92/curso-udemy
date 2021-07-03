package tratandoArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {

    public static void main(String[] args) {

        String[] lines = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};

        String path = "C:\\Users\\55549\\IdeaProjects\\curso-udemy\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            // cada vez que rodar o programa ele vai RECRIAR o arquivo com o conteúdo do vetor
            // para mudar isso é só fazer isso >>> (new FileWriter(path, true), adicionando o TRUE ele não recria o arquivo, só acrescenta o que for definido no vetor

            for ( String x : lines) {
                bw.write(x);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
