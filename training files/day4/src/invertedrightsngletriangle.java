import java.util.Scanner;
public class invertedrightsngletriangle {
    public static void main(String[] args){
        System.out.println("enter the upperlimit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}

