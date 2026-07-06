import java.util.*;
public class arraylistmethods {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.addLast("hi");
        list.addFirst("how are you");
        list.add(0,"1");
        List<String> list2 = new ArrayList<>(Arrays.asList("new","element"));
        list.addAll(0,list2);
        List<String> list3 = new ArrayList<>(Arrays.asList("second","new"));
        list.addAll(list3);

        System.out.println(list);

        list.remove("hello");
        list.remove(2);
        list.removeAll(list3);
        System.out.println(list);
        list.retainAll(list2);
        System.out.println(list);

        List<Integer> listi = new ArrayList<>();
        listi.add(10);
        listi.add(20);
        listi.add(30);
        listi.add(40);
        listi.removeIf(n->n%2==0);
        System.out.println(listi);
        listi.clear();
        System.out.println(listi);

        List<String> list4 = new ArrayList<>(Arrays.asList("hello","sir","how are you?","hello"));
        String a = list4.get(0);
        System.out.println(a);
        int b = list4.indexOf("sir");
        System.out.println(b);
        int c = list4.lastIndexOf("hello");
        System.out.println(c);

        boolean d = list4.contains("hello");
        System.out.println(d);

        boolean e = list4.isEmpty();
        System.out.println(e);

        int size = list4.size();
        System.out.println(size);

        List<String> list5 = new ArrayList<>(Arrays.asList("hello","sir"));
        boolean tf = list4.containsAll(list5);
        System.out.println(tf);



    }
}
