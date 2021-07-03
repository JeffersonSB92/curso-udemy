package tratandoArquivos;

import java.io.File;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // caminho da pasta >>>>  C:\\Users\\55549\\IdeaProjects\\curso-udemy

        System.out.println("Entre o caminho de uma pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); //esse comando lista as pastas contidas no caminho digitado
        System.out.println("PASTAS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); //esse comando lista os arquivos contidos no caminho digitado
        System.out.println("ARQUIVOS: ");
        for (File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\novaPasta").mkdir(); //esse comando cria uma pasta através do programa no caminho digitado
        System.out.println("Pasta criada com sucesso: " +sucess);

        sc.close();
    }
}