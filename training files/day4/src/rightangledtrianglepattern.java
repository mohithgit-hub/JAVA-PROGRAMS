import java.util.Scanner;
public class rightangledtrianglepattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=n;j>n-i;j--){
                System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
