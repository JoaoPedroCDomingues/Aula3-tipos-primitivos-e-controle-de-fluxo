import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int x = rand.nextInt(10) + 1;
        int n;

        System.out.println("Adivinhe o numero aleatório entre 1 e 10");
        do {

            n = sc.nextInt();

            if (n > x){
                System.out.println("O número certo é menor que esse!");
            }
            else if(n < x){
                System.out.println("O número certo é maior que esse!");
            }
            else if(n == x){
                System.out.println("Parabens! Você acertou!");
            }

        }while (n != x);

        sc.close();

    }
}