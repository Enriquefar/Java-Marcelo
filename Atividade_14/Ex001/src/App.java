import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
    Scanner scanner = new Scanner(System.in);
    String nome;
    int idade;
    double altura;
    System.out.print("Digite o seu nome completo: ");
    nome = scanner.nextLine(); 
    System.out.print("Digite sua idade: ");
    idade = scanner.nextInt();
    System.out.print("Digite sua altura: ");
    altura = scanner.nextDouble();
    System.out.println("");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    }
}
