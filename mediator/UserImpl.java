package design.mediator;

public class UserImpl extends User{

    public UserImpl(InteractionMediator med, String name) {
        super(med, name);
    }


    @Override
    public void send(String msg) {
        System.out.println("@"+ this.username + ": Sending a comment: " + msg);
        mediator.commentPost(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println('@' + this.username + ": Someone commented on the post you tagged in: " + msg);
    }
}
