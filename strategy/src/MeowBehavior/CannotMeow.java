package MeowBehavior;

public class CannotMeow implements MeowBehavior {
    @Override
    public void meow() {
        System.out.println("Sorry, I can't meow..");
    }
}
