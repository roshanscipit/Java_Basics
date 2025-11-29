package DesignPattern;

interface subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class concreteSubject implements subject {
    private java.util.List<Observer> observers = new java.util.ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
interface Observer {
    void update();
}

class concreteObserver implements Observer {
    private concreteSubject subject;
    private String name;

    public concreteObserver(concreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer " + name + ": Subject state changed to " + subject.getState());
    }
}

public class Observer {
    public static void main(String[] args) {
        concreteSubject subject = new concreteSubject();

        concreteObserver observer1 = new concreteObserver(subject, "A");
        concreteObserver observer2 = new concreteObserver(subject, "B");

        System.out.println("Setting subject state to 10");
        subject.setState(10);

        System.out.println("Setting subject state to 20");
        subject.setState(20);

        subject.removeObserver(observer1);

        System.out.println("Setting subject state to 30");
        subject.setState(30);
    }
}