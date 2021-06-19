package exercicio.vetor;
import entidades.vetor.ClienteHotel;

import java.util.Scanner;

public class ExercicioVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteHotel[] vect = new ClienteHotel[10];

        System.out.print("Quantos quartos vai reservar? ");
        int reserva = sc.nextInt();
        System.out.println("");

        for (int i = 1; i <= reserva; i++){

            sc.nextLine();
            System.out.println("Reserva #" +i +":");
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new ClienteHotel(nome, email, quarto);
            System.out.println("");

        }

        System.out.println("Quartos Reservados: ");

        for (int i = 0; i < 10; i++){
            if (vect[i] != null){
                System.out.print(i +": " +vect[i].getNome() +", " +vect[i].getEmail());
                System.out.println("");
            }

        }

        sc.close();
    }
}