import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {
    @Test
    void ArrayListTest() {
        List<String> words = new ArrayList<>();
        words.add("amir");
        words.add("ali");
        words.add("asal");
        
        List<String> UpperWords = convertToUppercase(words);


    }

    private List<String> convertToUppercase(List<String> words) {
        return null;
    }
}

