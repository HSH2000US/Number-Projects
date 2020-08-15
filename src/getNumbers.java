import java.util.Scanner;
public class getNumbers implements getNumbersInterface
{
    private int firstNum;
    private int secondNum;

    public int firstNum()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number >>> ");
        firstNum = sc.nextInt();
        return firstNum;

    }

    public int secondNum()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number >>> ");
        secondNum = sc.nextInt();
        return secondNum;
    }

}
