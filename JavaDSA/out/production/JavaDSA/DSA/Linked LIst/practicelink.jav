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
}