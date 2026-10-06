import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FilterNumWithCondtion {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 101; i <= 999 ; i++) {
            listOfIntegers.add(i);
        }

        String s1 = "";

        listOfIntegers.stream().filter( i -> {
            String s = ""+i;
            int x = Integer.parseInt(String.valueOf( s.charAt(0))) ;
            int y = Integer.parseInt(String.valueOf( s.charAt(2))) ;
            int z = Integer.parseInt(String.valueOf( s.charAt(1))) ;
            return x+y == z;
        }).forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        // Generates numbers from 100 to 999 inclusive
        IntStream.rangeClosed(100, 199)
                .filter(n -> {
                                  boolean res = n % 2 == 0  && n % 3 == 0;
                                  return res ;
                                }) // Example: keep only even numbers
                .forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        List<Integer> numbers = IntStream.rangeClosed(100, 999)
                .boxed()
                .toList();
        IntStream.rangeClosed(100, 199)
                .mapToObj(n -> "Number: " + n)
                .forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        IntStream.range(1000, 199).forEach(System.out::println);



    }
}
