package task9.Zoo_Inheritance;

public class Rabbit extends Animal {

    private boolean isJump;

    public Rabbit(String name, int age, boolean isJump) {
        super(name, age);
        this.isJump = isJump;
    }

}
