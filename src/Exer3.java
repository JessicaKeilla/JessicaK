import java.util.Scanner;

public class Exer3
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);

        System.out.println("put the number");
        int tC=0;

        while (tC<=100)
        {
            double tF=(9.0)/(5.0) * tC + 32.0;
            System.out.println(tC + "temp" + tF);
            tC +=10;
        }
    }
}
