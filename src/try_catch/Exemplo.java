package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        } catch (InputMismatchException e){
            System.out.println("Input error!");
        }

        System.out.println("End of program!");
        sc.close();
    }
}

//exemplo de tratamento de erro de entrada de dados
//no primeiro caso, trata um erro ao digitar uma posição de vetor além do limite do vetor, no caso, digitar 5 em um vetor de 3 posições
//o segundo caso trata um erro de tipo de dado digitado, temos que digitar um INT e digitamos uma STRING por exemplo
