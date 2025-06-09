import java.util.*;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

class Publisher {
    private List<Observer> observers = new ArrayList<>();

    void subscribe(Observer observer) {
        observers.add(observer);
    }

    void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Publisher channel = new Publisher();
        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.notifyObservers("New Video Uploaded!");
    }
}