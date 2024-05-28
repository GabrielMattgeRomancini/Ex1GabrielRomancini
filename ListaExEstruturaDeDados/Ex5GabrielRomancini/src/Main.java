import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Stack<Produto>> pilhas = new ArrayList<>(5);
        int maxCaixas = 10;

        // Inicializando as 5 pilhas
        for (int i = 0; i < 5; i++) {
            pilhas.add(new Stack<>());
        }

        while (true) {
            System.out.println("1 - Adicionar caixa");
            System.out.println("2 - Retirar caixa");
            System.out.println("3 - Exibir pilhas");
            System.out.println("4 - Sair");
            int opcao = s.nextInt();
            s.nextLine();  // Limpa o buffer

            if (opcao == 1) {
                System.out.println("Selecione a pilha (0-4):");
                int indicePilha = s.nextInt();
                s.nextLine();  // Limpa o buffer

                if (indicePilha >= 0 && indicePilha < 5) {
                    Stack<Produto> pilha = pilhas.get(indicePilha);
                    if (pilha.size() < maxCaixas) {
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
                        pilha.push(produto);
                        System.out.println("Produto adicionado à pilha " + indicePilha + ".");
                    } else {
                        System.out.println("A pilha está cheia. Não é possível adicionar mais caixas.");
                    }
                } else {
                    System.out.println("Índice de pilha inválido.");
                }
            } else if (opcao == 2) {
                System.out.println("Selecione a pilha (0-4):");
                int indicePilha = s.nextInt();
                s.nextLine();  // Limpa o buffer

                if (indicePilha >= 0 && indicePilha < 5) {
                    Stack<Produto> pilha = pilhas.get(indicePilha);
                    if (!pilha.isEmpty()) {
                        Produto produtoRemovido = pilha.pop();
                        System.out.println("Produto removido da pilha " + indicePilha + ": " + produtoRemovido);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                } else {
                    System.out.println("Índice de pilha inválido.");
                }
            } else if (opcao == 3) {
                for (int i = 0; i < pilhas.size(); i++) {
                    System.out.println("Pilha " + i + ":");
                    for (Produto produto : pilhas.get(i)) {
                        System.out.println(produto);
                    }
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
