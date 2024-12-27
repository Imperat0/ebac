public class Toyota extends Carro{

    private String cor;
    private String nome;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String marcaDeCarro() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
