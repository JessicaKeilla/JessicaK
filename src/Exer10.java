import java.util.Scanner;

public class Exer10
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        double x= br.nextDouble();
        int n = br.nextInt();
        double res= 0.0;


        int i=1;
        while (1<=n)
        {
            res = Math.cos(x+res);
            i++;
        }
        System.out.println("res");
    }
}
