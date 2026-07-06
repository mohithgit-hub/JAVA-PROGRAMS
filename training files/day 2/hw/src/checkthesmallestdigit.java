import java.util.Scanner;
public class checkthesmallestdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();
        int sm = 9;
        while(n!=0){
            int a = n%10;
            if(a<sm){
                sm = a;
            }
            n = n/10;
        }
        System.out.println("the smallest digit is:"+sm);
    }
}
