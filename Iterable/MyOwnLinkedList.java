import java.util.Iterator;

class Node<T>{
    T value;
    Node<T> next;

    public Node(T value){
        this.value = value;
        next = null;
    }
}

class MyIterator<T> implements Iterator<T>{

    Node<T> cursor;
    public MyIterator(Node<T> head){
        cursor = head;
    }

    public boolean hasNext(){
        return cursor != null;
    }

    public T next(){
        T nextElement = cursor.value;
        cursor = cursor.next;
        return nextElement;
    }
}

public class MyOwnLinkedList<T> implements Iterable<T>{

    Node<T> head;
    private int size;

    public MyOwnLinkedList(){
        head = null;
        size = 0;
    }

    public Iterator<T> iterator(){
        return new MyIterator<T>(head);
    }



    public int size(){return size;}

    public void add(T n){
        Node<T> newNode = new Node<T>(n);

        if(head == null)
            head = newNode;
        else{

            Node<T> cursor = head;
            while(cursor.next != null){
                cursor = cursor.next;
            }
            cursor.next = newNode;    
        }
        size++;
    }

    public T get(int i){
        
        Node<T> cursor = head;
        int counter = 0; 
        while(counter++ < i ){
            cursor = cursor.next;
        }
        return cursor.value;
    }
}


















