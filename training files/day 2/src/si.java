import java.util.Scanner;
public class si {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p = sc.nextInt();
        System.out.println("enter the interest rate:");
        int r = sc.nextInt();
        System.out.println("Enter the number of years:");
        int y = sc.nextInt();
        int ir = (p*r*y)/100;
        System.out.println("interest rate:"+ir);
    }
}
