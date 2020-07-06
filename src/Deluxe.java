public class Deluxe extends Hamburger {


    public Deluxe() {
        super("Deluxe","white","sausage and chicken",15);
        super.addHamburgerAddition1("Chips",2.99);
        super.addHamburgerAddition2("Coke",1.43);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot added this field of deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot added this field of deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot added this field of deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot added this field of deluxe");
    }
}
