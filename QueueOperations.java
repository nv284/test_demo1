package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperations {
	public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
       // Queue<String> waitingQueue = new LinkedList<String>();
        Queue<String> waitingQueue=new PriorityQueue<String>();  

        // Adding new elements to the Queue (The Enqueue operation)
        waitingQueue.add("Rajeev");
        waitingQueue.add("Chris");
        waitingQueue.add("John");
        waitingQueue.add("Mark");
        waitingQueue.add("Steven");
		 waitingQueue.add("Sara"); waitingQueue.add("robort"); waitingQueue.add("xylo");
		

        System.out.println("WaitingQueue : " + waitingQueue);
     // Check if a Queue is empty
        System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        // Check if the Queue contains an element
        String name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name); System.out.println("Waiting Queue doesn't contain " + name);
        }
        String fi =  waitingQueue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + fi);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        fi = waitingQueue.peek();
        System.out.println("\n=== Iterating over a Queue using iterator() ===");
        Iterator<String> waitingQueueIterator = waitingQueue.iterator();
        while (waitingQueueIterator.hasNext()) {
            String n= waitingQueueIterator.next();
            System.out.println(n);
        }
}}
