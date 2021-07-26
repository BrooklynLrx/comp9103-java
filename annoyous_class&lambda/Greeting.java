@FunctionalInterface
interface sayHello{
    
    public void hello(String name);         
    
    public default void howRU(){
        hello("Adam");
        System.out.println("How are you");
    }
}lam

public class Greeting{

    public static void main(String[] args){

        sayHello englishHello = name -> {
                
                System.out.println("Hi " + name); 
                
            };

        englishHello.howRU();
        
        englishHello.hello("Smith");


        sayHello chineseHello = name -> {

                System.out.println("Ni Hao, " + name); 
                
            };

        chineseHello.hello("Chen");
    }
}

