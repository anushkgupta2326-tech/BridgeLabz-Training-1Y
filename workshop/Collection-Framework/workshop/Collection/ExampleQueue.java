package workshop.Collection;

import java.util.*;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.add(45);
        q.add(51);
        q.offer(66);
        System.out.println(q);
        System.out.println(q.element());
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println("==========Priority Queue==========");
        PriorityQueue<String> s = new PriorityQueue<>(Comparator.reverseOrder());
        s.offer("Yash");
        s.offer("Person");
        s.offer("Apple");
        System.out.println(s);

        PriorityQueue<Integer> I = new PriorityQueue<>();
        I.offer(25);
        I.offer(30);
        I.offer(2);
        I.offer(29);
        I.offer(31);

        System.out.println(I);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(56);
        dq.addFirst(74);
        dq.offerLast(99);
        dq.offerFirst(88);
        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
    }
}
