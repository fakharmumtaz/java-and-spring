package com.javalogic.stream.custcollector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

//https://www.geeksforgeeks.org/how-to-build-a-custom-collector-in-java/?ref=rp
public class EmployeeCustomCollector {/*implements   Collector<Emp,
                List<Triplet<Integer, String, String> >,
                List<Triplet<Integer, String, String> >
        > {

    public static EmployeeCustomCollector toEmployeeList()
    {
        return new EmployeeCustomCollector();
    }

    public Supplier<
            List<Triplet<Integer, String, String> > >
    supplier()
    {
        return ArrayList::new;
    }

    public BiConsumer<
            List<Triplet<Integer, String, String> >, Student>
    accumulator()
    {
        return (list, student)
                -> list.add(
                Triplet.with(student.getYear(),
                        student.getFirstName(),
                        student.getLastName()));
    }

    public BinaryOperator<
            List<Triplet<Integer, String, String> >>
    combiner()
    {
        return (list1, list2) ->
        {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<
            List<Triplet<Integer, String, String> >,
            List<Triplet<Integer, String, String> > >
    finisher()
    {
        return Collections::unmodifiableList;
    }

    @Override
    public Set<Collector.Characteristics> characteristics()
    {
        return Set.of(Characteristics.UNORDERED);
    }
    */
}
