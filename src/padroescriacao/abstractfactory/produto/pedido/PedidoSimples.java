package padroescriacao.abstractfactory.produto.pedido;

public class PedidoSimples implements Pedido {

    public String emitir() {
        return "Pedido Simples";
    }
}