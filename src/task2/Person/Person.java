package task2.Person;

public class Person {

    String firstName;
    String lastName;
    int age;
    boolean isDegree;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, int age ) {
        this.firstName = firstName;
        this.age = age;
    }


    public Person(String lastName, int age, boolean isDegree) {
        this.lastName = lastName;
        this.age = age;
        this.isDegree = isDegree;
    }

}
