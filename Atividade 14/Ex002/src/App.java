import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18)
        {
            System.out.println("Maior de idade!");
        } else if (idade >= 12)
        {
            System.out.println("Adolescente!");
        }else
        {
            System.out.println("Criança!");
        }

    }
}
