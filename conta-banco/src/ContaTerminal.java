import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //to do: declarar variáveis ok
        //to do: exibir mensagens ao usuário ok
        //to do: armazenar dados do usuário usando a classe scanner() ok
        //to do: exibir mensagem final ao usuário ok
        Scanner sc = new Scanner(System.in);
        
        String nome, agencia;
        int conta;
        double saldo;

        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite o número da sua agência:");
        agencia = sc.nextLine();

        System.out.println("Digite o número da sua conta:");
        conta = sc.nextInt();

        System.out.println("Digite o valor do seu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco!\nAgência: " + agencia + "\nConta: " + conta + "\nSaldo: " + saldo);
    }
}
