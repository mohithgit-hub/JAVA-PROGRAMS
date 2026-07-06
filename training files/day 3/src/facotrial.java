import java.util.Scanner;
public class facotrial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer value");
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("the factorial is:"+fact);
    }
}
