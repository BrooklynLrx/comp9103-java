public class MyOwnArrayList{

    private int[] a;
    private int size;

    public MyOwnArrayList(){
        a = new int[1000];
        size = 0;
    }

    public MyOwnArrayList(int n){
        a = new int[n]; //8
        size = 0;
    }

    public int size(){
        return size;
    }

    public void add(int n){
            if(size >= a.length){
                int[] temp = new int[size *2];
                for(int i = 0; i < size; i++)
                    temp[i] = a[i];
             
                a = temp;        
            }
         
            a[size] = n;
            size++;
    }

    public int get(int index){
        if(index < 0 || index >= size)
            return 0;
        return a[index];
    }

}
