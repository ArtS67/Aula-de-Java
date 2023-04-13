import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta:" + tipoConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("*****************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir/Sacar
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("\nO saldo atual é: " + saldo);
            }else if (opcao == 2) {
                System.out.println("Qual valor a ser transferido:" );
                double valor = leitura.nextDouble();
                if( valor > saldo) {
                    System.out.println("Saldo insuficiente para transferencia");
                } else {
                    saldo -= valor;
                }
            } else if(opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao != 4) {
                System.out.println("Opcao Invalida");
            }
        }

    }
}
