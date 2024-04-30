import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner  sc = new Scanner(System.in);

      int numero;
      String agencia,nomeCliente;
      double saldo;

      System.out.println("Informe o numero da agencia: ");
      agencia = sc.next();

      System.out.println("Informe o número da conta: ");
      numero = sc.nextInt();
      sc.nextLine();

      System.out.println("Informe seu nome: ");
      nomeCliente = sc.nextLine();

      System.out.println("Informe seu saldo: ");
      saldo = sc.nextDouble();

      System.out.printf("Olá %s, Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponivel para o saque", nomeCliente, agencia, numero, saldo); 

       sc.close();
    }
}
