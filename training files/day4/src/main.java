import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = sc.nextInt();
        int original = n;
        int r = reverse(n);
        boolean p = palindrome(r, original);
        if(p==true){
            System.out.println("the given is a palindrome");
        }
        else{
            System.out.println("the given is not a palindrome");
        }

    }
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            rev = (rev * 10) + a;
        }
        return rev;
    }

    static boolean palindrome(int n, int o){

        if(n==o){
            return true;
        }
        else{
            return false;
        }
    }
}
