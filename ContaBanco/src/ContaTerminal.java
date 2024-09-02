import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
        System.out.println("====== BEM VINDO AO LIMABANK ========");
        System.out.println("Por favor digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite a sua Agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Qual o seu saldo? ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo  " + saldo + " já está disponivel para saque." );

    }
}
