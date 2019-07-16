public class Sugar extends Decorator {
    private Tea tea;

    public Sugar(Tea tea){
        this.tea = tea;
    }

    @Override
    public double cost() {
        return tea.cost() + 0.03;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + ", Sugar";
    }
}
