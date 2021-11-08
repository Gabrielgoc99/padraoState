
public class PedidoStatusEfetuado implements PedidoStatus {

    private PedidoStatusEfetuado() {};
    private static PedidoStatusEfetuado instance = new PedidoStatusEfetuado();
    public static PedidoStatusEfetuado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Pedido Efetuado!";
    }

    public String efetuar(Pedido pedido) {
        return "Pedido não Efetuado!";
    }

    public String separar(Pedido pedido) {
        pedido.setStatus(PedidoStatusEmSeparacao.getInstance());
        return "Pedido Separado!";
    }

    public String emitirNota(Pedido pedido) {
        pedido.setStatus(PedidoStatusEmitirNota.getInstance());
        return "Nota Fiscal Emitida!";
    }

    public String transportadora(Pedido pedido) {
        pedido.setStatus(PedidoStatusTransportadora.getInstance());
        return "Pedido Enviado à Transportadora!";
    }

    public String entregar(Pedido pedido) {
        pedido.setStatus(PedidoStatusEntregue.getInstance());
        return "Pedido Entregue!";
    }

    public String cancelar(Pedido pedido) {
        pedido.setStatus(PedidoStatusCancelado.getInstance());
        return "Pedido Cancelado!";
    }

}