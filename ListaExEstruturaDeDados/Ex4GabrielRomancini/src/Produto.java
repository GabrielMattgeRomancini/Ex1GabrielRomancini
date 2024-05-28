class Produto {
    int codProduto;
    String descricao;
    String dataEntrada;
    String ufOrigem;
    String ufDestino;

    public Produto(int codProduto, String descricao, String dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", descricao='" + descricao + '\'' +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", ufOrigem='" + ufOrigem + '\'' +
                ", ufDestino='" + ufDestino + '\'' +
                '}';
    }
}