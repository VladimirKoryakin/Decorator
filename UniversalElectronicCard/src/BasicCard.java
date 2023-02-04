public class BasicCard implements UniversalElectronicCard{
    String ownerName, country;
    int id;
    BasicCard(String name, String country, int id) {
        ownerName = name;
        this.country = country;
        this.id = id;
    }

    @Override
    public void getInfo() {
        System.out.println("Card data: " + ownerName + ", " + country + ", " + id);
    }

    @Override
    public void getPossibleActions() {
        System.out.println("The list of possible actions:");
    }
}
