import java.util.Scanner;

public class Exer5
{
    public static void main(String[] args)
    {
        Scanner br= new Scanner(System.in);
        System.out.print("Enter the boat's carrying capacity (kg): ");
        double boatCapacity = br.nextDouble();

        System.out.print("How many passengers are in line: ");
        int numberOfPassengers = br.nextInt();

        double totalW = 0.0;
        int passengerB = 0;

        for (int i = 1; i <= numberOfPassengers; i++) {
            System.out.print("weight of passenger " + i + " (kg): ");
            double passengerW = br.nextDouble();

            if (passengerW + totalW <= boatCapacity) {
                passengerB++;
                totalW += passengerW;
            } else {
                break;
            }
        }

        System.out.println(passengerB+ " passengers able to board .");
        System.out.println("Total weight of boarded passengers: " + totalW + " kg.");

    }
}
