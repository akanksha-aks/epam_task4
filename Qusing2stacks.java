// Java program to implement Queue using 
// two stacks with costly enQueue() 
import java.util.*; 

class Qusing2stacks 
{ 
static class Queue 
{ 
	static Stack<Integer> a = new Stack<Integer>(); 
	static Stack<Integer> b = new Stack<Integer>(); 

	static void enQueue(int x) 
	{ 
		// Move all elements from s1 to s2 
		while (!a.isEmpty()) 
		{ 
			b.push(a.pop()); 
			//s1.pop(); 
		} 

		// Push item into s1 
		a.push(x); 

		// Push everything back to s1 
		while (!b.isEmpty()) 
		{ 
			a.push(b.pop()); 
			//s2.pop(); 
		} 
	} 

	// Dequeue an item from the queue 
	static int deQueue() 
	{ 
		// if first stack is empty 
		if (a.isEmpty()) 
		{ 
			System.out.println("Q is Empty"); 
			System.exit(0); 
		} 

		// Return top of s1 
		int x = a.peek(); 
		a.pop(); 
		return x; 
	} 
}; 

public static void main(String[] args) 
{ 
	Queue q = new Queue(); 
	q.enQueue(1); 
	q.enQueue(2); 
	q.enQueue(3); 

	System.out.println(q.deQueue()); 
	System.out.println(q.deQueue()); 
	System.out.println(q.deQueue()); 
} 
} 

