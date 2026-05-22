<<<<<<< HEAD
public class practiclink {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    //Inser at begining
    public void InsertBeginning(int data) {
    Node newData = new Node(data)
    if(head == null) {
        head = newData;
        return;
    } else {
        newData.next = head;
        head = newData;
    }
}
    




    public static void main(String[] args) {

    }
=======
public class practiclink {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    //Inser at begining
    public void InsertBeginning(int data) {
    Node newData = new Node(data)
    if(head == null) {
        head = newData;
        return;
    } else {
        newData.next = head;
        head = newData;
    }
}
    




    public static void main(String[] args) {

    }
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
}