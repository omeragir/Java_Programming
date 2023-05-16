package day40_collectionContinue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();// order is random,does not accept null
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue.addAll(Arrays.asList(null,null,null));
        System.out.println(queue);

        int num1= queue.poll();//first - in - first - out==>FIFO

        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println("----------------------------");

        Queue<Integer> queue1 = new ArrayDeque<>();// insertion order,does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue1.addAll(Arrays.asList(null,null,null));

        System.out.println(queue1);

        //System.out.println(queue1.get(0));

        queue1.poll();//FIFO
        System.out.println(queue1);
        System.out.println("----------------------------");

        Queue<Integer> queue2 = new LinkedList<>();//insertion order,accepts null
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(null,null,null));
        System.out.println(queue2);

        System.out.println(((LinkedList<Integer>) queue2).get(4));



        System.out.println("--------------------------");
        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(0));

        ((LinkedList<Integer>) list).poll();//FIFO

        System.out.println(list);

        //((Stack) list).pop();//LIFO

        System.out.println(list);



    }
}
