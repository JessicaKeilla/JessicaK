import java.util.Scanner;

public class Exer6
{
    public static void main(String[] args)
    {
        Scanner  br= new Scanner(System.in);
        int negative = 0;
        int sumTwoDigit= 0;
        double smallestNumber = Double.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double number = br.nextDouble();

            if (number < 0) {
                negative++;
            }

            if (number >= 10 && number <= 99) {
                sumTwoDigit += number;
            }

            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        System.out.println("a) Number of negative numbers: " + negative);
        System.out.println("b) Sum of two-digit numbers: " + sumTwoDigit);
        System.out.println("c) Smallest number among all entered numbers: " + smallestNumber);

    }
}
