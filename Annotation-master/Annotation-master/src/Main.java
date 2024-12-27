public class Main {
    public static void main(String[] args) {
    }

    @Tabela( value = "Minha tabela")
    public class anotacaoTabela {
        @Tabela(value = "Minha tabela")
        private String nome;
    }
}