package Cats;

import MeowBehavior.MeowBehavior;
import MoveBehavior.MoveAbility;

public class Cat {
    protected MoveAbility moveAbility;
    protected MeowBehavior meowBehavior;

    public void meow(){
        meowBehavior.meow();
    }

    public void move(){
        moveAbility.move();
    }
}
