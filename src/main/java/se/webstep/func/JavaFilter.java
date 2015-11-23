package se.webstep.func;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaFilter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Arthur Dent", "Ford Prefect", "Zaphod Beeblebrox", "Marvin", "Trillian", "Slartibartfast");
        String longNames = names.stream()
                .filter(name -> name.length() > 12)
                .collect(Collectors.joining(", "));
        System.out.println(longNames);
        // Zaphod Beeblebrox, Slartibartfast

        String divisibleBy13 = IntStream.range(1, 100)
                .filter(i -> i % 13 == 0)
                .mapToObj(i -> "" + i)
                .collect(Collectors.joining(", "));
        System.out.println(divisibleBy13);
        // 13, 26, 39, 52, 65, 78, 91
    }
}
