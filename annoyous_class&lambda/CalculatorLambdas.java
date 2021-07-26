import java.util.HashMap;
interface binary_lambda {
    int apply(int x, int y);
}

public class CalculatorLambdas {
    public static void main(String[] args){
        HashMap<String,binary_lambda> operations = new HashMap<>();
        operations.put("ADD",(x,y) -> x + y);
        operations.put("SUB",(int x,int y) -> x - y);
        operations.put("MUL",(x,y) -> x * y);
        System.out.println(operations.get("ADD").apply(1,1));
        System.out.println(operations.get("SUB").apply(3,5));
        System.out.println(operations.get("MUL").apply(2,3));
    }

   
}
