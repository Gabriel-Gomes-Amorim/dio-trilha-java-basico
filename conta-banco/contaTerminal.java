import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception{
        // class scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor insira o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor insira a agência: ");
        String agencia = sc.next();

        System.out.println("Por favor insira seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor insira o saldo da conta: ");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
        
    }
}