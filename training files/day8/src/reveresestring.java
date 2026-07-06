public class reveresestring {
    public static void main(String[] args){
        String name = "malayalam";

        char[] arr = name.toCharArray();
        int left=0;
        int right = arr.length-1;
        while(right>=left){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String s = new String(arr);
        if(s.equals(name)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
