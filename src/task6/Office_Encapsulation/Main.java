package task6.Office_Encapsulation;

public class Main {

    public static void main(String[] args) {

        Candidate candidate1 = new Candidate("John", "Smith", 35, true);

        //
        String firstName1 = candidate1.getFirstName();
        System.out.println(firstName1);

        int age1 = candidate1.getAge();
        System.out.println(age1);



        // setter
        System.out.println(candidate1.getAge());
        candidate1.setAge(36);
        System.out.println(candidate1.getAge());

        // setter
        candidate1.setDegree(false);
        System.out.println(candidate1.getIsDegree());

    }
}
