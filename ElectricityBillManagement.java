import java.util.Scanner;

class ElectricityBillManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ELECTRICITY BILL MANAGEMENT =====");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double energyCharge;

        if (units <= 100) {
            energyCharge = units * 2.0;
        } 
        else if (units <= 200) {
            energyCharge = (100 * 2.0) + ((units - 100) * 3.0);
        } 
        else if (units <= 300) {
            energyCharge = (100 * 2.0)
                         + (100 * 3.0)
                         + ((units - 200) * 5.0);
        } 
        else {
            energyCharge = (100 * 2.0)
                         + (100 * 3.0)
                         + (100 * 5.0)
                         + ((units - 300) * 7.0);
        }

        double fixedCharge = 100;
        double totalBill = energyCharge + fixedCharge;

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Customer Name : " + name);
        System.out.println("Customer ID   : " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Energy Charge : " + energyCharge);
        System.out.println("Fixed Charge  : " + fixedCharge);
        System.out.println("Total Bill    : " + totalBill);

        sc.close();
    }
}
