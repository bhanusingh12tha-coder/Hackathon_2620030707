import java.util.Scanner;

public class SolarMonitor {

    // Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Panel ID (integer): ");
        int panelId = scanner.nextInt();
        
        System.out.print("Enter Energy Generated in kWh (decimal): ");
        double energyGenerated = scanner.nextDouble();
        
        System.out.print("Enter Number of Solar Panels (integer): ");
        int numberOfPanels = scanner.nextInt();
        
        System.out.print("Enter System Status (single character): ");
        char systemStatus = scanner.next().charAt(0);
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy generated in kWh: " + energyGenerated);
        System.out.println("Number of solar panels: " + numberOfPanels);
        System.out.println("System status: " + systemStatus);

        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
        System.out.print("Enter morning energy generation: ");
        double morning = scanner.nextDouble();
        System.out.print("Enter evening energy generation: ");
        double evening = scanner.nextDouble();
        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total energy generated today: " + total + " kWh");
        scanner.close();
    }
}
