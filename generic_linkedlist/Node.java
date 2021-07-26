public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T v){
        value = v;
        next = null;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setNext(Node<T> n){
        next = n;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T v){
        value = v;
    }
}

