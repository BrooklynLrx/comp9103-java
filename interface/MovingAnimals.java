public class MovingAnimals {
    public static void main(String[] args){
        Dog dog = new Dog("land");
        Dolphin dophin = new Dolphin("land");
        Move[] movingAnimals = {dog,dophin};
        for(Move m: movingAnimals) {
            m.move(1.0);
        }
        System.out.println(dog.getkmtravelled());
        System.out.println(dophin.getkmtravelled());
        
    }
}
