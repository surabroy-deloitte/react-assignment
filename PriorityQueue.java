import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class PriorityQueueExcercise {
    public static void main(String[] args) {


        //Q1
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);


        //Q2
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        // iterate the Priority Queue
        for (String element : pq) {
            System.out.println(element);
        }


        //Q3
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");
        System.out.println("Priority Queue1: "+queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Pink");
        queue2.add("White");
        queue2.add("Black");
        System.out.println("Priority Queue2: "+queue2);
        // adding queue2 to queue1
        queue1.addAll(queue2);
        System.out.println("New Priority Queue1: "+queue1);

        //Q4
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);

        // Inserts the specified element into this priority queue.
        pq1.offer("Blue");

        System.out.println("The New Priority Queue: " + pq1);

        //Q5
        PriorityQueue<String> pq2 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq2.add("Red");
        pq2.add("Green");
        pq2.add("Black");
        pq2.add("White");
        System.out.println("Original Priority Queue: "+pq2);

        // Removing all the elements from the Priority Queue
        pq2.clear();

        System.out.println("The New Priority Queue: " + pq2);

        //Q6

        PriorityQueue<String> pq3 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq3.add("Red");
        pq3.add("Green");
        pq3.add("Black");
        pq3.add("Pink");
        pq3.add("orange");
        System.out.println("Priority Queue: " + pq3);
        System.out.println("Size of the Priority Queue: " + pq3.size());

        //Q7

        PriorityQueue<String> p1 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        p1.add("Red");
        p1.add("Green");
        p1.add("Black");
        p1.add("White");
        System.out.println("First Priority Queue: "+p1);
        PriorityQueue<String> p2 = new PriorityQueue<String>();
        p2.add("Red");
        p2.add("Pink");
        p2.add("Black");
        p2.add("Orange");
        System.out.println("Second Priority Queue: "+p2);
        //comparison output in Priority Queue
        for (String element : p1){
            System.out.println(p2.contains(element) ? "Yes" : "No");
        }

        //Q8
        PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();

        // Add numbers in the Queue
        q1.add(10);
        q1.add(22);
        q1.add(36);
        q1.add(25);
        q1.add(16);
        q1.add(70);
        q1.add(82);
        q1.add(89);
        q1.add(14);
        System.out.println("Original Priority Queue: "+q1);
        System.out.println("The first element of the Queue: "+q1.peek());

        //Q9
        PriorityQueue<Integer> pq5 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq4 = new PriorityQueue<Integer>();
        // Add numbers in the Priority Queue
        pq5.add(10);
        pq5.add(22);
        pq5.add(36);
        pq5.add(25);
        pq5.add(16);
        pq5.add(70);
        pq5.add(82);
        pq5.add(89);
        pq5.add(14);
        System.out.println("Original Priority Queue: "+pq5);
        System.out.println("Removes the first element: "+pq5.poll());
        System.out.println("Priority Queue after removing first element: "+pq5);

        //Q10
        PriorityQueue<String> pq6 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq6.add("Red");
        pq6.add("Green");
        pq6.add("Black");
        pq6.add("White");
        System.out.println("Original Priority Queue: "+pq6);

        //Convert a linked list to array list
        List<String> array_list = new ArrayList<String>(pq6);
        System.out.println("Array containing all of the elements in the queue: "+array_list);

        //Q11
        PriorityQueue<String> q4 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        q4.add("Red");
        q4.add("Green");
        q4.add("Black");
        q4.add("White");
        System.out.println("Original Priority Queue: "+q4);

        //Convert Priority Queue to a string representation
        String str1;
        str1 = q4.toString();
        System.out.println("String representation of the Priority Queue: "+str1);

        //Q12
        PriorityQueue<Integer> p4 = new PriorityQueue<>(10, Collections.reverseOrder());

        // Add numbers in the Queue
        p4.add(10);
        p4.add(22);
        p4.add(36);
        p4.add(25);
        p4.add(16);
        p4.add(70);
        p4.add(82);
        p4.add(89);
        p4.add(14);
        System.out.println("\nOriginal Priority Queue: "+p4);

        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while( (val = p4.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }
}