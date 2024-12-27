public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("111-222-333-44");
        pessoaFisica.setIdade(20L);
        pessoaFisica.setSobreNome("Imperato");
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj("555-666-777/0001");
        pessoaJuridica.setIdade(20L);
        pessoaJuridica.setSobreNome("Imperato de Brito");
        imprimir(pessoaJuridica);
    }

    public static void imprimir(Pessoa pessoa) {
        System.out.println(pessoa.getSobreNome() + " Documento é " + pessoa.nome());
    }
}