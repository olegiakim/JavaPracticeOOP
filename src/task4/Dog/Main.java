package task4.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Jack");
        //
        dog1.twoPlusTwo();
        //
        dog1.sumTwoNumber(10, 20);
        //
        int result = dog1.sum(5, 5);
        System.out.println(result);
        System.out.println(result * 2);

    }
}
