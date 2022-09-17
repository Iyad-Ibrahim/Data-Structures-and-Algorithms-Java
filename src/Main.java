import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// Stack is a LIFO structure (Last In First Out)
		// push() adds to the top of the stack
		// pop() removes from the top of the stack
		
		/*
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.isEmpty()); //isEmpty() returns true if stack is empty and false otherwise
		
		stack.push("Overwatch");
		stack.push("Tekken 7");
		stack.push("Final Fantasy VII Remake");
		stack.push("Sekiro: Shadows Die Twice");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); //peek() returns the top element without removing it from the stack
		
		System.out.println(stack.search("Overwatch")); //search() returns the index of the searched element in the stack or -1 if element is not found
		*/
		
		//----------------------------------------------------------------------
		
		// Queue is FIFO data structure (First In First Out)
		// enqueue(), offer() ---> adds to the tail of the queue
		// dequeue(), poll() ---> removes the head of the queue
		
		/*
		Queue<String> q = new LinkedList<String>();
		
		System.out.println(q.isEmpty()); //isEmpty returns true if q is empty and false otherwise
		
		q.offer("Mom");
		q.offer("Dad");
		q.offer("Bro");
		q.offer("Me");
		
		System.out.println(q);
		
		System.out.println(q.peek()); //peek returns head of the queue without removing it from queue
		
		System.out.println(q.size()); //size() returns the size of the queue
		
		System.out.println(q.contains("Mom")); //contains() returns true if queue contains element and false otherwise
		
		q.poll(); //element() does the same as poll but throws an exception if queue is empty
		
		System.out.println(q);
		*/
		
		//----------------------------------------------------------------------
		
		// Priority Queue is data structure that orders elements based on priority
		// Higher priority elements first
		
		/*
		Queue<Double> scoreQ = new PriorityQueue<>(Collections.reverseOrder()); //when passing Doubles to PriorityQueue it orders them in ascending order by defualt, the order can be reversed using the Collections.reverseOrder() Comparator
		
		scoreQ.offer(9.0);
		scoreQ.offer(7.5);
		scoreQ.offer(8.0);
		scoreQ.offer(6.0);
		scoreQ.offer(5.5);
		
		//System.out.println(scoreQ); //print only displays the elements of the queue in the order of entry not by priority
		
		while(!scoreQ.isEmpty()) {
			System.out.println(scoreQ.poll());
		}
		*/
		
		//----------------------------------------------------------------------
		
		// LinkedList is a sequential data structure consisting of linked Nodes
		//
		// each Node consists of two parts: [data + address(s)]
		//
		//
		//							Singly Linked List
		//				Node				Node				Node
		//		   [data | next] ----> [data | next] ----> [data | next]
		//
		//							Doubly Linked List
		//				      Node							 Node
		//		   [previous | data | next]  <->  [previous | data | next]
		//
		//
		// Nodes are stored in non-consecutive memory addresses
		//
		// LinkedLists are not indexed and therefore elements can't be accessed randomly, so they can only be searched linearly ( O(n) )
		// Their advantage over arrays lies in the fact that insertions are very efficient since they dont require shifting of elements ( O(1) )
		//
		// Useful methods:
		// peekFisrt()
		// peekLast()
		// addFirst()
		// addLast()
		// removeFirst()
		// removeLast()
		
		/*
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.push("Mazda 626");
		linkedList.push("BMW 335i");
		linkedList.push("BMW 728i");
		linkedList.push("BMW 330xi");
		
		linkedList.add(1, "BMW 530i");
		linkedList.push("scrubmobile");
		
		System.out.println(linkedList);
		
		linkedList.remove("scrubmobile");
		
		System.out.println(linkedList);
		*/
		

	}

}
