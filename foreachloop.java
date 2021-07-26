import java.util.ArrayList;
public class foreachloop{
    public static void main(String[] args){
      ArrayList <String> a = new ArrayList<String>(3);
      a.add("a");
      a.add("b");
      a.add("c");
      for(String i:a){
            System.out.println(i);
      }
      System.out.println();
    }
}
