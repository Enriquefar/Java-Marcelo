import java.util.Scanner;
public class App 
{
    /*2)_Calculadora de Área de Retângulo Desenvolva um programa que leia a largura e altura de um retângulo e calcule sua área e perímetro. (retângulo) */
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        double largura, altura, area, perimetro;
        

        System.out.print("Digite a largura do retângulo: ");
        largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();

        area = largura * altura;
        perimetro = largura * 2 + altura * 2;

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perimetro do retângulo é: " + perimetro);
    }
}
