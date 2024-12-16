public class Visitor extends Person {
    private boolean isFirstTime;
    private String ticketType;

    
    public Visitor() {
    }

    
    public Visitor(String name, int age, String address, boolean isFirstTime, String ticketType) {
        super(name, age, address);
        this.isFirstTime = isFirstTime;
        this.ticketType = ticketType;
    }

    
    public boolean isFirstTime() {
        return isFirstTime;
    }

    public String getTicketType() {
        return ticketType;
    }

    
    public void setFirstTime(boolean isFirstTime) {
        this.isFirstTime = isFirstTime;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}

//class Visitor extends Person {
//    private int visitorId;
//    private String ticketType;
//
//    public Visitor() {}
//
//    public Visitor(String name, int age, String gender, int visitorId, String ticketType) {
//        super(name, age, gender);
//        this.visitorId = visitorId;
//        this.ticketType = ticketType;
//    }
//
//    public int getVisitorId() {
//        return visitorId;
//    }
//
//    public void setVisitorId(int visitorId) {
//        this.visitorId = visitorId;
//    }
//
//    public String getTicketType() {
//        return ticketType;
//    }
//
//    public void setTicketType(String ticketType) {
//        this.ticketType = ticketType;
//    }
//}