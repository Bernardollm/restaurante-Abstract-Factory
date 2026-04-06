package padroescriacao.abstractfactory;

public class FabricaGourmet implements FabricaAbstrata {

    public Pedido criarPedido() {
        return new PedidoGourmet();
    }

    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalGourmet();
    }
}