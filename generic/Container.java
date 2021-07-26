public class Container<T> {
    private T element;
    public Container(T element){
        this.element = element;
    }

    public T set(T element){
        T oldelement = this.element;
        this.element = element;
        return oldelement;
    }

    public T get(){
        return element;
    }

    public static void main (String[] args){
        Container<String> c = new Container<String>("hello box");
        String s1 = c.get();
        c.set("new");
        String s2 = c.get();
        System.out.println(s1);
        System.out.println(s2);
    }
}
