import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter your lucky number:");
        // int num_1 =sc.nextInt();
        // System.out.println("your lucky number is :"+num_1);

        System.out.println("enter your name:");
        String  name = sc.nextLine();
        System.out.println("your name is:"+ name);

        sc.close();
    }
}
