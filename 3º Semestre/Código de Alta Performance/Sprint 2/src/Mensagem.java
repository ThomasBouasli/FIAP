public class Mensagem {
    private Cliente cliente;
    private String msg;

    public Mensagem(Cliente cliente, String msg) {
        this.cliente = cliente;
        this.msg = msg;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getMsg() {
        return msg;
    }
}
