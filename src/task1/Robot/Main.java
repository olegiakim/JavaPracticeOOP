package task1.Robot;

public class Main {
    public static void main(String[] args) {

        //    stack                    Heap
       Robot robot1 = new Robot("John","r1", 5, "blue", "red", true);
       Robot robot2 = new Robot("Jack","r2", 6, "green", "white", false);
       Robot robot3 = new Robot("John","r3", 4, "pink", "white", true);


       Robot robot4 = new Robot("Mark", "rts32", 10, "black", "white", true);


        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);

        //open

        System.out.println(robot4.name);
        System.out.println(robot4.model);
        System.out.println(robot4.height);
        System.out.println(robot4.pantColor);
        System.out.println(robot4.tShirt);
        System.out.println(robot4.isCap);
        ;
    }


}
