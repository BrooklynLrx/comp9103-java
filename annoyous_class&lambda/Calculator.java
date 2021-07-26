import java.util.HashMap;

interface IntegerBinary {
    int apply(int x,int y);
}

public class Calculator{
    public static void main(String[] args) {
        HashMap<String,IntegerBinary> operations = new HashMap<>();
    
        operations.put("ADD",new IntegerBinary(){
            public int apply(int x,int y) {
                return x+y;
            }
        });

        operations.put("SUB",new IntegerBinary(){
            public int apply(int x,int y) {
                return x-y;
            }
        });

        operations.put("MUL",new IntegerBinary(){
            public int apply(int x,int y) {
                return x*y;
            }
        });

        System.out.println(operations.get("ADD").apply(1,1));
        System.out.println(operations.get("SUB").apply(3,5));
        System.out.println(operations.get("MUL").apply(2,3));
    }


}
