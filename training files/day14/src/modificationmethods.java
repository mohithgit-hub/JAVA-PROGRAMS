import java.util.*;
public class modificationmethods {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        list.set(1,"bb");
        list.add(2,"b");
        System.out.println(list);
        list.replaceAll(s->s.toUpperCase());
        list.replaceAll(s->s.toLowerCase());
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
