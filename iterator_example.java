import java.util.Iterator;
import java.util.ArrayList;
public class iterator_example{
    public static void main(String[] args){
            ArrayList<String> a = new ArrayList<String>();
            a.add("a");
            a.add("b");
            a.add("c");
            Iterator<String> iterator = a.iterator();

            while(iterator.hasNext()) {
                String s = iterator.next();
                System.out.println(s);
            }
    }
 
}
