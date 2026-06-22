import java.util.Scanner;

public class exerciciosSemafaro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o estado do semáforo (vermelho, amarelo ou verde):");
        String estado = scanner.nextLine().trim().toLowerCase();

        switch (estado) {
            case "vermelho" -> System.out.println("Pare!");
            case "amarelo" -> System.out.println("Atenção! Prepare-se para parar.");
            case "verde" -> System.out.println("Siga em frente.");
            default -> System.out.println("Entrada inválida. Use vermelho, amarelo ou verde.");
        }

        scanner.close();
    }
}
