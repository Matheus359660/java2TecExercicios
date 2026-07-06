import java.util.Scanner;


public class banco{
    public static void main(String [] args) {
        String nome ="Xande de realengo";
        String TipoConta = "Corrente";
        double saldo =1660.35;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\n Nome do cliente:" + nome);
        System.out.println("\n Tipo da conta:" + TipoConta);
        System.out.println("\n************************");

        String menu = """
                    ** Digite sua opção **
                    1 - COnsultar saldo
                    2 - Transferir Valor
                    3 - Receber Valor
                    4 - Sair
                """;

                Scanner leitura = new Scanner(System.in);

                while (opcao !=4) {
                    System.out.println(menu);
                    opcao = leitura.nextInt();
                    if(opcao == 1){
                        System.out.println("Seu saldo é: " + saldo); 
                    }
                }
                
    }
}