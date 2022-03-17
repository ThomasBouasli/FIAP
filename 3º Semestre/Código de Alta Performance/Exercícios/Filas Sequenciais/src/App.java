import java.util.LinkedList;
import java.util.Queue;

public class App {
    private static Queue<String> queue = new LinkedList<String>();
    public static void main(String[] args) throws Exception {
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
