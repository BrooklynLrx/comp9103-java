public class Chair extends Furniture{
    public Chair(){
        super("Chair");
    }

    public void stack(Furniture f){
        System.out.println("put it away");
    }
}
