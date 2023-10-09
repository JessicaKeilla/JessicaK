import java.util.Scanner;

public class doWhile
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        System.out.println("n раз");
        int n= br.nextInt();
        int i= 1;

        do {
            System.out.println("Hello"+i);
            i++;
        }while(i<n);
    }
}
