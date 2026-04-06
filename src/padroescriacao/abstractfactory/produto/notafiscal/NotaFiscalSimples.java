package padroescriacao.abstractfactory.produto.notafiscal;

public class NotaFiscalSimples implements NotaFiscal {

    public String emitir() {
        return "Nota Fiscal Simples";
    }
}