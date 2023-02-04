public class BankCardDecorator extends CardDecorator{
    @Override
    public void getInfo() {
        System.out.println("It is a bank card!");
        decorated.getInfo();
    }

    @Override
    public void getPossibleActions() {
        decorated.getPossibleActions();
        System.out.println("You can pay!");
    }

    BankCardDecorator(UniversalElectronicCard card) {
        super(card);
    }
}
