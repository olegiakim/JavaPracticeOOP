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

    // getter
    public String getFirstName() {return firstName;}

    public int getAge() {return age;}

    public boolean getIsDegree() { return isDegree;}

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDegree(boolean isDegree) {
        this.isDegree = isDegree;
    }


}
