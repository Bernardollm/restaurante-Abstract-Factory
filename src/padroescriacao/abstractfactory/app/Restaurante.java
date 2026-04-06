package padroescriacao.abstractfactory.app;

import padroescriacao.abstractfactory.factory.FabricaAbstrata;
import padroescriacao.abstractfactory.produto.notafiscal.NotaFiscal;
import padroescriacao.abstractfactory.produto.pedido.Pedido;

public class Restaurante {

    private Pedido pedido;
    private NotaFiscal notaFiscal;

    public Restaurante(FabricaAbstrata fabrica) {
        this.pedido = fabrica.criarPedido();
        this.notaFiscal = fabrica.criarNotaFiscal();
    }

    public String emitirPedido() {
        return pedido.emitir();
    }

    public String emitirNotaFiscal() {
        return notaFiscal.emitir();
    }
}