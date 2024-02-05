package Collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTestClass {
    @Test
    void ArrayListTest() {
        List<String> words = new ArrayList<>();
        words.add("amir");
        words.add("reza");
        words.add("ali");
        words.add("asal");
        words.add(0,"mohammad");
        
        List<String> UpperWords = convertToUppercase(words);
        for (String m : UpperWords) {
            System.out.println(m);
        }


    }

    private List<String> convertToUppercase(List<String> words) {
        ArrayList<String> converter = new ArrayList<>();
        for (String i : words) {
            converter.add(i.toUpperCase());
            //Collections.sort(converter);
        }
        return converter;
    }
}

