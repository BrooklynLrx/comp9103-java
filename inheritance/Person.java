public class Person{
    public static int def_age = 21;
    private String name;
    private int age;
    public Person(){
        this("jeff",def_age);
    }
    public Person(name){
        this(name,def_age);
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public getName(){
        return name;
    }
}
