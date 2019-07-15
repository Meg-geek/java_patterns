package Cats;

import MeowBehavior.CanMeow;
import MoveBehavior.CanMove;

public class Kitten extends Cat {

    public Kitten(){
        meowBehavior = new CanMeow();
        moveAbility = new CanMove();
    }
}
