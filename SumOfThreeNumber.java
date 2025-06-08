import java.util.Scanner;
public class SumOfThreeNumber {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.println("enter first number:");
        int num_1 = ss.nextInt();
        System.out.println("enter second number:");
        int num_2 = ss.nextInt();
        System.out.println("enter third  number:");
        int num_3 = ss.nextInt();

        int sum = num_1 + num_2 +num_3 ;

        System.out.println("sum of three numbers :"+sum);
        ss.close();
    }
}
