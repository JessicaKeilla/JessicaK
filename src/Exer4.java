import java.util.Scanner;

public class Exer4
{
    public static void main (String[]args)
    {
        Scanner br = new Scanner(System.in);
        double[] temps = {36.6, 37.5, 31.8, 42.5, 30.0};

        for (int i = 0; i < temps.length; i++) {
            double temp = temps[i];

            if (temp == 36.6) {
                System.out.println("Пациент " + (i + 1) + ": ЗДОРОВ");
            } else if (temp >= 32.0 && temp <= 42.0) {
                System.out.println("Пациент " + (i + 1) + ": БОЛЕН");
            } else {
                System.out.println("Пациент " + (i + 1) + ": МЕРТВ");
            }
        }
    }
}
