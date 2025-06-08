import  java.util.Scanner;
public class ReadChar {
    public static void main(String[] args) {
        Scanner ss = new Scanner (System.in);
        System.out.println("enter char:");
        char ch = ss.next().charAt(2);
        System.out.println(ch);
        ss.close();
    }
}
