import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;

        System.out.print("Digite sua temperatura atual em °C: ");
        celsius = scanner.nextDouble();

        fahrenheit = (9/5 * celsius) + 32;
        kelvin = celsius + 273.15;

        System.out.println("Temperatura atual em kelvin: " + kelvin + "K");
        System.out.println("Temperatura atual em fahrenheit: " + fahrenheit + "°F");
    }
}
