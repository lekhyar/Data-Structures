package arrays;

public class LinkedList {
	Node head, current = null;
//Insert Elements
	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			current = n;
		}

	}
		
	///Delete Elements
 void delete(int data) {
	Node n = head;
	Node t= null;
	while(n!= null) {
		if(head.data==data) {
			head=head.nextNode;
			break;
		}
		if(n.data == data) {
			t.nextNode = n.nextNode;
			break;
		}
		t=n;
		n=n.nextNode;
	}
}
//Size of the elements
int size() {
	int size=0;
	Node n = head;
	while(n!=null) {
		size++;
		n= n.nextNode;
	}
	System.out.println("Size of the elements is "+size);
	return size;
}
//Maximum element

int max() {
	Node temp = head;
	int max = head.data;
	while(temp!=null) {
		if(temp.data > max) {
			max = temp.data;
		}
		temp= temp.nextNode;
	}
	System.out.println("Maximum element is "+max);
	return max;
}

//Minimum Element

int min() {
Node temp = head;

int min = head.data;
while(temp!=null) {
if(temp.data < min) {
min = temp.data;
}
temp= temp.nextNode;
}
System.out.println("Minimum element is  "+min);
return min;
}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println("The added Elements are: " +n.data);
			n = n.nextNode;
		}
		
	}
}
