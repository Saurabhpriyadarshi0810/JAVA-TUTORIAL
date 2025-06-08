import java.util.Scanner;
public class SumOfTwoNumbers{
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num_1 = ss.nextInt();
        System.out.println("enter the second number:");
        int num_2 = ss.nextInt();
        System.out.println("sum of two number:"+(num_1+num_2));

        ss.close();
    }
}