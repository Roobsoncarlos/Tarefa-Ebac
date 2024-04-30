public class Produtos {

    private String produto;
    private float valor;
    private int codigo;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCadastro(){
        return ("O produto: " + produto + " foi cadastrado com sucesso!");
    }
}
