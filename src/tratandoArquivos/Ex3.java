// Usando FileReader e BufferedReader de uma forma muito melhor ---- funciona da mesma maneira que o Ex2 porém é um código bem mais enxuto

package tratandoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

    public static void main(String[] args) {

        String path = "C:\\Users\\55549\\IdeaProjects\\curso-udemy\\TratandoArquivos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}