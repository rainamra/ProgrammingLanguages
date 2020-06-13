package design.mediator;

import java.util.ArrayList;
import java.util.List;

public class InteractionMediatorImpl implements InteractionMediator {
    private List<User> users;


    public InteractionMediatorImpl() {
        this.users = new ArrayList<>();
    }


    @Override
    public void taggedInPost(User user) {
        this.users.add(user);
    }


    @Override
    public void commentPost(String comment, User user) {
        for (User usr : users) {
            if (usr != user){
                usr.receive(comment);
            }
        }
    }
}


