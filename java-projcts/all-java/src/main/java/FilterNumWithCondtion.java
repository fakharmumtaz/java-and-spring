import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
 The following are examples of using the predefined collectors to perform common mutable reduction tasks:
// Accumulate names into a List
List<String> list = people.stream()
  .map(Person::getName)
  .collect(Collectors.toList());

// Accumulate names into a TreeSet
Set<String> set = people.stream()
  .map(Person::getName)
  .collect(Collectors.toCollection(TreeSet::new));

// Convert elements to strings and concatenate them, separated by commas
String joined = things.stream()
  .map(Object::toString)
  .collect(Collectors.joining(", "));

// Compute sum of salaries of employee
int total = employees.stream()
  .collect(Collectors.summingInt(Employee::getSalary));

// Group employees by department
Map<Department, List<Employee>> byDept = employees.stream()
  .collect(Collectors.groupingBy(Employee::getDepartment));

// Compute sum of salaries by department
Map<Department, Integer> totalByDept = employees.stream()
  .collect(Collectors.groupingBy(Employee::getDepartment,
                                 Collectors.summingInt(Employee::getSalary)));

// Partition students into passing and failing
Map<Boolean, List<Student>> passingFailing = students.stream()
  .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
Since:

* */

public class FilterNumWithCondtion {
    public static void main(String[] args) {
        System.out.println("\n:::::::::::::::::::::::::::::::::::::: range 0 - 6 ");
        List<Integer> collect = IntStream.range(0, 6).boxed().toList();
        collect.forEach(p -> System.out.print( p==0 ? p : "," + p));
        System.out.println("\n:::::::::::::::::::::::::::::::::::::: range 0 - 8 ");
        IntStream.range(0, 8).forEach(p -> System.out.print( p==0 ? p : "," + p));
        System.out.println("\n:::::::::::::::::::::::::::::::::::::: rangeClosed 0 - 9");
        IntStream.rangeClosed(0, 9).forEach(
                //System.out::println
                p -> System.out.print( p==0 ? p : "," + p)
        );
        System.out.println("\n2::::::::::::::::::::::::::::::::::::::");

        IntStream.rangeClosed(101, 150).filter( n -> {
                    int x = n % 10;
                    int y = n / 10;
                    int x1 = y % 10;
                    int y1 = y / 10;
                    int x2 = y1 % 10;
                    //int y2 = y1 / 10;
                    return  x + x2 == x1;
                } ).forEach(System.out::println);

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
        System.out.println(":::::::::::::::::::::::::::::::::::::: rangeClosed 100 - 199 ");
        // Generates numbers from 100 to 999 inclusive
        IntStream.rangeClosed(5, 199)
                .filter(n -> {
                                  return  n % 2 == 0  && n % 3 == 0 && n % 5 == 0;
                                }) // Example: keep only even numbers
                .forEach(System.out::println);
        //System.out.println("::::::::::::::::::::::::::::::::::::::");
        //List<Integer> numbers = IntStream.rangeClosed(100, 999) .boxed().toList();
        //IntStream.rangeClosed(100, 199).mapToObj(n -> "Number: " + n) .forEach(System.out::println);




    }
}
