public class HealthyBurger extends Hamburger{

private String healthyBurgerAddition1;
private double healthyBurgerAdditionPrice;

private String healthyBurgerAddition2;
private double healthyBurgerAdditionPrice2;


    public HealthyBurger( String meat, double price) {
        super("Healthy", "brown rye", meat, price);

    }


    public void addHealthAddition1(String name, double price){
        this.healthyBurgerAddition1=name;
        this.healthyBurgerAdditionPrice=price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyBurgerAddition2=name;
        this.healthyBurgerAdditionPrice2=price;
    }

    @Override
    public double itemizedHamburger() {
        double hamBurgerPrice= super.itemizedHamburger();
        if(this.healthyBurgerAddition1!=null){
            hamBurgerPrice+=this.healthyBurgerAdditionPrice;
            System.out.println("Added "+this.healthyBurgerAddition1+ " for an extra"+this.healthyBurgerAdditionPrice);
        }
        if(this.healthyBurgerAddition2!=null){
            hamBurgerPrice+=this.healthyBurgerAdditionPrice2;
            System.out.println("Added "+this.healthyBurgerAddition2+ " for an extra"+this.healthyBurgerAdditionPrice2);
        }
        return hamBurgerPrice;
    }
}
