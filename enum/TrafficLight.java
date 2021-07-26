enum LightColour{
    Red{public LightColour change(){return Green;}},
    Green{public LightColour change(){return Yellow;}},
    Yellow{public LightColour change(){return Red;}};
    public abstract LightColour change();
}

public class TrafficLight {
    private LightColour colour;
    public TrafficLight() {
        colour = LightColour.Red;
    }

    public LightColour change(){
        colour = colour.change();
        return colour;
    }
}
