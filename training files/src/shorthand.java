import java.util.Scanner;
public class shorthand {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = s.nextInt();
        String rs = (n%2==0)? "Even":"Odd";
        System.out.println(rs);
    }
}
