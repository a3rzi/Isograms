package Collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class SetTest {
    @Test
    void hashSetTest() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        for (Integer i : numbers) {
            System.out.println(i);
        }

    }

    @Test
    boolean Test2() {
        String str = "amirhossein";

        HashSet<Character> unique = new HashSet<>();

        for (char letter : str.toCharArray()){
            System.out.print(letter);
            if (unique.contains(letter)){
                return false;
            }
            unique.add(letter); //amirhossei
        }

        return true;
    }
}
