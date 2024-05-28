import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Cliente> filaPrioritaria = new LinkedList<>();
        Queue<Cliente> filaNormal = new LinkedList<>();
        int prioridadeAtendido = 0;
        int senha = 1;

        while (true){
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Chamar proximo da fila");
            System.out.println("3 - Sair");
            int opcao = s.nextInt();
            s.nextLine();

            if (opcao == 1){
                System.out.println("Digite o nome do cliente: ");
                String nome = s.nextLine();
                System.out.println("Digite a idade do cliente: ");
                int idadeCliente = s.nextInt();

                Cliente cliente = new Cliente(idadeCliente, senha++, nome);
                if (idadeCliente > 60){
                    filaPrioritaria.add(cliente);
                    System.out.println("Cliente adicionado à fila prioritaria");
                } else {
                    filaNormal.add(cliente);
                    System.out.println("Cliente adicionado à fila normal.");
                }
            } else if (opcao == 2) {
                if (!filaPrioritaria.isEmpty() && prioridadeAtendido < 2) {
                    Cliente proximo = filaPrioritaria.poll();
                    System.out.println("Atendendo cliente prioritário: " + proximo);
                    prioridadeAtendido++;
                } else if (!filaNormal.isEmpty()) {
                    Cliente proximo = filaNormal.poll();
                    System.out.println("Atendendo cliente normal: " + proximo);
                    prioridadeAtendido = 0;  // Reseta o contador após atender um cliente normal
                } else if (!filaPrioritaria.isEmpty()) {
                    Cliente proximo = filaPrioritaria.poll();
                    System.out.println("Atendendo cliente prioritário: " + proximo);
                } else {
                    System.out.println("Nenhum cliente na fila.");
                }
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        s.close();
    }
}