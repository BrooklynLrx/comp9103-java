import java.util.HashSet;

public class Sets{
    public static void main(String[] args){

        HashSet<String> s = new HashSet<String>();

        s.add("s1");
        s.add("s2");
        s.add("s3");
        s.add("s4");
        s.add("s5");
        s.add("s1");
        
        for(String str: s){
            System.out.println(str);
        }
    }
}
