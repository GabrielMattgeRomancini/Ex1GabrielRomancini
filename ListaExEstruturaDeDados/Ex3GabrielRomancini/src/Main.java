import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Livro> pilhaLivros = new Stack<>();

        while (true) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Remover livro");
            System.out.println("4 - Sair");
            int opcao = s.nextInt();
            s.nextLine();  // Limpa o buffer

            if (opcao == 1) {
                System.out.println("Digite o título do livro:");
                String titulo = s.nextLine();
                pilhaLivros.push(new Livro(titulo));
                System.out.println("Livro adicionado à pilha.");
            } else if (opcao == 2) {
                System.out.println("Livros na pilha:");
                for (Livro livro : pilhaLivros) {
                    System.out.println(livro);
                }
            } else if (opcao == 3) {
                if (!pilhaLivros.isEmpty()) {
                    Livro livroRemovido = pilhaLivros.pop();
                    System.out.println("Livro removido: " + livroRemovido);
                } else {
                    System.out.println("A pilha está vazia.");
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