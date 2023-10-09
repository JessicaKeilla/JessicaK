import java.util.Scanner;

public class Exer2
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        System.out.println("покажи  число квадрат или куб в экран ");
        int  n2, n3;

        for (int i=1; i<=10; i++)
        {
            n2= i*i;
            n3=n2*i;
            System.out.println(i + "квадрат" + n2 + "куб" + n3);
        }






    }
}
