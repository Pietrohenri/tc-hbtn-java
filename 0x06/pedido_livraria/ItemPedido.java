package pedido_livraria;
import pedido_livraria.produtos.Dvd;
import pedido_livraria.produtos.Livro;
import pedido_livraria.produtos.Produto;




public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Livro produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public ItemPedido(Dvd dvd2, int quantidade) {

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}