import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int u = n%10;
        int a = (n-u)/10;
        int t = a%10;
        int h = a-t;
        int c = h/10;

        System.out.println("The reversed number is :"+u+t+c);
    }

}
