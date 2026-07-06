import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("hello");
        list.add("kp");
        list.add("how are you");
        list.remove(1);
        list.remove("kp");
        list.add(1,"jeeva");
        list.addLast("rag");
        list.addFirst("pizza");
        List<String> name =  new ArrayList<>(Arrays.asList("hello","wassupp"));
        list.addAll(0,name);
        list.retainAll(name);
        for (Object n : list) {
            System.out.println(n);
        }
    }
}

