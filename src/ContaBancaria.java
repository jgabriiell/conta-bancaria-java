import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = entry.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = entry.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = entry.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = entry.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero  + " e seu saldo " + saldo + " já está disponível para uso.");
    }

}
