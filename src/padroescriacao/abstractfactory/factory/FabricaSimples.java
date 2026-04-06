package padroescriacao.abstractfactory.factory;

import padroescriacao.abstractfactory.produto.notafiscal.NotaFiscal;
import padroescriacao.abstractfactory.produto.notafiscal.NotaFiscalSimples;
import padroescriacao.abstractfactory.produto.pedido.Pedido;
import padroescriacao.abstractfactory.produto.pedido.PedidoSimples;

public class FabricaSimples implements FabricaAbstrata {

    public Pedido criarPedido() {
        return new PedidoSimples();
    }

    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalSimples();
    }
}