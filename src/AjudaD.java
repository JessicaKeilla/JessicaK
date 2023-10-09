public class AjudaD
{
    public static void main (String[]args)
    {
        final int SIZE= 5;
        for (int i=1; i<=SIZE; i++)
        {
            for  (int k=1; k<i; k++)
            System.out.print("- ");

            for (int j=i; j<= SIZE; j++)
                System.out.print(j+ " ");

            System.out.println();



        }
    }
}
