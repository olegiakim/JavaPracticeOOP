package task6.Office_Encapsulation;

public class Candidate {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isDegree;


    public Candidate(String firstName, String lastName, int age, boolean isDegree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isDegree = isDegree;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }



}
