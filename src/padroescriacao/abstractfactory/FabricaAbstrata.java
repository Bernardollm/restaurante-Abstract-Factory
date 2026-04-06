package padroescriacao.abstractfactory;

public interface FabricaAbstrata {
    Pedido criarPedido();
    NotaFiscal criarNotaFiscal();
}