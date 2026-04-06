package padroescriacao.abstractfactory.factory;

import padroescriacao.abstractfactory.produto.notafiscal.NotaFiscal;
import padroescriacao.abstractfactory.produto.pedido.Pedido;

public interface FabricaAbstrata {
    Pedido criarPedido();
    NotaFiscal criarNotaFiscal();
}