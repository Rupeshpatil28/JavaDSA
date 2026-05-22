<<<<<<< HEAD


public class singly {

    public static class Node {
    int data;     // The data value (can be any type: String, Object, etc.)
    Node next;    // A reference to the next node in the list

    // Constructor to create a new node
    // The 'next' is null by default
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


    public static void displayr(Node head) {         //print straight linearly
        if (head == null) return;
        System.out.println(head.data);
        displayrevers(head.next);
    }

    public static void displayrevers(Node head) {         //print in revers
        if (head == null) return;
        displayrevers(head.next);
        System.out.println(head.data);
    }

    public static void display(Node head)  {    //print lineraly
        while(head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }

    //For printing length of linked list
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count ++;
            head = head.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(8);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        
        System.out.print("this is legth : ");
        System.out.println(length(a));

    }
=======


public class singly {

    public static class Node {
    int data;     // The data value (can be any type: String, Object, etc.)
    Node next;    // A reference to the next node in the list

    // Constructor to create a new node
    // The 'next' is null by default
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


    public static void displayr(Node head) {         //print straight linearly
        if (head == null) return;
        System.out.println(head.data);
        displayrevers(head.next);
    }

    public static void displayrevers(Node head) {         //print in revers
        if (head == null) return;
        displayrevers(head.next);
        System.out.println(head.data);
    }

    public static void display(Node head)  {    //print lineraly
        while(head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }

    //For printing length of linked list
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count ++;
            head = head.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(8);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        
        System.out.print("this is legth : ");
        System.out.println(length(a));

    }
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
}