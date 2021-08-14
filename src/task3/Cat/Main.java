

package task3.Cat;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 2);
        System.out.println(cat1.name);
        System.out.println(cat1.age);

        cat1.sayHello();
        cat1.twoByTwo();
        cat1.mult(50, 5);


        System.out.println("-----------------------");

        Cat cat2 = new Cat("Murzik", 3);
        cat2.sayHello();
        cat2.twoByTwo();
        cat2.sum(532, 213);

        System.out.println("-----------------------");

        Cat cat3 = new Cat("Pirat", 10);
        cat3.sayHello();
        cat3.twoByTwo();
        cat3.textCat();
        cat3.sum(2,4);
        cat3.saySomething("meow");
        cat3.numberOddOrEven(5);

    }
}
