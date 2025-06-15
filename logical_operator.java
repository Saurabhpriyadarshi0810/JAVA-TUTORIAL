public class logical_operator {
    public static void main(String[] args) {
        int a  = 15 , b = 10 , c = 5;

        System.err.println((a>b)&&(a>c));
        System.err.println((a>b)||(a<c));
        System.err.println(!((a>b)||(a>c)));
    }
    
}
