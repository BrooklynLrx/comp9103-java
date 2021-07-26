public class Cupcake {
    public boolean delicious;
    public String name;
    public Cupcake(boolean delicious,String name){
        this.delicious = delicious;
        this.name = name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public static void main (String[] args){
        Cupcake a  = new Cupcake(true,"big");
        System.out.println(a.name);
        a.setname("asd");
        System.out.println(a.name);
    }
}

