import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FilterNumWithCondtion {
    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
        System.out.println("2::::::::::::::::::::::::::::::::::::::");

        IntStream.rangeClosed(101, 150).filter( n -> {
                    int x = n % 10;
                    int y = n / 10;
                    int x1 = y % 10;
                    int y1 = y / 10;
                    int x2 = y1 % 10;
                    //int y2 = y1 / 10;
                    return  x + x2 == x1;
                } )

                .forEach(System.out::println);
        System.out.println("3::::::::::::::::::::::::::::::::::::::");

        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 101; i <= 150 ; i++) {
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




    }
}
