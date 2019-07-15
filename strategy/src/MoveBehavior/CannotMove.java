package MoveBehavior;

public class CannotMove implements MoveAbility {
    @Override
    public void move() {
        System.out.println("Sorry, I can't move");
    }
}
