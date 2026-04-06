package padroescriacao.abstractfactory;

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