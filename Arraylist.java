import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.remove(1);
        a.set(1,"hah");
        System.out.println(a.get(1));
    }
}
