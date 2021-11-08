
public interface PedidoStatus {

    String getStatus();

    String efetuar(Pedido pedido);

    String separar(Pedido pedido);

    String emitirNota(Pedido pedido);

    String transportadora(Pedido pedido);

    String entregar(Pedido pedido);

    String cancelar(Pedido pedido);

}