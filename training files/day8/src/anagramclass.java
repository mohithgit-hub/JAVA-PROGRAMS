import java.util.Arrays;

public class anagramclass {
    public static void main(String[] args){
        String s = "listen";
        String s2 = "silent";
        char [] c1 = s.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);


        if(Arrays.equals(c1,c2)){
            System.out.println("is an anagram");
        }
        else{
            System.out.println("not an anagram");
        }
    }
}
