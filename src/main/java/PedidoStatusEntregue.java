

public class PedidoStatusEntregue implements PedidoStatus {

    private PedidoStatusEntregue() {};
    private static PedidoStatusEntregue instance = new PedidoStatusEntregue();
    public static PedidoStatusEntregue getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Pedido Entregue!";
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