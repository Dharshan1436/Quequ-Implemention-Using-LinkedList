package quequImplementionUsingLinkedList;

class Quequ {
	int[] ar;
	int front;
	int rear;
	int size;
	int capacity;

	public Quequ(int capacity) {

		this.capacity = capacity;
		this.ar = new int[capacity];
		this.front=0;
		this.rear=-1;
		this.size=0;
	}
	void enqueue(int element) {
		if(rear==capacity-1) {
			System.out.println("Queue is full");
		}else {
			rear++;
			ar[rear]=element;
			size++;
		}
	}
int dequeue() {
	if(front>rear) {
		System.out.println("Queue is empty");
		return -1;
	}else {
		int element=ar[front];
		front++;
		size--;
		return element;
	}
}
int getFront() {
	if(size>0) {
		return ar[front];
	}else {
		System.out.println("Queue is empty");
		return -1;
	}
}
int getRear() {
	if(size>0) {
		return ar[rear];
	}else {
		System.out.println("Queue is empty");
		return -1;
	}
}

boolean isFull() {
	return rear==capacity-1;
}
boolean isEmpty() {
	return front>rear;
}

int size() {
	return size;
}
}
public class QueueArray {

	public static void main(String[] args) {
		Quequ q=new Quequ(6);
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		 q.enqueue(40);
		 q.enqueue(50);
		 q.enqueue(60);
		 System.out.println(q.isFull());
		 System.out.println(q.isEmpty());
		 System.out.println(q.size);
		 q.dequeue();
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		System.out.println(q.capacity);
		System.out.println(q.size);
		 

	}

}
