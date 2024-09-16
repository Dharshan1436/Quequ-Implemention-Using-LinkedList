package quequImplementionUsingLinkedList;



class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	Node front;
	Node rear;
	int size;

	Queue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	boolean isEmpty() {
		return front == null;
	}

	void Enqueue(int element) {
		Node temp = new Node(element);
		size++;
		if (isEmpty()) {
			this.front = temp;
			this.rear = temp;
		} else {
			rear.next = temp;
			rear = rear.next;
		}
	}

	int dequeue() {
		if (isEmpty()) {
			return -1;
		} else {
			Node temp = front;
			front = front.next;
			temp.next = null;
			size--;
			return temp.data;

		}
	}

	int getFront() {
		if(isEmpty()) {
			return -1;
		}else {
			return front.data;
		}
	}
	int getrear() {
		if(isEmpty()) {
			return -1;
		}else {
			return rear.data;
		}
	}
}

public class QueueLinkList {

	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.Enqueue(10);
		System.out.println(q.isEmpty());
		q.Enqueue(20);
	}

}
