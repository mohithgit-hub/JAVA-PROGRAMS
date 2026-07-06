import java.util.Scanner;
public class frequencyofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();
        System.out.println("Enter the value of frequency to be found:");
        int f = sc.nextInt();
        int count = 0;

        while(n!=0){
            int a = n%10;
            if(a==f){
                count++;
            }
            n = n/10;
        }
        System.out.println("the frequency of "+f+" is "+count);
    }
}
