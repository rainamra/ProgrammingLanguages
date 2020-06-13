package design.mediator;

public class test {
    public static void main(String[] args) {
        InteractionMediator mediator = new InteractionMediatorImpl();
        User user1 = new UserImpl(mediator, "raina");
        User user2 = new UserImpl(mediator, "ali");
        User user3 = new UserImpl(mediator, "cen");
        User user4 = new UserImpl(mediator, "azel");
        User user5 = new UserImpl(mediator, "bunga");

        mediator.taggedInPost(user1);
        mediator.taggedInPost(user2);
        mediator.taggedInPost(user3);
        mediator.taggedInPost(user4);

        user1.send("amazing view!");

    }
}




