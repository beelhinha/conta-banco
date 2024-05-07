import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args){

        //Criar Scanner para receber os valores da conta via terminal
        Scanner scanner = new Scanner(System.in);
        
        
        //valores da conta
        System.out.println("Digite o número da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o número da agencia: ");
        String Agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double Saldo = scanner.nextDouble();
        String Mensagem = " Ola [" + NomeCliente + "], obrigado por criar uma conta em nosso banco, sua agencia e [" + Agencia + "] conta [" + Numero + "] e seu saldo [" + Saldo + "] ja esta disponivel para saque";
        System.out.println(Mensagem);
    }
}