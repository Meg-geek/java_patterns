package Cats;

import MeowBehavior.CanMeow;
import MoveBehavior.CannotMove;

public class ToyCat extends Cat {

    public ToyCat(){
        moveAbility = new CannotMove();
        meowBehavior = new CanMeow();
    }
}
