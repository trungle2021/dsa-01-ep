package LinkedList_01_day07.implement.singly_linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);

        System.out.println("Expected output: 1->2->3->4->5");
        System.out.print("Actual output: ");
//        myLinkedList.traverseForward();
    }

    Node head;
    private int length;

    public LinkedList() {
        this.length = 0;
        this.head = null;
    }

    public void traverseForward(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
    }

    public int get(int index) {
        if (index >= this.length || index < 0) {
            return -1;
        }

        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current == null ? -1 : current.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

    public void addAtTail(int val) {
        if (this.head == null) {
            addAtHead(val);
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(val);
        }
        length++;
    }

    public void addAtIndex(int index, int val) {

        if (index > length) {
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index >= length) {
            return;
        }

        if (index == 0) {
            this.head = this.head.next;
            length--;
            return;
        }

        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        if (current.next == null) {
            return;
        }

        current.next = current.next.next;
        length--;
    }
}
