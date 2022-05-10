public class Usuario {
    private int id;
    private String nome;
    private String status;
    private Stack stack;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = "ok";
        this.stack = new Stack(10);
    }

    public void enviaMsg(String msg) {
        stack.push(msg);
        this.status = "não ok";
    }

    public void leMsg() {
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        this.status = "ok";
    }

    public String getStatus() {
        return status;
    }
}