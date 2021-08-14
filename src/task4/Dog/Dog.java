package task4.Dog;

public class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void twoPlusTwo() {
        int a = 2;
        int b = 2;
        System.out.println( a + b);
    }

    public void sumTwoNumber(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
