public class checkvowelsandconsonants {
    public static void main(String[] args){
        int vowel=0;
        int consonant = 0;
        String name = "krIshn aprAsad";
        String s1 = name.toLowerCase();
        char[] c = s1.toCharArray();
        for(char n:c){
            if(n=='i' || n =='o' || n=='a' || n=='e' || n=='u'){
                vowel++;
            }
            else  if(n==' '){
                continue;
            }
            else{
                consonant++;
            }
        }
        System.out.println("vowel:"+vowel);
        System.out.println("consonant:"+consonant);
    }
}
