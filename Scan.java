import java.util.Scanner;
public class Scan{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            String a = s.nextLine();
            System.out.println(a);
        }
    }
}
