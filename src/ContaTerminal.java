import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int conta = sc.nextInt();

        System.out.println("Por favor, informe o número da agência com o dígito verificador:");
        sc.nextLine(); 
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe o nome do usuário:");
        String nome = sc.nextLine();

        System.out.println("Por favor, informe o seu saldo:");
        float saldo = sc.nextFloat();

        if (agencia.length() > 3) {
            agencia = agencia.substring(0, agencia.length() - 1) + "-" + agencia.charAt(agencia.length() - 1);
        }

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque");

        sc.close();
    }
}
