import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        double distancia, combustivel, media;

        System.out.print("DIgite a distância percorrida em Km: ");
        distancia = scanner.nextDouble();
        System.out.print("Digite a quantidade de cosbustível gasta: ");
        combustivel = scanner.nextDouble();

        media = distancia / combustivel;

        System.out.println("O seu consumo médio de combustível foi de: " + media);
    }
}
