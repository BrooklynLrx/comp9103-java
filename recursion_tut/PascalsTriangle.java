import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PascalsTriangle {

    //Recursive version
    public static List<Integer> pascalRecursive(int n) {
        if(n == 0) {
            return Arrays.<Integer>asList(1);
        } else if(n == 1) {
            return Arrays.<Integer>asList(1, 1);
        } else {
            List<Integer> previous = pascalRecursive(n-1);
            List<Integer> current = new ArrayList<Integer>(); //Set capacity
            current.add(1);
            for(int i = 1; i < previous.size(); i++) {
                current.add(previous.get(i-1) + previous.get(i));
            }
            current.add(1);
            return current;
        }
    }

    //Recursive version output
    public static void OutputTriangle(int n) {
        int count = 0;
        while(count <= n) {
            System.out.println(pascalRecursive(count));
            count++;
        }
    }
