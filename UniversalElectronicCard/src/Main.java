public class Main {
    public static void main(String[] args) {
        UniversalElectronicCard card = new BasicCard("Ivan Petrov", "Russia", 12345678);
        card.getInfo();
        card.getPossibleActions();
        System.out.println("--------\nNow it's also a passport!\n--------");
        card = new PassportDecorator(card);
        card.getInfo();
        card.getPossibleActions();
        System.out.println("--------\nNow it's also a polis!\n--------");
        card = new PolisDecorator(card);
        card.getInfo();
        card.getPossibleActions();
        System.out.println("--------\nNow it's also a bank card!\n--------");
        card = new BankCardDecorator(card);
        card.getInfo();
        card.getPossibleActions();
    }
}