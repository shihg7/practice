import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list排序 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("s");
        list.add("b");
        list.add("e");
        list.add("a");
        System.out.println(list);
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

    }
}