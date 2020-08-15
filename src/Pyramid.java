
public class Pyramid
{
    public static void main (String args[])
    {



        int odd = 1;
        int noOfSpaces = 9;

        for (int i = 1; i <= 10; i++ )
        {
            int k = 0;
            for (int j = 1; j <= noOfSpaces; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= odd; j++)
            {
                if (j <= i)
                {
                    k = k + 1;
                }
                else
                {
                    k = k - 1;
                }
                System.out.print(k);
            }
            System.out.println();
            odd += 2;
            noOfSpaces-=1;
        }
    }
}