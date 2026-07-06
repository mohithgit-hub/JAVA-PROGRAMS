import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit of the three digit number:");
        int a = sc.nextInt();
        System.out.println("Enter the second digit:");
        int b = sc.nextInt();
        System.out.println("Enter the third digit:");
        int c = sc.nextInt();

        int f = c;
        int s = b;
        int t = a;

        System.out.println("The reversed number is:"+f+s+t);
    }
}