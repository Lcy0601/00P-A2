import java.util.Comparator;

public class AssignmentTwo {
    public static void main(String[] args) {
    }

    public void partThree() {
        Employee operator = new Employee("John", 30, "123 Main St", "Operator", 50000);
        Ride ride = new Ride("Roller Coaster", operator, 2);

        Visitor v1 = new Visitor("Alice", 25, "456 Elm St", true, "Regular");
        Visitor v2 = new Visitor("Bob", 28, "789 Oak St", false, "VIP");
        Visitor v3 = new Visitor("Charlie", 32, "321 Pine St", true, "Regular");
        Visitor v4 = new Visitor("David", 27, "555 Cedar St", false, "Regular");
        Visitor v5 = new Visitor("Eve", 24, "888 Maple St", true, "VIP");

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        ride.removeVisitorFromQueue(v3);
        ride.printQueue();
    }

    public void partFourA() {
        Employee operator = new Employee("Tom", 35, "999 Street", "Operator", 55000);
        Ride ride = new Ride("Thunderstorm", operator, 4);

        Visitor v1 = new Visitor("Frank", 26, "111 Ave", true, "Regular");
        Visitor v2 = new Visitor("Grace", 29, "222 Blvd", false, "VIP");
        Visitor v3 = new Visitor("Henry", 31, "333 Rd", true, "Regular");
        Visitor v4 = new Visitor("Ivy", 23, "444 Ln", false, "Regular");
        Visitor v5 = new Visitor("Jack", 27, "555 Way", true, "VIP");

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        System.out.println("Is visitor in history? " + ride.checkVisitorFromHistory(v3));
        System.out.println("Number of visitors in history: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }

    public void partFourB() {
        Employee operator = new Employee("Sam", 33, "777 Place", "Operator", 52000);
        Ride ride = new Ride("Spinning Ride", operator, 3);

        Visitor v1 = new Visitor("Katie", 22, "666 Drive", true, "Regular");
        Visitor v2 = new Visitor("Leo", 25, "888 Circle", false, "VIP");
        Visitor v3 = new Visitor("Mia", 24, "999 Square", true, "Regular");
        Visitor v4 = new Visitor("Nora", 26, "1010 Path", false, "Regular");
        Visitor v5 = new Visitor("Oliver", 28, "1111 Trail", true, "VIP");

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        ride.printRideHistory();

        // 自定义比较器，这里简单按照年龄比较，你可以根据更多属性修改
        Comparator<Visitor> comparator = (v1, v2) -> v1.getAge() - v2.getAge();
        ride.sortRideHistory(comparator);

        ride.printRideHistory();
    }

    public void partFive() {
        Employee operator = new Employee("Peter", 38, "2345 St", "Operator", 58000);
        Ride ride = new Ride("Big Wheel", operator, 5);

        Visitor v1 = new Visitor("Quinn", 21, "3456 Ave", true, "Regular");
        Visitor v2 = new Visitor("Ryan", 20, "4567 Blvd", false, "VIP");
        Visitor v3 = new Visitor("Sarah", 23, "5678 Rd", true, "Regular");
        Visitor v4 = new Visitor("Tyler", 22, "6789 Ln", false, "Regular");
        Visitor v5 = new Visitor("Ulysses", 24, "7890 Way", true, "VIP");
        Visitor v6 = new Visitor("Violet", 25, "8901 Drive", false, "Regular");
        Visitor v7 = new Visitor("Wendy", 26, "9012 Circle", true, "VIP");
        Visitor v8 = new Visitor("Xavier", 27, "0123 Square", false, "Regular");
        Visitor v9 = new Visitor("Yvonne", 28, "1234 Path", true, "VIP");
        Visitor v10 = new Visitor("Zachary", 29, "2345 Trail", false, "Regular");

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);
        ride.addVisitorToQueue(v6);
        ride.addVisitorToQueue(v7);
        ride.addVisitorToQueue(v8);
        ride.addVisitorToQueue(v9);
        ride.addVisitorToQueue(v10);

        ride.printQueue();

        ride.runOneCycle();

        ride.printQueue();
        ride.printRideHistory();
    }

    public void partSix() {
        Employee operator = new Employee("Adam", 32, "1357 St", "Operator", 53000);
        Ride ride = new Ride("Water Slide", operator, 3);

        Visitor v1 = new Visitor("Brandon", 23, "2468 Ave", true, "Regular");
        Visitor v2 = new Visitor("Cara", 25, "3579 Blvd", false, "VIP");
        Visitor v3 = new Visitor("Daniel", 27, "4680 Rd", true, "Regular");
        Visitor v4 = new Visitor("Ella", 29, "5791 Ln", false, "Regular");
        Visitor v5 = new Visitor("Franklin", 31, "6802 Way", true, "VIP");

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        ride.exportRideHistory();
    }

    public void partSeven() {
        Employee operator = new Employee("Adam", 32, "1357 St", "Operator", 53000);
        Ride ride = new Ride("Water Slide", operator, 3);

        ride.importRideHistory();

        System.out.println("Number of visitors in ride history after import: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }
}
//import java.util.Collections;
//import java.util.Comparator;
//public class AssignmentTwo {
//
//
//    public void partThree() {
//        Employee operator = new Employee("John", 30, "Male", 1001, "Rides Department");
//        Ride rollerCoaster = new Ride("Roller Coaster", 50, operator, 2);
//        Visitor v1 = new Visitor("Alice", 25, "Female", 2001, "Full");
//        Visitor v2 = new Visitor("Bob", 28, "Male", 2002, "Full");
//        Visitor v3 = new Visitor("Carol", 22, "Female", 2003, "Full");
//        Visitor v4 = new Visitor("David", 27, "Male", 2004, "Full");
//        Visitor v5 = new Visitor("Eve", 24, "Female", 2005, "Full");
//        rollerCoaster.addVisitorToQueue(v1);
//        rollerCoaster.addVisitorToQueue(v2);
//        rollerCoaster.addVisitorToQueue(v3);
//        rollerCoaster.addVisitorToQueue(v4);
//        rollerCoaster.addVisitorToQueue(v5);
//        rollerCoaster.printQueue();
//        rollerCoaster.removeVisitorFromQueue();
//        rollerCoaster.printQueue();
//    }
//
//    public void partFourA() {
//        Employee operator = new Employee("John", 30, "Male", 1001, "Rides Department");
//        Ride rollerCoaster = new Ride("Roller Coaster", 50, operator, 2);
//        Visitor v1 = new Visitor("Alice", 25, "Female", 2001, "Full");
//        Visitor v2 = new Visitor("Bob", 28, "Male", 2002, "Full");
//        Visitor v3 = new Visitor("Carol", 22, "Female", 2003, "Full");
//        Visitor v4 = new Visitor("David", 27, "Male", 2004, "Full");
//        Visitor v5 = new Visitor("Eve", 24, "Female", 2005, "Full");
//        rollerCoaster.addVisitorToHistory(v1);
//        rollerCoaster.addVisitorToHistory(v2);
//        rollerCoaster.addVisitorToHistory(v3);
//        rollerCoaster.addVisitorToHistory(v4);
//        rollerCoaster.addVisitorToHistory(v5);
//        rollerCoaster.checkVisitorFromHistory(v3);
//        rollerCoaster.numberOfVisitors();
//        rollerCoaster.printRideHistory();
//    }
//
//    public void partFourB() {
//        Employee operator = new Employee("John", 30, "Male", 1001, "Rides Department");
//        Ride rollerCoaster = new Ride("Roller Coaster", 50, operator, 2);
//        Visitor v1 = new Visitor("Alice", 25, "Female", 2001, "Full");
//        Visitor v2 = new Visitor("Bob", 28, "Male", 2002, "Full");
//        Visitor v3 = new Visitor("Carol", 22, "Female", 2003, "Full");
//        Visitor v4 = new Visitor("David", 27, "Male", 2004, "Full");
//        Visitor v5 = new Visitor("Eve", 24, "Female", 2005, "Full");
//        rollerCoaster.addVisitorToHistory(v1);
//        rollerCoaster.addVisitorToHistory(v2);
//        rollerCoaster.addVisitorToHistory(v3);
//        rollerCoaster.addVisitorToHistory(v4);
//        rollerCoaster.addVisitorToHistory(v5);
//        rollerCoaster.printRideHistory();

//        Comparator<Visitor> visitorComparator = new Comparator<Visitor>() {
//            @Override
//            public int compare(Visitor v1, Visitor v2) {
//                return v1.getAge() - v2.getAge();
//            }
//        };
//        Collections.sort(rollerCoaster.rideHistory, visitorComparator);
//        rollerCoaster.printRideHistory();
//    }
//
//    public void partFive() {
//        Employee operator = new Employee("John", 30, "Male", 1001, "Rides Department");
//        Ride rollerCoaster = new Ride("Roller Coaster", 50, operator, 2);
//        Visitor v1 = new Visitor("Alice", 25, "Female", 2001, "Full");
//        Visitor v2 = new Visitor("Bob", 28, "Male", 2002, "Full");
//        Visitor v3 = new Visitor("Carol", 22, "Female", 2003, "Full");
//        Visitor v4 = new Visitor("David", 27, "Male", 2004, "Full");
//        Visitor v5 = new Visitor("Eve", 24, "Female", 2005, "Full");
//        Visitor v6 = new Visitor("Frank", 29, "Male", 2006, "Full");
//        Visitor v7 = new Visitor("Grace", 23, "Female", 2007, "Full");
//        Visitor v8 = new Visitor("Henry", 26, "Male", 2008, "Full");
//        Visitor v9 = new Visitor("Ivy", 21, "Female", 2009, "Full");
//        Visitor v10 = new Visitor("Jack", 27, "Male", 2010, "Full");
//        rollerCoaster.addVisitorToQueue(v1);
//        rollerCoaster.addVisitorToQueue(v2);
//        rollerCoaster.addVisitorToQueue(v3);
//        rollerCoaster.addVisitorToQueue(v4);
//        rollerCoaster.addVisitorToQueue(v5);
//        rollerCoaster.addVisitorToQueue(v6);
//        rollerCoaster.addVisitorToQueue(v7);
//        rollerCoaster.addVisitorToQueue(v8);
//        rollerCoaster.addVisitorToQueue(v9);
//        rollerCoaster.addVisitorToQueue(v10);
//        rollerCoaster.printQueue();
//        rollerCoaster.runOneCycle();
//        rollerCoaster.printQueue();
//        rollerCoaster.printRideHistory();
//    }
//
//    public void partSix() {
//        Employee operator = new Employee("John", 30, "Male", 1001, "Rides Department");
//        Ride rollerCoaster = new Ride("Roller Coaster", 50, operator, 2);
//        Visitor v1 = new Visitor("Alice", 25, "Female", 2001, "Full");
//        Visitor v2 = new Visitor("Bob", 28, "Male", 2002, "Full");
//        Visitor v3 = new Visitor("Carol", 22, "Female", 2003, "Full");
//        Visitor v4 = new Visitor("David", 27, "Male", 2004, "Full");
//        Visitor v5 = new Visitor("Eve", 24, "Female", 2005, "Full");
//        rollerCoaster.addVisitorToHistory(v1);
//        rollerCoaster.addVisitorToHistory(v2);
//        rollerCoaster.addVisitorToHistory(v3);
//        rollerCoaster.addVisitorToHistory(v4);
//        rollerCoaster.addVisitorToHistory(v5);
//        rollerCoaster.exportRideHistory();
//    }
//
//    public void partSeven() {
//        Employee operator = new Employee("John", 30, "Male", 1001, "Rides Department");
//        Ride rollerCoaster = new Ride("Roller Coaster", 50, operator, 2);
//        rollerCoaster.importRideHistory();
//        rollerCoaster.numberOfVisitors();
//        rollerCoaster.printRideHistory();
//    }
//
//
//    public static void main(String[] args) {
//        AssignmentTwo assignmentTwo = new AssignmentTwo();
//        System.out.println("+++++++++++++++++partThree++++++++++++++++++++");
//
//        assignmentTwo.partThree();
//        System.out.println("+++++++++++++++++partFourA()++++++++++++++++++++");
//
//        assignmentTwo.partFourA();
//        System.out.println("+++++++++++++++++partFourB++++++++++++++++++++");
//        assignmentTwo.partFourB();
//        System.out.println("+++++++++++++++++partFive++++++++++++++++++++");
//        assignmentTwo.partFive();
//        System.out.println("++++++++++++++++++partSix+++++++++++++++++++");
//        assignmentTwo.partSix();
//        System.out.println("++++++++++++++++++partSeven+++++++++++++++++++");
//        assignmentTwo.partSeven();
//    }
//
//}