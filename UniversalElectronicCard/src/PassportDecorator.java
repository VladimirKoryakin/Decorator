public class PassportDecorator extends CardDecorator{
    @Override
    public void getInfo() {
        System.out.println("It is a passport!");
        decorated.getInfo();
    }
    @Override
    public void getPossibleActions() {
        decorated.getPossibleActions();
        System.out.println("You can travel!");
    }
    PassportDecorator(UniversalElectronicCard card) {
        super(card);
    }
}
