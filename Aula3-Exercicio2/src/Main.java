import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos lanches foram consumidos na primeira hora?");
        int h1 = scanner.nextInt();
        System.out.println("Quantos lanches foram consumidos na segunda hora?");
        int h2 = scanner.nextInt();
        System.out.println("Quantos lanches foram consumidos na terceira hora?");
        int h3 = scanner.nextInt();

        int total = h1 + h2+ h3;
        double media = (double) total/3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + media);

        scanner.close();
    }
}