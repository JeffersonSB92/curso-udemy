package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args){

        metodo1();
        System.out.println();
        System.out.println("End of program!");

    }

    public static void metodo1(){
        System.out.println("***INÍCIO DO METODO 1***");
        metodo2();
        System.out.println("***FIM DO METODO 1***");
    }
    public static void metodo2(){
        System.out.println("***INÍCIO DO METODO 2***");
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace(); // imprimi a linha de erro
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("***FIM DO METODO 2***");
    }
}
