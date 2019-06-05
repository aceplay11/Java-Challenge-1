import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class findDuplicates {

    //function that compare elements in a Lst  and prints outs
    public static void findDuplicates(List<String> strings) {
        Set<String> set = new HashSet<>();

        for (String s : strings) {


            if (set.add(s) == false) {
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("as");
        list.add("back");
        list.add("first");
        list.add("as");
        findDuplicates(list);
    }
}



