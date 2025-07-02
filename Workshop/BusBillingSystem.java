package Workshop;
import java.util.Scanner;

public class BusBillingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bus Booking System");

        String continueBooking = "yes";

        while (continueBooking.equalsIgnoreCase("yes")) {
            System.out.println("Available destinations:");
            System.out.println("1. Delhi");
            System.out.println("2. Agra");
            System.out.println("3. Jaipur");
            System.out.println("4. Faridabad");
            System.out.println("5. Noida");

            System.out.print("Enter your destination name: ");
            String destination = scanner.next().toLowerCase();

            int distanceInKm = 0;

            switch (destination) {
                case "delhi":
                    distanceInKm = 150;
                    destination = "Delhi";
                    break;
                case "agra":
                    distanceInKm = 100;
                    destination = "Agra";
                    break;
                case "jaipur":
                    distanceInKm = 250;
                    destination = "Jaipur";
                    break;
                case "faridabad":
                    distanceInKm = 120;
                    destination = "Faridabad";
                    break;
                case "noida":
                    distanceInKm = 200;
                    destination = "Noida";
                    break;
                default:
                    System.out.println("Invalid destination. Booking cancelled.");
                    continue; // restart the loop
            }

            System.out.print("Enter fare per km: Rs ");
            int price = scanner.nextInt();

            System.out.print("Enter the number of passengers: ");
            int passenger = scanner.nextInt();

            if (price <= 0 || passenger <= 0) {
                System.out.println("Invalid fare or number of passengers. Booking cancelled.");
                continue; 
            }

            int farePerPerson = distanceInKm * price;
            int totalFare = farePerPerson * passenger;

            System.out.println("\n----- Booking Summary -----");
            System.out.println("Destination: " + destination);
            System.out.println("Distance: " + distanceInKm + " km");
            System.out.println("Fare per km: Rs. " + price);
            System.out.println("Fare per person: Rs. " + farePerPerson);
            System.out.println("Number of passengers: " + passenger);
            System.out.println("Total Fare: Rs. " + totalFare);
            System.out.println("Booking Confirmed. Have a safe journey!");

            System.out.println("Do you want to book another destination? (yes/no): ");
            continueBooking = scanner.next().toLowerCase();
        }

        System.out.println("Thank you for using the Bus Booking System!");
        scanner.close();
    }
}

