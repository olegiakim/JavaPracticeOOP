package task9.Zoo_Inheritance;

public class Dog extends Animal {

    private String bread;

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;
    }

}
