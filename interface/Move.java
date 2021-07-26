public interface Move{
    public void move(double hours);
    public default void talking(){
        System.out.println("talking");
    }
}
