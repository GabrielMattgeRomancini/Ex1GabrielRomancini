import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Produto> pilhaProdutos = new Stack<>();
        int maxCaixas = 10;

        while (true) {
            System.out.println("1 - Adicionar caixa");
            System.out.println("2 - Retirar caixa");
            System.out.println("3 - Exibir pilha");
            System.out.println("4 - Sair");
            int opcao = s.nextInt();
            s.nextLine();  // Limpa o buffer

            if (opcao == 1) {
                if (pilhaProdutos.size() < maxCaixas) {
                    System.out.println("Digite o código do produto:");
                    int codProduto = s.nextInt();
                    s.nextLine();  // Limpa o buffer
                    System.out.println("Digite a descrição do produto:");
                    String descricao = s.nextLine();
                    System.out.println("Digite a data de entrada:");
                    String dataEntrada = s.nextLine();
                    System.out.println("Digite a UF de origem:");
                    String ufOrigem = s.nextLine();
                    System.out.println("Digite a UF de destino:");
                    String ufDestino = s.nextLine();

                    Produto produto = new Produto(codProduto, descricao, dataEntrada, ufOrigem, ufDestino);
                    pilhaProdutos.push(produto);
                    System.out.println("Produto adicionado à pilha.");
                } else {
                    System.out.println("A pilha está cheia. Não é possível adicionar mais caixas.");
                }
            } else if (opcao == 2) {
                if (!pilhaProdutos.isEmpty()) {
                    Produto produtoRemovido = pilhaProdutos.pop();
                    System.out.println("Produto removido: " + produtoRemovido);
                } else {
                    System.out.println("A pilha está vazia.");
                }
            } else if (opcao == 3) {
                System.out.println("Produtos na pilha:");
                for (Produto produto : pilhaProdutos) {
                    System.out.println(produto);
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        s.close();
    }
}