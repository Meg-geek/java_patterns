public class Mint extends Decorator {
    private Tea tea;

    public Mint(Tea tea){
        this.tea = tea;
    }

    @Override
    public double cost() {
        return tea.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return this.getDescription() + ", Mint";
    }
}
