import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu Nome");
        String n = sc.next();

        System.out.println("Por favor digite seu Sobrenome");
        String s = sc.next();

        System.out.println("Por favor digite o número da Agência:");
        String agência = sc.next();

        System.out.println("Por favor digite sua Conta");
        int conta = sc.nextInt();   
        
        double saldo = 2500.12;
        
        System.out.printf("Olá %s %s", n, s + ", obrigado por criar uma conta em nosso banco,\nsua Agência é " + agência + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");        
    }
}
