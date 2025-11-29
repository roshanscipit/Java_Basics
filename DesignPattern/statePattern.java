package DesignPattern;

interface trafficLightState {
    void change(TrafficLight light);
}

class RedState implements trafficLightState {
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing from Red to Green");
        light.setState(new GreenState());
    }
}
class GreenState implements trafficLightState {
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing from Green to Yellow");
        light.setState(new YellowState());
    }
}

class YellowState implements trafficLightState {
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing from Yellow to Red");
        light.setState(new RedState());
    }
}

class TrafficLight {
    private trafficLightState state;

    public TrafficLight() {
        state = new RedState(); // Initial state
    }

    public void setState(trafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}

public class statePattern {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.change(); // Red to Green
        light.change(); // Green to Yellow
        light.change(); // Yellow to Red
        light.change(); // Red to Green
    }
}