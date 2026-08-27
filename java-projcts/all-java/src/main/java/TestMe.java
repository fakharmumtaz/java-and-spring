import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMe {
    public static void main(String[] arg) {

        String str = "dummy text for test";

        String[] strArr = str.split(" ");
        List<String> collect = Arrays.stream(strArr)
                .map(t ->  String.valueOf(t.charAt(0)).toUpperCase() + t.substring((1)))
                .collect(Collectors.toList());

        String collect1 = collect.stream().collect(Collectors.joining(" "));
        System.out.println(collect1);

    }
}
