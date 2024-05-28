public class Cliente {
    int idade;
    int senha;
    String nome;

    public Cliente(int idade, int senha, String nome) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idade= " + idade +
                ", senha= " + senha +
                ", nome= " + nome + '\'' +
                '}';
    }
}
