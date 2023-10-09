import java.util.Scanner;

public class Exer11
{
    public static void main (String[]args)
    {
        Scanner br= new Scanner(System.in);
        double x= br.nextDouble();
        int n = br.nextInt();
        double raiz= 0.0;


        int i=1;
        while (1<=n)
        {
            raiz = Math.sqrt(x+raiz);
            i++;
        }
        System.out.println("raiz");
    }
}
