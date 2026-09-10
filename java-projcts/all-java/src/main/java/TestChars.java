import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestChars {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "abcdABCDabcd";
        // get distinct characters and their count in a string?
        // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
        IntStream intStream = str.chars();
        System.out.println(intStream);
        //intStream.forEach();
        //intStream. map(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
