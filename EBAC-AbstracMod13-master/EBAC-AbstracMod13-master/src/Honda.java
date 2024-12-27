public class Honda extends Carro{

    private String marca;

    private String nome;


    public void imprimirMarca() {
        System.out.println("Honda");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public String marcaDeCarro() {
        return this.nome;
    }
}