import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alunos;

        System.out.println("Quantos alunos a turma possui?");
        alunos = sc.nextInt();

        switch (alunos) {
            case 10, 20:
                System.out.println("Utilize a sala I-16");
                break;
            case 30:
                System.out.println("Utilize a sala I-22");
                break;
            default:
                System.out.println("Nenhuma sala disponível");

        }

        sc.close();
    }
}