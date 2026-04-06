package padroescriacao.abstractfactory.test;

import org.junit.jupiter.api.Test;

import padroescriacao.abstractfactory.app.Restaurante;
import padroescriacao.abstractfactory.factory.FabricaAbstrata;
import padroescriacao.abstractfactory.factory.FabricaGourmet;
import padroescriacao.abstractfactory.factory.FabricaSimples;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    @Test
    void deveEmitirPedidoSimples() {
        FabricaAbstrata fabrica = new FabricaSimples();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Pedido Simples", restaurante.emitirPedido());
    }

    @Test
    void deveEmitirPedidoGourmet() {
        FabricaAbstrata fabrica = new FabricaGourmet();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Pedido Gourmet", restaurante.emitirPedido());
    }

    @Test
    void deveEmitirNotaFiscalSimples() {
        FabricaAbstrata fabrica = new FabricaSimples();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Nota Fiscal Simples", restaurante.emitirNotaFiscal());
    }

    @Test
    void deveEmitirNotaFiscalGourmet() {
        FabricaAbstrata fabrica = new FabricaGourmet();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Nota Fiscal Gourmet", restaurante.emitirNotaFiscal());
    }
}