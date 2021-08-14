package task5.CoffeeMachine;

public class CoffeeMachine {

    String brandName;

    public CoffeeMachine(String brandName) {
        this.brandName = brandName;
    }

    public void brewCoffeeMachine(boolean filter, boolean water, int cupSize, int strength) {

        if (!filter) {
            System.out.println("Clean up filter");
        } else
            if (!water) {
                System.out.println("Add water");
            } else {
                System.out.println("Coffee is brewing...");
                System.out.println("Done. Take your coffee!" + " Size " + cupSize + " strength " + strength);
            }
    }

}
