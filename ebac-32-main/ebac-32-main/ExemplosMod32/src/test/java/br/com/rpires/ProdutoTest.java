public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDaoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("T1");
        produto.setDescricao("teclado gamer");
        produto.setNome("Teclado mecanico");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}