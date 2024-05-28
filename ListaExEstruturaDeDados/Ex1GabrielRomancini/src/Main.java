import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<String> filaPacientes = new LinkedList<>();
        int maxPacientes = 20;

        while(true){

            System.out.println("1 - Adicionar um paciente: ");
            System.out.println("2 - Chamar um paciente: ");
            System.out.println("3 - Sair");
            int opcao = s.nextInt();
            s.nextLine();

            if (opcao == 1){
                if(filaPacientes.size() <= maxPacientes){
                    System.out.println("Nome do paciente");
                    String nomePaciente = s.nextLine();
                    filaPacientes.add(nomePaciente);
                    System.out.println("Paciente " +  nomePaciente + " adicionado a fila");
                }
                else{
                    System.out.println("Limite máximo da fila atingido!");
                }
            }
            else if (opcao == 2){
                if(!filaPacientes.isEmpty()){
                    String proxPaciente = filaPacientes.poll();
                    System.out.println("Próximo paciente: " + proxPaciente );
                }
                else{
                    System.out.println("Nenhum paciente na fila");
                }
            } else if (opcao == 3) {
                System.out.println("Sistema encerrado");
                break;
            }
            else{
                System.out.println("Opcao invalida, tente novamente!");
            }

        }
        s.close();

    }
}