

public class PedidoStatusCancelado implements PedidoStatus {

    private PedidoStatusCancelado() {};
    private static PedidoStatusCancelado instance = new PedidoStatusCancelado();
    public static PedidoStatusCancelado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Pedido Cancelado!";
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