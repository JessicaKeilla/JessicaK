import java.util.Scanner;

public class whilee
{
    public static void main (String[]args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("n раз");
        int n= br.nextInt();
        int i= 1;

        while (i<n)
        {
            System.out.println("Hello"+i);
            i++;
        }
    }
}
