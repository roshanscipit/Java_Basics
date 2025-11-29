package DesignPattern;

interface chatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements chatMediator {
    private java.util.List<User> users;

    public ChatMediatorImpl() {
        this.users = new java.util.ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            // message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}

abstract class User {
    protected chatMediator mediator;
    protected String name;

    public User(chatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}

class UserImpl extends User {

    public UserImpl(chatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " Sending Message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " Received Message: " + msg);
    }
}

public class mediatorPattern {
    public static void main(String[] args) {
        chatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Alice");
        User user2 = new UserImpl(mediator, "Bob");
        User user3 = new UserImpl(mediator, "Charlie");
        User user4 = new UserImpl(mediator, "Diana");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello everyone!");
        user2.send("Hi Alice!");
    }
}