package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}

class CCC{
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        List<String> str = Arrays.asList("fsf", "ff");
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,4));
    }


        }