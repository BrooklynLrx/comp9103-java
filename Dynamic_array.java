import java.util.ArrayList;
public class Dynamic_array{
    public static void main(String[] args){
        ArrayList a = new ArrayList<String>();
        a.add("1");
        a.add(new Integer(5));
        a.add(new Double(10.6));
        for(int i= 0; i < a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
