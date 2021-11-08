
public class Pedido {

    private int nroPedido;
    private PedidoStatus status;

    public Pedido() {
        this.status = PedidoStatusEfetuado.getInstance();
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public String efetuar() {
        return status.efetuar(this);
    }

    public String separar() {
        return status.separar(this);
    }

    public String emitirNota() {
        return status.emitirNota(this);
    }

    public String transportadora() {
        return status.transportadora(this);
    }

    public String entregar() {
        return status.entregar(this);
    }

    public String cancelar() {
        return status.cancelar(this);
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public PedidoStatus getStatus() {
        return status;
    }
}