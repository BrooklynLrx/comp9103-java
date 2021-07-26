import java.util.List;
import java.util.ArrayList;

public abstract class Furniture {
    private String name;
    private List<String> parts;
    public Furniture(String name){
        this.name = name;
        this.parts = new ArrayList<String>();
    }

    public void addpart(String p){
        parts.add(p);
    }

    public abstract void stack(Furniture f);
}
