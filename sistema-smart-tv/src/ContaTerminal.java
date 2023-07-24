import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome inteiro:");
        String nome = scanner.next();

        System.out.println("Digite seu email:");
        String email = scanner.next();

        System.out.println("Digite seu número de telefone:");
        int numero = scanner.nextInt();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Seu nome inteiro é " + nome);
        System.out.println("Seu email é " + email);
        System.out.println("Seu número é " + numero);
        System.out.println("E sua idade é de " + idade + "anos");

        System.out.println("Todos esses dados estão corretos? caso sim, digite 1, caso não, digite 0.");
        int afirmação = scanner.nextInt();
        if
        
    }

}
