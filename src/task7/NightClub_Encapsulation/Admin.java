package task7.NightClub_Encapsulation;

public class Admin {

    public void checkClient(String clientFirstName, String clientLastName, int clientAge, boolean clientIsId) {

        //
        if (clientIsId == false) {
            System.out.println(clientFirstName + " " + clientLastName + " you don't have an id... go home");
        } else {
            if (clientAge >= 21) {
                System.out.println(clientFirstName + " " + clientLastName + " welcome");
            } else {
                System.out.println(clientFirstName + " " + clientLastName + " you're too young... go home");
            }
        }

    }
}
