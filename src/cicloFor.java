import java.util.Scanner;

public class cicloFor
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        System.out.println("n раз");
        int n= br.nextInt();


        for (int i=1; i<=n; i++)
        {
            System.out.println("Hello"+i);
        }


    }
}
