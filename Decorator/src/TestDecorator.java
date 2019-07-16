public class TestDecorator {
    public static void main(String[] args){
        Tea blackTea = new BlackTea();
        printTeaInfo(blackTea);

        blackTea = new Lemon(blackTea);
        blackTea = new Lemon(blackTea);
        blackTea = new Sugar(blackTea);
        printTeaInfo(blackTea);

    }

    public static void printTeaInfo(Tea tea){
        System.out.println(tea.getDescription() + ", cost: " + tea.cost());
    }
}
