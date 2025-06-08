import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner ss  = new Scanner (System.in);
        System.out.println("enter  principle  amount:");
        int principle = ss.nextInt();
        System.out.println("enter  rate :");
        Float rate =  ss.nextFloat();
        System.out.println("enter  time :");
        int time = ss. nextInt();

     float si  = (principle*rate*time)/100 ;
    System.out.println("si = "+si);
        ss.close();
    }
}
