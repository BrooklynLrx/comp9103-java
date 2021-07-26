import java.util.Scanner;
public class MyOwnLinkedListTest{
    public static void main(String[] args){

        MyOwnLinkedList<Integer> a = new MyOwnLinkedList<Integer>();

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
            a.add(scan.nextInt());
        
       
        for(Integer str: a)
            System.out.println(str);


    }
}

