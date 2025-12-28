import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //variaveis
        String nome;
        int idade;
        char genero;

        //entrada de dados
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite seu genero: ");
        genero = scanner.next().charAt(0);

        //print das informações
        System.out.println("Informações: ");
        System.out.println("O Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu genero é: " + genero);

        scanner.close();
    }
}
