/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akanksha singh
 */
public class cycleInLL {
	
	public static void main(String[] args) {
		Node head = new Node("1");
		head.next = new Node("2");
		head.next.next = new Node("3");
		head.next.next.next = new Node("4");
		head.next.next.next.next = new Node("5");
		head.next.next.next.next.next = new Node("6");
		head.next.next.next.next.next.next = new Node("7");
		head.next.next.next.next.next.next.next = head.next.next;
		findcycle(head);
	}
	
	private static void findcycle(Node head) {
		Node slow = head;
		Node fast = head.next.next;
		while(slow != null) {
			if(slow == fast) {
				System.out.println("Loop Found in Linked List");
				int lengthOfLoop = findLength(slow, fast);
				break;
			}else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
	}

	private static int findLength(Node firstPtr, Node secondPtr) {
		secondPtr = secondPtr.next;
		int lengthLoop = 1;
		while(secondPtr != firstPtr) {
			lengthLoop++;
			secondPtr = secondPtr.next;
		}
		System.out.println(" Loop length is "+lengthLoop);
		return lengthLoop;
	}

}

