public class linearsearch {
    public static void main(String[] args){
        int[] n ={1,2,3,4,5,6,7,8,9,10};
        int key=10;
        int j = n.length;
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                System.out.println("found");
            }
            else if(n[i]!=key && i>=n.length-1){
                System.out.println("not found");
            }
            else{

            }
        }
    }
}
