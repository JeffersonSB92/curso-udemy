package metodo_abstrato;

import metodo_abstrato.entidades.Circulo;
import metodo_abstrato.entidades.Forma;
import metodo_abstrato.entidades.Retangulo;
import metodo_abstrato.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                list.add(new Retangulo(color, altura, largura));
            }
            else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circulo(color, raio));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Forma forma : list) {
            System.out.println(String.format("%.2f", forma.area()));
        }

        sc.close();
    }
}