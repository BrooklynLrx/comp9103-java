public class Dog implements Move{
    private String region;
    private double landspeed = 50.0;
    private double waterspped =8.0;
    private double kmtravelled = 0.0;

    public Dog(String region){
        this.region = region;
    }

    public void move(double hours) {
        if(region.equals("water")) {
            kmtravelled += waterspped*hours;
        }
        else if(region.equals("land")) {
            kmtravelled += landspeed*hours;
        }
    }

    public double getkmtravelled(){
        return kmtravelled;
    }
    public void talking() {
        System.out.println("dog");
    }
}
