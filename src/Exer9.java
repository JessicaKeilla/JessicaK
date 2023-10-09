import java.util.Scanner;

public class Exer9
{
    public static void main (String[]args)
    {
        Scanner br = new Scanner(System.in);
        double eps= br.nextDouble();
        double sum= 0.0;
        int k=1;// 1,3,5,7...
        int sign = +1;
        while(1.0/k>= eps)
        {
            sum=sum+1.0/k*sign;
            k=k+2;
            sign=-sign;

        }
    }

}
