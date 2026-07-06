import java.util.Scanner;
public class binarytriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o=0;
        int g=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i==1){
                    System.out.print("1");
                }
                else if(i!=1)
                {
                    System.out.print("0");
                }
                else if(i==n-1){
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
