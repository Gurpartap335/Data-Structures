package lecture.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.list;

public class CountsItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(List.of("phone", "blue", "pixel"));
        list.add(List.of("computer", "silver", "iphone"));
        list.add(List.of("phone", "gold", "iphone"));

        Map<String, Integer> map = Map.of("type", 0, "color", 1, "name", 2);
        System.out.println(map);

        Map<Character, Integer> test = Map.of('e', 4, 't', 2, 'l', 1, 'r', 3);
        System.out.println(test);



    }


}
