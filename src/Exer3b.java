import java.util.Scanner;

public class Exer3b
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        System.out.println("put the value");

        double x= 0.0;


        do {
            double y=Math.log(x+1.0)*Math.sin(x);

            System.out.println(x + "диапазоне" + y);
            x +=0.5;
        }while(x<=5.0);
    }
    }

