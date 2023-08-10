import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Teste {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite seu peso: ");
            double peso = scanner.nextDouble();

            System.out.println("Digite seu nome completo: ");
            String name = scanner.next();

            System.out.println("Seu nome é " + name);
            System.out.println("Sua idade é " + idade);
            System.out.println("Seu peso é " + peso);
            scanner.close();

        }
        catch(InputMismatchException e){
            // err é utilizada para imprimir mensagem no console de erro
            System.err.println("Por favor, utilize números para idade e peso");
        }
        
    }
}
