import java.util.Scanner;
public class Subtract
{
    public static void main(String[] args)
    {
        int number1,number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        System.out.printf("%s - %s = %s",number1,number2,number1-number2);
        input.close();
        
    }
}