

public class PedidoStatusEmitirNota implements PedidoStatus {

    private PedidoStatusEmitirNota() {};
    private static PedidoStatusEmitirNota instance = new PedidoStatusEmitirNota();
    public static PedidoStatusEmitirNota getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Nota Fiscal Emitida!";
    }

    public String efetuar(Pedido pedido) {
        return "Pedido não Efetuado!";
    }

    public String separar(Pedido pedido) {
        return "Pedido não Separado!";
    }

    public String emitirNota(Pedido pedido) {
        return "Nota Fiscal não Emitida!";
    }

    public String transportadora(Pedido pedido) {
        return "Pedido não Enviado à Transportadora!";
    }

    public String entregar(Pedido pedido) {
        return "Pedido não Entregue!";
    }

    public String cancelar(Pedido pedido) {
        return "Pedido não Cancelado!";
    }

}