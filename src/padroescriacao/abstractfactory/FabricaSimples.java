package padroescriacao.abstractfactory;

public class FabricaSimples implements FabricaAbstrata {

    public Pedido criarPedido() {
        return new PedidoSimples();
    }

    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalSimples();
    }
}