public class CardDecorator implements UniversalElectronicCard {
    protected UniversalElectronicCard decorated;

    @Override
    public void getInfo() {
        decorated.getInfo();
    }

    @Override
    public void getPossibleActions() {
        decorated.getPossibleActions();
    }

    CardDecorator(UniversalElectronicCard card) {
        decorated = card;
    }
}
