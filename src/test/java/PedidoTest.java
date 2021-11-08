
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido Efetuado

    @Test
    public void naoEfetuaPedidoEfetuado() {
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        assertEquals("Pedido não Efetuado!", pedido.efetuar());
    }

    @Test
    public void separarPedidoEfetuado() {
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        assertEquals("Pedido Separado!", pedido.separar());
    }

    @Test
    public void emitirNotaPedidoEfetuado() {
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        assertEquals("Nota Fiscal Emitida!", pedido.emitirNota());
    }

    @Test
    public void transportadoraPedidoEfetuado() {
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        assertEquals("Pedido Enviado à Transportadora!", pedido.transportadora());
    }

    @Test
    public void entregarPedidoEfetuado() {
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        assertEquals("Pedido Entregue!", pedido.entregar());
    }

    @Test
    public void cancelarPedidoEfetuado() {
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        assertEquals("Pedido Cancelado!", pedido.cancelar());
    }
}