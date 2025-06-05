import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        double salarioBruto, salarioLiquido;
        
        System.out.print("Digite o seu sálario atual: ");
        salarioBruto = scanner.nextDouble();
        
        salarioLiquido = salarioBruto * 0.77;

        System.out.print("O seu sálario líquido é de: R$" + salarioLiquido);
    }
}
