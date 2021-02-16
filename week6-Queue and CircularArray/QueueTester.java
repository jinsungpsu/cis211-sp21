
public class QueueTester {
    public static void main(String[] args) {
        Queue<Integer> numQ = new ArrayQueue<>();
        numQ.enqueue(1); // front 1 back
        numQ.enqueue(2); // front 1 2 back
        numQ.enqueue(3); // front 1 2 3 back
        numQ.enqueue(4); // front 1 2 3 4 back

        System.out.println(numQ.dequeue()); // 1 (remaining in queue is 2 3 4)
        System.out.println(numQ.dequeue()); // 2 (remaining in queue is 3 4)
        System.out.println(numQ.dequeue()); // 3 (remaining in queue is 4)

        // queue only has one item... 4, which is both front and back

        numQ.enqueue(2); // front 4 2 back
        numQ.enqueue(3); // front 4 2 3 back
        numQ.enqueue(4); // front 4 2 3 4 back
    }
}
