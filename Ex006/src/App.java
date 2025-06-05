import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        double precoUnidade, precoTotal;
        int quantidade;

        System.out.print("Digite o nome produto: ");
        nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço unitário do produto: ");
        precoUnidade = scanner.nextDouble();
        System.out.print("Digite a quantidade desse produto em estoque: ");
        quantidade = scanner.nextInt();

        precoTotal = precoUnidade * quantidade;

        System.out.println("O preço total em estoque do produto " + nomeProduto + " é de R$" + precoTotal);
    }
}
