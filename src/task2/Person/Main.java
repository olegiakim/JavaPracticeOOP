package task2.Person;

public class Main {


    public static void main(String[] args) {

        Person person1 = new Person("Mark", "Johnson");


        System.out.println(person1.firstName);
        System.out.println(person1.lastName);


        Person person2 = new Person("Mike", 25);


        Person person3 = new Person("White", 30, true);
    }
}

