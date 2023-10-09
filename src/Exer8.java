import java.util.Scanner;
public class Exer8
{
    public static void main (String[]args)
    {
        Scanner br = new Scanner(System.in);

        System.out.print("Введите целое число n: ");
        int n = br.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i); //
        }

        System.out.println("Сумма S = " + sum);
    }

}
