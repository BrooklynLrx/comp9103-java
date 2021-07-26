public class LinkedList<T>{
    private Node<T> head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public void add(T v){
        if(head = null) {
            head = new Node<T>(v);
        }
        else{
            Node<T> current = head;
            while(current.getNext()!=null) {
                current = current.getNext();
            }
            current.setNext(new Node<T>(v));
        }
        size++;
    }

    public int size(){
        return size;
    }
}
