import java.util.Scanner;
public class checkthegreatestdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = sc.nextInt();
        int gr = 0;
        while(n!=0){
            int a = n%10;
            if(a>gr){
                gr = a;
            }
            n = n/10;
        }
        System.out.println("the greatest digit is:"+gr);
    }
}
