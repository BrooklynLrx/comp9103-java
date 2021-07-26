import java.util.HashMap;
import java.util.Map;
public class map{
    public static void main(String[] args){
        HashMap<String,Integer> seats = new HashMap<String,Integer>();
        seats.put("Bus",39);
        seats.put("as",5);
        seats.put("ds",2);
        seats.put("csd",3);

        seats.remove("ds");
        for (Map.Entry<String, Integer> entry : seats.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
