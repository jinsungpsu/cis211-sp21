import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTester {
    public static void main(String[] args) {
        Queue<Integer> numQ = new ArrayBlockingQueue<>(5);
        numQ.add(1); // front 1 back
        numQ.add(2); // front 1 2 back
        numQ.add(3); // front 1 2 3 back
        numQ.add(4); // front 1 2 3 4 back

        System.out.println(numQ.remove()); // 1 (remaining in queue is 2 3 4)
        System.out.println(numQ.remove()); // 2 (remaining in queue is 3 4)
        System.out.println(numQ.remove()); // 3 (remaining in queue is 4)

        // queue only has one item... 4, which is both front and back

        numQ.add(2); // front 4 2 back
        numQ.add(3); // front 4 2 3 back
        numQ.add(4); // front 4 2 3 4 back


        Queue<String> sQ = new LinkedList<>();
        sQ.add("Hello");
        sQ.add("Hello");
        sQ.add("Hello");
        sQ.add("Hello");
        sQ.add("Hello");
        System.out.println(sQ.remove());
        System.out.println(sQ.remove());
        System.out.println(sQ.remove());
        System.out.println(sQ.remove());
        System.out.println(sQ.remove());
        System.out.println(sQ.remove());
    }
}
