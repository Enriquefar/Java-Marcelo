import java.util.Scanner;
public class App {
    public static void main(String[] args) 
    {
        String nome;
        int idade;
        double altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informa o seu nome: ");
        nome = scanner.next();
        System.out.println("Informe a sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Informe a sua altura: ");
        altura = scanner.nextDouble();
        System.out.println("Boa noite, "+ nome + "você tem: "+idade+" anos e sua altura é de "+ altura + " metros");
    }
}