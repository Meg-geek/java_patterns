package MoveBehavior;

public class CanMove implements MoveAbility {
    @Override
    public void move() {
        System.out.println("*run into other room*");
    }
}
