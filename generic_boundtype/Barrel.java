import java.util.ArrayList;
import java.util.List;
public class Barrel <T extends Liquid> {
    private List<T> liquids;

    public Barrel(){
        liquids = new ArrayList<T>();
    }

    public void add(T liquid){
        liquids.add(liquid);
    }

    public void outputVolume(){
        double total = 0.0;
        for(T e: liquids){
            total += e.getLitres();
            System.out.println(e+": "+e.getLitres()+"L");
        }
        System.out.println("Total:"+total+"L\n");
    }

    public static void main(String[] args){
        Barrel<Water> water = new Barrel<Water>();
        Barrel<Oil> oil = new Barrel<Oil>();
        Barrel<Liquid> mix = new Barrel<Liquid>();

        water.add(new Water(1.0));
        water.add(new Water(2.0));
        water.outputVolume();

        oil.add(new Oil(1.0));
        oil.add(new Oil(2.0));
        oil.outputVolume();

        mix.add(new Water(1.0));
        mix.add(new Oil(1.0));
        mix.outputVolume();
    }
}
