import java.util.Scanner;

public class Exer3c
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        System.out.println("put the value");
        double x= 0.0;

        for (int i=1; i<=Math.PI*2; i++)
        {
            double y=Math.cos(x);
            System.out.println(x +  "диапазоне"  + y);
            x +=Math.PI/6;
        }
    }
}
