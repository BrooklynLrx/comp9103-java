import java.util.Scanner;
import java.util.LinkedList;

public class LinkedLists{
    public static void main(String[] args){

        LinkedList<Integer> a = new LinkedList<Integer>();

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
            a.add(scan.nextInt());
        
        for(int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));
    }
}
