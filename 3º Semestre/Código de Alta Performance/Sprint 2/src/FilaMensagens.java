import java.util.ArrayList;

public class FilaMensagens {
    private ArrayList<Mensagem> fila;

    public FilaMensagens() {
        this.fila = new ArrayList<Mensagem>();
    }

    public void init() {
        this.fila = new ArrayList<Mensagem>();
    }

    public void enqueue(Mensagem m) {
        this.fila.add(m);
    }

    public Mensagem dequeue() {
        Mensagem m = this.fila.get(0);
        this.fila.remove(0);
        return m;
    }

    public boolean isEmpty() {
        return this.fila.isEmpty();
    }
}
