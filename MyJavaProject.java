class Node {
    int data;
    Node next;

    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


// Linked list class containing operations for adding elements
class Linkedlist {
    Node head;

    // Method to add elements to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        
        // Insert elements into the linked list
        myList.insert(5);
        myList.insert(10);
        myList.insert(15);

        // Display the elements of the linked list
        System.out.print("Linked list: ");
        myList.display(); // Output: Linked list: 15 10 5

        // Delete an element from the linked list
        myList.delete(10);

        // Display the elements of the linked list after deletion
        System.out.print("Linked list after deletion: ");
        myList.display(); // Output: Linked list after deletion: 15 5
    }
}
