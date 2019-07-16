public class Lemon extends Decorator {
    private Tea tea;

    public Lemon(Tea tea){
        this.tea = tea;
    }

    @Override
    public double cost() {
        return tea.cost() + 0.08;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + ", Lemon";
    }
}
