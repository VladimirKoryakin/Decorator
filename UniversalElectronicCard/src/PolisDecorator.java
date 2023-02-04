public class PolisDecorator extends CardDecorator {
    @Override
    public void getInfo() {
        System.out.println("It is a polis!");
        decorated.getInfo();
    }

    @Override
    public void getPossibleActions() {
        decorated.getPossibleActions();
        System.out.println("You can receive medical help!");
    }

    PolisDecorator(UniversalElectronicCard card) {
        super(card);
    }
}
