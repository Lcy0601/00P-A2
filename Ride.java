import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Ride implements RideInterface {
    private String rideName;
    private Employee operator;
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;
    private int maxRider;
    private int numOfCycles;

    public Ride() {
        waitingLine = new LinkedList<>();
        rideHistory = new LinkedList<>();
        numOfCycles = 0;
    }


    public Ride(String rideName, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = 0;
    }


    public String getRideName() {
        return rideName;
    }

    public Employee getOperator() {
        return operator;
    }

    public Queue<Visitor> getWaitingLine() {
        return waitingLine;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }


    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

  
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor!= null) {
            waitingLine.add(visitor);
            System.out.println(visitor.getName() + " has been added to the queue successfully.");
        } else {
            System.out.println("Failed to add visitor to the queue. Visitor is null.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingLine.remove(visitor)) {
            System.out.println(visitor.getName() + " has been removed from the queue successfully.");
        } else {
            System.out.println("Failed to remove visitor from the queue. Visitor not found.");
        }
    }

    // 实现接口中的printQueue方法
    @Override
    public void printQueue() {
        System.out.println("Visitors in the queue for " + rideName + ":");
        for (Visitor v : waitingLine) {
            System.out.println("Name: " + v.getName() + ", Age: " + v.getAge() + ", Address: " + v.getAddress());
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor!= null) {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " has been added to ride history successfully.");
        } else {
            System.out.println("Failed to add visitor to ride history. Visitor is null.");
        }
    }


    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    
    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor v = iterator.next();
            System.out.println("Name: " + v.getName() + ", Age: " + v.getAge() + ", Address: " + v.getAddress());
        }
    }

    
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("Cannot run the ride. No operator assigned.");
            return;
        }
        if (waitingLine.isEmpty()) {
            System.out.println("Cannot run the ride. No visitors in the waiting line.");
            return;
        }
        int numToRemove = Math.min(maxRider, waitingLine.size());
        for (int i = 0; i < numToRemove; i++) {
            Visitor visitor = waitingLine.poll();
            addVisitorToHistory(visitor);
        }
        numOfCycles++;
        System.out.println("One cycle of the ride has been run successfully.");
    }

    
    public void exportRideHistory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rideName + "_history.csv"))) {
            for (Visitor v : rideHistory) {
                writer.write(v.getName() + "," + v.getAge() + "," + v.getAddress() + "\n");
            }
            System.out.println("Ride history has been exported successfully.");
        } catch (IOException e) {
            System.out.println("Failed to export ride history: " + e.getMessage());
        }
    }

 
    public void importRideHistory() {
        File file = new File(rideName + "_history.csv");
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String address = parts[2];
                Visitor visitor = new Visitor(name, age, address, false, "");
                addVisitorToHistory(visitor);
            }
            System.out.println("Ride history has been imported successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Failed to import ride history: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing data from file: " + e.getMessage());
        }
    }

    
    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
    }
}
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.Queue;
//

//class Ride implements RideInterface {
//    private String rideName;
//    private int maxCapacity;
//    private Employee operator;
//    private Queue<Visitor> waitingLine;
//    public LinkedList<Visitor> rideHistory;
//    private int maxRider;
//    private int numOfCycles;
//
//    public Ride() {
//        waitingLine = new LinkedList<>();
//        rideHistory = new LinkedList<>();
//        numOfCycles = 0;
//    }
//
//    public Ride(String rideName, int maxCapacity, Employee operator, int maxRider) {
//        this.rideName = rideName;
//        this.maxCapacity = maxCapacity;
//        this.operator = operator;
//        this.waitingLine = new LinkedList<>();
//        this.rideHistory = new LinkedList<>();
//        this.maxRider = maxRider;
//        this.numOfCycles = 0;
//    }
//
//    public String getRideName() {
//        return rideName;
//    }
//
//    public void setRideName(String rideName) {
//        this.rideName = rideName;
//    }
//
//    public int getMaxCapacity() {
//        return maxCapacity;
//    }
//
//    public void setMaxCapacity(int maxCapacity) {
//        this.maxCapacity = maxCapacity;
//    }
//
//    public Employee getOperator() {
//        return operator;
//    }
//
//    public void setOperator(Employee operator) {
//        this.operator = operator;
//    }
//
//    public int getMaxRider() {
//        return maxRider;
//    }
//
//    public void setMaxRider(int maxRider) {
//        this.maxRider = maxRider;
//    }
//
//    
//    @Override
//    public void addVisitorToQueue(Visitor visitor) {
//        waitingLine.add(visitor);
//        System.out.println(visitor.getName() + " added to the waiting line.");
//    }
//
//    
//    @Override
//    public void removeVisitorFromQueue() {
//        if (waitingLine.isEmpty()) {
//            System.out.println("The waiting line is empty.");
//        } else {
//            Visitor removedVisitor = waitingLine.poll();
//            System.out.println(removedVisitor.getName() + " removed from the waiting line.");
//        }
//    }
//
//    
//    @Override
//    public void printQueue() {
//        System.out.println("Visitors in the waiting line:");
//        for (Visitor v : waitingLine) {
//            System.out.println(v.getName());
//        }
//    }
//
//    
//    @Override
//    public void runOneCycle() {
//        if (operator == null) {
//            System.out.println("No operator assigned to the ride.");
//            return;
//        }
//        if (waitingLine.isEmpty()) {
//            System.out.println("No visitors in the waiting line.");
//            return;
//        }
//        int numToRemove = Math.min(maxRider, waitingLine.size());
//        for (int i = 0; i < numToRemove; i++) {
//            Visitor visitor = waitingLine.poll();
//            rideHistory.add(visitor);
//        }
//        numOfCycles++;
//        System.out.println("Run one cycle, added " + numToRemove + " visitors to ride history.");
//    }
//
//    
//    @Override
//    public void addVisitorToHistory(Visitor visitor) {
//        rideHistory.add(visitor);
//        System.out.println(visitor.getName() + " added to ride history.");
//    }
//
//    
//    @Override
//    public boolean checkVisitorFromHistory(Visitor visitor) {
//        return rideHistory.contains(visitor);
//    }
//
//    
//    @Override
//    public int numberOfVisitors() {
//        return rideHistory.size();
//    }
//
//    
//    @Override
//    public void printRideHistory() {
//        System.out.println("Ride history:");
//        for (Visitor v : rideHistory) {
//            System.out.println(v.getName());
//        }
//    }
//
//    
//    public void exportRideHistory() {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rideName + ".csv"))) {
//            for (Visitor v : rideHistory) {
//                writer.write(v.getName() + "," + v.getAge() + "," + v.getGender() + "," + v.getVisitorId() + "," + v.getTicketType());
//                writer.newLine();
//            }
//            System.out.println("Ride history exported successfully.");
//        } catch (IOException e) {
//            System.out.println("Error exporting ride history: " + e.getMessage());
//        }
//    }
//
//    
//    public void importRideHistory() {
//        try (BufferedReader reader = new BufferedReader(new FileReader(rideName + ".csv"))) {
//            String line;
//            while ((line = reader.readLine())!= null) {
//                String[] parts = line.split(",");
//                Visitor visitor = new Visitor(parts[0], Integer.parseInt(parts[1]), parts[2], Integer.parseInt(parts[3]), parts[4]);
//                rideHistory.add(visitor);
//            }
//            System.out.println("Ride history imported successfully.");
//        } catch (IOException e) {
//            System.out.println("Error importing ride history: " + e.getMessage());
//        }
//    }
//}
