package padroescriacao.abstractfactory.factory;

import padroescriacao.abstractfactory.produto.notafiscal.NotaFiscal;
import padroescriacao.abstractfactory.produto.notafiscal.NotaFiscalGourmet;
import padroescriacao.abstractfactory.produto.pedido.Pedido;
import padroescriacao.abstractfactory.produto.pedido.PedidoGourmet;

public class FabricaGourmet implements FabricaAbstrata {

    public Pedido criarPedido() {
        return new PedidoGourmet();
    }

    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalGourmet();
    }
}