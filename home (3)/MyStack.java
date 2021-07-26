public class MyStack<E> implements DelayedStack<E>{
    @SuppressWarnings("unchecked")
    private E[] lista = (E[])new Object[1000];   
    private int delay;
    private int maxdelay;
    private int size;
    private String lastaction="";
    @SuppressWarnings("unchecked")
    public MyStack (int delay){
        if(delay < 0){
            this.delay = 0;
            this.maxdelay = delay;
        }
        else{
            this.maxdelay = delay;
            this.delay = delay;
        }
        this.size = 0;
    }
    public int size(){
        return size;
    }
    public void push(E element){
        lista[size] = (E) element;
        size++;
        if(size == lista.length){
            @SuppressWarnings("unchecked")
            E[] newArray = (E[])new Object[lista.length*2];
            System.arraycopy(lista,0,newArray,0,lista.length);
            lista = newArray;
        }
        delay--;        
        if(lastaction.equals("pop") || lastaction.equals("clear") ) {
            if(maxdelay<=0){
                delay = 0;
            }
            else{
                delay = maxdelay-1;
            }
        }
        if(delay<0){
            delay = 0;
        }
        lastaction = "push";     
    }
    public E pop() throws IllegalStateException{
        if(lista == null){
            throw new IllegalStateException();
        }
        else if(size == 0){;
            throw  new IllegalStateException("empty list");
        }
        if(delay > 0){
            return null;
        }
        else {
            E a = lista[size-1];
            lista[size-1] = null;
            size --;
            lastaction = "pop";
            return (E) a;

        }

    }
    public E peek() throws IllegalStateException{
         if(lista == null){
            throw new IllegalStateException();
         }
         else if(size == 0){
            throw new IllegalStateException("empty list");
         }
         else{
             E t = lista[size-1];
             return (E) t;
             
         }
    }
    public int getDelay(){
        return delay;
    }
    public void setMaximumDelay(int d){
        /*if(d < 0){
            this.maxdelay = 0;
            if(!lastaction.equals("clear")){
                lastaction = "setmax";
            }
        }*/
        //else{
            this.maxdelay = d;
            if(!lastaction.equals("clear")){
                lastaction = "setmax";
            }
        //}
    }
    public int getMaximumDelay(){
        return this.maxdelay;
    }
    public boolean clear(){
        if(size == 0){
            lastaction = "clear";
            return true;
        }
        else if(maxdelay>delay && delay > 0) {
            return false;
        }
        else{
            for(int i = 0;i < size;i++){
                lista[i] = null;
            }
            size = 0;
            delay = 0;
            lastaction = "clear";
            return true;
        }
    }
    public boolean contains(E elem){
        if(size == 0){
            return false;
        }
        else if(elem == null){
            for(int i = 0; i < size;i++){
                if(lista[i] == null){
                    return true;
                }
            }
            return false;
        }
        else{
            for(int i = 0; i < size;i++){
                if(lista[i] == null){
                    continue;
                }
                if(lista[i].equals(elem)){
                    return true;
                }
            }
            return false;
        }
    }

    //public E pop() throws IllegalStateException;


}
