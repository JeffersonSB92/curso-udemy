package tratandoArquivos;

import java.io.File;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre o caminho de uma pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath()); //mostra o caminho completo do arquivo
        System.out.println("getParent: " + path.getParent()); //mostra o caminho antes do arquivo
        System.out.println("getName: " + path.getName()); //mostra só o nome do arquivo

        sc.close();
    }
}
