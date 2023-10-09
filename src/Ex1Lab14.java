public class Ex1Lab14
{
    public static void main (String[]args) {
        final int SIZE = 12;
        for (int x = 1; x <= SIZE; x++) {
            for (int y = 1; y <= SIZE; y++) {
                {
                    int z = x * y;
                    if (z < 10) System.out.print("");
                    if (z < 100) System.out.print("");
                    System.out.println("" + z);
                }
                System.out.println();
            }

        }
    }
}
