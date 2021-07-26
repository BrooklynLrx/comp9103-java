class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        next = null;
    }
}

public class MyOwnLinkedList{

    Node head;
    private int size;

    public MyOwnLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){return size;}

    public void add(int n){
        Node newNode = new Node(n);

        if(head == null)
            head = newNode;
        else{

            Node cursor = head;
            while(cursor.next != null){
                cursor = cursor.next;
            }
            cursor.next = newNode;    
        }
        size++;
    }

    public int get(int i){
        
        Node cursor = head;
        int counter = 0; 
        while(counter++ < i ){
            cursor = cursor.next;
        }
        return cursor.value;
    }
}

















