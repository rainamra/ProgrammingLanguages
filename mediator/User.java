package design.mediator;

public abstract class User {
    protected InteractionMediator mediator;
    protected String username;

    public User(InteractionMediator med, String name) {
        this.mediator = med;
        this.username = name;

    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}


