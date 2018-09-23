package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class j8Tr {
    public static void main(String[] args) {
    //1 var
        List<String> names1 = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names1, new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    });

    //2 var
        List<String> names2 = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names2, (a, b) -> b.compareTo(a));

    //3 var
        List<String> names3 = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names3, Comparator.reverseOrder());

    //4 var
        List<String> names4= Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names4);


        System.out.println(names1);
        System.out.println(names2);
        System.out.println(names3);
        System.out.println(names4);
    }
}
