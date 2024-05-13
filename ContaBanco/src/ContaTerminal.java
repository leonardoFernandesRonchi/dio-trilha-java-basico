import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     System.out.println("Por favor, digite o número da conta");
     int AccountNumber = scanner.nextInt();
     System.out.println("Por favor, Digite o número da Agência");
     String AgencyNumber = scanner.next();
     System.out.println("Por favor, Digite o nome do cliente");
     String ClientName = scanner.next();
     System.out.println("Por favor, Digite o saldo");
     float Balance = scanner.nextFloat();



     System.out.println("Olá," + ClientName + ", obrigado por criar uma conta em nosso banco, sua agência é" + AgencyNumber + ", conta" + AccountNumber + "e seu saldo" + Balance + "Já está disponível para saque.");
    }

}
