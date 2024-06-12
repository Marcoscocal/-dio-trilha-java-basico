import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o número da sua conta!");
        int numero = scanner.nextInt();

        System.out.println("Seu saldo é!");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Ola, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",");

        System.out.println("conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
