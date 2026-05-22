
public class singlyy {
    Node head; // The head (first node) of the list. Initially null for an empty list.

    private int size;
    singlyy() {
       this.size = 0;
    }

    class Node {
    int data;     // The data value (can be any type: String, Object, etc.)
    Node next;    // A reference to the next node in the list  

    // Constructor to create a new node  
    // The 'next' is null by default
    Node(int data) {
        this.data = data;
        this.next = null;
        size++;
    }
}



    //✅For adding element (INSERT at beginning)
    public void InsertBeginning(int data) {
        Node newNode = new Node(data);     //Naya node banaya aur data usme dala
        if (head == null) {        //if  //Agar list khaali hai (head null hai)
            head = newNode;              //To newNode ko head bana do
            return;
        } 
        newNode.next = head;  //else //Agar list bhari he to New node ka next purani list ka head hoga
        head = newNode;        //Ab newNode ko head bana do (starting node)
    }


    //✅Inser at the END
    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);       //Naya node banaya aur data usme dala
        if(head == null) {                   //if  //Agar list khaali hai (head null hai)
            head = newNode;                   //To newNode ko head bana do
            return;
        }
        Node currNode = head;                  //Traversal ke liye head se start kiya
        while (currNode.next != null) {        //Jab tak last node na mil jaye (next null nahi)
            currNode = currNode.next;          //currNode ko aage le jaate raho
        }
        currNode.next = newNode;              //Last node ka next ab newNode ho gaya
    }



    //✅ for printing the list okayy RUPU....
    public void printlist() {
        if (head == null) {       //agar list pehle se hi khali hogi to
            System.out.println("list is empty");
            return;
        }
        Node current = head; // Start from the head
        while (current != null) {    //jab tak current node null nahi milta tab tak calta rahega
            System.out.print(current.data + " -> "); // Print the current node's data
            current = current.next; // Move to the next node
        }
        System.out.println("NULL"); // Mark the end of the list
    }


    //For delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is null");  
            return;          
        }
        size--; //for size only
        head = head.next;
    }
    
    //For Delete last
    public void deletlast() {
        if (head == null) {
            System.out.println("So list is empty");
            return;
        }

        size --;  //For size only
        if (head.next == null) {
            head = null;
        }
        Node firstNode = head;
        Node secondNode = head.next;
        while (secondNode.next != null) {
            secondNode = secondNode.next;
            firstNode = firstNode.next;
            
        }
        firstNode.next = null;
    }


    public int getSize() {       // For size
        return size;
    }


  public static void main(String[] args) {
    singlyy list = new singlyy();
    list.InsertBeginning(1);
    list.InsertBeginning(2);
    list.printlist();

    list.InsertAtEnd(9);
    list.printlist();

    list.InsertBeginning(01);
    list.printlist();

    list.deleteFirst();
    list.deleteFirst();
    list.deletlast();
    list.printlist();

    System.out.println(list.getSize());
  }
}