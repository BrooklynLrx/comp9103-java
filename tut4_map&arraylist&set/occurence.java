import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class occurence{
    public static void main(String[] args){    
    HashMap<String,Integer> a = new HashMap<String,Integer>();
    System.out.println("Please input a string: ");
    Scanner s = new Scanner(System.in);
    String sentense = s.nextLine();
    for(int i = 0;i < sentense.length();i++){
        if(!a.containsKey(String.valueOf(sentense.charAt(i)))){
            a.put(String.valueOf(sentense.charAt(i)),1);
        }
        else{
            a.put(String.valueOf(sentense.charAt(i)),a.get(String.valueOf(sentense.charAt(i)))+1);
        }
    }
    for (Map.Entry<String, Integer> entry : a.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
    }
}

}
