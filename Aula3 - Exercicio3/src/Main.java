import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a nota final do aluno?");
        int npa = scanner.nextInt();
        float nfa;
        float np3;

        if(npa >= 60){
            System.out.println("O aluno está aprovado!");
        }
        else if(npa < 30){
            System.out.println("O aluno está reprovado");
        }
        else{
            System.out.println("O aluno está de recuperação, informe sua nota da NP3:");
            np3 = scanner.nextInt();
            nfa = ((npa + np3) / 2);
            if(nfa >= 50){
                System.out.println("O aluno está aprovado! Com nota " + nfa);
            }
            else{
                System.out.println("O aluno está reprovado! Com nota " + nfa);
            }
        }

    scanner.close();
    }
}