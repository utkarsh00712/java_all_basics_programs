
public class Queue {
int arr[];
int size;
int front = -1;
int rare = -1;

public Queue(int size) {
	arr = new int[size];
	this.size = size;
}

public void insert(int value) {
	if(rare == size-1) {
		System.out.println("Queue is Full");
	} else {
		rare++;
		arr[rare] = value;
	}
}

public void delete(int value) {
	if(front == -1 && rare == -1 ||front == (size-1)) {
		System.out.println("Queue is Empty");
	} else {
		for(int i = 0; i <= arr.length-1; i++) {
			front++;
			arr[i]=0;
		}
	}
}

public void display() {
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i] + " ");
	}
}
}
