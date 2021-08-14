package task3.Cat;

public class Cat {

    // field
    String name;
    int age;

    // constructor
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }


    // methods
    public void sayHello(){
        System.out.println("Hello guys. My name is " + name);
        System.out.println("My age is " + age + " years");
    }

    public void twoByTwo(){
        System.out.println("2 * 2 = 4");
    }

    public void textCat(){
        System.out.println("In ancient times cats were worshipped as gods; they have not forgotten this.” – Terry Pratchett\n" +
                "“I had been told that the training procedure with cats was difficult. It’s not. Mine had me trained in two days.” – Bill Dana\n" +
                "“Cats are inquisitive, but hate to admit it.” – Mason Cooley\n" +
                "“As anyone who has ever been around a cat for any length of time well knows, cats have enormous patience with the limitations of the humankind.” – Cleveland Amory\n" +
                "“I have studied many philosophers and many cats. The wisdom of cats is infinitely superior.” – Hippolyte Taine");
    }

    public void sum(int a, int b) {
        int result = a + b;
        System.out.println("Our result is " + result);
    }


    public void mult(int a, int b) {
        int result = a * b;
        System.out.println("Our result is " + result );
    }

    public void saySomething(String word) {
        System.out.println("I can say " + word);
    }

    public void numberOddOrEven(int number) {
        if (number % 2 != 0) {
            System.out.println(number + " is Odd number");
        } else {
            System.out.println(number + " is Even number");
        }
    }

}
