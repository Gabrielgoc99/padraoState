
public class PedidoStatusEmSeparacao implements PedidoStatus {

    private PedidoStatusEmSeparacao() {};
    private static PedidoStatusEmSeparacao instance = new PedidoStatusEmSeparacao();
    public static PedidoStatusEmSeparacao getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Pedido Separado!";
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