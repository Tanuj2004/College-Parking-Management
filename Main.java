abstract class ParkingPermit {
    int passId;
    String issueDate;
    String expiryDate;
    String name;
    double parkingFee;
    int spotId;
    int vehicleId;
    String helpNumber;
    public ParkingPermit(int passId, String issueDate, String expiryDate, String name, double parkingFee, int spotId, int vehicleId, String helpNumber) {
        this.passId = passId;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.name = name;
        this.parkingFee = parkingFee;
        this.spotId = spotId;
        this.vehicleId = vehicleId;
        this.helpNumber = helpNumber;
    }
    abstract void createPass();
    abstract void getPass();
}
class Pass extends ParkingPermit {
    public Pass(int passId, String issueDate, String expiryDate, String name, double parkingFee, int spotId, int vehicleId, String helpNumber) {
        super(passId, issueDate, expiryDate, name, parkingFee, spotId, vehicleId, helpNumber);
    }

    void createPass() {
        if (parkingFee <= 0) {
            System.out.println("Error: Invalid parking fee.");
        } else {
            System.out.println("Pass created successfully.");
        }
    }

    void getPass() {
        if (passId <= 0 || spotId <= 0 || vehicleId <= 0) {
            System.out.println("Error: Invalid pass details.");
        } else {
            System.out.println("Pass ID: " + passId);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Expiry Date: " + expiryDate);
            System.out.println("Name: " + name);
            System.out.println("Parking Fee: " + parkingFee);
            System.out.println("Spot ID: " + spotId);
            System.out.println("Vehicle ID: " + vehicleId);
            System.out.println("Help Number: " + helpNumber);
        }
    }
}
class Ticket extends ParkingPermit {

    public Ticket(int passId, String issueDate, String expiryDate, String name, double parkingFee, int spotId, int vehicleId, String helpNumber) {
        super(passId, issueDate, expiryDate, name, parkingFee, spotId, vehicleId, helpNumber);
    }

    void createPass() {
        if (parkingFee <= 0) {
            System.out.println("Error: Invalid parking fee.");
        } else {
            System.out.println("Ticket created successfully.");
        }
    }

    void getPass() {
        if (passId <= 0 || spotId <= 0 || vehicleId <= 0) {
            System.out.println("Error: Invalid ticket details.");
        } else {
            System.out.println("Ticket ID: " + passId);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Expiry Date: " + expiryDate);
            System.out.println("Name: " + name);
            System.out.println("Parking Fee: " + parkingFee);
            System.out.println("Spot ID: " + spotId);
            System.out.println("Vehicle ID: " + vehicleId);
            System.out.println("Help Number: " + helpNumber);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Pass studentPass = new Pass(1, "2024-01-01", "2024-12-31", "John Doe", 500.0, 101, 1001, "123-456-7890");
        Ticket visitorTicket = new Ticket(2, "2024-01-01", "2024-01-01", "Jane Smith", 20.0, 102, 1002, "123-456-7891");

        studentPass.createPass();
        studentPass.getPass();

         //visitorTicket.createPass();
         //visitorTicket.getPass();
    }
}
