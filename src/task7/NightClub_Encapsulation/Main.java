package task7.NightClub_Encapsulation;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("John", " Smith", 27, true);
        Client client2 = new Client("Maria", "White", 18, true);
        Client client3 = new Client("Mike", "Black", 35, false);

        Admin admin = new Admin();

        // Client #1
        admin.checkClient(client1.getFirstName(), client1.getLastName(), client1.getAge(), client1.getIsId());
        // Client #2
        admin.checkClient(client2.getFirstName(), client2.getLastName(), client2.getAge(), client2.getIsId());
        // Client #3
        admin.checkClient(client3.getFirstName(), client3.getLastName(), client3.getAge(), client3.getIsId());


    }
}
